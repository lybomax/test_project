package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:42
 */
@Table("iff_j_user_participation")
public class IffJUserParticipation{

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
   private java.lang.String task;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String userid;

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

}