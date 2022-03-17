package com.dlut.citiproject.Bean;

import javax.persistence.*;

@Entity
@Table(name = "source_财务指标")
public class source_Finance {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    //属性
    private int id;
    //属性
    private String stkcd;
    private String ShortName;
    private String IndustryCode;
    private String IndustryName;
    private String EndDate;
    private String StateType;
    private String TotalAssets;
    private String TotalLiabilities;
    private String OperatingRevenue;
    private String OperatingNetCashFlow;
    private String ROA;
    private String AssetLiabilityRatio;
    private String FinancialLiability;
    private String OperatingLiability;
    private String BookToMarketRatio;
    private String ManagementExpenseRate;
    private String TangibleAssetRatio;
    private String CurrentRatio;
    private String InventoryTurnover;
    private String WorkingCapitalTurnover;
    private String CashEquivalentsTurnover;
    private String OperatingRevenueGrowth;
    private String NonDebtTaxShield;
    private String IncomeTaxTate;
    private String ProfitsVolatility;
    private String CashFlowVolatility;
    private String InterestCoverageRatio;
    private String TaxBearing;
    private String BankLoanRatio;
    private String ShortLoanDependence;
    private String ShareholdersOccupy;

    public source_Finance(String stkcd, String shortName, String industryCode, String industryName, String endDate, String stateType, String totalAssets, String totalLiabilities, String operatingRevenue, String operatingNetCashFlow, String roa, String assetLiabilityRatio, String financialLiability, String operatingLiability, String bookToMarketRatio, String managementExpenseRate, String tangibleAssetRatio, String currentRatio, String inventoryTurnover, String workingCapitalTurnover, String cashEquivalentsTurnover, String operatingRevenueGrowth, String nonDebtTaxShield, String incomeTaxTate, String profitsVolatility, String cashFlowVolatility, String interestCoverageRatio, String taxBearing, String bankLoanRatio, String shortLoanDependence, String shareholdersOccupy) {
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
        ROA = roa;
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


    //有参构造

    //无参构造
}