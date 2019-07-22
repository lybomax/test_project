package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:流程审批路线配置表
 * 创建日期:2019-07-22 09:37:53
 */
@Table("workflow_template_route")
public class WorkflowTemplateRoute{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String templateRouteId;
   /**
      *工作流模板编号 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String workflowTemplateId;
   /**
      *版本号 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer version;
   /**
      *法人机构 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String legalPersonBrcode;
   /**
      *流程首节点URL 
      *数据类型：varchar(300) 
      *是否必填:true 
   **/
   private java.lang.String firstTaskUrl;
   /**
      *审批节点URL：审批路线默认站点URL 
      *数据类型：varchar(300) 
      *是否必填:true 
   **/
   private java.lang.String approveTaskUrl;
   /**
      *状态：
            01-有效
            99-无效 
      *数据类型：varchar(2) 
      *是否必填:true 
   **/
   private java.lang.String status;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplateRouteId(){
      return templateRouteId;
   }

   /**
    *
    *@param templateRouteId
    */
   public void setTemplateRouteId(java.lang.String templateRouteId){
      this.templateRouteId = templateRouteId;
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
    *版本号
    *@return java.lang.Integer
    */
   public java.lang.Integer getVersion(){
      return version;
   }

   /**
    *版本号
    *@param version
    */
   public void setVersion(java.lang.Integer version){
      this.version = version;
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
    *流程首节点URL
    *@return java.lang.String
    */
   public java.lang.String getFirstTaskUrl(){
      return firstTaskUrl;
   }

   /**
    *流程首节点URL
    *@param firstTaskUrl
    */
   public void setFirstTaskUrl(java.lang.String firstTaskUrl){
      this.firstTaskUrl = firstTaskUrl;
   }

   /**
    *审批节点URL：审批路线默认站点URL
    *@return java.lang.String
    */
   public java.lang.String getApproveTaskUrl(){
      return approveTaskUrl;
   }

   /**
    *审批节点URL：审批路线默认站点URL
    *@param approveTaskUrl
    */
   public void setApproveTaskUrl(java.lang.String approveTaskUrl){
      this.approveTaskUrl = approveTaskUrl;
   }

   /**
    *状态：
            01-有效
            99-无效
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态：
            01-有效
            99-无效
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
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