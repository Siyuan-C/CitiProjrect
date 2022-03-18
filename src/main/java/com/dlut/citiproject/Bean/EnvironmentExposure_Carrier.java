package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_环境披露_上市公司环境信息披露载体信息表
@Entity
@Table(name = "source_环境披露_上市公司环境信息披露载体信息表")
public class EnvironmentExposure_Carrier {
    @Id
    //属性
    private String stkcd;   //证券代码
    private String EndDate; //统计截止日期
    private String InstitutionID;   //上市公司ID
    private String ShortName;   //证券简称
    private String AnnualReport;    //上市公司年报
    private String CSRReport;   //社会责任报告
    private String EnvReport;   //环境报告

    //有参构造
    public EnvironmentExposure_Carrier(String stkcd, String endDate, String institutionID, String shortName, String annualReport, String CSRReport, String envReport) {
        this.stkcd = stkcd;
        EndDate = endDate;
        InstitutionID = institutionID;
        ShortName = shortName;
        AnnualReport = annualReport;
        this.CSRReport = CSRReport;
        EnvReport = envReport;
    }

    //无参构造
    public EnvironmentExposure_Carrier(){

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

    public String getAnnualReport() {
        return AnnualReport;
    }

    public void setAnnualReport(String annualReport) {
        AnnualReport = annualReport;
    }

    public String getCSRReport() {
        return CSRReport;
    }

    public void setCSRReport(String CSRReport) {
        this.CSRReport = CSRReport;
    }

    public String getEnvReport() {
        return EnvReport;
    }

    public void setEnvReport(String envReport) {
        EnvReport = envReport;
    }
}
