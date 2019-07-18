package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业应收账款融资融资方案表
 * 创建日期:2019-07-18 10:23:32
 */
@Table("factoring_cust_finance_scheme")
public class FactoringCustFinanceScheme{

   /**
      *ID 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String schemeId;
   /**
      *申请编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String appNo;
   /**
      *融资客户编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *融资客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *融资方案名称 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String schemeName;
   /**
      *产品编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String productId;
   /**
      *产品名称 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String productName;
   /**
      *融资模式:逐笔融资、框架合同融资 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String financeMode;
   /**
      *产品名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String baseProductName;
   /**
      *参考利率区间下限 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal referenceRateMin;
   /**
      *参考利率区间上限 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal referenceRateMax;
   /**
      *罚息利率区间下限 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal penaltyRateMin;
   /**
      *罚息利率区间上限 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal penaltyRateMax;
   /**
      *还款方式:
            01一次性还本付息
            02每月还息到期还本
            03等额本息
            04等额本金
            05自定义还款 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String repayType;
   /**
      *收费标识
            0-不收费
            1-收费 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String feeFlag;
   /**
      *状态 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *锁定标志 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLocked;
   /**
      *锁定申请编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String lockAppNo;
   /**
      *核心企业客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String coreCustcd;
   /**
      *核心企业名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String coreCustname;
   /**
      *额度编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String creditNo;
   /**
      *融资比例 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanPercent;
   /**
      *融资模式：1-发票融资;2-池融资 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String financingType;
   /**
      *服务内容：保理融资;账款管理;应收租金催收;坏账担保 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String serviceContent;
   /**
      *出账类型
            01-流贷 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String loanWay;
   /**
      *建立时间 
      *数据类型：char(17) 
      *是否必填:true 
   **/
   private java.lang.String createTime;
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
   /**
      *产品编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String baseProductId;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String capitalCustcd;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String capitalCustname;
   /**
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanCost;

  //get和set方法
   /**
    *ID
    *@return java.lang.String
    */
   public java.lang.String getSchemeId(){
      return schemeId;
   }

   /**
    *ID
    *@param schemeId
    */
   public void setSchemeId(java.lang.String schemeId){
      this.schemeId = schemeId;
   }

   /**
    *申请编号
    *@return java.lang.String
    */
   public java.lang.String getAppNo(){
      return appNo;
   }

   /**
    *申请编号
    *@param appNo
    */
   public void setAppNo(java.lang.String appNo){
      this.appNo = appNo;
   }

   /**
    *融资客户编号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *融资客户编号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *融资客户名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *融资客户名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *融资方案名称
    *@return java.lang.String
    */
   public java.lang.String getSchemeName(){
      return schemeName;
   }

