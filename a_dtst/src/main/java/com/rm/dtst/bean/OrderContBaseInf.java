package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:订单融资合同信息表
 * 创建日期:2019-07-22 09:37:25
 */
@Table("order_cont_base_inf")
public class OrderContBaseInf{

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
      *业务合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String businessNo;
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
   private java.lang.String capitalCustcd;
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
      *产品编号 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String baseProductId;
   /**
      *产品名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String baseProductName;
   /**
      *合同开始日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date startDate;
   /**
      *最迟付款日 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date endDate;
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
      *融资比例:默认100%不可修改 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal loanPercent;
   /**
      *应收账款合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String debtContNo;
   /**
      *还款方式 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String repayMode;
   /**
      *融资成本 
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
      *逾期利率 
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
      *罚息利率 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal punitiveRate;
   /**
      *合同状态:
            01-生效 
            02-出账
            03-结清 
            04-逾期 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String contStatus;
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
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date signDate;
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
      *框架合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String frameMastContno;
   /**
      *融资模式:01逐笔融资、02框架合同融资 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String financeMode;
   /**
      *尾款是否解付：1-是、2-否 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String toSallerFlag;
   /**
      *回款用途：01-还贷 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String returnUsage;
   /**
      *回款核销规则：01-先到期限先核销，02-平均分配核销 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String assignRule;
   /**
      *结算账号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String acctNo;
   /**
      *结算账号名称 
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String acctNoName;
   /**
      *结算账号开户行 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String acctBank;
   /**
      *回款保证金账号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String returnAcctNo;
   /**
      *回款账户名称 
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String returnAcctName;
   /**
      *回款账户开户行 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String returnAcctBank;
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
    *业务合同号
    *@return java.lang.String
    */
   public java.lang.String getBusinessNo(){
      return businessNo;
   }

   /**
    *业务合同号
    *@param businessNo
    */
   public void setBusinessNo(java.lang.String businessNo){
      this.businessNo = businessNo;
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
    *合同开始日期
    *@return java.util.Date
    */
   public java.util.Date getStartDate(){
      return startDate;
   }

   /**
    *合同开始日期
    *@param startDate
    */
   public void setStartDate(java.util.Date startDate){
      this.startDate = startDate;
   }

   /**
    *最迟付款日
    *@return java.util.Date
    */
   public java.util.Date getEndDate(){
      return endDate;
   }

   /**
    *最迟付款日
    *@param endDate
    */
   public void setEndDate(java.util.Date endDate){
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
    *融资比例:默认100%不可修改
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLoanPercent(){
      return loanPercent;
   }

   /**
    *融资比例:默认100%不可修改
    *@param loanPercent
    */
   public void setLoanPercent(java.math.BigDecimal loanPercent){
      this.loanPercent = loanPercent;
   }

   /**
    *应收账款合同号
    *@return java.lang.String
    */
   public java.lang.String getDebtContNo(){
      return debtContNo;
   }

   /**
    *应收账款合同号
    *@param debtContNo
    */
   public void setDebtContNo(java.lang.String debtContNo){
      this.debtContNo = debtContNo;
   }

   /**
    *还款方式
    *@return java.lang.String
    */
   public java.lang.String getRepayMode(){
      return repayMode;
   }

   /**
    *还款方式
    *@param repayMode
    */
   public void setRepayMode(java.lang.String repayMode){
      this.repayMode = repayMode;
   }

   /**
    *融资成本
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getFinancingCostRate(){
      return financingCostRate;
   }

   /**
    *融资成本
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
    *逾期利率
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getOverdueRate(){
      return overdueRate;
   }

   /**
    *逾期利率
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
    *罚息利率
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPunitiveRate(){
      return punitiveRate;
   }

   /**
    *罚息利率
    *@param punitiveRate
    */
   public void setPunitiveRate(java.math.BigDecimal punitiveRate){
      this.punitiveRate = punitiveRate;
   }

   /**
    *合同状态:
            01-生效 
            02-出账
            03-结清 
            04-逾期
    *@return java.lang.String
    */
   public java.lang.String getContStatus(){
      return contStatus;
   }

   /**
    *合同状态:
            01-生效 
            02-出账
            03-结清 
            04-逾期
    *@param contStatus
    */
   public void setContStatus(java.lang.String contStatus){
      this.contStatus = contStatus;
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
    *@return java.util.Date
    */
   public java.util.Date getSignDate(){
      return signDate;
   }

   /**
    *签约日期
    *@param signDate
    */
   public void setSignDate(java.util.Date signDate){
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
    *框架合同号
    *@return java.lang.String
    */
   public java.lang.String getFrameMastContno(){
      return frameMastContno;
   }

   /**
    *框架合同号
    *@param frameMastContno
    */
   public void setFrameMastContno(java.lang.String frameMastContno){
      this.frameMastContno = frameMastContno;
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
    *尾款是否解付：1-是、2-否
    *@return java.lang.String
    */
   public java.lang.String getToSallerFlag(){
      return toSallerFlag;
   }

   /**
    *尾款是否解付：1-是、2-否
    *@param toSallerFlag
    */
   public void setToSallerFlag(java.lang.String toSallerFlag){
      this.toSallerFlag = toSallerFlag;
   }

   /**
    *回款用途：01-还贷
    *@return java.lang.String
    */
   public java.lang.String getReturnUsage(){
      return returnUsage;
   }

   /**
    *回款用途：01-还贷
    *@param returnUsage
    */
   public void setReturnUsage(java.lang.String returnUsage){
      this.returnUsage = returnUsage;
   }

   /**
    *回款核销规则：01-先到期限先核销，02-平均分配核销
    *@return java.lang.String
    */
   public java.lang.String getAssignRule(){
      return assignRule;
   }

   /**
    *回款核销规则：01-先到期限先核销，02-平均分配核销
    *@param assignRule
    */
   public void setAssignRule(java.lang.String assignRule){
      this.assignRule = assignRule;
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
    *回款保证金账号
    *@return java.lang.String
    */
   public java.lang.String getReturnAcctNo(){
      return returnAcctNo;
   }

   /**
    *回款保证金账号
    *@param returnAcctNo
    */
   public void setReturnAcctNo(java.lang.String returnAcctNo){
      this.returnAcctNo = returnAcctNo;
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