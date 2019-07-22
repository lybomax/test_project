package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:26
 */
@Table("iff_config")
public class IffConfig{

   /**
      *参数编号 
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String poid;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String categorypoid;
   /**
      *数据类型：varchar(50) 
      *是否必填:true 
   **/
   private java.lang.String configname;
   /**
      *数据类型：varchar(50) 
      *是否必填:true 
   **/
   private java.lang.String configkey;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String configvalue;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String defaultvalue;

  //get和set方法
   /**
    *参数编号
    *@return java.lang.String
    */
   public java.lang.String getPoid(){
      return poid;
   }

   /**
    *参数编号
    *@param poid
    */
   public void setPoid(java.lang.String poid){
      this.poid = poid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCategorypoid(){
      return categorypoid;
   }

   /**
    *
    *@param categorypoid
    */
   public void setCategorypoid(java.lang.String categorypoid){
      this.categorypoid = categorypoid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getConfigname(){
      return configname;
   }

   /**
    *
    *@param configname
    */
   public void setConfigname(java.lang.String configname){
      this.configname = configname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getConfigkey(){
      return configkey;
   }

   /**
    *
    *@param configkey
    */
   public void setConfigkey(java.lang.String configkey){
      this.configkey = configkey;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getConfigvalue(){
      return configvalue;
   }

   /**
    *
    *@param configvalue
    */
   public void setConfigvalue(java.lang.String configvalue){
      this.configvalue = configvalue;
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
   public java.lang.String getDefaultvalue(){
      return defaultvalue;
   }

   /**
    *
    *@param defaultvalue
    */
   public void setDefaultvalue(java.lang.String defaultvalue){
      this.defaultvalue = defaultvalue;
   }

}