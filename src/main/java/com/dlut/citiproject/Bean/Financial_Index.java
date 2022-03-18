package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//source_财务指标
@Entity
@Table(name = "source_财务指标")
public class Financial_Index {
    @Id
    //属性
    private String stkcd;   //证券代码
    private String ShortName;   //证券简称
    private String IndustryCode;    //行业代码
    private String IndustryName;    //行业名称
    private String EndDate;     //会计期间
    private String StateType;   //报表类型
    private String TotalAssets;     //总资产
    private String TotalLiabilities;    //总负债
    private String OperatingRevenue;    //营业收入
    private String OperatingNetCashFlow;    //经营性净现金流
    private String ROA;     //总资产净利润率
    private String AssetLiabilityRatio;     //资产负债率
    private String FinancialLiability;  //金融负债
    private String OperatingLiability;  //经营负债
    private String BookToMarketRatio;   //账面市值比
    private String ManagementExpenseRate;   //管理费用率
    private String TangibleAssetRatio;  //有形资产比率
    private String CurrentRatio;    //流动比率
    private String InventoryTurnover;   //存货周转率
    private String WorkingCapitalTurnover;  //营运资金周转率
    private String CashEquivalentsTurnover;     //现金及现金等价物周转率
    private String OperatingRevenueGrowth;  //营业收入增长率
    private String NonDebtTaxShield;    //非债务税盾
    private String IncomeTaxTate;   //所得税率
    private String ProfitsVolatility;   //盈利波动性
    private String CashFlowVolatility;  //现金流波动性
    private String InterestCoverageRatio;   //利息覆盖率
    private String TaxBearing;  //税负
    private String BankLoanRatio;   //银行借款比例
    private String ShortLoanDependence; //短期借款依赖度
    private String ShareholdersOccupy;  //大股东占款


    //有参构造
    public Financial_Index(String stkcd, String shortName, String industryCode, String industryName, String endDate, String stateType, String totalAssets, String totalLiabilities, String operatingRevenue, String operatingNetCashFlow, String ROA, String assetLiabilityRatio, String financialLiability, String operatingLiability, String bookToMarketRatio, String managementExpenseRate, String tangibleAssetRatio, String currentRatio, String inventoryTurnover, String workingCapitalTurnover, String cashEquivalentsTurnover, String operatingRevenueGrowth, String nonDebtTaxShield, String incomeTaxTate, String profitsVolatility, String cashFlowVolatility, String interestCoverageRatio, String taxBearing, String bankLoanRatio, String shortLoanDependence, String shareholdersOccupy) {
        this.stkcd = stkcd;
        ShortName = shortName;
        IndustryCode = industryCode;
        IndustryName = industryName;
        EndDate = endDate;
        StateType = stateType;
        TotalAssets = totalAssets;
        TotalLiabilities = totalLiabilities;
        OperatingRevenue = operatingRevenue;
        OperatingNetCashFlow = operatingNetCashFlow;
        this.ROA = ROA;
        AssetLiabilityRatio = assetLiabilityRatio;
        FinancialLiability = financialLiability;
        OperatingLiability = operatingLiability;
        BookToMarketRatio = bookToMarketRatio;
        ManagementExpenseRate = managementExpenseRate;
        TangibleAssetRatio = tangibleAssetRatio;
        CurrentRatio = currentRatio;
        InventoryTurnover = inventoryTurnover;
        WorkingCapitalTurnover = workingCapitalTurnover;
        CashEquivalentsTurnover = cashEquivalentsTurnover;
        OperatingRevenueGrowth = operatingRevenueGrowth;
        NonDebtTaxShield = nonDebtTaxShield;
        IncomeTaxTate = incomeTaxTate;
        ProfitsVolatility = profitsVolatility;
        CashFlowVolatility = cashFlowVolatility;
        InterestCoverageRatio = interestCoverageRatio;
        TaxBearing = taxBearing;
        BankLoanRatio = bankLoanRatio;
        ShortLoanDependence = shortLoanDependence;
        ShareholdersOccupy = shareholdersOccupy;
    }

