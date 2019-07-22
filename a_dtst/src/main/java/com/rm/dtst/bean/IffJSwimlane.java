package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:40
 */
@Table("iff_j_swimlane")
public class IffJSwimlane{

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
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String assignee;
   /**
      *外键，和流程实例表DBID关联 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String execution;

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
   public java.lang.String getAssignee(){
      return assignee;
   }

   /**
    *
    *@param assignee
    */
   public void setAssignee(java.lang.String assignee){
      this.assignee = assignee;
   }

   /**
    *外键，和流程实例表DBID关联
    *@return java.lang.String
    */
   public java.lang.String getExecution(){
      return execution;
   }

   /**
    *外键，和流程实例表DBID关联
    *@param execution
    */
   public void setExecution(java.lang.String execution){
      this.execution = execution;
   }

}