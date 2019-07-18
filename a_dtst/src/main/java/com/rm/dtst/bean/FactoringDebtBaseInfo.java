package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业供应链信息表
 * 创建日期:2019-07-18 10:23:32
 */
@Table("factoring_debt_base_info")
public class FactoringDebtBaseInfo{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String debtId;
   /**
      *申请编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String appNo;
   /**
      *应收账款合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String financingContId;
   /**
      *融资方案编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String schemeId;
   /**
      *订单基本信息表ID 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String orderId;
   /**
      *订单编号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String orderNo;
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
      *凭证类型:默认01
            01-发票
            02-结算单
            03-收货收据
            05-出口退税凭证
            06-其它
            07-虚拟发票 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String debtType;
   /**
      *发票代码,凭证类型为01-发票时才输入 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String billsCode;
   /**
      *发票校验码，凭证类型为01-发票时才输入 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String verifyCode;
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
      *瑕疵标记:1-有瑕疵、0-无瑕疵 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String flawFlag;
   /**
      *瑕疵原因 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String flawReason;
   /**
      *商纠状态:1-有商纠、0-无商纠 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String issueFlag;
   /**
      *商纠原因 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String issueReason;
   /**
      *逾期状态:1-有、0-无 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String overdueFlag;
   /**
      *逾期原因 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String overdueReason;
   /**
      *是否呆账:1-有、0-无 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String badFlag;
   /**
      *呆账原因 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String badReason;
   /**
      *应收账款池状态:1-池内、0-池外 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String poolFlag;
   /**
      *应收账款逾期余额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal overdueAmt;
   /**
      *应收账款逾期状态:01-未逾期、02-已逾期 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String overdueStatus;
   /**
      *应收账款单据状态:01-已录入、02-已验真、03-验证失败、04-已转让、05-部分融资、06-已融资、07-部分核销、08-已核销 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *还款状态:01-未还款、02-部分还款、03-已还款 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String returnStatus;
   /**
      *催收次数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer pressCount;
   /**
      *催收提示次数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer warnCount;
   /**
      *渠道标识:1-运营平台2-企业自助平台3-ERP对接 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String channelFlag;
   /**
      *商纠次数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer issueTimes;
   /**
      *是否已付款：:0-否、1-是 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isPay;
   /**
      *是否锁定：:0-未锁定、1-锁定 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLocked;
   /**
      *加锁业务申请编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String lockAppno;
   /**
      *文件资源编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String resourceId;
   /**
      *商纠金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal issueAmt;
   /**
      *争议解除方式 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String issueRelieve;
   /**
      *付款余额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal paymentRemAmt;
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
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String customerSeller;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String sellerName;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String customerBuyer;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String buyerName;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String billType;

  //get和set方法
   /**
    *主键
    *@return java.lang.String
    */
   public java.lang.String getDebtId(){
      return debtId;
   }

