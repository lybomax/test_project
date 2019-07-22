package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:配置中心作业流水表
 * 创建日期:2019-07-22 09:36:10
 */
@Table("cfg_job_log")
public class CfgJobLog{

   /**
      *业务流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String jobLogId;
   /**
      *作业id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String jobId;
   /**
      *作业名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String jobName;
   /**
      *日终标识
            0-定时任务
            1-日终任务 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String eodFlag;
   /**
      *日终顺序号 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer eodSerial;
   /**
      *执行日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date execDate;
   /**
      *开始时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date beginTime;
   /**
      *结束时间 
      *数据类型：datetime(6) 
      *是否必填:false 
   **/
   private java.util.Date endTime;
   /**
      *耗时（毫秒） 
      *数据类型：bigint(20) 
      *是否必填:false 
   **/
   private java.lang.String takeTime;
   /**
      *服务器名称 
      *数据类型：varchar(128) 
      *是否必填:false 
   **/
   private java.lang.String serverName;
   /**
      *作业状态
            00-成功
            11-作业中
            99-失败 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String jobStatus;
   /**
      *异常描述 
      *数据类型：varchar(1024) 
      *是否必填:false 
   **/
   private java.lang.String errorDesc;
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
   public java.lang.String getJobLogId(){
      return jobLogId;
   }

   /**
    *业务流水号
    *@param jobLogId
    */
   public void setJobLogId(java.lang.String jobLogId){
      this.jobLogId = jobLogId;
   }

   /**
    *作业id
    *@return java.lang.String
    */
   public java.lang.String getJobId(){
      return jobId;
   }

   /**
    *作业id
    *@param jobId
    */
   public void setJobId(java.lang.String jobId){
      this.jobId = jobId;
   }

   /**
    *作业名称
    *@return java.lang.String
    */
   public java.lang.String getJobName(){
      return jobName;
   }

   /**
    *作业名称
    *@param jobName
    */
   public void setJobName(java.lang.String jobName){
      this.jobName = jobName;
   }

   /**
    *日终标识
            0-定时任务
            1-日终任务
    *@return java.lang.String
    */
   public java.lang.String getEodFlag(){
      return eodFlag;
   }

   /**
    *日终标识
            0-定时任务
            1-日终任务
    *@param eodFlag
    */
   public void setEodFlag(java.lang.String eodFlag){
      this.eodFlag = eodFlag;
   }

   /**
    *日终顺序号
    *@return java.lang.Integer
    */
   public java.lang.Integer getEodSerial(){
      return eodSerial;
   }

   /**
    *日终顺序号
    *@param eodSerial
    */
   public void setEodSerial(java.lang.Integer eodSerial){
      this.eodSerial = eodSerial;
   }

   /**
    *执行日期
    *@return java.util.Date
    */
   public java.util.Date getExecDate(){
      return execDate;
   }

   /**
    *执行日期
    *@param execDate
    */
   public void setExecDate(java.util.Date execDate){
      this.execDate = execDate;
   }

   /**
    *开始时间
    *@return java.util.Date
    */
   public java.util.Date getBeginTime(){
      return beginTime;
   }

   /**
    *开始时间
    *@param beginTime
    */
   public void setBeginTime(java.util.Date beginTime){
      this.beginTime = beginTime;
   }

   /**
    *结束时间
    *@return java.util.Date
    */
   public java.util.Date getEndTime(){
      return endTime;
   }

   /**
    *结束时间
    *@param endTime
    */
   public void setEndTime(java.util.Date endTime){
      this.endTime = endTime;
   }

   /**
    *耗时（毫秒）
    *@return java.lang.String
    */
   public java.lang.String getTakeTime(){
      return takeTime;
   }

   /**
    *耗时（毫秒）
    *@param takeTime
    */
   public void setTakeTime(java.lang.String takeTime){
      this.takeTime = takeTime;
   }

   /**
    *服务器名称
    *@return java.lang.String
    */
   public java.lang.String getServerName(){
      return serverName;
   }

   /**
    *服务器名称
    *@param serverName
    */
   public void setServerName(java.lang.String serverName){
      this.serverName = serverName;
   }

   /**
    *作业状态
            00-成功
            11-作业中
            99-失败
    *@return java.lang.String
    */
   public java.lang.String getJobStatus(){
      return jobStatus;
   }

   /**
    *作业状态
            00-成功
            11-作业中
            99-失败
    *@param jobStatus
    */
   public void setJobStatus(java.lang.String jobStatus){
      this.jobStatus = jobStatus;
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