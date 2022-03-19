package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_环境披露_上市公司环境负债披露情况表
@Entity
@Table(name = "source_环境披露_上市公司环境负债披露情况表")
public class EnvironmentExposure_Debt {
    @Id
    private int id;
    //属性
    private String stkcd;   //证券代码

    @Override
    public String toString() {
        return "EnvironmentExposure_Debt{" +
                "id=" + id +
                ", stkcd='" + stkcd + '\'' +
                ", EndDate='" + EndDate + '\'' +
                ", InstitutionID='" + InstitutionID + '\'' +
                ", ShortName='" + ShortName + '\'' +
                ", WasteWaterEmission='" + WasteWaterEmission + '\'' +
                ", CODEmission='" + CODEmission + '\'' +
                ", SO2Emission='" + SO2Emission + '\'' +
                ", CO2Emission='" + CO2Emission + '\'' +
                ", SootDustEmission='" + SootDustEmission + '\'' +
                ", IndSolidWasteEmission='" + IndSolidWasteEmission + '\'' +
                '}';
    }

    private String EndDate; //统计截止日期
    private String InstitutionID;   //上市公司ID
    private String ShortName;   //证券简称
    private String WasteWaterEmission;  //废水排放量
    private String CODEmission;     //COD排放量
    private String SO2Emission;     //SO2排放量
    private String CO2Emission;     //CO2排放量
    private String SootDustEmission;    //烟尘和粉尘排放量
    private String IndSolidWasteEmission;      //工业固废物产生量


    //有参构造
    public EnvironmentExposure_Debt(String stkcd, String endDate, String institutionID, String shortName, String wasteWaterEmission, String CODEmission, String SO2Emission, String CO2Emission, String sootDustEmission, String indSolidWasteEmission) {
        this.stkcd = stkcd;
        EndDate = endDate;
        InstitutionID = institutionID;
        ShortName = shortName;
        WasteWaterEmission = wasteWaterEmission;
        this.CODEmission = CODEmission;
        this.SO2Emission = SO2Emission;
        this.CO2Emission = CO2Emission;
        SootDustEmission = sootDustEmission;
        IndSolidWasteEmission = indSolidWasteEmission;
    }

    //无参构造
    public EnvironmentExposure_Debt(){

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

    public String getWasteWaterEmission() {
        return WasteWaterEmission;
    }

    public void setWasteWaterEmission(String wasteWaterEmission) {
        WasteWaterEmission = wasteWaterEmission;
    }

    public String getCODEmission() {
        return CODEmission;
    }

    public void setCODEmission(String CODEmission) {
        this.CODEmission = CODEmission;
    }

    public String getSO2Emission() {
        return SO2Emission;
    }

    public void setSO2Emission(String SO2Emission) {
        this.SO2Emission = SO2Emission;
    }

    public String getCO2Emission() {
        return CO2Emission;
    }

    public void setCO2Emission(String CO2Emission) {
        this.CO2Emission = CO2Emission;
    }

    public String getSootDustEmission() {
        return SootDustEmission;
    }

    public void setSootDustEmission(String sootDustEmission) {
        SootDustEmission = sootDustEmission;
    }

    public String getIndSolidWasteEmission() {
        return IndSolidWasteEmission;
    }

    public void setIndSolidWasteEmission(String indSolidWasteEmission) {
        IndSolidWasteEmission = indSolidWasteEmission;
    }
}
