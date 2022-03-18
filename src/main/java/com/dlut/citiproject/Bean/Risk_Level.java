package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_风险水平
@Entity
@Table(name = "source_风险水平")
public class Risk_Level {
    @Id
    //属性
    private String stkcd;   //证券代码
    private String Accper;  //截止日期
    private String Typrep;  //报表类型编码
    private String Indcd;   //行业代码
    private String F070101B;    //财务杠杆
    private String F070201B;    //经营杠杆
    private String F070301B;    //综合杠杆
    private String Indnme;  //行业名称

    //有参构造
    public Risk_Level(String stkcd, String accper, String typrep, String indcd, String f070101B, String f070201B, String f070301B, String indnme) {
        this.stkcd = stkcd;
        Accper = accper;
        Typrep = typrep;
        Indcd = indcd;
        F070101B = f070101B;
        F070201B = f070201B;
        F070301B = f070301B;
        Indnme = indnme;
    }

    //无参构造
    public Risk_Level(){

    }

    public String getStkcd() {
        return stkcd;
    }

    public void setStkcd(String stkcd) {
        this.stkcd = stkcd;
    }

    public String getAccper() {
        return Accper;
    }

    public void setAccper(String accper) {
        Accper = accper;
    }

    public String getTyprep() {
        return Typrep;
    }

    public void setTyprep(String typrep) {
        Typrep = typrep;
    }

    public String getIndcd() {
        return Indcd;
    }

    public void setIndcd(String indcd) {
        Indcd = indcd;
    }

    public String getF070101B() {
        return F070101B;
    }

    public void setF070101B(String f070101B) {
        F070101B = f070101B;
    }

    public String getF070201B() {
        return F070201B;
    }

    public void setF070201B(String f070201B) {
        F070201B = f070201B;
    }

    public String getF070301B() {
        return F070301B;
    }

    public void setF070301B(String f070301B) {
        F070301B = f070301B;
    }

    public String getIndnme() {
        return Indnme;
    }

    public void setIndnme(String indnme) {
        Indnme = indnme;
    }
}
