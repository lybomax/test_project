package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:30
 */
@Table("iff_j_deployprop")
public class IffJDeployprop{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String deployment;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String objname;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String key;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String stringval;
   /**
      *数据类型：bigint(20) 
      *是否必填:false 
   **/
   private java.lang.String longval;

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
   public java.lang.String getObjname(){
      return objname;
   }

   /**
    *
    *@param objname
    */
   public void setObjname(java.lang.String objname){
      this.objname = objname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getKey(){
      return key;
   }

   /**
    *
    *@param key
    */
   public void setKey(java.lang.String key){
      this.key = key;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStringval(){
      return stringval;
   }

   /**
    *
    *@param stringval
    */
   public void setStringval(java.lang.String stringval){
      this.stringval = stringval;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLongval(){
      return longval;
   }

   /**
    *
    *@param longval
    */
   public void setLongval(java.lang.String longval){
      this.longval = longval;
   }

}