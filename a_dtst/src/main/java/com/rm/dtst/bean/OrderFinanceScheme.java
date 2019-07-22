package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:订单融资方案表
 * 创建日期:2019-07-22 09:37:28
 */
@Table("order_finance_scheme")
public class OrderFinanceScheme{

   /**
      *融资方案编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String schemeId;
   /**
      *融资方案名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String schemeName;
   /**
      *申请流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String applyLogId;
   /**
      *客户号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String custId;
   /**
      *客户名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String custName;
   /**
      *产品编号 
      *数据类型：varchar(10) 
      *是否必填:true 
   **/
   private java.lang.String productId;
   /**
      *产品名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String productName;
   /**
      *基础产品编号 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String baseProductId;
   /**
      *基础产品名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String baseProductName;
   /**
      *额度编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String creditId;
   /**
      *核心企业客户号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String coreCustId;
   /**
      *核心企业客户名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String coreCustName;
   /**
      *资金方编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String capitalCustcd;
   /**
      *资金方名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String capitalCustname;
   /**
      *签约方式
            01-线下
            02-线上 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String signMode;
   /**
      *融资模式
            1-独立合同
            2-框架合同 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String financeMode;
   /**
      *还款方式
            01一次性还本付息
            02-每月还息到期还本
            03-等额本息
            04-等额本金 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String repayMode;
   /**
      *币种 
      *数据类型：char(3) 
      *是否必填:true 
   **/
   private java.lang.String currency;
   /**
      *收费标识
            0-不收费
            1-收费 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String feeFlag;
   /**
      *融资成本 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanCost;
   /**
      *融资比例 
      *数据类型：decimal(9,6) 
      *是否必填:true 
   **/
   private java.math.BigDecimal loanPercent;
   /**
      *转应收账款融资标识
            0-否
            1-是 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String debtLoanFlag;
   /**
      *转应收账款融资比例 
      *数据类型：decimal(9,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal debtLoanPercent;
   /**
      *应收账款融资还款控制标识
            0-无限制
            1-限制只能由核心企业还款 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String debtLoanRepayFlag;
   /**
      *应收款融资追索权标识
            0-无追索
            1-有追索 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String debtRecourseFlag;
   /**
      *应收款融资保理方式
            1-明保理
            2-暗保理 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String debtFactoringMode;
   /**
      *应收款融资出账方式
            01-银承
            02-保函
            03-流贷 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String debtLoanMode;
   /**
      *锁定标识 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String lockFlag;
   /**
      *锁定申请流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String lockApplyLogId;
   /**
      *方案状态 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String schemeStatus;
   /**
      *建立时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *最后更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

  //get和set方法
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
    *申请流水号
    *@return java.lang.String
    */
   public java.lang.String getApplyLogId(){
      return applyLogId;
   }

   /**
    *申请流水号
    *@param applyLogId
    */
   public void setApplyLogId(java.lang.String applyLogId){
      this.applyLogId = applyLogId;
   }

   /**
    *客户号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *客户号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *客户名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *客户名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
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
    *基础产品名称
    *@return java.lang.String
    */
   public java.lang.String getBaseProductName(){
      return baseProductName;
   }

   /**
    *基础产品名称
    *@param baseProductName
    */
   public void setBaseProductName(java.lang.String baseProductName){
      this.baseProductName = baseProductName;
   }

   /**
    *额度编号
    *@return java.lang.String
    */
   public java.lang.String getCreditId(){
      return creditId;
   }

   /**
    *额度编号
    *@param creditId
    */
   public void setCreditId(java.lang.String creditId){
      this.creditId = creditId;
   }

   /**
    *核心企业客户号
    *@return java.lang.String
    */
   public java.lang.String getCoreCustId(){
      return coreCustId;
   }

   /**
    *核心企业客户号
    *@param coreCustId
    */
   public void setCoreCustId(java.lang.String coreCustId){
      this.coreCustId = coreCustId;
   }

   /**
    *核心企业客户名称
    *@return java.lang.String
    */
   public java.lang.String getCoreCustName(){
      return coreCustName;
   }

   /**
    *核心企业客户名称
    *@param coreCustName
    */
   public void setCoreCustName(java.lang.String coreCustName){
      this.coreCustName = coreCustName;
   }

   /**
    *资金方编号
    *@return java.lang.String
    */
   public java.lang.String getCapitalCustcd(){
      return capitalCustcd;
   }

   /**
    *资金方编号
    *@param capitalCustcd
    */
   public void setCapitalCustcd(java.lang.String capitalCustcd){
      this.capitalCustcd = capitalCustcd;
   }

   /**
    *资金方名称
    *@return java.lang.String
    */
   public java.lang.String getCapitalCustname(){
      return capitalCustname;
   }

   /**
    *资金方名称
    *@param capitalCustname
    */
   public void setCapitalCustname(java.lang.String capitalCustname){
      this.capitalCustname = capitalCustname;
   }

   /**
    *签约方式
            01-线下
            02-线上
    *@return java.lang.String
    */
   public java.lang.String getSignMode(){
      return signMode;
   }

   /**
    *签约方式
            01-线下
            02-线上
    *@param signMode
    */
   public void setSignMode(java.lang.String signMode){
      this.signMode = signMode;
   }

