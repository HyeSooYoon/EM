package com.emotion.em.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@SequenceGenerator(
  name = "DIARY_SEQ_GENERATOR", 
  sequenceName = "DIARY_SEQ",
  initialValue = 1,
  allocationSize = 1)
public class TbDiaryTitle {
    
    @Id
    @Column(name="no")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIARY_SEQ_GENERATOR")
    private int no;
    
    @Column(name="title", nullable = false, length=50)
    private String title;
    
    @Column(name="date", nullable = false)
    private LocalDateTime date;
    
    @Column(name="emotion_cd", nullable = false, length=4)
    private String emotionCd; 

}
 