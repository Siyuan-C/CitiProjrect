package com.dlut.citiproject.Bean;

//source_公司基本情况文件
public class Basic_Information {

    //属性
    private String stkcd;   //证券代码
    private String Stknme;  //证券中文简称
    private String Stktype; //股票类型
    private String Crcd;    //A/B/H股交叉码
    private String Conme;   //公司名称
    private String Cochsnm; //公司中文简称
    private String Conmee;  //公司英文名称
    private String Nnindnme;    //行业名称C
    private String Nnindcd; //行业代码C
    private String Nindnme; //行业名称B
    private String Nindcd;  //行业代码B
    private String Indnme;  //行业名称A
    private String Indcd;   //行业代码A
    private String Busscope;    //经营范围
    private String Cohisty; //公司沿革
    private String Regcap;  //注册资本
    private String EstablishDate;   //成立日期
    private String ListedDate;  //上市日期
    private String DelistedDate;    //退市日期

    //有参构造
    public Basic_Information(String stkcd, String stknme, String stktype, String crcd, String conme, String cochsnm, String conmee, String nnindnme, String nnindcd, String nindnme, String nindcd, String indnme, String indcd, String busscope, String cohisty, String regcap, String establishDate, String listedDate, String delistedDate) {
        this.stkcd = stkcd;
        Stknme = stknme;
        Stktype = stktype;
        Crcd = crcd;
        Conme = conme;
        Cochsnm = cochsnm;
        Conmee = conmee;
        Nnindnme = nnindnme;
        Nnindcd = nnindcd;
        Nindnme = nindnme;
        Nindcd = nindcd;
        Indnme = indnme;
        Indcd = indcd;
        Busscope = busscope;
        Cohisty = cohisty;
        Regcap = regcap;
        EstablishDate = establishDate;
        ListedDate = listedDate;
        DelistedDate = delistedDate;
    }

    //无参构造
    public Basic_Information(){

    }

    public String getStkcd() {
        return stkcd;
    }

    public void setStkcd(String stkcd) {
        this.stkcd = stkcd;
    }

    public String getStknme() {
        return Stknme;
    }

    public void setStknme(String stknme) {
        Stknme = stknme;
    }

    public String getStktype() {
        return Stktype;
    }

    public void setStktype(String stktype) {
        Stktype = stktype;
    }

    public String getCrcd() {
        return Crcd;
    }

    public void setCrcd(String crcd) {
        Crcd = crcd;
    }

    public String getConme() {
        return Conme;
    }

    public void setConme(String conme) {
        Conme = conme;
    }

    public String getCochsnm() {
        return Cochsnm;
    }

    public void setCochsnm(String cochsnm) {
        Cochsnm = cochsnm;
    }

    public String getConmee() {
        return Conmee;
    }

    public void setConmee(String conmee) {
        Conmee = conmee;
    }

    public String getNnindnme() {
        return Nnindnme;
    }

    public void setNnindnme(String nnindnme) {
        Nnindnme = nnindnme;
    }

    public String getNnindcd() {
        return Nnindcd;
    }

    public void setNnindcd(String nnindcd) {
        Nnindcd = nnindcd;
    }

    public String getNindnme() {
        return Nindnme;
    }

    public void setNindnme(String nindnme) {
        Nindnme = nindnme;
    }

    public String getNindcd() {
        return Nindcd;
    }

    public void setNindcd(String nindcd) {
        Nindcd = nindcd;
    }

    public String getIndnme() {
        return Indnme;
    }

    public void setIndnme(String indnme) {
        Indnme = indnme;
    }

    public String getIndcd() {
        return Indcd;
    }

    public void setIndcd(String indcd) {
        Indcd = indcd;
    }

    public String getBusscope() {
        return Busscope;
    }

    public void setBusscope(String busscope) {
        Busscope = busscope;
    }

    public String getCohisty() {
        return Cohisty;
    }

    public void setCohisty(String cohisty) {
        Cohisty = cohisty;
    }

    public String getRegcap() {
        return Regcap;
    }

    public void setRegcap(String regcap) {
        Regcap = regcap;
    }

    public String getEstablishDate() {
        return EstablishDate;
    }

    public void setEstablishDate(String establishDate) {
        EstablishDate = establishDate;
    }

    public String getListedDate() {
        return ListedDate;
    }

    public void setListedDate(String listedDate) {
        ListedDate = listedDate;
    }

    public String getDelistedDate() {
        return DelistedDate;
    }

    public void setDelistedDate(String delistedDate) {
        DelistedDate = delistedDate;
    }
}
