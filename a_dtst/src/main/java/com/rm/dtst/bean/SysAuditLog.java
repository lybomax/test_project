package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:审批流水表
 * 创建日期:2019-07-22 09:37:34
 */
@Table("sys_audit_log")
public class SysAuditLog{

   /**
      *审批流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String auditLogId;
   /**
      *申请流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String applyLogId;
   /**
      *审批机构 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String auditBranchId;
   /**
      *审批客户经理 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String auditStaffId;
   /**
      *流程节点 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String taskId;
   /**
      *流程节点名称 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String taskName;
   /**
      *审批日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date auditDate;
   /**
      *审批时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date auditTime;
   /**
      *审批结果
            Agree-审批通过
            GoBack-审批退回
            Refuse-审批拒绝
            Cancel-审批撤销 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String auditResult;
   /**
      *审批意见 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String auditOpinion;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String memo;
   /**
      *法人机构 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String legalPersonBrcode;
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
    *审批流水号
    *@return java.lang.String
    */
   public java.lang.String getAuditLogId(){
      return auditLogId;
   }

   /**
    *审批流水号
    *@param auditLogId
    */
   public void setAuditLogId(java.lang.String auditLogId){
      this.auditLogId = auditLogId;
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
    *审批机构
    *@return java.lang.String
    */
   public java.lang.String getAuditBranchId(){
      return auditBranchId;
   }

   /**
    *审批机构
    *@param auditBranchId
    */
   public void setAuditBranchId(java.lang.String auditBranchId){
      this.auditBranchId = auditBranchId;
   }

   /**
    *审批客户经理
    *@return java.lang.String
    */
   public java.lang.String getAuditStaffId(){
      return auditStaffId;
   }

   /**
    *审批客户经理
    *@param auditStaffId
    */
   public void setAuditStaffId(java.lang.String auditStaffId){
      this.auditStaffId = auditStaffId;
   }

   /**
    *流程节点
    *@return java.lang.String
    */
   public java.lang.String getTaskId(){
      return taskId;
   }

   /**
    *流程节点
    *@param taskId
    */
   public void setTaskId(java.lang.String taskId){
      this.taskId = taskId;
   }

   /**
    *流程节点名称
    *@return java.lang.String
    */
   public java.lang.String getTaskName(){
      return taskName;
   }

   /**
    *流程节点名称
    *@param taskName
    */
   public void setTaskName(java.lang.String taskName){
      this.taskName = taskName;
   }

   /**
    *审批日期
    *@return java.util.Date
    */
   public java.util.Date getAuditDate(){
      return auditDate;
   }

   /**
    *审批日期
    *@param auditDate
    */
   public void setAuditDate(java.util.Date auditDate){
      this.auditDate = auditDate;
   }

   /**
    *审批时间
    *@return java.util.Date
    */
   public java.util.Date getAuditTime(){
      return auditTime;
   }

   /**
    *审批时间
    *@param auditTime
    */
   public void setAuditTime(java.util.Date auditTime){
      this.auditTime = auditTime;
   }

   /**
    *审批结果
            Agree-审批通过
            GoBack-审批退回
            Refuse-审批拒绝
            Cancel-审批撤销
    *@return java.lang.String
    */
   public java.lang.String getAuditResult(){
      return auditResult;
   }

   /**
    *审批结果
            Agree-审批通过
            GoBack-审批退回
            Refuse-审批拒绝
            Cancel-审批撤销
    *@param auditResult
    */
   public void setAuditResult(java.lang.String auditResult){
      this.auditResult = auditResult;
   }

   /**
    *审批意见
    *@return java.lang.String
    */
   public java.lang.String getAuditOpinion(){
      return auditOpinion;
   }

   /**
    *审批意见
    *@param auditOpinion
    */
   public void setAuditOpinion(java.lang.String auditOpinion){
      this.auditOpinion = auditOpinion;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getMemo(){
      return memo;
   }

   /**
    *
    *@param memo
    */
   public void setMemo(java.lang.String memo){
      this.memo = memo;
   }

   /**
    *法人机构
    *@return java.lang.String
    */
   public java.lang.String getLegalPersonBrcode(){
      return legalPersonBrcode;
   }

   /**
    *法人机构
    *@param legalPersonBrcode
    */
   public void setLegalPersonBrcode(java.lang.String legalPersonBrcode){
      this.legalPersonBrcode = legalPersonBrcode;
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