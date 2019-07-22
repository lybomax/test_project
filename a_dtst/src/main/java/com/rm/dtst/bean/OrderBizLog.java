package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:订单中心业务流水表
 * 创建日期:2019-07-22 09:37:24
 */
@Table("order_biz_log")
public class OrderBizLog{

   /**
      *业务流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String bizLogId;
   /**
      *来源流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String srcLogId;
   /**
      *平台流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String sysLogId;
   /**
      *渠道标识 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String channelId;
   /**
      *渠道报文标识号 
      *数据类型：varchar(35) 
      *是否必填:true 
   **/
   private java.lang.String channelMsgId;
   /**
      *渠道报文类型 
      *数据类型：char(6) 
      *是否必填:false 
   **/
   private java.lang.String channelMsgType;
   /**
      *渠道日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date channelDate;
   /**
      *渠道终端类型
            10-app iOS
            11-app android
            20-web
            30-wechat 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String channelTerminalType;
   /**
      *业务大类 
      *数据类型：varchar(6) 
      *是否必填:false 
   **/
   private java.lang.String bizCat;
   /**
      *业务子类 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String bizSubCat;
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
      *原业务流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String origBizLogId;
   /**
      *原来源流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String origSrcLogId;
   /**
      *交易状态
            00-成功
            10-待处理
            11-处理中
            80-未明
            90-已冲正
            99-失败 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String txnStatus;
   /**
      *交易失败原因 
      *数据类型：varchar(512) 
      *是否必填:false 
   **/
   private java.lang.String txnFailDesc;
   /**
      *请求报文 
      *数据类型：varchar(16384) 
      *是否必填:true 
   **/
   private java.lang.String requestMsg;
   /**
      *应答报文 
      *数据类型：varchar(2048) 
      *是否必填:false 
   **/
   private java.lang.String responseMsg;
   /**
      *返回码 
      *数据类型：char(6) 
      *是否必填:false 
   **/
   private java.lang.String resultCode;
   /**
      *返回信息 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String resultDesc;
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
    *业务流水号
    *@return java.lang.String
    */
   public java.lang.String getBizLogId(){
      return bizLogId;
   }

   /**
    *业务流水号
    *@param bizLogId
    */
   public void setBizLogId(java.lang.String bizLogId){
      this.bizLogId = bizLogId;
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
    *平台流水号
    *@return java.lang.String
    */
   public java.lang.String getSysLogId(){
      return sysLogId;
   }

   /**
    *平台流水号
    *@param sysLogId
    */
   public void setSysLogId(java.lang.String sysLogId){
      this.sysLogId = sysLogId;
   }

   /**
    *渠道标识
    *@return java.lang.String
    */
   public java.lang.String getChannelId(){
      return channelId;
   }

   /**
    *渠道标识
    *@param channelId
    */
   public void setChannelId(java.lang.String channelId){
      this.channelId = channelId;
   }

   /**
    *渠道报文标识号
    *@return java.lang.String
    */
   public java.lang.String getChannelMsgId(){
      return channelMsgId;
   }

   /**
    *渠道报文标识号
    *@param channelMsgId
    */
   public void setChannelMsgId(java.lang.String channelMsgId){
      this.channelMsgId = channelMsgId;
   }

   /**
    *渠道报文类型
    *@return java.lang.String
    */
   public java.lang.String getChannelMsgType(){
      return channelMsgType;
   }

   /**
    *渠道报文类型
    *@param channelMsgType
    */
   public void setChannelMsgType(java.lang.String channelMsgType){
      this.channelMsgType = channelMsgType;
   }

   /**
    *渠道日期
    *@return java.util.Date
    */
   public java.util.Date getChannelDate(){
      return channelDate;
   }

   /**
    *渠道日期
    *@param channelDate
    */
   public void setChannelDate(java.util.Date channelDate){
      this.channelDate = channelDate;
   }

   /**
    *渠道终端类型
            10-app iOS
            11-app android
            20-web
            30-wechat
    *@return java.lang.String
    */
   public java.lang.String getChannelTerminalType(){
      return channelTerminalType;
   }

   /**
    *渠道终端类型
            10-app iOS
            11-app android
            20-web
            30-wechat
    *@param channelTerminalType
    */
   public void setChannelTerminalType(java.lang.String channelTerminalType){
      this.channelTerminalType = channelTerminalType;
   }

   /**
    *业务大类
    *@return java.lang.String
    */
   public java.lang.String getBizCat(){
      return bizCat;
   }

   /**
    *业务大类
    *@param bizCat
    */
   public void setBizCat(java.lang.String bizCat){
      this.bizCat = bizCat;
   }

   /**
    *业务子类
    *@return java.lang.String
    */
   public java.lang.String getBizSubCat(){
      return bizSubCat;
   }

   /**
    *业务子类
    *@param bizSubCat
    */
   public void setBizSubCat(java.lang.String bizSubCat){
      this.bizSubCat = bizSubCat;
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
    *原业务流水号
    *@return java.lang.String
    */
   public java.lang.String getOrigBizLogId(){
      return origBizLogId;
   }

   /**
    *原业务流水号
    *@param origBizLogId
    */
   public void setOrigBizLogId(java.lang.String origBizLogId){
      this.origBizLogId = origBizLogId;
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
            10-待处理
            11-处理中
            80-未明
            90-已冲正
            99-失败
    *@return java.lang.String
    */
   public java.lang.String getTxnStatus(){
      return txnStatus;
   }

   /**
    *交易状态
            00-成功
            10-待处理
            11-处理中
            80-未明
            90-已冲正
            99-失败
    *@param txnStatus
    */
   public void setTxnStatus(java.lang.String txnStatus){
      this.txnStatus = txnStatus;
   }

   /**
    *交易失败原因
    *@return java.lang.String
    */
   public java.lang.String getTxnFailDesc(){
      return txnFailDesc;
   }

   /**
    *交易失败原因
    *@param txnFailDesc
    */
   public void setTxnFailDesc(java.lang.String txnFailDesc){
      this.txnFailDesc = txnFailDesc;
   }

   /**
    *请求报文
    *@return java.lang.String
    */
   public java.lang.String getRequestMsg(){
      return requestMsg;
   }

   /**
    *请求报文
    *@param requestMsg
    */
   public void setRequestMsg(java.lang.String requestMsg){
      this.requestMsg = requestMsg;
   }

   /**
    *应答报文
    *@return java.lang.String
    */
   public java.lang.String getResponseMsg(){
      return responseMsg;
   }

   /**
    *应答报文
    *@param responseMsg
    */
   public void setResponseMsg(java.lang.String responseMsg){
      this.responseMsg = responseMsg;
   }

   /**
    *返回码
    *@return java.lang.String
    */
   public java.lang.String getResultCode(){
      return resultCode;
   }

   /**
    *返回码
    *@param resultCode
    */
   public void setResultCode(java.lang.String resultCode){
      this.resultCode = resultCode;
   }

   /**
    *返回信息
    *@return java.lang.String
    */
   public java.lang.String getResultDesc(){
      return resultDesc;
   }

   /**
    *返回信息
    *@param resultDesc
    */
   public void setResultDesc(java.lang.String resultDesc){
      this.resultDesc = resultDesc;
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