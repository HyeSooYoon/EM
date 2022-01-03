package com.emotion.em.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_diary_title")
public class TbDiaryTitle {
    
    @Id
    private int no;
    
    @Column
    private String title;
    
    @Column(name="date_time", nullable = false)
    private LocalDateTime date;
    
    @Column
    private String emotion_cd;

    public int getNo() {
        return no;
    }
    


}
 