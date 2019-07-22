package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:57
 */
@Table("iff_templatedesign")
public class IffTemplatedesign{

   /**
      *工作流PDID 
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String packagehandle;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String designtemplateid;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *数据类型：int(5) 
      *是否必填:true 
   **/
   private java.lang.Integer version;
   /**
      *0：未部署
            1：已部署 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isdeployed;
   /**
      *数据类型：longtext 
      *是否必填:true 
   **/
   private java.lang.String content;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String templatehandle;
   /**
      *流程图图片 
      *数据类型：longblob 
      *是否必填:false 
   **/
   private java.lang.String templatepicture;

  //get和set方法
   /**
    *工作流PDID
    *@return java.lang.String
    */
   public java.lang.String getHandle(){
      return handle;
   }

   /**
    *工作流PDID
    *@param handle
    */
   public void setHandle(java.lang.String handle){
      this.handle = handle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPackagehandle(){
      return packagehandle;
   }

   /**
    *
    *@param packagehandle
    */
   public void setPackagehandle(java.lang.String packagehandle){
      this.packagehandle = packagehandle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDesigntemplateid(){
      return designtemplateid;
   }

   /**
    *
    *@param designtemplateid
    */
   public void setDesigntemplateid(java.lang.String designtemplateid){
      this.designtemplateid = designtemplateid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getName(){
      return name;
   }

   /**
    *
    *@param name
    */
   public void setName(java.lang.String name){
      this.name = name;
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
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getVersion(){
      return version;
   }

   /**
    *
    *@param version
    */
   public void setVersion(java.lang.Integer version){
      this.version = version;
   }

   /**
    *0：未部署
            1：已部署
    *@return java.lang.String
    */
   public java.lang.String getIsdeployed(){
      return isdeployed;
   }

   /**
    *0：未部署
            1：已部署
    *@param isdeployed
    */
   public void setIsdeployed(java.lang.String isdeployed){
      this.isdeployed = isdeployed;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getContent(){
      return content;
   }

   /**
    *
    *@param content
    */
   public void setContent(java.lang.String content){
      this.content = content;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplatehandle(){
      return templatehandle;
   }

   /**
    *
    *@param templatehandle
    */
   public void setTemplatehandle(java.lang.String templatehandle){
      this.templatehandle = templatehandle;
   }

   /**
    *流程图图片
    *@return java.lang.String
    */
   public java.lang.String getTemplatepicture(){
      return templatepicture;
   }

   /**
    *流程图图片
    *@param templatepicture
    */
   public void setTemplatepicture(java.lang.String templatepicture){
      this.templatepicture = templatepicture;
   }

}