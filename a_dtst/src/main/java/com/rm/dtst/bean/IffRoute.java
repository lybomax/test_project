package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:54
 */
@Table("iff_route")
public class IffRoute{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String templatehandle;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String fromhandle;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String tohandle;
   /**
      *数据类型：varchar(512) 
      *是否必填:false 
   **/
   private java.lang.String exrp;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isdefault;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHandle(){
      return handle;
   }

   /**
    *
    *@param handle
    */
   public void setHandle(java.lang.String handle){
      this.handle = handle;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getFromhandle(){
      return fromhandle;
   }

   /**
    *
    *@param fromhandle
    */
   public void setFromhandle(java.lang.String fromhandle){
      this.fromhandle = fromhandle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTohandle(){
      return tohandle;
   }

   /**
    *
    *@param tohandle
    */
   public void setTohandle(java.lang.String tohandle){
      this.tohandle = tohandle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExrp(){
      return exrp;
   }

   /**
    *
    *@param exrp
    */
   public void setExrp(java.lang.String exrp){
      this.exrp = exrp;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getIsdefault(){
      return isdefault;
   }

   /**
    *
    *@param isdefault
    */
   public void setIsdefault(java.lang.String isdefault){
      this.isdefault = isdefault;
   }

}