   /**
    *融资模式
            1-独立合同
            2-框架合同
    *@return java.lang.String
    */
   public java.lang.String getFinanceMode(){
      return financeMode;
   }

   /**
    *融资模式
            1-独立合同
            2-框架合同
    *@param financeMode
    */
   public void setFinanceMode(java.lang.String financeMode){
      this.financeMode = financeMode;
   }

   /**
    *还款方式
            01一次性还本付息
            02-每月还息到期还本
            03-等额本息
            04-等额本金
    *@return java.lang.String
    */
   public java.lang.String getRepayMode(){
      return repayMode;
   }

   /**
    *还款方式
            01一次性还本付息
            02-每月还息到期还本
            03-等额本息
            04-等额本金
    *@param repayMode
    */
   public void setRepayMode(java.lang.String repayMode){
      this.repayMode = repayMode;
   }

   /**
    *币种
    *@return java.lang.String
    */
   public java.lang.String getCurrency(){
      return currency;
   }

   /**
    *币种
    *@param currency
    */
   public void setCurrency(java.lang.String currency){
      this.currency = currency;
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
    *融资成本
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLoanCost(){
      return loanCost;
   }

   /**
    *融资成本
    *@param loanCost
    */
   public void setLoanCost(java.math.BigDecimal loanCost){
      this.loanCost = loanCost;
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
    *转应收账款融资标识
            0-否
            1-是
    *@return java.lang.String
    */
   public java.lang.String getDebtLoanFlag(){
      return debtLoanFlag;
   }

   /**
    *转应收账款融资标识
            0-否
            1-是
    *@param debtLoanFlag
    */
   public void setDebtLoanFlag(java.lang.String debtLoanFlag){
      this.debtLoanFlag = debtLoanFlag;
   }

   /**
    *转应收账款融资比例
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getDebtLoanPercent(){
      return debtLoanPercent;
   }

   /**
    *转应收账款融资比例
    *@param debtLoanPercent
    */
   public void setDebtLoanPercent(java.math.BigDecimal debtLoanPercent){
      this.debtLoanPercent = debtLoanPercent;
   }

   /**
    *应收账款融资还款控制标识
            0-无限制
            1-限制只能由核心企业还款
    *@return java.lang.String
    */
   public java.lang.String getDebtLoanRepayFlag(){
      return debtLoanRepayFlag;
   }

   /**
    *应收账款融资还款控制标识
            0-无限制
            1-限制只能由核心企业还款
    *@param debtLoanRepayFlag
    */
   public void setDebtLoanRepayFlag(java.lang.String debtLoanRepayFlag){
      this.debtLoanRepayFlag = debtLoanRepayFlag;
   }

   /**
    *应收款融资追索权标识
            0-无追索
            1-有追索
    *@return java.lang.String
    */
   public java.lang.String getDebtRecourseFlag(){
      return debtRecourseFlag;
   }

   /**
    *应收款融资追索权标识
            0-无追索
            1-有追索
    *@param debtRecourseFlag
    */
   public void setDebtRecourseFlag(java.lang.String debtRecourseFlag){
      this.debtRecourseFlag = debtRecourseFlag;
   }

   /**
    *应收款融资保理方式
            1-明保理
            2-暗保理
    *@return java.lang.String
    */
   public java.lang.String getDebtFactoringMode(){
      return debtFactoringMode;
   }

   /**
    *应收款融资保理方式
            1-明保理
            2-暗保理
    *@param debtFactoringMode
    */
   public void setDebtFactoringMode(java.lang.String debtFactoringMode){
      this.debtFactoringMode = debtFactoringMode;
   }

   /**
    *应收款融资出账方式
            01-银承
            02-保函
            03-流贷
    *@return java.lang.String
    */
   public java.lang.String getDebtLoanMode(){
      return debtLoanMode;
   }

   /**
    *应收款融资出账方式
            01-银承
            02-保函
            03-流贷
    *@param debtLoanMode
    */
   public void setDebtLoanMode(java.lang.String debtLoanMode){
      this.debtLoanMode = debtLoanMode;
   }

   /**
    *锁定标识
    *@return java.lang.String
    */
   public java.lang.String getLockFlag(){
      return lockFlag;
   }

   /**
    *锁定标识
    *@param lockFlag
    */
   public void setLockFlag(java.lang.String lockFlag){
      this.lockFlag = lockFlag;
   }

   /**
    *锁定申请流水号
    *@return java.lang.String
    */
   public java.lang.String getLockApplyLogId(){
      return lockApplyLogId;
   }

   /**
    *锁定申请流水号
    *@param lockApplyLogId
    */
   public void setLockApplyLogId(java.lang.String lockApplyLogId){
      this.lockApplyLogId = lockApplyLogId;
   }

   /**
    *方案状态
    *@return java.lang.String
    */
   public java.lang.String getSchemeStatus(){
      return schemeStatus;
   }

   /**
    *方案状态
    *@param schemeStatus
    */
   public void setSchemeStatus(java.lang.String schemeStatus){
      this.schemeStatus = schemeStatus;
   }

   /**
    *建立时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *最后更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
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