package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_管理层治理能力
@Entity
@Table(name = "source_管理层治理能力")
public class Govern_Capacity {
    @Id
    private int id;
    //属性
    private String stkcd;   //证券代码
    private String ShortName;   //证券简称
    private String Enddate;     //会计期间
    private String IndustryCode;    //行业代码
    private String IndustryName;    //行业名称
    private String PropertyRightsNature;    //产权性质
    private String OwnershipProportion;     //实际控制人拥有上市公司所有权比例
    private String ControlProportion;   //实际控制人拥有上市公司控制权比例
    private String ControllerSeperation;    //实际控制人两权分离率
    private String ContrshrProportion;  //控股股东持股比例
    private String ContrshrNature;  //控股股东性质
    private String SharesBalance;   //股权制衡度
    private String InsInvestorProp;     //机构投资者持股比例
    private String BankHoldProportion;  //银行持股比例
    private String ISHoldBankShares;    //是否持有银行股份
    private String HoldBankSharesProp;  //持有银行股份比例
    private String ISHoldOtherFinaShares;   //是否持有其他金融机构股份
    private String TOP3SumSalary;   //管理层前三名薪酬总额
    private String SumSalary;   //管理层薪酬总额
    private String ConcurrentPosition;  //两职合一
    private String Mngmhldn;    //管理层持股比例
    private String Boardsize;   //董事会规模
    private String IndDirectorRatio;    //独立董事占比
    private String SupervisorSize;  //监事会规模
    private String ExecutivesNumber;    //高管人数
    private String MaleRatio;   //管理层男性占比
    private String AverageAge;  //管理层平均年龄
    private String MngmFinancialBack;   //董监高是否具有金融背景
    private String MngmOverseaBack;     //董监高是否具有海外背景
    private String IsCocurP;    //董监高是否兼任股东单位职务
    private String StaffNumber;     //员工人数
    private String ProfitPerCapita;     //人均创利
    private String ExcessEmployeeRate;  //超额雇员率

    @Override
    public String toString() {
        return "Govern_Capacity{" +
                "id=" + id +
                ", stkcd='" + stkcd + '\'' +
                ", ShortName='" + ShortName + '\'' +
                ", Enddate='" + Enddate + '\'' +
                ", IndustryCode='" + IndustryCode + '\'' +
                ", IndustryName='" + IndustryName + '\'' +
                ", PropertyRightsNature='" + PropertyRightsNature + '\'' +
                ", OwnershipProportion='" + OwnershipProportion + '\'' +
                ", ControlProportion='" + ControlProportion + '\'' +
                ", ControllerSeperation='" + ControllerSeperation + '\'' +
                ", ContrshrProportion='" + ContrshrProportion + '\'' +
                ", ContrshrNature='" + ContrshrNature + '\'' +
                ", SharesBalance='" + SharesBalance + '\'' +
                ", InsInvestorProp='" + InsInvestorProp + '\'' +
                ", BankHoldProportion='" + BankHoldProportion + '\'' +
                ", ISHoldBankShares='" + ISHoldBankShares + '\'' +
                ", HoldBankSharesProp='" + HoldBankSharesProp + '\'' +
                ", ISHoldOtherFinaShares='" + ISHoldOtherFinaShares + '\'' +
                ", TOP3SumSalary='" + TOP3SumSalary + '\'' +
                ", SumSalary='" + SumSalary + '\'' +
                ", ConcurrentPosition='" + ConcurrentPosition + '\'' +
                ", Mngmhldn='" + Mngmhldn + '\'' +
                ", Boardsize='" + Boardsize + '\'' +
                ", IndDirectorRatio='" + IndDirectorRatio + '\'' +
                ", SupervisorSize='" + SupervisorSize + '\'' +
                ", ExecutivesNumber='" + ExecutivesNumber + '\'' +
                ", MaleRatio='" + MaleRatio + '\'' +
                ", AverageAge='" + AverageAge + '\'' +
                ", MngmFinancialBack='" + MngmFinancialBack + '\'' +
                ", MngmOverseaBack='" + MngmOverseaBack + '\'' +
                ", IsCocurP='" + IsCocurP + '\'' +
                ", StaffNumber='" + StaffNumber + '\'' +
                ", ProfitPerCapita='" + ProfitPerCapita + '\'' +
                ", ExcessEmployeeRate='" + ExcessEmployeeRate + '\'' +
                ", StaffIntensity='" + StaffIntensity + '\'' +
                ", IndDirectorNetCentrality='" + IndDirectorNetCentrality + '\'' +
                ", OneControlMany='" + OneControlMany + '\'' +
                '}';
    }

