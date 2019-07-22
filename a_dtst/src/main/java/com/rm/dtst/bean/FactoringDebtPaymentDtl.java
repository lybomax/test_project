package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:应收账款付款提示明细表
 * 创建日期:2019-07-22 09:36:20
 */
@Table("factoring_debt_payment_dtl")
public class FactoringDebtPaymentDtl{

   /**
      *ID 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *主表ID 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String infId;
   /**
      *关联合同编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String financingContId;
   /**
      *关联应收账款编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String debtId;
   /**
      *融资方案编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String schemeId;
   /**
      *产品编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String productId;
   /**
      *基础产品编号 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String baseProductId;
   /**
      *卖方客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String customerSeller;
   /**
      *卖方客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String sellerName;
   /**
      *买方客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String customerBuyer;
   /**
      *买方客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String buyerName;
   /**
      *账期 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer payDays;
   /**
      *宽限期 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer gracePeriod;
   /**
      *凭证号码 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String debtNo;
   /**
      *凭证类型:01-发票 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String debtType;
   /**
      *发票代码 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String billsCode;
   /**
      *凭证日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String debtDate;
   /**
      *凭证到期日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String endDate;
   /**
      *最迟付款日 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String latePaymentDate;
   /**
      *凭证金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal debtAmt;
   /**
      *票面金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal debtAmtView;
   /**
      *应收账款余额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal remainingAmt;
   /**
      *已用金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal useAmt;
   /**
      *已融资金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanAmt;
   /**
      *可融资金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanRemainingAmt;
   /**
      *融资比例 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanPercent;
   /**
      *本次使用金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal amt;
   /**
      *付款余额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal paymentRemAmt;
   /**
      *机构号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String branchId;
   /**
      *最后更新时间 
      *数据类型：char(17) 
      *是否必填:true 
   **/
   private java.lang.String updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

  //get和set方法
   /**
    *ID
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *ID
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *主表ID
    *@return java.lang.String
    */
   public java.lang.String getInfId(){
      return infId;
   }

   /**
    *主表ID
    *@param infId
    */
   public void setInfId(java.lang.String infId){
      this.infId = infId;
   }

   /**
    *关联合同编号
    *@return java.lang.String
    */
   public java.lang.String getFinancingContId(){
      return financingContId;
   }

   /**
    *关联合同编号
    *@param financingContId
    */
   public void setFinancingContId(java.lang.String financingContId){
      this.financingContId = financingContId;
   }

   /**
    *关联应收账款编号
    *@return java.lang.String
    */
   public java.lang.String getDebtId(){
      return debtId;
   }

   /**
    *关联应收账款编号
    *@param debtId
    */
   public void setDebtId(java.lang.String debtId){
      this.debtId = debtId;
   }

   /**
    *融资方案编号
    *@return java.lang.String
    */
   public java.lang.String getSchemeId(){
      return schemeId;
   }

   /**
    *融资方案编号
    *@param schemeId
    */
   public void setSchemeId(java.lang.String schemeId){
      this.schemeId = schemeId;
   }

   /**
    *产品编号
    *@return java.lang.String
    */
   public java.lang.String getProductId(){
      return productId;
   }

   /**
    *产品编号
    *@param productId
    */
   public void setProductId(java.lang.String productId){
      this.productId = productId;
   }

   /**
    *基础产品编号
    *@return java.lang.String
    */
   public java.lang.String getBaseProductId(){
      return baseProductId;
   }

   /**
    *基础产品编号
    *@param baseProductId
    */
   public void setBaseProductId(java.lang.String baseProductId){
      this.baseProductId = baseProductId;
   }

   /**
    *卖方客户号
    *@return java.lang.String
    */
   public java.lang.String getCustomerSeller(){
      return customerSeller;
   }

   /**
    *卖方客户号
    *@param customerSeller
    */
   public void setCustomerSeller(java.lang.String customerSeller){
      this.customerSeller = customerSeller;
   }

   /**
    *卖方客户名称
    *@return java.lang.String
    */
   public java.lang.String getSellerName(){
      return sellerName;
   }

   /**
    *卖方客户名称
    *@param sellerName
    */
   public void setSellerName(java.lang.String sellerName){
      this.sellerName = sellerName;
   }

   /**
    *买方客户号
    *@return java.lang.String
    */
   public java.lang.String getCustomerBuyer(){
      return customerBuyer;
   }

   /**
    *买方客户号
    *@param customerBuyer
    */
   public void setCustomerBuyer(java.lang.String customerBuyer){
      this.customerBuyer = customerBuyer;
   }

   /**
    *买方客户名称
    *@return java.lang.String
    */
   public java.lang.String getBuyerName(){
      return buyerName;
   }

   /**
    *买方客户名称
    *@param buyerName
    */
   public void setBuyerName(java.lang.String buyerName){
      this.buyerName = buyerName;
   }

   /**
    *账期
    *@return java.lang.Integer
    */
   public java.lang.Integer getPayDays(){
      return payDays;
   }

   /**
    *账期
    *@param payDays
    */
   public void setPayDays(java.lang.Integer payDays){
      this.payDays = payDays;
   }

