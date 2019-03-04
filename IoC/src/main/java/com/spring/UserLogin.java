package com.spring;

public class UserLogin {
    private User user;

    public UserLogin(User user) {
        this.user = user;
    }
    public boolean userLogin(User user){
        if (user.getAccount().equals("admin")&& user.getPassword().equals("111")){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "user=" + user +
                '}';
    }
}
