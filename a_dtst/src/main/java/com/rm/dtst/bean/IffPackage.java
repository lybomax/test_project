package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:49
 */
@Table("iff_package")
public class IffPackage{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String templatepackageid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String currentid;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String name;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String superhandle;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;

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
   public java.lang.String getTemplatepackageid(){
      return templatepackageid;
   }

   /**
    *
    *@param templatepackageid
    */
   public void setTemplatepackageid(java.lang.String templatepackageid){
      this.templatepackageid = templatepackageid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCurrentid(){
      return currentid;
   }

   /**
    *
    *@param currentid
    */
   public void setCurrentid(java.lang.String currentid){
      this.currentid = currentid;
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
   public java.lang.String getSuperhandle(){
      return superhandle;
   }

   /**
    *
    *@param superhandle
    */
   public void setSuperhandle(java.lang.String superhandle){
      this.superhandle = superhandle;
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

}