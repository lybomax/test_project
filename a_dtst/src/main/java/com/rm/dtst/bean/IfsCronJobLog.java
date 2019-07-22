package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]定时任务执行日志表
 * 创建日期:2019-07-22 09:37:10
 */
@Table("ifs_cron_job_log")
public class IfsCronJobLog{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *任务标识号 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer jobno;
   /**
      *执行任务类 
      *数据类型：varchar(256) 
      *是否必填:true 
   **/
   private java.lang.String subProceFunction;
   /**
      *执行时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String excuteTime;
   /**
      *执行结果1-成功，0-失败 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String excuteResult;
   /**
      *执行的服务器实例(暂未使用) 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String excuteOwn;
   /**
      *失败标志位0-未失败，1-失败 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String failFlag;
   /**
      *成功标志0-未成功，1-成功 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String sucFlag;
   /**
      *失败信息 
      *数据类型：varchar(512) 
      *是否必填:false 
   **/
   private java.lang.String exceptionMsg;
   /**
      *是否已结束当日执行1是0否 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String endExcuteFlag;

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
    *任务标识号
    *@return java.lang.Integer
    */
   public java.lang.Integer getJobno(){
      return jobno;
   }

   /**
    *任务标识号
    *@param jobno
    */
   public void setJobno(java.lang.Integer jobno){
      this.jobno = jobno;
   }

   /**
    *执行任务类
    *@return java.lang.String
    */
   public java.lang.String getSubProceFunction(){
      return subProceFunction;
   }

   /**
    *执行任务类
    *@param subProceFunction
    */
   public void setSubProceFunction(java.lang.String subProceFunction){
      this.subProceFunction = subProceFunction;
   }

   /**
    *执行时间
    *@return java.lang.String
    */
   public java.lang.String getExcuteTime(){
      return excuteTime;
   }

   /**
    *执行时间
    *@param excuteTime
    */
   public void setExcuteTime(java.lang.String excuteTime){
      this.excuteTime = excuteTime;
   }

   /**
    *执行结果1-成功，0-失败
    *@return java.lang.String
    */
   public java.lang.String getExcuteResult(){
      return excuteResult;
   }

   /**
    *执行结果1-成功，0-失败
    *@param excuteResult
    */
   public void setExcuteResult(java.lang.String excuteResult){
      this.excuteResult = excuteResult;
   }

   /**
    *执行的服务器实例(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getExcuteOwn(){
      return excuteOwn;
   }

   /**
    *执行的服务器实例(暂未使用)
    *@param excuteOwn
    */
   public void setExcuteOwn(java.lang.String excuteOwn){
      this.excuteOwn = excuteOwn;
   }

   /**
    *失败标志位0-未失败，1-失败
    *@return java.lang.String
    */
   public java.lang.String getFailFlag(){
      return failFlag;
   }

   /**
    *失败标志位0-未失败，1-失败
    *@param failFlag
    */
   public void setFailFlag(java.lang.String failFlag){
      this.failFlag = failFlag;
   }

   /**
    *成功标志0-未成功，1-成功
    *@return java.lang.String
    */
   public java.lang.String getSucFlag(){
      return sucFlag;
   }

   /**
    *成功标志0-未成功，1-成功
    *@param sucFlag
    */
   public void setSucFlag(java.lang.String sucFlag){
      this.sucFlag = sucFlag;
   }

   /**
    *失败信息
    *@return java.lang.String
    */
   public java.lang.String getExceptionMsg(){
      return exceptionMsg;
   }

   /**
    *失败信息
    *@param exceptionMsg
    */
   public void setExceptionMsg(java.lang.String exceptionMsg){
      this.exceptionMsg = exceptionMsg;
   }

   /**
    *是否已结束当日执行1是0否
    *@return java.lang.String
    */
   public java.lang.String getEndExcuteFlag(){
      return endExcuteFlag;
   }

   /**
    *是否已结束当日执行1是0否
    *@param endExcuteFlag
    */
   public void setEndExcuteFlag(java.lang.String endExcuteFlag){
      this.endExcuteFlag = endExcuteFlag;
   }

}