package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:应收账款融资合同信息表
 * 创建日期:2019-07-18 10:23:28
 */
@Table("factoring_cont_base_inf")
public class FactoringContBaseInf{

   /**
      *合同编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String financingContId;
   /**
      *申请编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String appNo;
   /**
      *合同名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String financingContName;
   /**
      *合同类型:01-融资服务合同、02-债权转让合同 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String contType;
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
      *资金方编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String capitalCustId;
   /**
      *资金方名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String capitalCustname;
   /**
      *出账类型:01-流动资金贷款 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String loanWay;
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
      *合同开始日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String startDate;
   /**
      *最迟付款日 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String endDate;
   /**
      *申请金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal appAmt;
   /**
      *合同金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal contAmt;
   /**
      *实际放款金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanAmt;
   /**
      *执行年/月利率(％) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal financingCostRate;
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
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal overdueRate;
   /**
      *逾期罚息比率(％) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal punitiveFloatValue;
   /**
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal punitiveRate;
   /**
      *备注 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *签约模式：01-线下，02-线上 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String signMode;
   /**
      *确权模式：01-线下，02-线上 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String confirmMode;
   /**
      *签约日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String signDate;
   /**
      *链属企业额度编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String creditNo;
   /**
      *核心企业客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String coreCustId;
   /**
      *核心企业名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String coreName;
   /**
      *渠道标示：10-运营PC，20-运营APP，30-企业自助PC，40-企业自助APP 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String channelFlag;
   /**
      *签章方式:01-电子签章，02-纸质签章 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String signType;
   /**
      *融资到期日 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String loanEndDate;
   /**
      *融资模式:01逐笔融资、02框架合同融资 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String financeMode;
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
      *结算账号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String acctNo;
   /**
      *池保证金账号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String bailAcctNo;
   /**
      *回款专户 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String returnAcct;
   /**
      *回款用途:01-入借据保证金;02-还贷 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String repayPurpose;
   /**
      *尾款规则:01-入结算账户;02-留存回款专户 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String dueBalanceRule;
   /**
      *回款核销规则:01-先到期先核销;02-平均分配核销 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String paymentVerifyRule;
   /**
      *赔款转让协议号 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String reparationProtNo;
   /**
      *租赁方式:01-普通租赁;02-售后回租;03-融资租赁 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String lease;
   /**
      *反转让方 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String repurchaser;
   /**
      *反转让协议号 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String repurchaseProtNo;
   /**
      *买方保理商客户号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String factoringBranchId;
   /**
      *赔款期限(天) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer reparationTerm;
   /**
      *赔付比例(%) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal reparationPercent;
   /**
      *累计赔款金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal cumulativeReparationAmt;
   /**
      *保理方式：1-明保理;2-暗保理 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String factPattern;
   /**
      *合作机构（村镇银行） 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String cooperationBrcode;
   /**
      *租金处理方式：1-质押、2-转让 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String rentSettleWay;
   /**
      *池保证金余额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal poolBailAmt;
   /**
      *是否融资性合同01-否；02-是 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String ifFinancing;
   /**
      *池保证金子账号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String bailSubAcctNo;
   /**
      *卖方监管账户 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String moniAcctNo;
   /**
      *卖方监管账户名称 
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String moniAcctName;
   /**
      *结算账号名称 
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String acctNoName;
   /**
      *池保证金账户名称 
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String bailAcctNoName;
   /**
      *回款账户名称 
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String returnAcctName;
   /**
      *卖方监管账户开户行 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String moniAcctBank;
   /**
      *回款账户开户行 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String returnAcctBank;
   /**
      *池保证金账户开户行 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String bailAcctBank;
   /**
      *结算账号开户行 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String acctBank;
   /**
      *数据来源 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String dataSource;
   /**
      *基础合同买方客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custcdBaseSaller;
   /**
      *间接付款 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String indirectPayment;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String contStatus;

  //get和set方法
   /**
    *合同编号
    *@return java.lang.String
    */
   public java.lang.String getFinancingContId(){
      return financingContId;
   }