   /**
    *主键
    *@param debtId
    */
   public void setDebtId(java.lang.String debtId){
      this.debtId = debtId;
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
    *应收账款合同号
    *@return java.lang.String
    */
   public java.lang.String getFinancingContId(){
      return financingContId;
   }

   /**
    *应收账款合同号
    *@param financingContId
    */
   public void setFinancingContId(java.lang.String financingContId){
      this.financingContId = financingContId;
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
    *订单基本信息表ID
    *@return java.lang.String
    */
   public java.lang.String getOrderId(){
      return orderId;
   }

   /**
    *订单基本信息表ID
    *@param orderId
    */
   public void setOrderId(java.lang.String orderId){
      this.orderId = orderId;
   }

   /**
    *订单编号
    *@return java.lang.String
    */
   public java.lang.String getOrderNo(){
      return orderNo;
   }

   /**
    *订单编号
    *@param orderNo
    */
   public void setOrderNo(java.lang.String orderNo){
      this.orderNo = orderNo;
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
    *凭证类型:默认01
            01-发票
            02-结算单
            03-收货收据
            05-出口退税凭证
            06-其它
            07-虚拟发票
    *@return java.lang.String
    */
   public java.lang.String getDebtType(){
      return debtType;
   }

   /**
    *凭证类型:默认01
            01-发票
            02-结算单
            03-收货收据
            05-出口退税凭证
            06-其它
            07-虚拟发票
    *@param debtType
    */
   public void setDebtType(java.lang.String debtType){
      this.debtType = debtType;
   }

   /**
    *发票代码,凭证类型为01-发票时才输入
    *@return java.lang.String
    */
   public java.lang.String getBillsCode(){
      return billsCode;
   }

   /**
    *发票代码,凭证类型为01-发票时才输入
    *@param billsCode
    */
   public void setBillsCode(java.lang.String billsCode){
      this.billsCode = billsCode;
   }

   /**
    *发票校验码，凭证类型为01-发票时才输入
    *@return java.lang.String
    */
   public java.lang.String getVerifyCode(){
      return verifyCode;
   }

   /**
    *发票校验码，凭证类型为01-发票时才输入
    *@param verifyCode
    */
   public void setVerifyCode(java.lang.String verifyCode){
      this.verifyCode = verifyCode;
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
    *瑕疵标记:1-有瑕疵、0-无瑕疵
    *@return java.lang.String
    */
   public java.lang.String getFlawFlag(){
      return flawFlag;
   }

   /**
    *瑕疵标记:1-有瑕疵、0-无瑕疵
    *@param flawFlag
    */
   public void setFlawFlag(java.lang.String flawFlag){
      this.flawFlag = flawFlag;
   }

   /**
    *瑕疵原因
    *@return java.lang.String
    */
   public java.lang.String getFlawReason(){
      return flawReason;
   }

   /**
    *瑕疵原因
    *@param flawReason
    */
   public void setFlawReason(java.lang.String flawReason){
      this.flawReason = flawReason;
   }

   /**
    *商纠状态:1-有商纠、0-无商纠
    *@return java.lang.String
    */
   public java.lang.String getIssueFlag(){
      return issueFlag;
   }

   /**
    *商纠状态:1-有商纠、0-无商纠
    *@param issueFlag
    */
   public void setIssueFlag(java.lang.String issueFlag){
      this.issueFlag = issueFlag;
   }

   /**
    *商纠原因
    *@return java.lang.String
    */
   public java.lang.String getIssueReason(){
      return issueReason;
   }

   /**
    *商纠原因
    *@param issueReason
    */
   public void setIssueReason(java.lang.String issueReason){
      this.issueReason = issueReason;
   }

   /**
    *逾期状态:1-有、0-无
    *@return java.lang.String
    */
   public java.lang.String getOverdueFlag(){
      return overdueFlag;
   }

   /**
    *逾期状态:1-有、0-无
    *@param overdueFlag
    */
   public void setOverdueFlag(java.lang.String overdueFlag){
      this.overdueFlag = overdueFlag;
   }

   /**
    *逾期原因
    *@return java.lang.String
    */
   public java.lang.String getOverdueReason(){
      return overdueReason;
   }

   /**
    *逾期原因
    *@param overdueReason
    */
   public void setOverdueReason(java.lang.String overdueReason){
      this.overdueReason = overdueReason;
   }

   /**
    *是否呆账:1-有、0-无
    *@return java.lang.String
    */
   public java.lang.String getBadFlag(){
      return badFlag;
   }

   /**
    *是否呆账:1-有、0-无
    *@param badFlag
    */
   public void setBadFlag(java.lang.String badFlag){
      this.badFlag = badFlag;
   }

   /**
    *呆账原因
    *@return java.lang.String
    */
   public java.lang.String getBadReason(){
      return badReason;
   }

   /**
    *呆账原因
    *@param badReason
    */
   public void setBadReason(java.lang.String badReason){
      this.badReason = badReason;
   }

   /**
    *应收账款池状态:1-池内、0-池外
    *@return java.lang.String
    */
   public java.lang.String getPoolFlag(){
      return poolFlag;
   }

   /**
    *应收账款池状态:1-池内、0-池外
    *@param poolFlag
    */
   public void setPoolFlag(java.lang.String poolFlag){
      this.poolFlag = poolFlag;
   }

   /**
    *应收账款逾期余额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getOverdueAmt(){
      return overdueAmt;
   }

   /**
    *应收账款逾期余额
    *@param overdueAmt
    */
   public void setOverdueAmt(java.math.BigDecimal overdueAmt){
      this.overdueAmt = overdueAmt;
   }

   /**
    *应收账款逾期状态:01-未逾期、02-已逾期
    *@return java.lang.String
    */
   public java.lang.String getOverdueStatus(){
      return overdueStatus;
   }

   /**
    *应收账款逾期状态:01-未逾期、02-已逾期
    *@param overdueStatus
    */
   public void setOverdueStatus(java.lang.String overdueStatus){
      this.overdueStatus = overdueStatus;
   }

   /**
    *应收账款单据状态:01-已录入、02-已验真、03-验证失败、04-已转让、05-部分融资、06-已融资、07-部分核销、08-已核销
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *应收账款单据状态:01-已录入、02-已验真、03-验证失败、04-已转让、05-部分融资、06-已融资、07-部分核销、08-已核销
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *还款状态:01-未还款、02-部分还款、03-已还款
    *@return java.lang.String
    */
   public java.lang.String getReturnStatus(){
      return returnStatus;
   }

   /**
    *还款状态:01-未还款、02-部分还款、03-已还款
    *@param returnStatus
    */
   public void setReturnStatus(java.lang.String returnStatus){
      this.returnStatus = returnStatus;
   }

   /**
    *催收次数
    *@return java.lang.Integer
    */
   public java.lang.Integer getPressCount(){
      return pressCount;
   }

   /**
    *催收次数
    *@param pressCount
    */
   public void setPressCount(java.lang.Integer pressCount){
      this.pressCount = pressCount;
   }

   /**
    *催收提示次数
    *@return java.lang.Integer
    */
   public java.lang.Integer getWarnCount(){
      return warnCount;
   }

   /**
    *催收提示次数
    *@param warnCount
    */
   public void setWarnCount(java.lang.Integer warnCount){
      this.warnCount = warnCount;
   }

   /**
    *渠道标识:1-运营平台2-企业自助平台3-ERP对接
    *@return java.lang.String
    */
   public java.lang.String getChannelFlag(){
      return channelFlag;
   }

   /**
    *渠道标识:1-运营平台2-企业自助平台3-ERP对接
    *@param channelFlag
    */
   public void setChannelFlag(java.lang.String channelFlag){
      this.channelFlag = channelFlag;
   }

   /**
    *商纠次数
    *@return java.lang.Integer
    */
   public java.lang.Integer getIssueTimes(){
      return issueTimes;
   }

   /**
    *商纠次数
    *@param issueTimes
    */
   public void setIssueTimes(java.lang.Integer issueTimes){
      this.issueTimes = issueTimes;
   }

   /**
    *是否已付款：:0-否、1-是
    *@return java.lang.String
    */
   public java.lang.String getIsPay(){
      return isPay;
   }

   /**
    *是否已付款：:0-否、1-是
    *@param isPay
    */
   public void setIsPay(java.lang.String isPay){
      this.isPay = isPay;
   }

   /**
    *是否锁定：:0-未锁定、1-锁定
    *@return java.lang.String
    */
   public java.lang.String getIsLocked(){
      return isLocked;
   }

   /**
    *是否锁定：:0-未锁定、1-锁定
    *@param isLocked
    */
   public void setIsLocked(java.lang.String isLocked){
      this.isLocked = isLocked;
   }

   /**
    *加锁业务申请编号
    *@return java.lang.String
    */
   public java.lang.String getLockAppno(){
      return lockAppno;
   }

   /**
    *加锁业务申请编号
    *@param lockAppno
    */
   public void setLockAppno(java.lang.String lockAppno){
      this.lockAppno = lockAppno;
   }

   /**
    *文件资源编号
    *@return java.lang.String
    */
   public java.lang.String getResourceId(){
      return resourceId;
   }

   /**
    *文件资源编号
    *@param resourceId
    */
   public void setResourceId(java.lang.String resourceId){
      this.resourceId = resourceId;
   }

   /**
    *商纠金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getIssueAmt(){
      return issueAmt;
   }

   /**
    *商纠金额
    *@param issueAmt
    */
   public void setIssueAmt(java.math.BigDecimal issueAmt){
      this.issueAmt = issueAmt;
   }

   /**
    *争议解除方式
    *@return java.lang.String
    */
   public java.lang.String getIssueRelieve(){
      return issueRelieve;
   }

   /**
    *争议解除方式
    *@param issueRelieve
    */
   public void setIssueRelieve(java.lang.String issueRelieve){
      this.issueRelieve = issueRelieve;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getCustomerSeller(){
      return customerSeller;
   }

   /**
    *
    *@param customerSeller
    */
   public void setCustomerSeller(java.lang.String customerSeller){
      this.customerSeller = customerSeller;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSellerName(){
      return sellerName;
   }

   /**
    *
    *@param sellerName
    */
   public void setSellerName(java.lang.String sellerName){
      this.sellerName = sellerName;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCustomerBuyer(){
      return customerBuyer;
   }

   /**
    *
    *@param customerBuyer
    */
   public void setCustomerBuyer(java.lang.String customerBuyer){
      this.customerBuyer = customerBuyer;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBuyerName(){
      return buyerName;
   }

   /**
    *
    *@param buyerName
    */
   public void setBuyerName(java.lang.String buyerName){
      this.buyerName = buyerName;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBillType(){
      return billType;
   }

   /**
    *
    *@param billType
    */
   public void setBillType(java.lang.String billType){
      this.billType = billType;
   }

}