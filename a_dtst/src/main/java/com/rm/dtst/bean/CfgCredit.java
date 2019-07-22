package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:额度信息表
 * 创建日期:2019-07-22 09:36:03
 */
@Table("cfg_credit")
public class CfgCredit{

   /**
      *额度编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String creditId;
   /**
      *申请流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String applyLogId;
   /**
      *额度种类编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String creditTypeCode;
   /**
      *授信类型
            1-直接授信
            2-第三方授信
            3-间接授信
            4-买方授信 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String grantType;
   /**
      *产品额度类型
            01-订单融资额度
            02-保理融资额度
            03-提货担保融资额度
            04-预付款融资额度
            05-商票保贴融资额度
             
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String productCreditType;
   /**
      *额度种类
            1-核心企业额度
            2-产品额度
            3-链属企业额度 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String creditClass;
   /**
      *循环标识
            0-非循环
            1-循环 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String recycleFlag;
   /**
      *共享标识
            0-独占
            1-共享 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String shareFlag;
   /**
      *集团额度标识
            0-非集团
            1-集团 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String groupFlag;
   /**
      *集团额度编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String groupCreditId;
   /**
      *上级额度编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String parentCreditId;
   /**
      *产品编号 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String productId;
   /**
      *产品名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String productName;
   /**
      *币种 
      *数据类型：char(3) 
      *是否必填:true 
   **/
   private java.lang.String currency;
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
      *客户评级 
      *数据类型：varchar(10) 
      *是否必填:true 
   **/
   private java.lang.String custRating;
   /**
      *授信客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String grantCustId;
   /**
      *授信客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String grantCustName;
   /**
      *申请额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal appliedCredit;
   /**
      *批复额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal approvedCredit;
   /**
      *剩余额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal remainingCredit;
   /**
      *预占用额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal reservedCredit;
   /**
      *已占额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal usedCredit;
   /**
      *冻结额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal frozenCredit;
   /**
      *可用额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal availableCredit;
   /**
      *生效日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date effectiveDate;
   /**
      *有效天数 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer effectiveDays;
   /**
      *到期日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date expiryDate;
   /**
      *额度状态
            01-审批通过
            02-已启用
            03-终止
            99-已失效 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String creditStatus;
   /**
      *批复日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date approveDate;
   /**
      *原额度编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String origCreditId;
   /**
      *担保方式
            01-无担保
            02-最高额担保
            03-逐笔担保 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String guaranteeMode;
   /**
      *还款来源 
      *数据类型：text 
      *是否必填:false 
   **/
   private java.lang.String repaySource;
   /**
      *申请意见 
      *数据类型：text 
      *是否必填:false 
   **/
   private java.lang.String applyExplain;
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
      *创建时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *更新程序 
      *数据类型：varchar(128) 
      *是否必填:true 
   **/
   private java.lang.String updateProgram;

  //get和set方法
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
    *额度种类编号
    *@return java.lang.String
    */
   public java.lang.String getCreditTypeCode(){
      return creditTypeCode;
   }

   /**
    *额度种类编号
    *@param creditTypeCode
    */
   public void setCreditTypeCode(java.lang.String creditTypeCode){
      this.creditTypeCode = creditTypeCode;
   }

   /**
    *授信类型
            1-直接授信
            2-第三方授信
            3-间接授信
            4-买方授信
    *@return java.lang.String
    */
   public java.lang.String getGrantType(){
      return grantType;
   }

   /**
    *授信类型
            1-直接授信
            2-第三方授信
            3-间接授信
            4-买方授信
    *@param grantType
    */
   public void setGrantType(java.lang.String grantType){
      this.grantType = grantType;
   }

   /**
    *产品额度类型
            01-订单融资额度
            02-保理融资额度
            03-提货担保融资额度
            04-预付款融资额度
            05-商票保贴融资额度
            
    *@return java.lang.String
    */
   public java.lang.String getProductCreditType(){
      return productCreditType;
   }

   /**
    *产品额度类型
            01-订单融资额度
            02-保理融资额度
            03-提货担保融资额度
            04-预付款融资额度
            05-商票保贴融资额度
            
    *@param productCreditType
    */
   public void setProductCreditType(java.lang.String productCreditType){
      this.productCreditType = productCreditType;
   }