   /**
    *合同编号
    *@param financingContId
    */
   public void setFinancingContId(java.lang.String financingContId){
      this.financingContId = financingContId;
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
    *合同名称
    *@return java.lang.String
    */
   public java.lang.String getFinancingContName(){
      return financingContName;
   }

   /**
    *合同名称
    *@param financingContName
    */
   public void setFinancingContName(java.lang.String financingContName){
      this.financingContName = financingContName;
   }

   /**
    *合同类型:01-融资服务合同、02-债权转让合同
    *@return java.lang.String
    */
   public java.lang.String getContType(){
      return contType;
   }

   /**
    *合同类型:01-融资服务合同、02-债权转让合同
    *@param contType
    */
   public void setContType(java.lang.String contType){
      this.contType = contType;
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
    *资金方编号
    *@return java.lang.String
    */
   public java.lang.String getCapitalCustId(){
      return capitalCustId;
   }

   /**
    *资金方编号
    *@param capitalCustId
    */
   public void setCapitalCustId(java.lang.String capitalCustId){
      this.capitalCustId = capitalCustId;
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
    *出账类型:01-流动资金贷款
    *@return java.lang.String
    */
   public java.lang.String getLoanWay(){
      return loanWay;
   }

   /**
    *出账类型:01-流动资金贷款
    *@param loanWay
    */
   public void setLoanWay(java.lang.String loanWay){
      this.loanWay = loanWay;
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
    *合同开始日期
    *@return java.lang.String
    */
   public java.lang.String getStartDate(){
      return startDate;
   }

   /**
    *合同开始日期
    *@param startDate
    */
   public void setStartDate(java.lang.String startDate){
      this.startDate = startDate;
   }

   /**
    *最迟付款日
    *@return java.lang.String
    */
   public java.lang.String getEndDate(){
      return endDate;
   }

   /**
    *最迟付款日
    *@param endDate
    */
   public void setEndDate(java.lang.String endDate){
      this.endDate = endDate;
   }

   /**
    *申请金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAppAmt(){
      return appAmt;
   }

   /**
    *申请金额
    *@param appAmt
    */
   public void setAppAmt(java.math.BigDecimal appAmt){
      this.appAmt = appAmt;
   }

   /**
    *合同金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getContAmt(){
      return contAmt;
   }

   /**
    *合同金额
    *@param contAmt
    */
   public void setContAmt(java.math.BigDecimal contAmt){
      this.contAmt = contAmt;
   }

   /**
    *实际放款金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLoanAmt(){
      return loanAmt;
   }

   /**
    *实际放款金额
    *@param loanAmt
    */
   public void setLoanAmt(java.math.BigDecimal loanAmt){
      this.loanAmt = loanAmt;
   }

   /**
    *执行年/月利率(％)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getFinancingCostRate(){
      return financingCostRate;
   }

   /**
    *执行年/月利率(％)
    *@param financingCostRate
    */
   public void setFinancingCostRate(java.math.BigDecimal financingCostRate){
      this.financingCostRate = financingCostRate;
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
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getOverdueRate(){
      return overdueRate;
   }

   /**
    *
    *@param overdueRate
    */
   public void setOverdueRate(java.math.BigDecimal overdueRate){
      this.overdueRate = overdueRate;
   }

   /**
    *逾期罚息比率(％)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPunitiveFloatValue(){
      return punitiveFloatValue;
   }

   /**
    *逾期罚息比率(％)
    *@param punitiveFloatValue
    */
   public void setPunitiveFloatValue(java.math.BigDecimal punitiveFloatValue){
      this.punitiveFloatValue = punitiveFloatValue;
   }

   /**
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPunitiveRate(){
      return punitiveRate;
   }

   /**
    *
    *@param punitiveRate
    */
   public void setPunitiveRate(java.math.BigDecimal punitiveRate){
      this.punitiveRate = punitiveRate;
   }

   /**
    *备注
    *@return java.lang.String
    */
   public java.lang.String getRemark(){
      return remark;
   }

   /**
    *备注
    *@param remark
    */
   public void setRemark(java.lang.String remark){
      this.remark = remark;
   }

   /**
    *签约模式：01-线下，02-线上
    *@return java.lang.String
    */
   public java.lang.String getSignMode(){
      return signMode;
   }

   /**
    *签约模式：01-线下，02-线上
    *@param signMode
    */
   public void setSignMode(java.lang.String signMode){
      this.signMode = signMode;
   }

   /**
    *确权模式：01-线下，02-线上
    *@return java.lang.String
    */
   public java.lang.String getConfirmMode(){
      return confirmMode;
   }

   /**
    *确权模式：01-线下，02-线上
    *@param confirmMode
    */
   public void setConfirmMode(java.lang.String confirmMode){
      this.confirmMode = confirmMode;
   }

   /**
    *签约日期
    *@return java.lang.String
    */
   public java.lang.String getSignDate(){
      return signDate;
   }

   /**
    *签约日期
    *@param signDate
    */
   public void setSignDate(java.lang.String signDate){
      this.signDate = signDate;
   }

   /**
    *链属企业额度编号
    *@return java.lang.String
    */
   public java.lang.String getCreditNo(){
      return creditNo;
   }

   /**
    *链属企业额度编号
    *@param creditNo
    */
   public void setCreditNo(java.lang.String creditNo){
      this.creditNo = creditNo;
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
    *核心企业名称
    *@return java.lang.String
    */
   public java.lang.String getCoreName(){
      return coreName;
   }

   /**
    *核心企业名称
    *@param coreName
    */
   public void setCoreName(java.lang.String coreName){
      this.coreName = coreName;
   }

   /**
    *渠道标示：10-运营PC，20-运营APP，30-企业自助PC，40-企业自助APP
    *@return java.lang.String
    */
   public java.lang.String getChannelFlag(){
      return channelFlag;
   }

   /**
    *渠道标示：10-运营PC，20-运营APP，30-企业自助PC，40-企业自助APP
    *@param channelFlag
    */
   public void setChannelFlag(java.lang.String channelFlag){
      this.channelFlag = channelFlag;
   }

   /**
    *签章方式:01-电子签章，02-纸质签章
    *@return java.lang.String
    */
   public java.lang.String getSignType(){
      return signType;
   }

   /**
    *签章方式:01-电子签章，02-纸质签章
    *@param signType
    */
   public void setSignType(java.lang.String signType){
      this.signType = signType;
   }

   /**
    *融资到期日
    *@return java.lang.String
    */
   public java.lang.String getLoanEndDate(){
      return loanEndDate;
   }

   /**
    *融资到期日
    *@param loanEndDate
    */
   public void setLoanEndDate(java.lang.String loanEndDate){
      this.loanEndDate = loanEndDate;
   }

   /**
    *融资模式:01逐笔融资、02框架合同融资
    *@return java.lang.String
    */
   public java.lang.String getFinanceMode(){
      return financeMode;
   }

   /**
    *融资模式:01逐笔融资、02框架合同融资
    *@param financeMode
    */
   public void setFinanceMode(java.lang.String financeMode){
      this.financeMode = financeMode;
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
    *结算账号
    *@return java.lang.String
    */
   public java.lang.String getAcctNo(){
      return acctNo;
   }

   /**
    *结算账号
    *@param acctNo
    */
   public void setAcctNo(java.lang.String acctNo){
      this.acctNo = acctNo;
   }

   /**
    *池保证金账号
    *@return java.lang.String
    */
   public java.lang.String getBailAcctNo(){
      return bailAcctNo;
   }

   /**
    *池保证金账号
    *@param bailAcctNo
    */
   public void setBailAcctNo(java.lang.String bailAcctNo){
      this.bailAcctNo = bailAcctNo;
   }

   /**
    *回款专户
    *@return java.lang.String
    */
   public java.lang.String getReturnAcct(){
      return returnAcct;
   }

   /**
    *回款专户
    *@param returnAcct
    */
   public void setReturnAcct(java.lang.String returnAcct){
      this.returnAcct = returnAcct;
   }

   /**
    *回款用途:01-入借据保证金;02-还贷
    *@return java.lang.String
    */
   public java.lang.String getRepayPurpose(){
      return repayPurpose;
   }

   /**
    *回款用途:01-入借据保证金;02-还贷
    *@param repayPurpose
    */
   public void setRepayPurpose(java.lang.String repayPurpose){
      this.repayPurpose = repayPurpose;
   }

   /**
    *尾款规则:01-入结算账户;02-留存回款专户
    *@return java.lang.String
    */
   public java.lang.String getDueBalanceRule(){
      return dueBalanceRule;
   }

   /**
    *尾款规则:01-入结算账户;02-留存回款专户
    *@param dueBalanceRule
    */
   public void setDueBalanceRule(java.lang.String dueBalanceRule){
      this.dueBalanceRule = dueBalanceRule;
   }

   /**
    *回款核销规则:01-先到期先核销;02-平均分配核销
    *@return java.lang.String
    */
   public java.lang.String getPaymentVerifyRule(){
      return paymentVerifyRule;
   }

   /**
    *回款核销规则:01-先到期先核销;02-平均分配核销
    *@param paymentVerifyRule
    */
   public void setPaymentVerifyRule(java.lang.String paymentVerifyRule){
      this.paymentVerifyRule = paymentVerifyRule;
   }

   /**
    *赔款转让协议号
    *@return java.lang.String
    */
   public java.lang.String getReparationProtNo(){
      return reparationProtNo;
   }

   /**
    *赔款转让协议号
    *@param reparationProtNo
    */
   public void setReparationProtNo(java.lang.String reparationProtNo){
      this.reparationProtNo = reparationProtNo;
   }

   /**
    *租赁方式:01-普通租赁;02-售后回租;03-融资租赁
    *@return java.lang.String
    */
   public java.lang.String getLease(){
      return lease;
   }

   /**
    *租赁方式:01-普通租赁;02-售后回租;03-融资租赁
    *@param lease
    */
   public void setLease(java.lang.String lease){
      this.lease = lease;
   }

   /**
    *反转让方
    *@return java.lang.String
    */
   public java.lang.String getRepurchaser(){
      return repurchaser;
   }

   /**
    *反转让方
    *@param repurchaser
    */
   public void setRepurchaser(java.lang.String repurchaser){
      this.repurchaser = repurchaser;
   }

   /**
    *反转让协议号
    *@return java.lang.String
    */
   public java.lang.String getRepurchaseProtNo(){
      return repurchaseProtNo;
   }

   /**
    *反转让协议号
    *@param repurchaseProtNo
    */
   public void setRepurchaseProtNo(java.lang.String repurchaseProtNo){
      this.repurchaseProtNo = repurchaseProtNo;
   }

   /**
    *买方保理商客户号
    *@return java.lang.String
    */
   public java.lang.String getFactoringBranchId(){
      return factoringBranchId;
   }

   /**
    *买方保理商客户号
    *@param factoringBranchId
    */
   public void setFactoringBranchId(java.lang.String factoringBranchId){
      this.factoringBranchId = factoringBranchId;
   }

   /**
    *赔款期限(天)
    *@return java.lang.Integer
    */
   public java.lang.Integer getReparationTerm(){
      return reparationTerm;
   }

   /**
    *赔款期限(天)
    *@param reparationTerm
    */
   public void setReparationTerm(java.lang.Integer reparationTerm){
      this.reparationTerm = reparationTerm;
   }

   /**
    *赔付比例(%)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReparationPercent(){
      return reparationPercent;
   }

   /**
    *赔付比例(%)
    *@param reparationPercent
    */
   public void setReparationPercent(java.math.BigDecimal reparationPercent){
      this.reparationPercent = reparationPercent;
   }

   /**
    *累计赔款金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getCumulativeReparationAmt(){
      return cumulativeReparationAmt;
   }

   /**
    *累计赔款金额
    *@param cumulativeReparationAmt
    */
   public void setCumulativeReparationAmt(java.math.BigDecimal cumulativeReparationAmt){
      this.cumulativeReparationAmt = cumulativeReparationAmt;
   }

   /**
    *保理方式：1-明保理;2-暗保理
    *@return java.lang.String
    */
   public java.lang.String getFactPattern(){
      return factPattern;
   }

   /**
    *保理方式：1-明保理;2-暗保理
    *@param factPattern
    */
   public void setFactPattern(java.lang.String factPattern){
      this.factPattern = factPattern;
   }

   /**
    *合作机构（村镇银行）
    *@return java.lang.String
    */
   public java.lang.String getCooperationBrcode(){
      return cooperationBrcode;
   }

   /**
    *合作机构（村镇银行）
    *@param cooperationBrcode
    */
   public void setCooperationBrcode(java.lang.String cooperationBrcode){
      this.cooperationBrcode = cooperationBrcode;
   }

   /**
    *租金处理方式：1-质押、2-转让
    *@return java.lang.String
    */
   public java.lang.String getRentSettleWay(){
      return rentSettleWay;
   }

   /**
    *租金处理方式：1-质押、2-转让
    *@param rentSettleWay
    */
   public void setRentSettleWay(java.lang.String rentSettleWay){
      this.rentSettleWay = rentSettleWay;
   }

   /**
    *池保证金余额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPoolBailAmt(){
      return poolBailAmt;
   }

   /**
    *池保证金余额
    *@param poolBailAmt
    */
   public void setPoolBailAmt(java.math.BigDecimal poolBailAmt){
      this.poolBailAmt = poolBailAmt;
   }

   /**
    *是否融资性合同01-否；02-是
    *@return java.lang.String
    */
   public java.lang.String getIfFinancing(){
      return ifFinancing;
   }

   /**
    *是否融资性合同01-否；02-是
    *@param ifFinancing
    */
   public void setIfFinancing(java.lang.String ifFinancing){
      this.ifFinancing = ifFinancing;
   }

   /**
    *池保证金子账号
    *@return java.lang.String
    */
   public java.lang.String getBailSubAcctNo(){
      return bailSubAcctNo;
   }

   /**
    *池保证金子账号
    *@param bailSubAcctNo
    */
   public void setBailSubAcctNo(java.lang.String bailSubAcctNo){
      this.bailSubAcctNo = bailSubAcctNo;
   }

   /**
    *卖方监管账户
    *@return java.lang.String
    */
   public java.lang.String getMoniAcctNo(){
      return moniAcctNo;
   }

   /**
    *卖方监管账户
    *@param moniAcctNo
    */
   public void setMoniAcctNo(java.lang.String moniAcctNo){
      this.moniAcctNo = moniAcctNo;
   }

   /**
    *卖方监管账户名称
    *@return java.lang.String
    */
   public java.lang.String getMoniAcctName(){
      return moniAcctName;
   }

   /**
    *卖方监管账户名称
    *@param moniAcctName
    */
   public void setMoniAcctName(java.lang.String moniAcctName){
      this.moniAcctName = moniAcctName;
   }

   /**
    *结算账号名称
    *@return java.lang.String
    */
   public java.lang.String getAcctNoName(){
      return acctNoName;
   }

   /**
    *结算账号名称
    *@param acctNoName
    */
   public void setAcctNoName(java.lang.String acctNoName){
      this.acctNoName = acctNoName;
   }

   /**
    *池保证金账户名称
    *@return java.lang.String
    */
   public java.lang.String getBailAcctNoName(){
      return bailAcctNoName;
   }

   /**
    *池保证金账户名称
    *@param bailAcctNoName
    */
   public void setBailAcctNoName(java.lang.String bailAcctNoName){
      this.bailAcctNoName = bailAcctNoName;
   }

   /**
    *回款账户名称
    *@return java.lang.String
    */
   public java.lang.String getReturnAcctName(){
      return returnAcctName;
   }

   /**
    *回款账户名称
    *@param returnAcctName
    */
   public void setReturnAcctName(java.lang.String returnAcctName){
      this.returnAcctName = returnAcctName;
   }

   /**
    *卖方监管账户开户行
    *@return java.lang.String
    */
   public java.lang.String getMoniAcctBank(){
      return moniAcctBank;
   }

   /**
    *卖方监管账户开户行
    *@param moniAcctBank
    */
   public void setMoniAcctBank(java.lang.String moniAcctBank){
      this.moniAcctBank = moniAcctBank;
   }

   /**
    *回款账户开户行
    *@return java.lang.String
    */
   public java.lang.String getReturnAcctBank(){
      return returnAcctBank;
   }

   /**
    *回款账户开户行
    *@param returnAcctBank
    */
   public void setReturnAcctBank(java.lang.String returnAcctBank){
      this.returnAcctBank = returnAcctBank;
   }

   /**
    *池保证金账户开户行
    *@return java.lang.String
    */
   public java.lang.String getBailAcctBank(){
      return bailAcctBank;
   }

   /**
    *池保证金账户开户行
    *@param bailAcctBank
    */
   public void setBailAcctBank(java.lang.String bailAcctBank){
      this.bailAcctBank = bailAcctBank;
   }

   /**
    *结算账号开户行
    *@return java.lang.String
    */
   public java.lang.String getAcctBank(){
      return acctBank;
   }

   /**
    *结算账号开户行
    *@param acctBank
    */
   public void setAcctBank(java.lang.String acctBank){
      this.acctBank = acctBank;
   }

   /**
    *数据来源
    *@return java.lang.String
    */
   public java.lang.String getDataSource(){
      return dataSource;
   }

   /**
    *数据来源
    *@param dataSource
    */
   public void setDataSource(java.lang.String dataSource){
      this.dataSource = dataSource;
   }

   /**
    *基础合同买方客户号
    *@return java.lang.String
    */
   public java.lang.String getCustcdBaseSaller(){
      return custcdBaseSaller;
   }

   /**
    *基础合同买方客户号
    *@param custcdBaseSaller
    */
   public void setCustcdBaseSaller(java.lang.String custcdBaseSaller){
      this.custcdBaseSaller = custcdBaseSaller;
   }

   /**
    *间接付款
    *@return java.lang.String
    */
   public java.lang.String getIndirectPayment(){
      return indirectPayment;
   }

   /**
    *间接付款
    *@param indirectPayment
    */
   public void setIndirectPayment(java.lang.String indirectPayment){
      this.indirectPayment = indirectPayment;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getContStatus(){
      return contStatus;
   }

   /**
    *
    *@param contStatus
    */
   public void setContStatus(java.lang.String contStatus){
      this.contStatus = contStatus;
   }

}