    private String StaffIntensity;  //员工密集度
    private String IndDirectorNetCentrality;    //独立董事网络中心度
    private String OneControlMany;  //是否存在一控多情况

    //有参构造
    public Govern_Capacity(String stkcd, String shortName, String enddate, String industryCode, String industryName, String propertyRightsNature, String ownershipProportion, String controlProportion, String controllerSeperation, String contrshrProportion, String contrshrNature, String sharesBalance, String insInvestorProp, String bankHoldProportion, String ISHoldBankShares, String holdBankSharesProp, String ISHoldOtherFinaShares, String TOP3SumSalary, String sumSalary, String concurrentPosition, String mngmhldn, String boardsize, String indDirectorRatio, String supervisorSize, String executivesNumber, String maleRatio, String averageAge, String mngmFinancialBack, String mngmOverseaBack, String isCocurP, String staffNumber, String profitPerCapita, String excessEmployeeRate, String staffIntensity, String indDirectorNetCentrality, String oneControlMany) {
        this.stkcd = stkcd;
        ShortName = shortName;
        Enddate = enddate;
        IndustryCode = industryCode;
        IndustryName = industryName;
        PropertyRightsNature = propertyRightsNature;
        OwnershipProportion = ownershipProportion;
        ControlProportion = controlProportion;
        ControllerSeperation = controllerSeperation;
        ContrshrProportion = contrshrProportion;
        ContrshrNature = contrshrNature;
        SharesBalance = sharesBalance;
        InsInvestorProp = insInvestorProp;
        BankHoldProportion = bankHoldProportion;
        this.ISHoldBankShares = ISHoldBankShares;
        HoldBankSharesProp = holdBankSharesProp;
        this.ISHoldOtherFinaShares = ISHoldOtherFinaShares;
        this.TOP3SumSalary = TOP3SumSalary;
        SumSalary = sumSalary;
        ConcurrentPosition = concurrentPosition;
        Mngmhldn = mngmhldn;
        Boardsize = boardsize;
        IndDirectorRatio = indDirectorRatio;
        SupervisorSize = supervisorSize;
        ExecutivesNumber = executivesNumber;
        MaleRatio = maleRatio;
        AverageAge = averageAge;
        MngmFinancialBack = mngmFinancialBack;
        MngmOverseaBack = mngmOverseaBack;
        IsCocurP = isCocurP;
        StaffNumber = staffNumber;
        ProfitPerCapita = profitPerCapita;
        ExcessEmployeeRate = excessEmployeeRate;
        StaffIntensity = staffIntensity;
        IndDirectorNetCentrality = indDirectorNetCentrality;
        OneControlMany = oneControlMany;
    }

