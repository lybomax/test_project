package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:放款登记簿
 * 创建日期:2019-07-22 09:36:00
 */
@Table("acct_lnci_base_info")
public class AcctLnciBaseInfo{

   /**
      *借据id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String loanId;
   /**
      *借据编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String loanNo;
   /**
      *融资服务合同编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String financingContId;
   /**
      *融资方客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *融资方名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *资金方 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String capitalId;
   /**
      *资金方名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String capitalName;
   /**
      *融资方案编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String schemeId;
   /**
      *产品编号 
      *数据类型：varchar(10) 
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
      *申请金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal applyAmt;
   /**
      *借据金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal lnciAmt;
   /**
      *借据余额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal lnciBal;
   /**
      *已还金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal repaymentAmt;
   /**
      *起息日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String startDate;
   /**
      *到期日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String endDate;
   /**
      *还款方式:01-一次性还本付息、02-每月还息到期还本、03-等额本息、04-等额本金 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String repayMode;
   /**
      *利率类型 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String rateType;
   /**
      *基准年利率(％) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal baseYearRate;
   /**
      *利率浮动方式:00-不浮动，01-上浮，02-下浮 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String rateFloatType;
   /**
      *利率浮动值 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal rateFloatValue;
   /**
      *执行年/月利率(％) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal executeRate;
   /**
      *逾期浮动值 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal overdueFloatValue;
   /**
      *逾期罚息比率(％) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal punitivePercent;
   /**
      *正常本金 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal normalCapital;
   /**
      *逾期本金 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal overdueCapital;
   /**
      *应收应计利息 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal receivableAccuredInt;
   /**
      *应收欠息 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal receivableInt;
   /**
      *应收罚息 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal receivablePunishInt;
   /**
      *初始保证金比例 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal firstBailRatio;
   /**
      *初始保证金金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal bailAmt;
   /**
      *追加保证金金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal addBailAmt;
   /**
      *追加现金等价物金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal addCashEqtAmt;
   /**
      *初始现金等价物总额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal initCashEqtAmt;
   /**
      *锁定标识：0-未锁定;1-锁定 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLocked;
   /**
      *加锁业务编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String lockAppNo;
   /**
      *抵质押合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String slaveContNo;
   /**
      *借据状态:00-正常、01-逾期、02-呆滞、03-无效、04-部分还款、05-已结清 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String lnciStatus;
   /**
      *贷款五级分类:01-正常、02-关注、03-次级、04-可疑、05-损失 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String fivelevel;
   /**
      *机构号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String branchId;
   /**
      *客户经理 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String mgrNo;
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

  //get和set方法
   /**
    *借据id
    *@return java.lang.String
    */
   public java.lang.String getLoanId(){
      return loanId;
   }

   /**
    *借据id
    *@param loanId
    */
   public void setLoanId(java.lang.String loanId){
      this.loanId = loanId;
   }

   /**
    *借据编号
    *@return java.lang.String
    */
   public java.lang.String getLoanNo(){
      return loanNo;
   }

   /**
    *借据编号
    *@param loanNo
    */
   public void setLoanNo(java.lang.String loanNo){
      this.loanNo = loanNo;
   }

   /**
    *融资服务合同编号
    *@return java.lang.String
    */
   public java.lang.String getFinancingContId(){
      return financingContId;
   }

   /**
    *融资服务合同编号
    *@param financingContId
    */
   public void setFinancingContId(java.lang.String financingContId){
      this.financingContId = financingContId;
   }

   /**
    *融资方客户号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *融资方客户号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *融资方名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *融资方名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *资金方
    *@return java.lang.String
    */
   public java.lang.String getCapitalId(){
      return capitalId;
   }

   /**
    *资金方
    *@param capitalId
    */
   public void setCapitalId(java.lang.String capitalId){
      this.capitalId = capitalId;
   }

   /**
    *资金方名称
    *@return java.lang.String
    */
   public java.lang.String getCapitalName(){
      return capitalName;
   }

