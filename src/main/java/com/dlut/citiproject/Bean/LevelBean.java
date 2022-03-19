package com.dlut.citiproject.Bean;

import javax.persistence.*;

@Entity
@Table(name = "level")
public class LevelBean {
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    //属性
    private  String stkcd;

    public LevelBean() {
    }

    private  String ShortName;
    private  String E_level;
    private  String S_level;
    private  String C_level;
    private  String T_Score;

    public LevelBean(String stkcd, String shortName, String e_level, String s_level, String c_level, String t_score) {
        this.stkcd = stkcd;
        ShortName = shortName;
        E_level = e_level;
        S_level = s_level;
        C_level = c_level;
        T_Score = t_score;
    }

    public String getC_level() {
        return C_level;
    }

    public void setC_level(String c_level) {
        C_level = c_level;
    }

    public String getStkcd() {
        return stkcd;
    }

    public void setStkcd(String stkcd) {
        this.stkcd = stkcd;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public String getE_level() {
        return E_level;
    }

    public void setE_level(String e_level) {
        E_level = e_level;
    }

    public String getS_level() {
        return S_level;
    }

    public void setS_level(String s_level) {
        S_level = s_level;
    }

    public String getT_Score() {
        return T_Score;
    }

    public void setT_Score(String t_Score) {
        T_Score = t_Score;
    }
}
