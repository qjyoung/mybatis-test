package com.siyueren.mybatistest.pojo;

public class UserDetail {
    
    private String hobbies;
    
    private String idols;
    
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
    
    @Override
    public String toString() {
        return "UserDetail{" +
                "hobbies='" + hobbies + '\'' +
                ", idols='" + idols + '\'' +
                '}';
    }
}