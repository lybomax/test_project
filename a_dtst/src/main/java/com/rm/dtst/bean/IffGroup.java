package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:27
 */
@Table("iff_group")
public class IffGroup{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String groupid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String groupname;

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
   public java.lang.String getGroupname(){
      return groupname;
   }

   /**
    *
    *@param groupname
    */
   public void setGroupname(java.lang.String groupname){
      this.groupname = groupname;
   }

}