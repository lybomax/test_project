package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:配置中心作业配置表
 * 创建日期:2019-07-22 09:36:10
 */
@Table("cfg_job_cfg")
public class CfgJobCfg{

   /**
      *作业id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
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
      *是否必填:true 
   **/
   private java.lang.String eodFlag;
   /**
      *日终顺序号 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer eodSerial;
   /**
      *说明 
      *数据类型：varchar(300) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *有效标识
            0-无效
            1-有效 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String validFlag;
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
    *说明
    *@return java.lang.String
    */
   public java.lang.String getRemark(){
      return remark;
   }

   /**
    *说明
    *@param remark
    */
   public void setRemark(java.lang.String remark){
      this.remark = remark;
   }

   /**
    *有效标识
            0-无效
            1-有效
    *@return java.lang.String
    */
   public java.lang.String getValidFlag(){
      return validFlag;
   }

   /**
    *有效标识
            0-无效
            1-有效
    *@param validFlag
    */
   public void setValidFlag(java.lang.String validFlag){
      this.validFlag = validFlag;
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