package com.emotion.em.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_diary_title")
public class TbDiaryTitle {
    
    @Id
    private int no;
    @Column
    private String title;
    @Column
    private String date;
    @Column
    private String date;

    public int getNo() {
        return no;
    }
    


}
 