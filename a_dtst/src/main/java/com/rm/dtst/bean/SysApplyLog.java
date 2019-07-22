package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:申请流水表
 * 创建日期:2019-07-22 09:37:32
 */
@Table("sys_apply_log")
public class SysApplyLog{

   /**
      *申请流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String applyLogId;
   /**
      *工作流模板编号 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String workflowTemplateId;
   /**
      *工作流模板编号 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String workflowTemplateName;
   /**
      *工作流实例编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String workflowInstanceId;
   /**
      *申请类型 
      *数据类型：varchar(4) 
      *是否必填:true 
   **/
   private java.lang.String applyType;
   /**
      *关联业务编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String relBizId;
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
      *金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal amt;
   /**
      *币种 
      *数据类型：char(3) 
      *是否必填:false 
   **/
   private java.lang.String currency;
   /**
      *发起机构 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String submitBranchId;
   /**
      *发起客户经理 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String submitCustManager;
   /**
      *发起客户经理 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String submitCustManagerName;
   /**
      *发起渠道 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String submitChannelId;
   /**
      *发起日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date submitDate;
   /**
      *发起时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date submitTime;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *申请状态：
            00-审批通过
            01-审批中
            99-审批拒绝 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String applyStatus;
   /**
      *拥有者角色 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String ownerRoleId;
   /**
      *拥有者id 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String ownerId;
   /**
      *下一节点名 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String nextNodeName;
   /**
      *下一节点id 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String nextNodeId;
   /**
      *待办节点url 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String sourceUrl;
   /**
      *流程任务编号 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String taskId;
   /**
      *申请状态详情：
            00-审批通过
            01-审批中
            02-审批退回
            99-审批拒绝 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String applyStatusDetail;
   /**
      *法人机构 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String legalPersonBrcode;
   /**
      *审批路线版本号 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer routeVersion;
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
    *工作流模板编号
    *@return java.lang.String
    */
   public java.lang.String getWorkflowTemplateId(){
      return workflowTemplateId;
   }

   /**
    *工作流模板编号
    *@param workflowTemplateId
    */
   public void setWorkflowTemplateId(java.lang.String workflowTemplateId){
      this.workflowTemplateId = workflowTemplateId;
   }

   /**
    *工作流模板编号
    *@return java.lang.String
    */
   public java.lang.String getWorkflowTemplateName(){
      return workflowTemplateName;
   }

   /**
    *工作流模板编号
    *@param workflowTemplateName
    */
   public void setWorkflowTemplateName(java.lang.String workflowTemplateName){
      this.workflowTemplateName = workflowTemplateName;
   }

   /**
    *工作流实例编号
    *@return java.lang.String
    */
   public java.lang.String getWorkflowInstanceId(){
      return workflowInstanceId;
   }

   /**
    *工作流实例编号
    *@param workflowInstanceId
    */
   public void setWorkflowInstanceId(java.lang.String workflowInstanceId){
      this.workflowInstanceId = workflowInstanceId;
   }

   /**
    *申请类型
    *@return java.lang.String
    */
   public java.lang.String getApplyType(){
      return applyType;
   }

