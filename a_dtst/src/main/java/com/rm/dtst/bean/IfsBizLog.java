package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]操作日志表
 * 创建日期:2019-07-22 09:37:08
 */
@Table("ifs_biz_log")
public class IfsBizLog{

   /**
      *主键 
      *数据类型：char(36) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *日志序号 
      *数据类型：char(36) 
      *是否必填:true 
   **/
   private java.lang.String logId;
   /**
      *交易日期 
      *数据类型：char(8) 
      *是否必填:true 
   **/
   private java.lang.String txnDate;
   /**
      *交易开始时间 
      *数据类型：char(6) 
      *是否必填:true 
   **/
   private java.lang.String txnStartTime;
   /**
      *交易结束时间 
      *数据类型：char(6) 
      *是否必填:true 
   **/
   private java.lang.String txnEndTime;
   /**
      *交易耗时 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer txnRunTime;
   /**
      *交易机构号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String brcode;
   /**
      *交易操作员 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String oprcode;
   /**
      *交易IP 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String ipAdr;
   /**
      *菜单编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String funcid;
   /**
      *操作码 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String oprtxncd;
   /**
      *操作日志1 
      *数据类型：varchar(2048) 
      *是否必填:false 
   **/
   private java.lang.String txnBizLog1;
   /**
      *操作日志2 
      *数据类型：varchar(2048) 
      *是否必填:false 
   **/
   private java.lang.String txnBizLog2;
   /**
      *交易状态99=失败02=成功 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String txnStatus;
   /**
      *失败信息 
      *数据类型：varchar(2048) 
      *是否必填:false 
   **/
   private java.lang.String txnFailLog;

  //get和set方法
   /**
    *主键
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *日志序号
    *@return java.lang.String
    */
   public java.lang.String getLogId(){
      return logId;
   }

   /**
    *日志序号
    *@param logId
    */
   public void setLogId(java.lang.String logId){
      this.logId = logId;
   }

   /**
    *交易日期
    *@return java.lang.String
    */
   public java.lang.String getTxnDate(){
      return txnDate;
   }

   /**
    *交易日期
    *@param txnDate
    */
   public void setTxnDate(java.lang.String txnDate){
      this.txnDate = txnDate;
   }

   /**
    *交易开始时间
    *@return java.lang.String
    */
   public java.lang.String getTxnStartTime(){
      return txnStartTime;
   }

   /**
    *交易开始时间
    *@param txnStartTime
    */
   public void setTxnStartTime(java.lang.String txnStartTime){
      this.txnStartTime = txnStartTime;
   }

   /**
    *交易结束时间
    *@return java.lang.String
    */
   public java.lang.String getTxnEndTime(){
      return txnEndTime;
   }

   /**
    *交易结束时间
    *@param txnEndTime
    */
   public void setTxnEndTime(java.lang.String txnEndTime){
      this.txnEndTime = txnEndTime;
   }

   /**
    *交易耗时
    *@return java.lang.Integer
    */
   public java.lang.Integer getTxnRunTime(){
      return txnRunTime;
   }

   /**
    *交易耗时
    *@param txnRunTime
    */
   public void setTxnRunTime(java.lang.Integer txnRunTime){
      this.txnRunTime = txnRunTime;
   }

   /**
    *交易机构号
    *@return java.lang.String
    */
   public java.lang.String getBrcode(){
      return brcode;
   }

   /**
    *交易机构号
    *@param brcode
    */
   public void setBrcode(java.lang.String brcode){
      this.brcode = brcode;
   }

   /**
    *交易操作员
    *@return java.lang.String
    */
   public java.lang.String getOprcode(){
      return oprcode;
   }

   /**
    *交易操作员
    *@param oprcode
    */
   public void setOprcode(java.lang.String oprcode){
      this.oprcode = oprcode;
   }

   /**
    *交易IP
    *@return java.lang.String
    */
   public java.lang.String getIpAdr(){
      return ipAdr;
   }

   /**
    *交易IP
    *@param ipAdr
    */
   public void setIpAdr(java.lang.String ipAdr){
      this.ipAdr = ipAdr;
   }

   /**
    *菜单编号
    *@return java.lang.String
    */
   public java.lang.String getFuncid(){
      return funcid;
   }

   /**
    *菜单编号
    *@param funcid
    */
   public void setFuncid(java.lang.String funcid){
      this.funcid = funcid;
   }

   /**
    *操作码
    *@return java.lang.String
    */
   public java.lang.String getOprtxncd(){
      return oprtxncd;
   }

   /**
    *操作码
    *@param oprtxncd
    */
   public void setOprtxncd(java.lang.String oprtxncd){
      this.oprtxncd = oprtxncd;
   }

   /**
    *操作日志1
    *@return java.lang.String
    */
   public java.lang.String getTxnBizLog1(){
      return txnBizLog1;
   }

   /**
    *操作日志1
    *@param txnBizLog1
    */
   public void setTxnBizLog1(java.lang.String txnBizLog1){
      this.txnBizLog1 = txnBizLog1;
   }

   /**
    *操作日志2
    *@return java.lang.String
    */
   public java.lang.String getTxnBizLog2(){
      return txnBizLog2;
   }

   /**
    *操作日志2
    *@param txnBizLog2
    */
   public void setTxnBizLog2(java.lang.String txnBizLog2){
      this.txnBizLog2 = txnBizLog2;
   }

   /**
    *交易状态99=失败02=成功
    *@return java.lang.String
    */
   public java.lang.String getTxnStatus(){
      return txnStatus;
   }

   /**
    *交易状态99=失败02=成功
    *@param txnStatus
    */
   public void setTxnStatus(java.lang.String txnStatus){
      this.txnStatus = txnStatus;
   }

   /**
    *失败信息
    *@return java.lang.String
    */
   public java.lang.String getTxnFailLog(){
      return txnFailLog;
   }

   /**
    *失败信息
    *@param txnFailLog
    */
   public void setTxnFailLog(java.lang.String txnFailLog){
      this.txnFailLog = txnFailLog;
   }

}