    //无参构造
    public Govern_Capacity(){

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

    public String getEnddate() {
        return Enddate;
    }

    public void setEnddate(String enddate) {
        Enddate = enddate;
    }

    public String getIndustryCode() {
        return IndustryCode;
    }

    public void setIndustryCode(String industryCode) {
        IndustryCode = industryCode;
    }

    public String getIndustryName() {
        return IndustryName;
    }

    public void setIndustryName(String industryName) {
        IndustryName = industryName;
    }

    public String getPropertyRightsNature() {
        return PropertyRightsNature;
    }

    public void setPropertyRightsNature(String propertyRightsNature) {
        PropertyRightsNature = propertyRightsNature;
    }

    public String getOwnershipProportion() {
        return OwnershipProportion;
    }

    public void setOwnershipProportion(String ownershipProportion) {
        OwnershipProportion = ownershipProportion;
    }

    public String getControlProportion() {
        return ControlProportion;
    }

    public void setControlProportion(String controlProportion) {
        ControlProportion = controlProportion;
    }

    public String getControllerSeperation() {
        return ControllerSeperation;
    }

    public void setControllerSeperation(String controllerSeperation) {
        ControllerSeperation = controllerSeperation;
    }

    public String getContrshrProportion() {
        return ContrshrProportion;
    }

    public void setContrshrProportion(String contrshrProportion) {
        ContrshrProportion = contrshrProportion;
    }

    public String getContrshrNature() {
        return ContrshrNature;
    }

    public void setContrshrNature(String contrshrNature) {
        ContrshrNature = contrshrNature;
    }

    public String getSharesBalance() {
        return SharesBalance;
    }

    public void setSharesBalance(String sharesBalance) {
        SharesBalance = sharesBalance;
    }

    public String getInsInvestorProp() {
        return InsInvestorProp;
    }

    public void setInsInvestorProp(String insInvestorProp) {
        InsInvestorProp = insInvestorProp;
    }

    public String getBankHoldProportion() {
        return BankHoldProportion;
    }

    public void setBankHoldProportion(String bankHoldProportion) {
        BankHoldProportion = bankHoldProportion;
    }

    public String getISHoldBankShares() {
        return ISHoldBankShares;
    }

    public void setISHoldBankShares(String ISHoldBankShares) {
        this.ISHoldBankShares = ISHoldBankShares;
    }

    public String getHoldBankSharesProp() {
        return HoldBankSharesProp;
    }

    public void setHoldBankSharesProp(String holdBankSharesProp) {
        HoldBankSharesProp = holdBankSharesProp;
    }

    public String getISHoldOtherFinaShares() {
        return ISHoldOtherFinaShares;
    }

    public void setISHoldOtherFinaShares(String ISHoldOtherFinaShares) {
        this.ISHoldOtherFinaShares = ISHoldOtherFinaShares;
    }

    public String getTOP3SumSalary() {
        return TOP3SumSalary;
    }

    public void setTOP3SumSalary(String TOP3SumSalary) {
        this.TOP3SumSalary = TOP3SumSalary;
    }

    public String getSumSalary() {
        return SumSalary;
    }

    public void setSumSalary(String sumSalary) {
        SumSalary = sumSalary;
    }

    public String getConcurrentPosition() {
        return ConcurrentPosition;
    }

    public void setConcurrentPosition(String concurrentPosition) {
        ConcurrentPosition = concurrentPosition;
    }

    public String getMngmhldn() {
        return Mngmhldn;
    }

    public void setMngmhldn(String mngmhldn) {
        Mngmhldn = mngmhldn;
    }

    public String getBoardsize() {
        return Boardsize;
    }

    public void setBoardsize(String boardsize) {
        Boardsize = boardsize;
    }

    public String getIndDirectorRatio() {
        return IndDirectorRatio;
    }

    public void setIndDirectorRatio(String indDirectorRatio) {
        IndDirectorRatio = indDirectorRatio;
    }

    public String getSupervisorSize() {
        return SupervisorSize;
    }

    public void setSupervisorSize(String supervisorSize) {
        SupervisorSize = supervisorSize;
    }

    public String getExecutivesNumber() {
        return ExecutivesNumber;
    }

    public void setExecutivesNumber(String executivesNumber) {
        ExecutivesNumber = executivesNumber;
    }

    public String getMaleRatio() {
        return MaleRatio;
    }

    public void setMaleRatio(String maleRatio) {
        MaleRatio = maleRatio;
    }

    public String getAverageAge() {
        return AverageAge;
    }

    public void setAverageAge(String averageAge) {
        AverageAge = averageAge;
    }

    public String getMngmFinancialBack() {
        return MngmFinancialBack;
    }

    public void setMngmFinancialBack(String mngmFinancialBack) {
        MngmFinancialBack = mngmFinancialBack;
    }

    public String getMngmOverseaBack() {
        return MngmOverseaBack;
    }

    public void setMngmOverseaBack(String mngmOverseaBack) {
        MngmOverseaBack = mngmOverseaBack;
    }

    public String getIsCocurP() {
        return IsCocurP;
    }

    public void setIsCocurP(String isCocurP) {
        IsCocurP = isCocurP;
    }

    public String getStaffNumber() {
        return StaffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        StaffNumber = staffNumber;
    }

    public String getProfitPerCapita() {
        return ProfitPerCapita;
    }

    public void setProfitPerCapita(String profitPerCapita) {
        ProfitPerCapita = profitPerCapita;
    }

    public String getExcessEmployeeRate() {
        return ExcessEmployeeRate;
    }

    public void setExcessEmployeeRate(String excessEmployeeRate) {
        ExcessEmployeeRate = excessEmployeeRate;
    }

    public String getStaffIntensity() {
        return StaffIntensity;
    }

    public void setStaffIntensity(String staffIntensity) {
        StaffIntensity = staffIntensity;
    }

    public String getIndDirectorNetCentrality() {
        return IndDirectorNetCentrality;
    }

    public void setIndDirectorNetCentrality(String indDirectorNetCentrality) {
        IndDirectorNetCentrality = indDirectorNetCentrality;
    }

    public String getOneControlMany() {
        return OneControlMany;
    }

    public void setOneControlMany(String oneControlMany) {
        OneControlMany = oneControlMany;
    }
}