   /**
    *融资方案名称
    *@param schemeName
    */
   public void setSchemeName(java.lang.String schemeName){
      this.schemeName = schemeName;
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
    *产品名称
    *@return java.lang.String
    */
   public java.lang.String getProductName(){
      return productName;
   }

   /**
    *产品名称
    *@param productName
    */
   public void setProductName(java.lang.String productName){
      this.productName = productName;
   }

   /**
    *融资模式:逐笔融资、框架合同融资
    *@return java.lang.String
    */
   public java.lang.String getFinanceMode(){
      return financeMode;
   }

   /**
    *融资模式:逐笔融资、框架合同融资
    *@param financeMode
    */
   public void setFinanceMode(java.lang.String financeMode){
      this.financeMode = financeMode;
   }

   /**
    *产品名称
    *@return java.lang.String
    */
   public java.lang.String getBaseProductName(){
      return baseProductName;
   }

   /**
    *产品名称
    *@param baseProductName
    */
   public void setBaseProductName(java.lang.String baseProductName){
      this.baseProductName = baseProductName;
   }

   /**
    *参考利率区间下限
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReferenceRateMin(){
      return referenceRateMin;
   }

   /**
    *参考利率区间下限
    *@param referenceRateMin
    */
   public void setReferenceRateMin(java.math.BigDecimal referenceRateMin){
      this.referenceRateMin = referenceRateMin;
   }

   /**
    *参考利率区间上限
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReferenceRateMax(){
      return referenceRateMax;
   }

   /**
    *参考利率区间上限
    *@param referenceRateMax
    */
   public void setReferenceRateMax(java.math.BigDecimal referenceRateMax){
      this.referenceRateMax = referenceRateMax;
   }

   /**
    *罚息利率区间下限
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPenaltyRateMin(){
      return penaltyRateMin;
   }

   /**
    *罚息利率区间下限
    *@param penaltyRateMin
    */
   public void setPenaltyRateMin(java.math.BigDecimal penaltyRateMin){
      this.penaltyRateMin = penaltyRateMin;
   }

   /**
    *罚息利率区间上限
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPenaltyRateMax(){
      return penaltyRateMax;
   }

   /**
    *罚息利率区间上限
    *@param penaltyRateMax
    */
   public void setPenaltyRateMax(java.math.BigDecimal penaltyRateMax){
      this.penaltyRateMax = penaltyRateMax;
   }

   /**
    *还款方式:
            01一次性还本付息
            02每月还息到期还本
            03等额本息
            04等额本金
            05自定义还款
    *@return java.lang.String
    */
   public java.lang.String getRepayType(){
      return repayType;
   }

   /**
    *还款方式:
            01一次性还本付息
            02每月还息到期还本
            03等额本息
            04等额本金
            05自定义还款
    *@param repayType
    */
   public void setRepayType(java.lang.String repayType){
      this.repayType = repayType;
   }

   /**
    *收费标识
            0-不收费
            1-收费
    *@return java.lang.String
    */
   public java.lang.String getFeeFlag(){
      return feeFlag;
   }

   /**
    *收费标识
            0-不收费
            1-收费
    *@param feeFlag
    */
   public void setFeeFlag(java.lang.String feeFlag){
      this.feeFlag = feeFlag;
   }

   /**
    *状态
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *锁定标志
    *@return java.lang.String
    */
   public java.lang.String getIsLocked(){
      return isLocked;
   }

   /**
    *锁定标志
    *@param isLocked
    */
   public void setIsLocked(java.lang.String isLocked){
      this.isLocked = isLocked;
   }

   /**
    *锁定申请编号
    *@return java.lang.String
    */
   public java.lang.String getLockAppNo(){
      return lockAppNo;
   }

   /**
    *锁定申请编号
    *@param lockAppNo
    */
   public void setLockAppNo(java.lang.String lockAppNo){
      this.lockAppNo = lockAppNo;
   }

   /**
    *核心企业客户号
    *@return java.lang.String
    */
   public java.lang.String getCoreCustcd(){
      return coreCustcd;
   }

   /**
    *核心企业客户号
    *@param coreCustcd
    */
   public void setCoreCustcd(java.lang.String coreCustcd){
      this.coreCustcd = coreCustcd;
   }

   /**
    *核心企业名称
    *@return java.lang.String
    */
   public java.lang.String getCoreCustname(){
      return coreCustname;
   }

   /**
    *核心企业名称
    *@param coreCustname
    */
   public void setCoreCustname(java.lang.String coreCustname){
      this.coreCustname = coreCustname;
   }

   /**
    *额度编号
    *@return java.lang.String
    */
   public java.lang.String getCreditNo(){
      return creditNo;
   }

   /**
    *额度编号
    *@param creditNo
    */
   public void setCreditNo(java.lang.String creditNo){
      this.creditNo = creditNo;
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
    *融资模式：1-发票融资;2-池融资
    *@return java.lang.String
    */
   public java.lang.String getFinancingType(){
      return financingType;
   }

   /**
    *融资模式：1-发票融资;2-池融资
    *@param financingType
    */
   public void setFinancingType(java.lang.String financingType){
      this.financingType = financingType;
   }

   /**
    *服务内容：保理融资;账款管理;应收租金催收;坏账担保
    *@return java.lang.String
    */
   public java.lang.String getServiceContent(){
      return serviceContent;
   }

   /**
    *服务内容：保理融资;账款管理;应收租金催收;坏账担保
    *@param serviceContent
    */
   public void setServiceContent(java.lang.String serviceContent){
      this.serviceContent = serviceContent;
   }

   /**
    *出账类型
            01-流贷
    *@return java.lang.String
    */
   public java.lang.String getLoanWay(){
      return loanWay;
   }

   /**
    *出账类型
            01-流贷
    *@param loanWay
    */
   public void setLoanWay(java.lang.String loanWay){
      this.loanWay = loanWay;
   }

   /**
    *建立时间
    *@return java.lang.String
    */
   public java.lang.String getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.lang.String createTime){
      this.createTime = createTime;
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

   /**
    *产品编号
    *@return java.lang.String
    */
   public java.lang.String getBaseProductId(){
      return baseProductId;
   }

   /**
    *产品编号
    *@param baseProductId
    */
   public void setBaseProductId(java.lang.String baseProductId){
      this.baseProductId = baseProductId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCapitalCustcd(){
      return capitalCustcd;
   }

   /**
    *
    *@param capitalCustcd
    */
   public void setCapitalCustcd(java.lang.String capitalCustcd){
      this.capitalCustcd = capitalCustcd;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCapitalCustname(){
      return capitalCustname;
   }

   /**
    *
    *@param capitalCustname
    */
   public void setCapitalCustname(java.lang.String capitalCustname){
      this.capitalCustname = capitalCustname;
   }

   /**
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLoanCost(){
      return loanCost;
   }

   /**
    *
    *@param loanCost
    */
   public void setLoanCost(java.math.BigDecimal loanCost){
      this.loanCost = loanCost;
   }

}