package com.siyueren.mybatistest.pojo;

public class User {
    private Integer id;
    
    private String userName;
    
    private String hobbies;
    
    private String idols;
    
    private Long createTime;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getHobbies() {
        return hobbies;
    }
    
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    
    public String getIdols() {
        return idols;
    }
    
    public void setIdols(String idols) {
        this.idols = idols;
    }
    
    public Long getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", idols='" + idols + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}