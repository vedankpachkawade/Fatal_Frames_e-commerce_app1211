package com.example.fatalframes.Model;

public class Users {
    private String name;

    public Users(String name, String phone, String mailid, String password) {
        this.name = name;
        this.phone = phone;
        this.mailid = mailid;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String phone;
    private String mailid;
    private String password;

    public Users()
    {

    }
}
