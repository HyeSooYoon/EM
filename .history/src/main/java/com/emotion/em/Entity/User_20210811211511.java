package com.emotion.em.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_diary_title")
public class User {
    
    @Id
    private int userIdx;
    @Column
    private String userName;
    @Column
    private String userNick;

    public int getUserIdx() {
        return userIdx;
    }
    


}
 