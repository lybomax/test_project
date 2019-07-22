package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:33
 */
@Table("iff_j_lob")
public class IffJLob{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer dbversion;
   /**
      *数据类型：longblob 
      *是否必填:false 
   **/
   private java.lang.String blobValue;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String deployment;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String name;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDbid(){
      return dbid;
   }

   /**
    *
    *@param dbid
    */
   public void setDbid(java.lang.String dbid){
      this.dbid = dbid;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getDbversion(){
      return dbversion;
   }

   /**
    *
    *@param dbversion
    */
   public void setDbversion(java.lang.Integer dbversion){
      this.dbversion = dbversion;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBlobValue(){
      return blobValue;
   }

   /**
    *
    *@param blobValue
    */
   public void setBlobValue(java.lang.String blobValue){
      this.blobValue = blobValue;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDeployment(){
      return deployment;
   }

   /**
    *
    *@param deployment
    */
   public void setDeployment(java.lang.String deployment){
      this.deployment = deployment;
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

}