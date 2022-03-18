package com.dlut.citiproject.Bean;

import javax.persistence.*;

@Entity
@Table(name = "storage_corporation")
public class Storage_corporation {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    //属性
    private int id;
    private String name;
    private String password;

    public Storage_corporation(int id ,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    public Storage_corporation(){

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
