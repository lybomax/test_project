package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:流程节点tab页配置表
 * 创建日期:2019-07-22 09:37:51
 */
@Table("workflow_tab_rel")
public class WorkflowTabRel{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *工作流模板编号 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String workflowTemplateId;
   /**
      *节点ID 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String taskId;
   /**
      *法人机构 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String legalPersonBrcode;
   /**
      *tab页ID 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String tabId;
   /**
      *tab页标题 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String title;
   /**
      *页面url 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String url;
   /**
      *显示顺序 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer showSeq;
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
    *节点ID
    *@return java.lang.String
    */
   public java.lang.String getTaskId(){
      return taskId;
   }

   /**
    *节点ID
    *@param taskId
    */
   public void setTaskId(java.lang.String taskId){
      this.taskId = taskId;
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
    *tab页ID
    *@return java.lang.String
    */
   public java.lang.String getTabId(){
      return tabId;
   }

   /**
    *tab页ID
    *@param tabId
    */
   public void setTabId(java.lang.String tabId){
      this.tabId = tabId;
   }

   /**
    *tab页标题
    *@return java.lang.String
    */
   public java.lang.String getTitle(){
      return title;
   }

   /**
    *tab页标题
    *@param title
    */
   public void setTitle(java.lang.String title){
      this.title = title;
   }

   /**
    *页面url
    *@return java.lang.String
    */
   public java.lang.String getUrl(){
      return url;
   }

   /**
    *页面url
    *@param url
    */
   public void setUrl(java.lang.String url){
      this.url = url;
   }

   /**
    *显示顺序
    *@return java.lang.Integer
    */
   public java.lang.Integer getShowSeq(){
      return showSeq;
   }

   /**
    *显示顺序
    *@param showSeq
    */
   public void setShowSeq(java.lang.Integer showSeq){
      this.showSeq = showSeq;
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