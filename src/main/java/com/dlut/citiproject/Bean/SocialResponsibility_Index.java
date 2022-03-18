package com.dlut.citiproject.Bean;

//source_上市公司社会责任评价指标表
public class SocialResponsibility_Index {

    //属性
    private String stkcd;   //证券代码
    private String ShortName;   //股票简称
    private String EndDate; //统计截止日期
    private String DeclareDate; //公告日期
    private String StatisticCaliberID;  //口径编码
    private String StatisticCaliber;    //口径名称
    private String ContentTypeCode;     //披露内容类型编码
    private String ContentType;     //披露内容类型
    private String ItemRank;    //项目序号
    private String ItemName;    //项目名称
    private String Amount;  //项目数值
    private String Unit;    //单位
    private String Notes;   //备注


    //有参构造
    public SocialResponsibility_Index(String stkcd, String shortName, String endDate, String declareDate, String statisticCaliberID, String statisticCaliber, String contentTypeCode, String contentType, String itemRank, String itemName, String amount, String unit, String notes) {
        this.stkcd = stkcd;
        ShortName = shortName;
        EndDate = endDate;
        DeclareDate = declareDate;
        StatisticCaliberID = statisticCaliberID;
        StatisticCaliber = statisticCaliber;
        ContentTypeCode = contentTypeCode;
        ContentType = contentType;
        ItemRank = itemRank;
        ItemName = itemName;
        Amount = amount;
        Unit = unit;
        Notes = notes;
    }

    //无参构造
    public SocialResponsibility_Index(){

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

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getDeclareDate() {
        return DeclareDate;
    }

    public void setDeclareDate(String declareDate) {
        DeclareDate = declareDate;
    }

    public String getStatisticCaliberID() {
        return StatisticCaliberID;
    }

    public void setStatisticCaliberID(String statisticCaliberID) {
        StatisticCaliberID = statisticCaliberID;
    }

    public String getStatisticCaliber() {
        return StatisticCaliber;
    }

    public void setStatisticCaliber(String statisticCaliber) {
        StatisticCaliber = statisticCaliber;
    }

    public String getContentTypeCode() {
        return ContentTypeCode;
    }

    public void setContentTypeCode(String contentTypeCode) {
        ContentTypeCode = contentTypeCode;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }

    public String getItemRank() {
        return ItemRank;
    }

    public void setItemRank(String itemRank) {
        ItemRank = itemRank;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
