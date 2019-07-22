package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:额度交易流水表
 * 创建日期:2019-07-22 09:36:06
 */
@Table("cfg_credit_txn_log")
public class CfgCreditTxnLog{

   /**
      *交易流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String txnLogId;
   /**
      *来源流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String srcLogId;
   /**
      *额度编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String creditId;
   /**
      *申请流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String applyLogId;
   /**
      *关联业务编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String relBizId;
   /**
      *金额 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal amt;
   /**
      *交易前预占用额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal prevReservedCredit;
   /**
      *交易前已占额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal prevUsedCredit;
   /**
      *交易前冻结额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal prevFrozenCredit;
   /**
      *交易前可用额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal prevAvailableCredit;
   /**
      *交易后预占用额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal postReservedCredit;
   /**
      *交易后已占额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal postUsedCredit;
   /**
      *交易后冻结额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal postFrozenCredit;
   /**
      *交易后可用额度 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal postAvailableCredit;
   /**
      *交易顺序号 
      *数据类型：bigint(20) 
      *是否必填:true 
   **/
   private java.lang.String txnSerial;
   /**
      *交易类型 
      *数据类型：varchar(4) 
      *是否必填:true 
   **/
   private java.lang.String txnType;
   /**
      *交易日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date txnDate;
   /**
      *交易时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date txnTime;
   /**
      *冲正标识
            0-正交易
            1-冲正交易 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String revsFlag;
   /**
      *原交易流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String origTxnLogId;
   /**
      *原来源流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String origSrcLogId;
   /**
      *交易状态
            00-成功
            90-已冲正 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String txnStatus;
   /**
      *备注 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String memo;
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
   private java.lang.String updateProg;

  //get和set方法
   /**
    *交易流水号
    *@return java.lang.String
    */
   public java.lang.String getTxnLogId(){
      return txnLogId;
   }

   /**
    *交易流水号
    *@param txnLogId
    */
   public void setTxnLogId(java.lang.String txnLogId){
      this.txnLogId = txnLogId;
   }

   /**
    *来源流水号
    *@return java.lang.String
    */
   public java.lang.String getSrcLogId(){
      return srcLogId;
   }

