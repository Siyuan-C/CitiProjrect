package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_环境披露_上市公司环境监管与认证披露情况表
@Entity
@Table(name = "source_环境披露_上市公司环境监管与认证披露情况表")
public class EnvironmentExposure_Regulation {
    @Id
    //属性
    private String stkcd;   //证券代码
    private String EndDate; //统计截止日期
    private String InstitutionID;   //上市公司ID
    private String ShortName;   //证券简称
    private String KeyPollMonUnit;  //重点污染监控单位
    private String PollEmissStandard;   //污染物排放达标
    private String SuddenEnvAccident;   //突发环境事故
    private String EnvViolation;    //环境违法事件
    private String EnvPetLetterCase;    //环境信访案件
    private String IsPassISO14001;  //是否通过ISO14001认证
    private String IsPassISO9001;   //是否通过ISO9001认证

    //有参构造
    public EnvironmentExposure_Regulation(String stkcd, String endDate, String institutionID, String shortName, String keyPollMonUnit, String pollEmissStandard, String suddenEnvAccident, String envViolation, String envPetLetterCase, String isPassISO14001, String isPassISO9001) {
        this.stkcd = stkcd;
        EndDate = endDate;
        InstitutionID = institutionID;
        ShortName = shortName;
        KeyPollMonUnit = keyPollMonUnit;
        PollEmissStandard = pollEmissStandard;
        SuddenEnvAccident = suddenEnvAccident;
        EnvViolation = envViolation;
        EnvPetLetterCase = envPetLetterCase;
        IsPassISO14001 = isPassISO14001;
        IsPassISO9001 = isPassISO9001;
    }

    //无参构造
    public EnvironmentExposure_Regulation(){

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

    public String getKeyPollMonUnit() {
        return KeyPollMonUnit;
    }

    public void setKeyPollMonUnit(String keyPollMonUnit) {
        KeyPollMonUnit = keyPollMonUnit;
    }

    public String getPollEmissStandard() {
        return PollEmissStandard;
    }

    public void setPollEmissStandard(String pollEmissStandard) {
        PollEmissStandard = pollEmissStandard;
    }

    public String getSuddenEnvAccident() {
        return SuddenEnvAccident;
    }

    public void setSuddenEnvAccident(String suddenEnvAccident) {
        SuddenEnvAccident = suddenEnvAccident;
    }

    public String getEnvViolation() {
        return EnvViolation;
    }

    public void setEnvViolation(String envViolation) {
        EnvViolation = envViolation;
    }

    public String getEnvPetLetterCase() {
        return EnvPetLetterCase;
    }

    public void setEnvPetLetterCase(String envPetLetterCase) {
        EnvPetLetterCase = envPetLetterCase;
    }

    public String getIsPassISO14001() {
        return IsPassISO14001;
    }

    public void setIsPassISO14001(String isPassISO14001) {
        IsPassISO14001 = isPassISO14001;
    }

    public String getIsPassISO9001() {
        return IsPassISO9001;
    }

    public void setIsPassISO9001(String isPassISO9001) {
        IsPassISO9001 = isPassISO9001;
    }
}