   /**
    *申请类型
    *@param applyType
    */
   public void setApplyType(java.lang.String applyType){
      this.applyType = applyType;
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
    *发起机构
    *@return java.lang.String
    */
   public java.lang.String getSubmitBranchId(){
      return submitBranchId;
   }

   /**
    *发起机构
    *@param submitBranchId
    */
   public void setSubmitBranchId(java.lang.String submitBranchId){
      this.submitBranchId = submitBranchId;
   }

   /**
    *发起客户经理
    *@return java.lang.String
    */
   public java.lang.String getSubmitCustManager(){
      return submitCustManager;
   }

   /**
    *发起客户经理
    *@param submitCustManager
    */
   public void setSubmitCustManager(java.lang.String submitCustManager){
      this.submitCustManager = submitCustManager;
   }

   /**
    *发起客户经理
    *@return java.lang.String
    */
   public java.lang.String getSubmitCustManagerName(){
      return submitCustManagerName;
   }

   /**
    *发起客户经理
    *@param submitCustManagerName
    */
   public void setSubmitCustManagerName(java.lang.String submitCustManagerName){
      this.submitCustManagerName = submitCustManagerName;
   }

   /**
    *发起渠道
    *@return java.lang.String
    */
   public java.lang.String getSubmitChannelId(){
      return submitChannelId;
   }

   /**
    *发起渠道
    *@param submitChannelId
    */
   public void setSubmitChannelId(java.lang.String submitChannelId){
      this.submitChannelId = submitChannelId;
   }

   /**
    *发起日期
    *@return java.util.Date
    */
   public java.util.Date getSubmitDate(){
      return submitDate;
   }

   /**
    *发起日期
    *@param submitDate
    */
   public void setSubmitDate(java.util.Date submitDate){
      this.submitDate = submitDate;
   }

   /**
    *发起时间
    *@return java.util.Date
    */
   public java.util.Date getSubmitTime(){
      return submitTime;
   }

   /**
    *发起时间
    *@param submitTime
    */
   public void setSubmitTime(java.util.Date submitTime){
      this.submitTime = submitTime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getRemark(){
      return remark;
   }

   /**
    *
    *@param remark
    */
   public void setRemark(java.lang.String remark){
      this.remark = remark;
   }

   /**
    *申请状态：
            00-审批通过
            01-审批中
            99-审批拒绝
    *@return java.lang.String
    */
   public java.lang.String getApplyStatus(){
      return applyStatus;
   }

   /**
    *申请状态：
            00-审批通过
            01-审批中
            99-审批拒绝
    *@param applyStatus
    */
   public void setApplyStatus(java.lang.String applyStatus){
      this.applyStatus = applyStatus;
   }

   /**
    *拥有者角色
    *@return java.lang.String
    */
   public java.lang.String getOwnerRoleId(){
      return ownerRoleId;
   }

   /**
    *拥有者角色
    *@param ownerRoleId
    */
   public void setOwnerRoleId(java.lang.String ownerRoleId){
      this.ownerRoleId = ownerRoleId;
   }

   /**
    *拥有者id
    *@return java.lang.String
    */
   public java.lang.String getOwnerId(){
      return ownerId;
   }

   /**
    *拥有者id
    *@param ownerId
    */
   public void setOwnerId(java.lang.String ownerId){
      this.ownerId = ownerId;
   }

   /**
    *下一节点名
    *@return java.lang.String
    */
   public java.lang.String getNextNodeName(){
      return nextNodeName;
   }

   /**
    *下一节点名
    *@param nextNodeName
    */
   public void setNextNodeName(java.lang.String nextNodeName){
      this.nextNodeName = nextNodeName;
   }

   /**
    *下一节点id
    *@return java.lang.String
    */
   public java.lang.String getNextNodeId(){
      return nextNodeId;
   }

   /**
    *下一节点id
    *@param nextNodeId
    */
   public void setNextNodeId(java.lang.String nextNodeId){
      this.nextNodeId = nextNodeId;
   }

   /**
    *待办节点url
    *@return java.lang.String
    */
   public java.lang.String getSourceUrl(){
      return sourceUrl;
   }

   /**
    *待办节点url
    *@param sourceUrl
    */
   public void setSourceUrl(java.lang.String sourceUrl){
      this.sourceUrl = sourceUrl;
   }

   /**
    *流程任务编号
    *@return java.lang.String
    */
   public java.lang.String getTaskId(){
      return taskId;
   }

   /**
    *流程任务编号
    *@param taskId
    */
   public void setTaskId(java.lang.String taskId){
      this.taskId = taskId;
   }

   /**
    *申请状态详情：
            00-审批通过
            01-审批中
            02-审批退回
            99-审批拒绝
    *@return java.lang.String
    */
   public java.lang.String getApplyStatusDetail(){
      return applyStatusDetail;
   }

   /**
    *申请状态详情：
            00-审批通过
            01-审批中
            02-审批退回
            99-审批拒绝
    *@param applyStatusDetail
    */
   public void setApplyStatusDetail(java.lang.String applyStatusDetail){
      this.applyStatusDetail = applyStatusDetail;
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
    *审批路线版本号
    *@return java.lang.Integer
    */
   public java.lang.Integer getRouteVersion(){
      return routeVersion;
   }

   /**
    *审批路线版本号
    *@param routeVersion
    */
   public void setRouteVersion(java.lang.Integer routeVersion){
      this.routeVersion = routeVersion;
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