package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:53
 */
@Table("iff_role_resource")
public class IffRoleResource{

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
   private java.lang.String roleid;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String resourceid;
   /**
      *FUNCTION MENU 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String resourcetype;

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

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getResourceid(){
      return resourceid;
   }

   /**
    *
    *@param resourceid
    */
   public void setResourceid(java.lang.String resourceid){
      this.resourceid = resourceid;
   }

   /**
    *FUNCTION MENU
    *@return java.lang.String
    */
   public java.lang.String getResourcetype(){
      return resourcetype;
   }

   /**
    *FUNCTION MENU
    *@param resourcetype
    */
   public void setResourcetype(java.lang.String resourcetype){
      this.resourcetype = resourcetype;
   }

}