   /**
    *额度种类
            1-核心企业额度
            2-产品额度
            3-链属企业额度
    *@return java.lang.String
    */
   public java.lang.String getCreditClass(){
      return creditClass;
   }

   /**
    *额度种类
            1-核心企业额度
            2-产品额度
            3-链属企业额度
    *@param creditClass
    */
   public void setCreditClass(java.lang.String creditClass){
      this.creditClass = creditClass;
   }

   /**
    *循环标识
            0-非循环
            1-循环
    *@return java.lang.String
    */
   public java.lang.String getRecycleFlag(){
      return recycleFlag;
   }

   /**
    *循环标识
            0-非循环
            1-循环
    *@param recycleFlag
    */
   public void setRecycleFlag(java.lang.String recycleFlag){
      this.recycleFlag = recycleFlag;
   }

   /**
    *共享标识
            0-独占
            1-共享
    *@return java.lang.String
    */
   public java.lang.String getShareFlag(){
      return shareFlag;
   }

   /**
    *共享标识
            0-独占
            1-共享
    *@param shareFlag
    */
   public void setShareFlag(java.lang.String shareFlag){
      this.shareFlag = shareFlag;
   }

   /**
    *集团额度标识
            0-非集团
            1-集团
    *@return java.lang.String
    */
   public java.lang.String getGroupFlag(){
      return groupFlag;
   }

   /**
    *集团额度标识
            0-非集团
            1-集团
    *@param groupFlag
    */
   public void setGroupFlag(java.lang.String groupFlag){
      this.groupFlag = groupFlag;
   }

   /**
    *集团额度编号
    *@return java.lang.String
    */
   public java.lang.String getGroupCreditId(){
      return groupCreditId;
   }

   /**
    *集团额度编号
    *@param groupCreditId
    */
   public void setGroupCreditId(java.lang.String groupCreditId){
      this.groupCreditId = groupCreditId;
   }

   /**
    *上级额度编号
    *@return java.lang.String
    */
   public java.lang.String getParentCreditId(){
      return parentCreditId;
   }

