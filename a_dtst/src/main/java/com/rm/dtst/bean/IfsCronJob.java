package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]定时任务配置表
 * 创建日期:2019-07-22 09:37:09
 */
@Table("ifs_cron_job")
public class IfsCronJob{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *任务编号(唯一) 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer jobno;
   /**
      *执行任务类 
      *数据类型：varchar(256) 
      *是否必填:true 
   **/
   private java.lang.String processFunction;
   /**
      *任务参数,格式为:key1=值1;key2=值2;.. 
      *数据类型：varchar(512) 
      *是否必填:false 
   **/
   private java.lang.String processParam;
   /**
      *最大次数(暂未使用) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer maxproc;
   /**
      *执行方式90=每日93=每月初97=每月某日98=每月末9N不运行 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String runtime;
   /**
      *每月某日 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer daysOfMonth;
   /**
      *执行间隔(单位为分钟) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer repeatTime;
   /**
      *日执行次数(-1表示不控制) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer repeatCnt;
   /**
      *开始时间,格式为:HHmmss 
      *数据类型：char(6) 
      *是否必填:false 
   **/
   private java.lang.String startTime;
   /**
      *结束时间,格式为:HHmmss 
      *数据类型：char(6) 
      *是否必填:false 
   **/
   private java.lang.String endTime;
   /**
      *最后的执行时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String lastRunTime;
   /**
      *到期时间(暂未使用) 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String dueTime;
   /**
      *成功标识(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String sucFlag;
   /**
      *失败标识(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String failFlag;
   /**
      *是否自动(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String auto;
   /**
      *锁定用户(暂未使用) 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String lockOwn;
   /**
      *任务描述0 
      *数据类型：varchar(128) 
      *是否必填:false 
   **/
   private java.lang.String desc0;
   /**
      *任务描述1 
      *数据类型：varchar(1024) 
      *是否必填:false 
   **/
   private java.lang.String desc1;
   /**
      *任务描述2 
      *数据类型：varchar(1024) 
      *是否必填:false 
   **/
   private java.lang.String desc2;
   /**
      *设置时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String timestamps;
   /**
      *(暂未使用) 
      *数据类型：varchar(1) 
      *是否必填:false 
   **/
   private java.lang.String dualcontrolLockstatus;

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
    *任务编号(唯一)
    *@return java.lang.Integer
    */
   public java.lang.Integer getJobno(){
      return jobno;
   }

   /**
    *任务编号(唯一)
    *@param jobno
    */
   public void setJobno(java.lang.Integer jobno){
      this.jobno = jobno;
   }

   /**
    *执行任务类
    *@return java.lang.String
    */
   public java.lang.String getProcessFunction(){
      return processFunction;
   }

   /**
    *执行任务类
    *@param processFunction
    */
   public void setProcessFunction(java.lang.String processFunction){
      this.processFunction = processFunction;
   }

   /**
    *任务参数,格式为:key1=值1;key2=值2;..
    *@return java.lang.String
    */
   public java.lang.String getProcessParam(){
      return processParam;
   }

   /**
    *任务参数,格式为:key1=值1;key2=值2;..
    *@param processParam
    */
   public void setProcessParam(java.lang.String processParam){
      this.processParam = processParam;
   }

   /**
    *最大次数(暂未使用)
    *@return java.lang.Integer
    */
   public java.lang.Integer getMaxproc(){
      return maxproc;
   }

   /**
    *最大次数(暂未使用)
    *@param maxproc
    */
   public void setMaxproc(java.lang.Integer maxproc){
      this.maxproc = maxproc;
   }

   /**
    *执行方式90=每日93=每月初97=每月某日98=每月末9N不运行
    *@return java.lang.String
    */
   public java.lang.String getRuntime(){
      return runtime;
   }

   /**
    *执行方式90=每日93=每月初97=每月某日98=每月末9N不运行
    *@param runtime
    */
   public void setRuntime(java.lang.String runtime){
      this.runtime = runtime;
   }

   /**
    *每月某日
    *@return java.lang.Integer
    */
   public java.lang.Integer getDaysOfMonth(){
      return daysOfMonth;
   }

   /**
    *每月某日
    *@param daysOfMonth
    */
   public void setDaysOfMonth(java.lang.Integer daysOfMonth){
      this.daysOfMonth = daysOfMonth;
   }

