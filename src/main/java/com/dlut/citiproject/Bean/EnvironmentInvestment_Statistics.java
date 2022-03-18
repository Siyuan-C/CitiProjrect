package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_环境投资_上市公司环境投资统计表
@Entity
@Table(name = "source_环境投资_上市公司环境投资统计表")
public class EnvironmentInvestment_Statistics {
    @Id
    //属性
    private String stkcd;   //证券代码
    private String EndDate; //统计截止日期
    private String InstitutionID;   //上市公司ID
    private String ShortName;   //证券简称
    private String EPInvest;    //环保投资

    //有参构造

    public EnvironmentInvestment_Statistics(String stkcd, String endDate, String institutionID, String shortName, String EPInvest) {
        this.stkcd = stkcd;
        EndDate = endDate;
        InstitutionID = institutionID;
        ShortName = shortName;
        this.EPInvest = EPInvest;
    }

    //无参构造
    public EnvironmentInvestment_Statistics(){

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

    public String getEPInvest() {
        return EPInvest;
    }

    public void setEPInvest(String EPInvest) {
        this.EPInvest = EPInvest;
    }
}
