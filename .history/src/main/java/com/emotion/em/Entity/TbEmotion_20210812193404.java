package com.emotion.em.Entity;

public class TbEmotion { 
    
    @Id
    @Column(name="no")
    private int no;
    
    @Column(name="title", nullable = false, length=50)
    private String title;
    
    @Column(name="date", nullable = false)
    private LocalDateTime date;
    
    @Column(name="emotion_cd", nullable = false, length=4)
    private String emotion_cd;

    public int getNo() {
        return no;
    }
}
