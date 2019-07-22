package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]用户岗位/角色关联表
 * 创建日期:2019-07-22 09:37:21
 */
@Table("ifs_staff_role_rel")
public class IfsStaffRoleRel{

   /**
      *主键 
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *用户编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String tlrno;
   /**
      *岗位/角色编号 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer roleId;
   /**
      *状态 1有效0无效 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String status;

  //get和set方法
   /**
    *主键
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *用户编号
    *@return java.lang.String
    */
   public java.lang.String getTlrno(){
      return tlrno;
   }

   /**
    *用户编号
    *@param tlrno
    */
   public void setTlrno(java.lang.String tlrno){
      this.tlrno = tlrno;
   }

   /**
    *岗位/角色编号
    *@return java.lang.Integer
    */
   public java.lang.Integer getRoleId(){
      return roleId;
   }

   /**
    *岗位/角色编号
    *@param roleId
    */
   public void setRoleId(java.lang.Integer roleId){
      this.roleId = roleId;
   }

   /**
    *状态 1有效0无效
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态 1有效0无效
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

}