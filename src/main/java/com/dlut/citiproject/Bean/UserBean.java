package com.dlut.citiproject.Bean;

import org.apache.catalina.User;
import sun.dc.pr.PRError;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserBean {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    //属性
    private int id;
    private String name;
    private String password;
    private String email;

    //有参构造
    public UserBean(String name,String password,String email){
        this.name=name;
        this.password=password;
        this.email=email;
    }
    public UserBean(int id,String name,String password,String email){
        this.id=id;
        this.name=name;
        this.password=password;
        this.email=email;
    }
    //无参构造
    public UserBean(){

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

