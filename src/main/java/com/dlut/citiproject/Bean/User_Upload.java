package com.dlut.citiproject.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//企业上传信息表
@Entity
@Table(name = "企业上传信息表")
public class User_Upload {
    @Id
    //属性
    private int id;
    private String name;    //用户名
    private String Corporation_Name;    //企业名称
    private String EnvironmentalActions_Number;    //环保专项行动次数
    private String EnvironmentalInput_Costs;    //环保项目投入费用
    private String Environmental_Investment;    //环保投资
    private String EmissionReductions_Number;  //废水、废气等减排治理次数
    private String Environmental_Reports;  //环境报告/社会责任报告
    private String Certification_ISO9001;   //是否通过ISO9001认证
    private String Work_Accidents;     //工伤事故
    private String MajorSafety_Accidents;  //重大安全事故
    private String Customer_Satisfaction;   //客户满意度
    private String EmployedPeople_Placement;   //安置社会就业人员
    private String Employee_Satisfaction;   //员工满意度
    private String Complaint_Incidents;    //歧视相关的申诉事件
    private String NetProfit_Margin;    //总资产净利润率
    private String Debt_Ratio;  //资产负债率
    private String IncomeGrowth_Ratio;  //营业收入增长率
    private String Financial_Leverage;  //财务杠杆
    private String Operating_Leverage;  //经营杠杆
    private String Consolidated_Leverage;   //综合杠杆
    private String StockholderShareholding_Ratio;   //控股股东持股比例
    private String InvestorShareholding_Ratio;  //机构投资者持股比例
    private String ManagerShareholding_Ratio;   //管理层持股比例

    //有参构造
    public User_Upload(String name, String corporation_Name, String environmentalActions_Number, String environmentalInput_Costs, String environmental_Investment,
                       String emissionReductions_Number, String environmental_Reports, String certification_ISO9001, String work_Accidents,
                       String majorSafety_Accidents, String customer_Satisfaction, String employedPeople_Placement, String employee_Satisfaction,
                       String complaint_Incidents, String netProfit_Margin, String debt_Ratio, String incomeGrowth_Ratio, String financial_Leverage,
                       String operating_Leverage, String consolidated_Leverage, String stockholderShareholding_Ratio, String investorShareholding_Ratio,
                       String managerShareholding_Ratio) {
        this.name = name;
        Corporation_Name = corporation_Name;
        EnvironmentalActions_Number = environmentalActions_Number;
        EnvironmentalInput_Costs = environmentalInput_Costs;
        Environmental_Investment = environmental_Investment;
        EmissionReductions_Number = emissionReductions_Number;
        Environmental_Reports = environmental_Reports;
        Certification_ISO9001 = certification_ISO9001;
        Work_Accidents = work_Accidents;
        MajorSafety_Accidents = majorSafety_Accidents;
        Customer_Satisfaction = customer_Satisfaction;
        EmployedPeople_Placement = employedPeople_Placement;
        Employee_Satisfaction = employee_Satisfaction;
        Complaint_Incidents = complaint_Incidents;
        NetProfit_Margin = netProfit_Margin;
        Debt_Ratio = debt_Ratio;
        IncomeGrowth_Ratio = incomeGrowth_Ratio;
        Financial_Leverage = financial_Leverage;
        Operating_Leverage = operating_Leverage;
        Consolidated_Leverage = consolidated_Leverage;
        StockholderShareholding_Ratio = stockholderShareholding_Ratio;
        InvestorShareholding_Ratio = investorShareholding_Ratio;
        ManagerShareholding_Ratio = managerShareholding_Ratio;
    }

    //无参构造
    public User_Upload(){

    }

    public String getCorporation_Name() {
        return Corporation_Name;
    }

    public void setCorporation_Name(String corporation_Name) {
        Corporation_Name = corporation_Name;
    }

    public String getEnvironmentalActions_Number() {
        return EnvironmentalActions_Number;
    }

    public void setEnvironmentalActions_Number(String environmentalActions_Number) {
        EnvironmentalActions_Number = environmentalActions_Number;
    }

    public String getEnvironmentalInput_Costs() {
        return EnvironmentalInput_Costs;
    }

    public void setEnvironmentalInput_Costs(String environmentalInput_Costs) {
        EnvironmentalInput_Costs = environmentalInput_Costs;
    }

