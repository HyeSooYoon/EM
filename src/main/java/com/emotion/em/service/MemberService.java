package com.emotion.em.service;

import javax.transaction.Transactional;

import com.emotion.em.Dto.MemberDto;
import com.emotion.em.Dto.Role;
import com.emotion.em.Entity.MemberEntity;
import com.emotion.em.repository.MemberRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberService implements UserDetailsService {
    
    private MemberRepository memberRepository;

    @Transactional
    public Long joinUser(MemberDto memberDto) {
        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        memberDto.setPassword(passwordEncoder.encode(memberDto.getPassword()));

        return memberRepository.save(memberDto.toEntity()).getId();
    }

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(userEmail);
        MemberEntity userEntity = null;
        User user = null;
        
        if(userEntityWrapper.isPresent())
        {
            userEntity = userEntityWrapper.get();
            List<GrantedAuthority> authorities = new ArrayList<>();

            if (("admin").equals(userEmail)) {
                authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
            } else {
                authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
            }

            user = new User(userEntity.getEmail(), userEntity.getPassword(), authorities);
        }
        else
        {
            throw new UsernameNotFoundException(userEmail);
        } 

        return user;
    }
}
