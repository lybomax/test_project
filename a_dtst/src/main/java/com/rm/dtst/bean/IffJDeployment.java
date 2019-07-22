package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:29
 */
@Table("iff_j_deployment")
public class IffJDeployment{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String name;
   /**
      *数据类型：bigint(20) 
      *是否必填:false 
   **/
   private java.lang.String timestamp;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String state;

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
   public java.lang.String getTimestamp(){
      return timestamp;
   }

   /**
    *
    *@param timestamp
    */
   public void setTimestamp(java.lang.String timestamp){
      this.timestamp = timestamp;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getState(){
      return state;
   }

   /**
    *
    *@param state
    */
   public void setState(java.lang.String state){
      this.state = state;
   }

}