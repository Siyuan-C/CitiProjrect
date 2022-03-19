package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_环境绩效_上市公司环境绩效明细表
@Entity
@Table(name = "source_环境绩效_上市公司环境绩效明细表")
public class EnvironmentAchievement_Details {

    //属性
    @Id
    private int id;
    private String stkcd;   //证券代码
    private String EndDate; //统计截止日期
    private String InstitutionID;   //上市公司ID
    private String ShortName;   //证券简称
    private String PerfProjectName; //绩效项目名称
    private String PerfValue;   //数值
    private String Unit;    //单位

    //有参构造
    public EnvironmentAchievement_Details(String stkcd, String endDate, String institutionID, String shortName, String perfProjectName, String perfValue, String unit) {
        this.stkcd = stkcd;
        this.EndDate = endDate;
        this.InstitutionID = institutionID;
        this.ShortName = shortName;
        this.PerfProjectName = perfProjectName;
        this.PerfValue = perfValue;
        this.Unit = unit;
    }

    @Override
    public String toString() {
        return "EnvironmentAchievement_Details{" +
                "stkcd='" + stkcd + '\'' +
                ", EndDate='" + EndDate + '\'' +
                ", InstitutionID='" + InstitutionID + '\'' +
                ", ShortName='" + ShortName + '\'' +
                ", PerfProjectName='" + PerfProjectName + '\'' +
                ", PerfValue='" + PerfValue + '\'' +
                ", Unit='" + Unit + '\'' +
                '}';
    }

    //无参构造
    public EnvironmentAchievement_Details(){

    }

    public String getStkcd() {
        return stkcd;
    }

    public void setStkcd(String stkcd) {
        this.stkcd = stkcd;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getInstitutionID() {
        return InstitutionID;
    }

    public void setInstitutionID(String institutionID) {
        InstitutionID = institutionID;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public String getPerfProjectName() {
//        System.out.println(PerfProjectName);
        return PerfProjectName;
    }

    public void setPerfProjectName(String perfProjectName) {
        PerfProjectName = perfProjectName;
    }

    public String getPerfValue() {
        return PerfValue;
    }

    public void setPerfValue(String perfValue) {
        PerfValue = perfValue;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }
}
