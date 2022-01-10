package com.emotion.em.config;
 
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/h2_db/**");        
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                // .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) 
                // .and()
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/h2_db/**").permitAll() 
                .antMatchers("/main").permitAll()
                .antMatchers("/em").authenticated()
                .anyRequest().authenticated() 
                .and()
                .csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("admin").password("{noop}1234").roles("USER");
    }
    
   
}