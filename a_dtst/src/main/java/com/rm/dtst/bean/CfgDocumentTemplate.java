package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:文书模板表
 * 创建日期:2019-07-22 09:36:08
 */
@Table("cfg_document_template")
public class CfgDocumentTemplate{

   /**
      *模板编号 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String templateCode;
   /**
      *模板名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String templateName;
   /**
      *文书类型 
      *数据类型：varchar(4) 
      *是否必填:true 
   **/
   private java.lang.String documentType;
   /**
      *模板文件名称 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String templateFileName;
   /**
      *模板文件URI 
      *数据类型：varchar(512) 
      *是否必填:false 
   **/
   private java.lang.String templateFileUri;
   /**
      *模板文件内容 
      *数据类型：longblob 
      *是否必填:false 
   **/
   private java.lang.String templateFileData;
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
    *模板编号
    *@return java.lang.String
    */
   public java.lang.String getTemplateCode(){
      return templateCode;
   }

   /**
    *模板编号
    *@param templateCode
    */
   public void setTemplateCode(java.lang.String templateCode){
      this.templateCode = templateCode;
   }

   /**
    *模板名称
    *@return java.lang.String
    */
   public java.lang.String getTemplateName(){
      return templateName;
   }

   /**
    *模板名称
    *@param templateName
    */
   public void setTemplateName(java.lang.String templateName){
      this.templateName = templateName;
   }

   /**
    *文书类型
    *@return java.lang.String
    */
   public java.lang.String getDocumentType(){
      return documentType;
   }

   /**
    *文书类型
    *@param documentType
    */
   public void setDocumentType(java.lang.String documentType){
      this.documentType = documentType;
   }

   /**
    *模板文件名称
    *@return java.lang.String
    */
   public java.lang.String getTemplateFileName(){
      return templateFileName;
   }

   /**
    *模板文件名称
    *@param templateFileName
    */
   public void setTemplateFileName(java.lang.String templateFileName){
      this.templateFileName = templateFileName;
   }

   /**
    *模板文件URI
    *@return java.lang.String
    */
   public java.lang.String getTemplateFileUri(){
      return templateFileUri;
   }

   /**
    *模板文件URI
    *@param templateFileUri
    */
   public void setTemplateFileUri(java.lang.String templateFileUri){
      this.templateFileUri = templateFileUri;
   }

   /**
    *模板文件内容
    *@return java.lang.String
    */
   public java.lang.String getTemplateFileData(){
      return templateFileData;
   }

   /**
    *模板文件内容
    *@param templateFileData
    */
   public void setTemplateFileData(java.lang.String templateFileData){
      this.templateFileData = templateFileData;
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