   /**
    *来源流水号
    *@param srcLogId
    */
   public void setSrcLogId(java.lang.String srcLogId){
      this.srcLogId = srcLogId;
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
    *关联业务编号
    *@return java.lang.String
    */
   public java.lang.String getRelBizId(){
      return relBizId;
   }

   /**
    *关联业务编号
    *@param relBizId
    */
   public void setRelBizId(java.lang.String relBizId){
      this.relBizId = relBizId;
   }

   /**
    *金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAmt(){
      return amt;
   }

   /**
    *金额
    *@param amt
    */
   public void setAmt(java.math.BigDecimal amt){
      this.amt = amt;
   }

   /**
    *交易前预占用额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPrevReservedCredit(){
      return prevReservedCredit;
   }

   /**
    *交易前预占用额度
    *@param prevReservedCredit
    */
   public void setPrevReservedCredit(java.math.BigDecimal prevReservedCredit){
      this.prevReservedCredit = prevReservedCredit;
   }

   /**
    *交易前已占额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPrevUsedCredit(){
      return prevUsedCredit;
   }

   /**
    *交易前已占额度
    *@param prevUsedCredit
    */
   public void setPrevUsedCredit(java.math.BigDecimal prevUsedCredit){
      this.prevUsedCredit = prevUsedCredit;
   }

   /**
    *交易前冻结额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPrevFrozenCredit(){
      return prevFrozenCredit;
   }

   /**
    *交易前冻结额度
    *@param prevFrozenCredit
    */
   public void setPrevFrozenCredit(java.math.BigDecimal prevFrozenCredit){
      this.prevFrozenCredit = prevFrozenCredit;
   }

   /**
    *交易前可用额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPrevAvailableCredit(){
      return prevAvailableCredit;
   }

   /**
    *交易前可用额度
    *@param prevAvailableCredit
    */
   public void setPrevAvailableCredit(java.math.BigDecimal prevAvailableCredit){
      this.prevAvailableCredit = prevAvailableCredit;
   }

   /**
    *交易后预占用额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPostReservedCredit(){
      return postReservedCredit;
   }

   /**
    *交易后预占用额度
    *@param postReservedCredit
    */
   public void setPostReservedCredit(java.math.BigDecimal postReservedCredit){
      this.postReservedCredit = postReservedCredit;
   }

   /**
    *交易后已占额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPostUsedCredit(){
      return postUsedCredit;
   }

   /**
    *交易后已占额度
    *@param postUsedCredit
    */
   public void setPostUsedCredit(java.math.BigDecimal postUsedCredit){
      this.postUsedCredit = postUsedCredit;
   }

   /**
    *交易后冻结额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPostFrozenCredit(){
      return postFrozenCredit;
   }

   /**
    *交易后冻结额度
    *@param postFrozenCredit
    */
   public void setPostFrozenCredit(java.math.BigDecimal postFrozenCredit){
      this.postFrozenCredit = postFrozenCredit;
   }

   /**
    *交易后可用额度
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getPostAvailableCredit(){
      return postAvailableCredit;
   }

   /**
    *交易后可用额度
    *@param postAvailableCredit
    */
   public void setPostAvailableCredit(java.math.BigDecimal postAvailableCredit){
      this.postAvailableCredit = postAvailableCredit;
   }

   /**
    *交易顺序号
    *@return java.lang.String
    */
   public java.lang.String getTxnSerial(){
      return txnSerial;
   }

   /**
    *交易顺序号
    *@param txnSerial
    */
   public void setTxnSerial(java.lang.String txnSerial){
      this.txnSerial = txnSerial;
   }

   /**
    *交易类型
    *@return java.lang.String
    */
   public java.lang.String getTxnType(){
      return txnType;
   }

   /**
    *交易类型
    *@param txnType
    */
   public void setTxnType(java.lang.String txnType){
      this.txnType = txnType;
   }

   /**
    *交易日期
    *@return java.util.Date
    */
   public java.util.Date getTxnDate(){
      return txnDate;
   }

   /**
    *交易日期
    *@param txnDate
    */
   public void setTxnDate(java.util.Date txnDate){
      this.txnDate = txnDate;
   }

   /**
    *交易时间
    *@return java.util.Date
    */
   public java.util.Date getTxnTime(){
      return txnTime;
   }

   /**
    *交易时间
    *@param txnTime
    */
   public void setTxnTime(java.util.Date txnTime){
      this.txnTime = txnTime;
   }

   /**
    *冲正标识
            0-正交易
            1-冲正交易
    *@return java.lang.String
    */
   public java.lang.String getRevsFlag(){
      return revsFlag;
   }

   /**
    *冲正标识
            0-正交易
            1-冲正交易
    *@param revsFlag
    */
   public void setRevsFlag(java.lang.String revsFlag){
      this.revsFlag = revsFlag;
   }

   /**
    *原交易流水号
    *@return java.lang.String
    */
   public java.lang.String getOrigTxnLogId(){
      return origTxnLogId;
   }

   /**
    *原交易流水号
    *@param origTxnLogId
    */
   public void setOrigTxnLogId(java.lang.String origTxnLogId){
      this.origTxnLogId = origTxnLogId;
   }

   /**
    *原来源流水号
    *@return java.lang.String
    */
   public java.lang.String getOrigSrcLogId(){
      return origSrcLogId;
   }

   /**
    *原来源流水号
    *@param origSrcLogId
    */
   public void setOrigSrcLogId(java.lang.String origSrcLogId){
      this.origSrcLogId = origSrcLogId;
   }

   /**
    *交易状态
            00-成功
            90-已冲正
    *@return java.lang.String
    */
   public java.lang.String getTxnStatus(){
      return txnStatus;
   }

   /**
    *交易状态
            00-成功
            90-已冲正
    *@param txnStatus
    */
   public void setTxnStatus(java.lang.String txnStatus){
      this.txnStatus = txnStatus;
   }

   /**
    *备注
    *@return java.lang.String
    */
   public java.lang.String getMemo(){
      return memo;
   }

   /**
    *备注
    *@param memo
    */
   public void setMemo(java.lang.String memo){
      this.memo = memo;
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
   public java.lang.String getUpdateProg(){
      return updateProg;
   }

   /**
    *更新程序
    *@param updateProg
    */
   public void setUpdateProg(java.lang.String updateProg){
      this.updateProg = updateProg;
   }

}