package com.emotion.em.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data; 

@Entity
@SequenceGenerator(
  name = "DIARY_SEQ_GENERATOR", 
  sequenceName = "DIARY_SEQ",
  initialValue = 1,
  allocationSize = 1)
@Data
@Table(name = "tb_diary_contents")
public class TbDiaryContents {
    
    @Id
    @Column(name="no", nullable = false, length=5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIARY_SEQ_GENERATOR")
    private int no;
    
    @Column(name="contents", nullable = false, length=500)
    private String contents;


}
 