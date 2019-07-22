package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:05
 */
@Table("iff_user_role")
public class IffUserRole{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String relationid;
   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String userid;
   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String roleid;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getRelationid(){
      return relationid;
   }

   /**
    *
    *@param relationid
    */
   public void setRelationid(java.lang.String relationid){
      this.relationid = relationid;
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
   public java.lang.String getRoleid(){
      return roleid;
   }

   /**
    *
    *@param roleid
    */
   public void setRoleid(java.lang.String roleid){
      this.roleid = roleid;
   }

}