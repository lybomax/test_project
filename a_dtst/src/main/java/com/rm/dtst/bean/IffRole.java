package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:52
 */
@Table("iff_role")
public class IffRole{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String roleid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String rolename;

  //get和set方法
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
   public java.lang.String getRolename(){
      return rolename;
   }

   /**
    *
    *@param rolename
    */
   public void setRolename(java.lang.String rolename){
      this.rolename = rolename;
   }

}