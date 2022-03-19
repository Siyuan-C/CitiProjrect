package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name = "storage_corporation")
public class Login_UserBean {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    //属性
    private int id;
    private String name;
    private String password;

    public Login_UserBean(int id , String name, String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    public Login_UserBean(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
}
