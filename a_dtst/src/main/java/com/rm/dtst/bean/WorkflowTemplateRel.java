package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:流程实例名称对应表
 * 创建日期:2019-07-22 09:37:52
 */
@Table("workflow_template_rel")
public class WorkflowTemplateRel{

   /**
      *工作流模板编号 
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String workflowTemplateId;
   /**
      *所属包ID 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String packageId;
   /**
      *流程中文名 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String flownamecn;
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
    *所属包ID
    *@return java.lang.String
    */
   public java.lang.String getPackageId(){
      return packageId;
   }

   /**
    *所属包ID
    *@param packageId
    */
   public void setPackageId(java.lang.String packageId){
      this.packageId = packageId;
   }

   /**
    *流程中文名
    *@return java.lang.String
    */
   public java.lang.String getFlownamecn(){
      return flownamecn;
   }

   /**
    *流程中文名
    *@param flownamecn
    */
   public void setFlownamecn(java.lang.String flownamecn){
      this.flownamecn = flownamecn;
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