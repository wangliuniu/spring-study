package com.spring.login;

/**
 * Created by ASUS on 2019/3/4.
 */
public class UserLogin {
    private User user;
    public UserLogin(User user) {
        this.user = user;
    }
    public UserLogin() {
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean userLogin(User user) {
 if(user.getAccount().equals("admin")&&user.getPassword().equals("111")){
     return true;
 }else{
     return false;
 }
    }
}