    public String getEnvironmental_Investment() {
        return Environmental_Investment;
    }

    public void setEnvironmental_Investment(String environmental_Investment) {
        Environmental_Investment = environmental_Investment;
    }

    public String getEmissionReductions_Number() {
        return EmissionReductions_Number;
    }

    public void setEmissionReductions_Number(String emissionReductions_Number) {
        EmissionReductions_Number = emissionReductions_Number;
    }

    public String getEnvironmental_Reports() {
        return Environmental_Reports;
    }

    public void setEnvironmental_Reports(String environmental_Reports) {
        Environmental_Reports = environmental_Reports;
    }

    public String getCertification_ISO9001() {
        return Certification_ISO9001;
    }

    public void setCertification_ISO9001(String certification_ISO9001) {
        Certification_ISO9001 = certification_ISO9001;
    }

    public String getWork_Accidents() {
        return Work_Accidents;
    }

    public void setWork_Accidents(String work_Accidents) {
        Work_Accidents = work_Accidents;
    }

    public String getMajorSafety_Accidents() {
        return MajorSafety_Accidents;
    }

    public void setMajorSafety_Accidents(String majorSafety_Accidents) {
        MajorSafety_Accidents = majorSafety_Accidents;
    }

    public String getCustomer_Satisfaction() {
        return Customer_Satisfaction;
    }

    public void setCustomer_Satisfaction(String customer_Satisfaction) {
        Customer_Satisfaction = customer_Satisfaction;
    }

    public String getEmployedPeople_Placement() {
        return EmployedPeople_Placement;
    }

    public void setEmployedPeople_Placement(String employedPeople_Placement) {
        EmployedPeople_Placement = employedPeople_Placement;
    }

    public String getEmployee_Satisfaction() {
        return Employee_Satisfaction;
    }

    public void setEmployee_Satisfaction(String employee_Satisfaction) {
        Employee_Satisfaction = employee_Satisfaction;
    }

    public String getComplaint_Incidents() {
        return Complaint_Incidents;
    }

    public void setComplaint_Incidents(String complaint_Incidents) {
        Complaint_Incidents = complaint_Incidents;
    }

    public String getNetProfit_Margin() {
        return NetProfit_Margin;
    }

    public void setNetProfit_Margin(String netProfit_Margin) {
        NetProfit_Margin = netProfit_Margin;
    }

    public String getDebt_Ratio() {
        return Debt_Ratio;
    }

    public void setDebt_Ratio(String debt_Ratio) {
        Debt_Ratio = debt_Ratio;
    }

    public String getIncomeGrowth_Ratio() {
        return IncomeGrowth_Ratio;
    }

    public void setIncomeGrowth_Ratio(String incomeGrowth_Ratio) {
        IncomeGrowth_Ratio = incomeGrowth_Ratio;
    }

    public String getFinancial_Leverage() {
        return Financial_Leverage;
    }

    public void setFinancial_Leverage(String financial_Leverage) {
        Financial_Leverage = financial_Leverage;
    }

    public String getOperating_Leverage() {
        return Operating_Leverage;
    }

    public void setOperating_Leverage(String operating_Leverage) {
        Operating_Leverage = operating_Leverage;
    }

    public String getConsolidated_Leverage() {
        return Consolidated_Leverage;
    }

    public void setConsolidated_Leverage(String consolidated_Leverage) {
        Consolidated_Leverage = consolidated_Leverage;
    }

    public String getStockholderShareholding_Ratio() {
        return StockholderShareholding_Ratio;
    }

    public void setStockholderShareholding_Ratio(String stockholderShareholding_Ratio) {
        StockholderShareholding_Ratio = stockholderShareholding_Ratio;
    }

    public String getInvestorShareholding_Ratio() {
        return InvestorShareholding_Ratio;
    }

    public void setInvestorShareholding_Ratio(String investorShareholding_Ratio) {
        InvestorShareholding_Ratio = investorShareholding_Ratio;
    }

    public String getManagerShareholding_Ratio() {
        return ManagerShareholding_Ratio;
    }

    public void setManagerShareholding_Ratio(String managerShareholding_Ratio) {
        ManagerShareholding_Ratio = managerShareholding_Ratio;
    }
}
