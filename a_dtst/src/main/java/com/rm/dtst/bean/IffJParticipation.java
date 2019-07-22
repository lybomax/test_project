package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:34
 */
@Table("iff_j_participation")
public class IffJParticipation{

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
   private java.lang.String groupid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String unitid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String userid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String type;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String task;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String swimlane;

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
   public java.lang.String getGroupid(){
      return groupid;
   }

   /**
    *
    *@param groupid
    */
   public void setGroupid(java.lang.String groupid){
      this.groupid = groupid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUnitid(){
      return unitid;
   }

   /**
    *
    *@param unitid
    */
   public void setUnitid(java.lang.String unitid){
      this.unitid = unitid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserid(){
      return userid;
   }

   /**
    *
    *@param userid
    */
   public void setUserid(java.lang.String userid){
      this.userid = userid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getType(){
      return type;
   }

   /**
    *
    *@param type
    */
   public void setType(java.lang.String type){
      this.type = type;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTask(){
      return task;
   }

   /**
    *
    *@param task
    */
   public void setTask(java.lang.String task){
      this.task = task;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSwimlane(){
      return swimlane;
   }

   /**
    *
    *@param swimlane
    */
   public void setSwimlane(java.lang.String swimlane){
      this.swimlane = swimlane;
   }

}