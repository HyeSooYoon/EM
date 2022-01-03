package com.emotion.em.repository;

import java.util.Optional;

import com.emotion.em.Entity.TbDiaryTitle;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryTitleRepository extends JpaRepository<TbDiaryTitle, Long> {
    
    Optional<TbDiaryTitle> findTbDiaryTitleByNo(int no);

    Optional<TbDiaryTitle> findTbDiaryTitleByEmotion_Cd(String emotion_cd);

    
}