    //无参构造
    public Financial_Index() {

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

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getStateType() {
        return StateType;
    }

    public void setStateType(String stateType) {
        StateType = stateType;
    }

    public String getTotalAssets() {
        return TotalAssets;
    }

    public void setTotalAssets(String totalAssets) {
        TotalAssets = totalAssets;
    }

    public String getTotalLiabilities() {
        return TotalLiabilities;
    }

    public void setTotalLiabilities(String totalLiabilities) {
        TotalLiabilities = totalLiabilities;
    }

    public String getOperatingRevenue() {
        return OperatingRevenue;
    }

    public void setOperatingRevenue(String operatingRevenue) {
        OperatingRevenue = operatingRevenue;
    }

    public String getOperatingNetCashFlow() {
        return OperatingNetCashFlow;
    }

    public void setOperatingNetCashFlow(String operatingNetCashFlow) {
        OperatingNetCashFlow = operatingNetCashFlow;
    }

    public String getROA() {
        return ROA;
    }

    public void setROA(String ROA) {
        this.ROA = ROA;
    }

    public String getAssetLiabilityRatio() {
        return AssetLiabilityRatio;
    }

    public void setAssetLiabilityRatio(String assetLiabilityRatio) {
        AssetLiabilityRatio = assetLiabilityRatio;
    }

    public String getFinancialLiability() {
        return FinancialLiability;
    }

    public void setFinancialLiability(String financialLiability) {
        FinancialLiability = financialLiability;
    }

    public String getOperatingLiability() {
        return OperatingLiability;
    }

    public void setOperatingLiability(String operatingLiability) {
        OperatingLiability = operatingLiability;
    }

    public String getBookToMarketRatio() {
        return BookToMarketRatio;
    }

    public void setBookToMarketRatio(String bookToMarketRatio) {
        BookToMarketRatio = bookToMarketRatio;
    }

    public String getManagementExpenseRate() {
        return ManagementExpenseRate;
    }

    public void setManagementExpenseRate(String managementExpenseRate) {
        ManagementExpenseRate = managementExpenseRate;
    }

    public String getTangibleAssetRatio() {
        return TangibleAssetRatio;
    }

    public void setTangibleAssetRatio(String tangibleAssetRatio) {
        TangibleAssetRatio = tangibleAssetRatio;
    }

    public String getCurrentRatio() {
        return CurrentRatio;
    }

    public void setCurrentRatio(String currentRatio) {
        CurrentRatio = currentRatio;
    }

    public String getInventoryTurnover() {
        return InventoryTurnover;
    }

    public void setInventoryTurnover(String inventoryTurnover) {
        InventoryTurnover = inventoryTurnover;
    }

    public String getWorkingCapitalTurnover() {
        return WorkingCapitalTurnover;
    }

    public void setWorkingCapitalTurnover(String workingCapitalTurnover) {
        WorkingCapitalTurnover = workingCapitalTurnover;
    }

    public String getCashEquivalentsTurnover() {
        return CashEquivalentsTurnover;
    }

    public void setCashEquivalentsTurnover(String cashEquivalentsTurnover) {
        CashEquivalentsTurnover = cashEquivalentsTurnover;
    }

    public String getOperatingRevenueGrowth() {
        return OperatingRevenueGrowth;
    }

    public void setOperatingRevenueGrowth(String operatingRevenueGrowth) {
        OperatingRevenueGrowth = operatingRevenueGrowth;
    }

    public String getNonDebtTaxShield() {
        return NonDebtTaxShield;
    }

    public void setNonDebtTaxShield(String nonDebtTaxShield) {
        NonDebtTaxShield = nonDebtTaxShield;
    }

    public String getIncomeTaxTate() {
        return IncomeTaxTate;
    }

    public void setIncomeTaxTate(String incomeTaxTate) {
        IncomeTaxTate = incomeTaxTate;
    }

    public String getProfitsVolatility() {
        return ProfitsVolatility;
    }

    public void setProfitsVolatility(String profitsVolatility) {
        ProfitsVolatility = profitsVolatility;
    }

    public String getCashFlowVolatility() {
        return CashFlowVolatility;
    }

    public void setCashFlowVolatility(String cashFlowVolatility) {
        CashFlowVolatility = cashFlowVolatility;
    }

    public String getInterestCoverageRatio() {
        return InterestCoverageRatio;
    }

    public void setInterestCoverageRatio(String interestCoverageRatio) {
        InterestCoverageRatio = interestCoverageRatio;
    }

    public String getTaxBearing() {
        return TaxBearing;
    }

    public void setTaxBearing(String taxBearing) {
        TaxBearing = taxBearing;
    }

    public String getBankLoanRatio() {
        return BankLoanRatio;
    }

    public void setBankLoanRatio(String bankLoanRatio) {
        BankLoanRatio = bankLoanRatio;
    }

    public String getShortLoanDependence() {
        return ShortLoanDependence;
    }

    public void setShortLoanDependence(String shortLoanDependence) {
        ShortLoanDependence = shortLoanDependence;
    }

    public String getShareholdersOccupy() {
        return ShareholdersOccupy;
    }

    public void setShareholdersOccupy(String shareholdersOccupy) {
        ShareholdersOccupy = shareholdersOccupy;
    }
}

