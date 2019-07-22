package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:系统异常信息表
 * 创建日期:2019-07-22 09:37:34
 */
@Table("sys_error")
public class SysError{

   /**
      *异常信息id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String errorId;
   /**
      *关联流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String relLogId;
   /**
      *系统编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String sysCode;
   /**
      *异常描述 
      *数据类型：varchar(1024) 
      *是否必填:true 
   **/
   private java.lang.String errorDesc;
   /**
      *该笔业务后续是否会重新尝试处理？
            0-否
            1-是 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String retryFlag;
   /**
      *已读标识
            0-未读
            1-已读 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String readFlag;
   /**
      *处理标识
            0-未处理
            1-已处理 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String procFlag;
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
   private java.lang.String updateProgram;

  //get和set方法
   /**
    *异常信息id
    *@return java.lang.String
    */
   public java.lang.String getErrorId(){
      return errorId;
   }

   /**
    *异常信息id
    *@param errorId
    */
   public void setErrorId(java.lang.String errorId){
      this.errorId = errorId;
   }

   /**
    *关联流水号
    *@return java.lang.String
    */
   public java.lang.String getRelLogId(){
      return relLogId;
   }

   /**
    *关联流水号
    *@param relLogId
    */
   public void setRelLogId(java.lang.String relLogId){
      this.relLogId = relLogId;
   }

   /**
    *系统编号
    *@return java.lang.String
    */
   public java.lang.String getSysCode(){
      return sysCode;
   }

   /**
    *系统编号
    *@param sysCode
    */
   public void setSysCode(java.lang.String sysCode){
      this.sysCode = sysCode;
   }

   /**
    *异常描述
    *@return java.lang.String
    */
   public java.lang.String getErrorDesc(){
      return errorDesc;
   }

   /**
    *异常描述
    *@param errorDesc
    */
   public void setErrorDesc(java.lang.String errorDesc){
      this.errorDesc = errorDesc;
   }

   /**
    *该笔业务后续是否会重新尝试处理？
            0-否
            1-是
    *@return java.lang.String
    */
   public java.lang.String getRetryFlag(){
      return retryFlag;
   }

   /**
    *该笔业务后续是否会重新尝试处理？
            0-否
            1-是
    *@param retryFlag
    */
   public void setRetryFlag(java.lang.String retryFlag){
      this.retryFlag = retryFlag;
   }

   /**
    *已读标识
            0-未读
            1-已读
    *@return java.lang.String
    */
   public java.lang.String getReadFlag(){
      return readFlag;
   }

   /**
    *已读标识
            0-未读
            1-已读
    *@param readFlag
    */
   public void setReadFlag(java.lang.String readFlag){
      this.readFlag = readFlag;
   }

   /**
    *处理标识
            0-未处理
            1-已处理
    *@return java.lang.String
    */
   public java.lang.String getProcFlag(){
      return procFlag;
   }

   /**
    *处理标识
            0-未处理
            1-已处理
    *@param procFlag
    */
   public void setProcFlag(java.lang.String procFlag){
      this.procFlag = procFlag;
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