   /**
    *宽限期
    *@return java.lang.Integer
    */
   public java.lang.Integer getGracePeriod(){
      return gracePeriod;
   }

   /**
    *宽限期
    *@param gracePeriod
    */
   public void setGracePeriod(java.lang.Integer gracePeriod){
      this.gracePeriod = gracePeriod;
   }

   /**
    *凭证号码
    *@return java.lang.String
    */
   public java.lang.String getDebtNo(){
      return debtNo;
   }

   /**
    *凭证号码
    *@param debtNo
    */
   public void setDebtNo(java.lang.String debtNo){
      this.debtNo = debtNo;
   }

   /**
    *凭证类型:01-发票
    *@return java.lang.String
    */
   public java.lang.String getDebtType(){
      return debtType;
   }

   /**
    *凭证类型:01-发票
    *@param debtType
    */
   public void setDebtType(java.lang.String debtType){
      this.debtType = debtType;
   }

   /**
    *发票代码
    *@return java.lang.String
    */
   public java.lang.String getBillsCode(){
      return billsCode;
   }

   /**
    *发票代码
    *@param billsCode
    */
   public void setBillsCode(java.lang.String billsCode){
      this.billsCode = billsCode;
   }

   /**
    *凭证日期
    *@return java.lang.String
    */
   public java.lang.String getDebtDate(){
      return debtDate;
   }

   /**
    *凭证日期
    *@param debtDate
    */
   public void setDebtDate(java.lang.String debtDate){
      this.debtDate = debtDate;
   }

   /**
    *凭证到期日期
    *@return java.lang.String
    */
   public java.lang.String getEndDate(){
      return endDate;
   }

   /**
    *凭证到期日期
    *@param endDate
    */
   public void setEndDate(java.lang.String endDate){
      this.endDate = endDate;
   }

   /**
    *最迟付款日
    *@return java.lang.String
    */
   public java.lang.String getLatePaymentDate(){
      return latePaymentDate;
   }

   /**
    *最迟付款日
    *@param latePaymentDate
    */
   public void setLatePaymentDate(java.lang.String latePaymentDate){
      this.latePaymentDate = latePaymentDate;
   }

   /**
    *凭证金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getDebtAmt(){
      return debtAmt;
   }

   /**
    *凭证金额
    *@param debtAmt
    */
   public void setDebtAmt(java.math.BigDecimal debtAmt){
      this.debtAmt = debtAmt;
   }

   /**
    *票面金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getDebtAmtView(){
      return debtAmtView;
   }

   /**
    *票面金额
    *@param debtAmtView
    */
   public void setDebtAmtView(java.math.BigDecimal debtAmtView){
      this.debtAmtView = debtAmtView;
   }

   /**
    *应收账款余额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getRemainingAmt(){
      return remainingAmt;
   }

   /**
    *应收账款余额
    *@param remainingAmt
    */
   public void setRemainingAmt(java.math.BigDecimal remainingAmt){
      this.remainingAmt = remainingAmt;
   }

   /**
    *已用金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getUseAmt(){
      return useAmt;
   }

   /**
    *已用金额
    *@param useAmt
    */
   public void setUseAmt(java.math.BigDecimal useAmt){
      this.useAmt = useAmt;
   }

   /**
    *已融资金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLoanAmt(){
      return loanAmt;
   }

   /**
    *已融资金额
    *@param loanAmt
    */
   public void setLoanAmt(java.math.BigDecimal loanAmt){
      this.loanAmt = loanAmt;
   }

   /**
    *可融资金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLoanRemainingAmt(){
      return loanRemainingAmt;
   }

   /**
    *可融资金额
    *@param loanRemainingAmt
    */
   public void setLoanRemainingAmt(java.math.BigDecimal loanRemainingAmt){
      this.loanRemainingAmt = loanRemainingAmt;
   }

   /**
    *融资比例
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLoanPercent(){
      return loanPercent;
   }

   /**
    *融资比例
    *@param loanPercent
    */
   public void setLoanPercent(java.math.BigDecimal loanPercent){
      this.loanPercent = loanPercent;
   }

   /**
    *本次使用金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAmt(){
      return amt;
   }

   /**
    *本次使用金额
    *@param amt
    */
   public void setAmt(java.math.BigDecimal amt){
      this.amt = amt;
   }

   /**
    *付款余额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPaymentRemAmt(){
      return paymentRemAmt;
   }

   /**
    *付款余额
    *@param paymentRemAmt
    */
   public void setPaymentRemAmt(java.math.BigDecimal paymentRemAmt){
      this.paymentRemAmt = paymentRemAmt;
   }

   /**
    *机构号
    *@return java.lang.String
    */
   public java.lang.String getBranchId(){
      return branchId;
   }

   /**
    *机构号
    *@param branchId
    */
   public void setBranchId(java.lang.String branchId){
      this.branchId = branchId;
   }

   /**
    *最后更新时间
    *@return java.lang.String
    */
   public java.lang.String getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.lang.String updateTime){
      this.updateTime = updateTime;
   }

   /**
    *最后更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProg(){
      return updateProg;
   }

   /**
    *最后更新程序
    *@param updateProg
    */
   public void setUpdateProg(java.lang.String updateProg){
      this.updateProg = updateProg;
   }

}