   /**
    *资金方名称
    *@param capitalName
    */
   public void setCapitalName(java.lang.String capitalName){
      this.capitalName = capitalName;
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
    *申请金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getApplyAmt(){
      return applyAmt;
   }

   /**
    *申请金额
    *@param applyAmt
    */
   public void setApplyAmt(java.math.BigDecimal applyAmt){
      this.applyAmt = applyAmt;
   }

   /**
    *借据金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLnciAmt(){
      return lnciAmt;
   }

   /**
    *借据金额
    *@param lnciAmt
    */
   public void setLnciAmt(java.math.BigDecimal lnciAmt){
      this.lnciAmt = lnciAmt;
   }

   /**
    *借据余额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLnciBal(){
      return lnciBal;
   }

   /**
    *借据余额
    *@param lnciBal
    */
   public void setLnciBal(java.math.BigDecimal lnciBal){
      this.lnciBal = lnciBal;
   }

   /**
    *已还金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getRepaymentAmt(){
      return repaymentAmt;
   }

   /**
    *已还金额
    *@param repaymentAmt
    */
   public void setRepaymentAmt(java.math.BigDecimal repaymentAmt){
      this.repaymentAmt = repaymentAmt;
   }

   /**
    *起息日期
    *@return java.lang.String
    */
   public java.lang.String getStartDate(){
      return startDate;
   }

   /**
    *起息日期
    *@param startDate
    */
   public void setStartDate(java.lang.String startDate){
      this.startDate = startDate;
   }

   /**
    *到期日期
    *@return java.lang.String
    */
   public java.lang.String getEndDate(){
      return endDate;
   }

   /**
    *到期日期
    *@param endDate
    */
   public void setEndDate(java.lang.String endDate){
      this.endDate = endDate;
   }

   /**
    *还款方式:01-一次性还本付息、02-每月还息到期还本、03-等额本息、04-等额本金
    *@return java.lang.String
    */
   public java.lang.String getRepayMode(){
      return repayMode;
   }

   /**
    *还款方式:01-一次性还本付息、02-每月还息到期还本、03-等额本息、04-等额本金
    *@param repayMode
    */
   public void setRepayMode(java.lang.String repayMode){
      this.repayMode = repayMode;
   }

   /**
    *利率类型
    *@return java.lang.String
    */
   public java.lang.String getRateType(){
      return rateType;
   }

   /**
    *利率类型
    *@param rateType
    */
   public void setRateType(java.lang.String rateType){
      this.rateType = rateType;
   }

   /**
    *基准年利率(％)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getBaseYearRate(){
      return baseYearRate;
   }

   /**
    *基准年利率(％)
    *@param baseYearRate
    */
   public void setBaseYearRate(java.math.BigDecimal baseYearRate){
      this.baseYearRate = baseYearRate;
   }

   /**
    *利率浮动方式:00-不浮动，01-上浮，02-下浮
    *@return java.lang.String
    */
   public java.lang.String getRateFloatType(){
      return rateFloatType;
   }

   /**
    *利率浮动方式:00-不浮动，01-上浮，02-下浮
    *@param rateFloatType
    */
   public void setRateFloatType(java.lang.String rateFloatType){
      this.rateFloatType = rateFloatType;
   }

   /**
    *利率浮动值
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getRateFloatValue(){
      return rateFloatValue;
   }

   /**
    *利率浮动值
    *@param rateFloatValue
    */
   public void setRateFloatValue(java.math.BigDecimal rateFloatValue){
      this.rateFloatValue = rateFloatValue;
   }

   /**
    *执行年/月利率(％)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getExecuteRate(){
      return executeRate;
   }

   /**
    *执行年/月利率(％)
    *@param executeRate
    */
   public void setExecuteRate(java.math.BigDecimal executeRate){
      this.executeRate = executeRate;
   }

   /**
    *逾期浮动值
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getOverdueFloatValue(){
      return overdueFloatValue;
   }

   /**
    *逾期浮动值
    *@param overdueFloatValue
    */
   public void setOverdueFloatValue(java.math.BigDecimal overdueFloatValue){
      this.overdueFloatValue = overdueFloatValue;
   }

   /**
    *逾期罚息比率(％)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPunitivePercent(){
      return punitivePercent;
   }

   /**
    *逾期罚息比率(％)
    *@param punitivePercent
    */
   public void setPunitivePercent(java.math.BigDecimal punitivePercent){
      this.punitivePercent = punitivePercent;
   }

   /**
    *正常本金
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getNormalCapital(){
      return normalCapital;
   }

   /**
    *正常本金
    *@param normalCapital
    */
   public void setNormalCapital(java.math.BigDecimal normalCapital){
      this.normalCapital = normalCapital;
   }

   /**
    *逾期本金
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getOverdueCapital(){
      return overdueCapital;
   }

   /**
    *逾期本金
    *@param overdueCapital
    */
   public void setOverdueCapital(java.math.BigDecimal overdueCapital){
      this.overdueCapital = overdueCapital;
   }

   /**
    *应收应计利息
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReceivableAccuredInt(){
      return receivableAccuredInt;
   }

   /**
    *应收应计利息
    *@param receivableAccuredInt
    */
   public void setReceivableAccuredInt(java.math.BigDecimal receivableAccuredInt){
      this.receivableAccuredInt = receivableAccuredInt;
   }

   /**
    *应收欠息
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReceivableInt(){
      return receivableInt;
   }

   /**
    *应收欠息
    *@param receivableInt
    */
   public void setReceivableInt(java.math.BigDecimal receivableInt){
      this.receivableInt = receivableInt;
   }

   /**
    *应收罚息
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReceivablePunishInt(){
      return receivablePunishInt;
   }

   /**
    *应收罚息
    *@param receivablePunishInt
    */
   public void setReceivablePunishInt(java.math.BigDecimal receivablePunishInt){
      this.receivablePunishInt = receivablePunishInt;
   }

   /**
    *初始保证金比例
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getFirstBailRatio(){
      return firstBailRatio;
   }

   /**
    *初始保证金比例
    *@param firstBailRatio
    */
   public void setFirstBailRatio(java.math.BigDecimal firstBailRatio){
      this.firstBailRatio = firstBailRatio;
   }

   /**
    *初始保证金金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getBailAmt(){
      return bailAmt;
   }

   /**
    *初始保证金金额
    *@param bailAmt
    */
   public void setBailAmt(java.math.BigDecimal bailAmt){
      this.bailAmt = bailAmt;
   }

   /**
    *追加保证金金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAddBailAmt(){
      return addBailAmt;
   }

   /**
    *追加保证金金额
    *@param addBailAmt
    */
   public void setAddBailAmt(java.math.BigDecimal addBailAmt){
      this.addBailAmt = addBailAmt;
   }

   /**
    *追加现金等价物金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAddCashEqtAmt(){
      return addCashEqtAmt;
   }

   /**
    *追加现金等价物金额
    *@param addCashEqtAmt
    */
   public void setAddCashEqtAmt(java.math.BigDecimal addCashEqtAmt){
      this.addCashEqtAmt = addCashEqtAmt;
   }

   /**
    *初始现金等价物总额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getInitCashEqtAmt(){
      return initCashEqtAmt;
   }

   /**
    *初始现金等价物总额
    *@param initCashEqtAmt
    */
   public void setInitCashEqtAmt(java.math.BigDecimal initCashEqtAmt){
      this.initCashEqtAmt = initCashEqtAmt;
   }

   /**
    *锁定标识：0-未锁定;1-锁定
    *@return java.lang.String
    */
   public java.lang.String getIsLocked(){
      return isLocked;
   }

   /**
    *锁定标识：0-未锁定;1-锁定
    *@param isLocked
    */
   public void setIsLocked(java.lang.String isLocked){
      this.isLocked = isLocked;
   }

   /**
    *加锁业务编号
    *@return java.lang.String
    */
   public java.lang.String getLockAppNo(){
      return lockAppNo;
   }

   /**
    *加锁业务编号
    *@param lockAppNo
    */
   public void setLockAppNo(java.lang.String lockAppNo){
      this.lockAppNo = lockAppNo;
   }

   /**
    *抵质押合同号
    *@return java.lang.String
    */
   public java.lang.String getSlaveContNo(){
      return slaveContNo;
   }

   /**
    *抵质押合同号
    *@param slaveContNo
    */
   public void setSlaveContNo(java.lang.String slaveContNo){
      this.slaveContNo = slaveContNo;
   }

   /**
    *借据状态:00-正常、01-逾期、02-呆滞、03-无效、04-部分还款、05-已结清
    *@return java.lang.String
    */
   public java.lang.String getLnciStatus(){
      return lnciStatus;
   }

   /**
    *借据状态:00-正常、01-逾期、02-呆滞、03-无效、04-部分还款、05-已结清
    *@param lnciStatus
    */
   public void setLnciStatus(java.lang.String lnciStatus){
      this.lnciStatus = lnciStatus;
   }

   /**
    *贷款五级分类:01-正常、02-关注、03-次级、04-可疑、05-损失
    *@return java.lang.String
    */
   public java.lang.String getFivelevel(){
      return fivelevel;
   }

   /**
    *贷款五级分类:01-正常、02-关注、03-次级、04-可疑、05-损失
    *@param fivelevel
    */
   public void setFivelevel(java.lang.String fivelevel){
      this.fivelevel = fivelevel;
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
    *客户经理
    *@return java.lang.String
    */
   public java.lang.String getMgrNo(){
      return mgrNo;
   }

   /**
    *客户经理
    *@param mgrNo
    */
   public void setMgrNo(java.lang.String mgrNo){
      this.mgrNo = mgrNo;
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

}