   /**
    *上级额度编号
    *@param parentCreditId
    */
   public void setParentCreditId(java.lang.String parentCreditId){
      this.parentCreditId = parentCreditId;
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
    *客户评级
    *@return java.lang.String
    */
   public java.lang.String getCustRating(){
      return custRating;
   }

   /**
    *客户评级
    *@param custRating
    */
   public void setCustRating(java.lang.String custRating){
      this.custRating = custRating;
   }

   /**
    *授信客户号
    *@return java.lang.String
    */
   public java.lang.String getGrantCustId(){
      return grantCustId;
   }

   /**
    *授信客户号
    *@param grantCustId
    */
   public void setGrantCustId(java.lang.String grantCustId){
      this.grantCustId = grantCustId;
   }

   /**
    *授信客户名称
    *@return java.lang.String
    */
   public java.lang.String getGrantCustName(){
      return grantCustName;
   }

   /**
    *授信客户名称
    *@param grantCustName
    */
   public void setGrantCustName(java.lang.String grantCustName){
      this.grantCustName = grantCustName;
   }

   /**
    *申请额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAppliedCredit(){
      return appliedCredit;
   }

   /**
    *申请额度
    *@param appliedCredit
    */
   public void setAppliedCredit(java.math.BigDecimal appliedCredit){
      this.appliedCredit = appliedCredit;
   }

   /**
    *批复额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getApprovedCredit(){
      return approvedCredit;
   }

   /**
    *批复额度
    *@param approvedCredit
    */
   public void setApprovedCredit(java.math.BigDecimal approvedCredit){
      this.approvedCredit = approvedCredit;
   }

   /**
    *剩余额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getRemainingCredit(){
      return remainingCredit;
   }

   /**
    *剩余额度
    *@param remainingCredit
    */
   public void setRemainingCredit(java.math.BigDecimal remainingCredit){
      this.remainingCredit = remainingCredit;
   }

   /**
    *预占用额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReservedCredit(){
      return reservedCredit;
   }

   /**
    *预占用额度
    *@param reservedCredit
    */
   public void setReservedCredit(java.math.BigDecimal reservedCredit){
      this.reservedCredit = reservedCredit;
   }

   /**
    *已占额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getUsedCredit(){
      return usedCredit;
   }

   /**
    *已占额度
    *@param usedCredit
    */
   public void setUsedCredit(java.math.BigDecimal usedCredit){
      this.usedCredit = usedCredit;
   }

   /**
    *冻结额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getFrozenCredit(){
      return frozenCredit;
   }

   /**
    *冻结额度
    *@param frozenCredit
    */
   public void setFrozenCredit(java.math.BigDecimal frozenCredit){
      this.frozenCredit = frozenCredit;
   }

   /**
    *可用额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAvailableCredit(){
      return availableCredit;
   }

   /**
    *可用额度
    *@param availableCredit
    */
   public void setAvailableCredit(java.math.BigDecimal availableCredit){
      this.availableCredit = availableCredit;
   }

   /**
    *生效日期
    *@return java.util.Date
    */
   public java.util.Date getEffectiveDate(){
      return effectiveDate;
   }

   /**
    *生效日期
    *@param effectiveDate
    */
   public void setEffectiveDate(java.util.Date effectiveDate){
      this.effectiveDate = effectiveDate;
   }

   /**
    *有效天数
    *@return java.lang.Integer
    */
   public java.lang.Integer getEffectiveDays(){
      return effectiveDays;
   }

   /**
    *有效天数
    *@param effectiveDays
    */
   public void setEffectiveDays(java.lang.Integer effectiveDays){
      this.effectiveDays = effectiveDays;
   }

   /**
    *到期日期
    *@return java.util.Date
    */
   public java.util.Date getExpiryDate(){
      return expiryDate;
   }

   /**
    *到期日期
    *@param expiryDate
    */
   public void setExpiryDate(java.util.Date expiryDate){
      this.expiryDate = expiryDate;
   }

   /**
    *额度状态
            01-审批通过
            02-已启用
            03-终止
            99-已失效
    *@return java.lang.String
    */
   public java.lang.String getCreditStatus(){
      return creditStatus;
   }

   /**
    *额度状态
            01-审批通过
            02-已启用
            03-终止
            99-已失效
    *@param creditStatus
    */
   public void setCreditStatus(java.lang.String creditStatus){
      this.creditStatus = creditStatus;
   }

   /**
    *批复日期
    *@return java.util.Date
    */
   public java.util.Date getApproveDate(){
      return approveDate;
   }

   /**
    *批复日期
    *@param approveDate
    */
   public void setApproveDate(java.util.Date approveDate){
      this.approveDate = approveDate;
   }

   /**
    *原额度编号
    *@return java.lang.String
    */
   public java.lang.String getOrigCreditId(){
      return origCreditId;
   }

   /**
    *原额度编号
    *@param origCreditId
    */
   public void setOrigCreditId(java.lang.String origCreditId){
      this.origCreditId = origCreditId;
   }

   /**
    *担保方式
            01-无担保
            02-最高额担保
            03-逐笔担保
    *@return java.lang.String
    */
   public java.lang.String getGuaranteeMode(){
      return guaranteeMode;
   }

   /**
    *担保方式
            01-无担保
            02-最高额担保
            03-逐笔担保
    *@param guaranteeMode
    */
   public void setGuaranteeMode(java.lang.String guaranteeMode){
      this.guaranteeMode = guaranteeMode;
   }

   /**
    *还款来源
    *@return java.lang.String
    */
   public java.lang.String getRepaySource(){
      return repaySource;
   }

   /**
    *还款来源
    *@param repaySource
    */
   public void setRepaySource(java.lang.String repaySource){
      this.repaySource = repaySource;
   }

   /**
    *申请意见
    *@return java.lang.String
    */
   public java.lang.String getApplyExplain(){
      return applyExplain;
   }

   /**
    *申请意见
    *@param applyExplain
    */
   public void setApplyExplain(java.lang.String applyExplain){
      this.applyExplain = applyExplain;
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
    *创建时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *创建时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
      this.updateTime = updateTime;
   }

   /**
    *更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProgram(){
      return updateProgram;
   }

   /**
    *更新程序
    *@param updateProgram
    */
   public void setUpdateProgram(java.lang.String updateProgram){
      this.updateProgram = updateProgram;
   }

}