package com.dnsoft.springlessons.lesson2;



public class User {
	 
    private String userName;
     
    private String wifeName;
     
    public String getWifeName() {
        return wifeName;
    }
 
    public void setWifeName(String wifeName) {
        System.out.println("setWifhName: " + wifeName);
        this.wifeName = wifeName;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
     
    public User() {
        System.out.println("User's Construtor...");
    }
 
    @Override
    public String toString() {
        return "User [userName=" + userName + "]";
    }
     
    public void init(){
        System.out.println("init method...");
    }
     
    public void destroy(){
        System.out.println("destroy method...");
    }
 
}
