package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_环境披露_上市公司环境业绩与治理披露情况表
@Entity
@Table(name = "source_环境披露_上市公司环境业绩与治理披露情况表")
public class EnvironmentExposure_Performance {
    @Id
    //属性
    private String stkcd;   //证券代码
    private String EndDate; //统计截止日期
    private String InstitutionID;   //上市公司ID
    private String ShortName;   //证券简称
    private String WasteGasEmissRed;    //废气减排治理情况
    private String WasteWaterEmissRed;  //废水减排治理情况
    private String SootDustRed;     //粉尘、烟尘治理情况
    private String SolidWasteDispUtil;  //固废利用与处置情况
    private String NoiseLightRadGovern;     //噪声、光污染、辐射等治理
    private String ClearProdImplement;  //清洁生产实施情况


    //有参构造
    public EnvironmentExposure_Performance(String stkcd, String endDate, String institutionID, String shortName, String wasteGasEmissRed, String wasteWaterEmissRed, String sootDustRed, String solidWasteDispUtil, String noiseLightRadGovern, String clearProdImplement) {
        this.stkcd = stkcd;
        EndDate = endDate;
        InstitutionID = institutionID;
        ShortName = shortName;
        WasteGasEmissRed = wasteGasEmissRed;
        WasteWaterEmissRed = wasteWaterEmissRed;
        SootDustRed = sootDustRed;
        SolidWasteDispUtil = solidWasteDispUtil;
        NoiseLightRadGovern = noiseLightRadGovern;
        ClearProdImplement = clearProdImplement;
    }

    //无参构造
    public EnvironmentExposure_Performance(){

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

    public String getWasteGasEmissRed() {
        return WasteGasEmissRed;
    }

    public void setWasteGasEmissRed(String wasteGasEmissRed) {
        WasteGasEmissRed = wasteGasEmissRed;
    }

    public String getWasteWaterEmissRed() {
        return WasteWaterEmissRed;
    }

    public void setWasteWaterEmissRed(String wasteWaterEmissRed) {
        WasteWaterEmissRed = wasteWaterEmissRed;
    }

    public String getSootDustRed() {
        return SootDustRed;
    }

    public void setSootDustRed(String sootDustRed) {
        SootDustRed = sootDustRed;
    }

    public String getSolidWasteDispUtil() {
        return SolidWasteDispUtil;
    }

    public void setSolidWasteDispUtil(String solidWasteDispUtil) {
        SolidWasteDispUtil = solidWasteDispUtil;
    }

    public String getNoiseLightRadGovern() {
        return NoiseLightRadGovern;
    }

    public void setNoiseLightRadGovern(String noiseLightRadGovern) {
        NoiseLightRadGovern = noiseLightRadGovern;
    }

    public String getClearProdImplement() {
        return ClearProdImplement;
    }

    public void setClearProdImplement(String clearProdImplement) {
        ClearProdImplement = clearProdImplement;
    }
}
