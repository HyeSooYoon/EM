package com.emotion.em.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_diary_title")
public class TbDiaryTitle {
    
    @Column(name="no", nullable = false)
    private int no;
    
    @Column(name="title", nullable = false)
    private String title;
    
    @Column(name="date", nullable = false)
    private LocalDateTime date;
    
    @Column(name="emotion_cd", nullable = false)
    private String emotion_cd;

    public int getNo() {
        return no;
    }
    


}
 