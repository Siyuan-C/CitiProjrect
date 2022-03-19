package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_环境投资_上市公司环境投资明细表
@Entity
@Table(name = "source_环境投资_上市公司环境投资明细表")
public class EnvironmentInvestment_Details {
    @Id
    private int id;

    @Override
    public String toString() {
        return "EnvironmentInvestment_Details{" +
                "id=" + id +
                ", stkcd='" + stkcd + '\'' +
                ", EndDate='" + EndDate + '\'' +
                ", InstitutionID='" + InstitutionID + '\'' +
                ", ShortName='" + ShortName + '\'' +
                ", ProjectName='" + ProjectName + '\'' +
                ", InputFee='" + InputFee + '\'' +
                '}';
    }

    //属性
    private String stkcd;   //证券代码
    private String EndDate; //统计截止日期
    private String InstitutionID;   //上市公司ID
    private String ShortName;   //证券简称
    private String ProjectName;     //项目名称
    private String InputFee;    //投入费用


    //有参构造
    public EnvironmentInvestment_Details(String stkcd, String endDate, String institutionID, String shortName, String projectName, String inputFee) {
        this.stkcd = stkcd;
        EndDate = endDate;
        InstitutionID = institutionID;
        ShortName = shortName;
        ProjectName = projectName;
        InputFee = inputFee;
    }

    //无参构造
    public EnvironmentInvestment_Details(){

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

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getInputFee() {
        return InputFee;
    }

    public void setInputFee(String inputFee) {
        InputFee = inputFee;
    }
}
