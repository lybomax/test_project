package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]岗位/角色菜单关联表
 * 创建日期:2019-07-22 09:37:17
 */
@Table("ifs_res_inf")
public class IfsResInf{

   /**
      *主键 
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *岗位/角色编号 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer roleId;
   /**
      *菜单编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String funcid;

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
    *菜单编号
    *@return java.lang.String
    */
   public java.lang.String getFuncid(){
      return funcid;
   }

   /**
    *菜单编号
    *@param funcid
    */
   public void setFuncid(java.lang.String funcid){
      this.funcid = funcid;
   }

}