   /**
    *执行间隔(单位为分钟)
    *@return java.lang.Integer
    */
   public java.lang.Integer getRepeatTime(){
      return repeatTime;
   }

   /**
    *执行间隔(单位为分钟)
    *@param repeatTime
    */
   public void setRepeatTime(java.lang.Integer repeatTime){
      this.repeatTime = repeatTime;
   }

   /**
    *日执行次数(-1表示不控制)
    *@return java.lang.Integer
    */
   public java.lang.Integer getRepeatCnt(){
      return repeatCnt;
   }

   /**
    *日执行次数(-1表示不控制)
    *@param repeatCnt
    */
   public void setRepeatCnt(java.lang.Integer repeatCnt){
      this.repeatCnt = repeatCnt;
   }

   /**
    *开始时间,格式为:HHmmss
    *@return java.lang.String
    */
   public java.lang.String getStartTime(){
      return startTime;
   }

   /**
    *开始时间,格式为:HHmmss
    *@param startTime
    */
   public void setStartTime(java.lang.String startTime){
      this.startTime = startTime;
   }

   /**
    *结束时间,格式为:HHmmss
    *@return java.lang.String
    */
   public java.lang.String getEndTime(){
      return endTime;
   }

   /**
    *结束时间,格式为:HHmmss
    *@param endTime
    */
   public void setEndTime(java.lang.String endTime){
      this.endTime = endTime;
   }

   /**
    *最后的执行时间
    *@return java.lang.String
    */
   public java.lang.String getLastRunTime(){
      return lastRunTime;
   }

   /**
    *最后的执行时间
    *@param lastRunTime
    */
   public void setLastRunTime(java.lang.String lastRunTime){
      this.lastRunTime = lastRunTime;
   }

   /**
    *到期时间(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getDueTime(){
      return dueTime;
   }

   /**
    *到期时间(暂未使用)
    *@param dueTime
    */
   public void setDueTime(java.lang.String dueTime){
      this.dueTime = dueTime;
   }

   /**
    *成功标识(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getSucFlag(){
      return sucFlag;
   }

   /**
    *成功标识(暂未使用)
    *@param sucFlag
    */
   public void setSucFlag(java.lang.String sucFlag){
      this.sucFlag = sucFlag;
   }

   /**
    *失败标识(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getFailFlag(){
      return failFlag;
   }

   /**
    *失败标识(暂未使用)
    *@param failFlag
    */
   public void setFailFlag(java.lang.String failFlag){
      this.failFlag = failFlag;
   }

   /**
    *是否自动(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getAuto(){
      return auto;
   }

   /**
    *是否自动(暂未使用)
    *@param auto
    */
   public void setAuto(java.lang.String auto){
      this.auto = auto;
   }

   /**
    *锁定用户(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getLockOwn(){
      return lockOwn;
   }

   /**
    *锁定用户(暂未使用)
    *@param lockOwn
    */
   public void setLockOwn(java.lang.String lockOwn){
      this.lockOwn = lockOwn;
   }

   /**
    *任务描述0
    *@return java.lang.String
    */
   public java.lang.String getDesc0(){
      return desc0;
   }

   /**
    *任务描述0
    *@param desc0
    */
   public void setDesc0(java.lang.String desc0){
      this.desc0 = desc0;
   }

   /**
    *任务描述1
    *@return java.lang.String
    */
   public java.lang.String getDesc1(){
      return desc1;
   }

   /**
    *任务描述1
    *@param desc1
    */
   public void setDesc1(java.lang.String desc1){
      this.desc1 = desc1;
   }

   /**
    *任务描述2
    *@return java.lang.String
    */
   public java.lang.String getDesc2(){
      return desc2;
   }

   /**
    *任务描述2
    *@param desc2
    */
   public void setDesc2(java.lang.String desc2){
      this.desc2 = desc2;
   }

   /**
    *设置时间
    *@return java.lang.String
    */
   public java.lang.String getTimestamps(){
      return timestamps;
   }

   /**
    *设置时间
    *@param timestamps
    */
   public void setTimestamps(java.lang.String timestamps){
      this.timestamps = timestamps;
   }

   /**
    *(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getDualcontrolLockstatus(){
      return dualcontrolLockstatus;
   }

   /**
    *(暂未使用)
    *@param dualcontrolLockstatus
    */
   public void setDualcontrolLockstatus(java.lang.String dualcontrolLockstatus){
      this.dualcontrolLockstatus = dualcontrolLockstatus;
   }

}