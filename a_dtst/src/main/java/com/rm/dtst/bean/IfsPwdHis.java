package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]密码修改记录表
 * 创建日期:2019-07-22 09:37:16
 */
@Table("ifs_pwd_his")
public class IfsPwdHis{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *用户编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String userid;
   /**
      *密码 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String password;
   /**
      *加密方式 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String encMode;
   /**
      *修改时间 
      *数据类型：char(14) 
      *是否必填:true 
   **/
   private java.lang.String modifiedTime;

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
   public java.lang.String getUserid(){
      return userid;
   }

   /**
    *用户编号
    *@param userid
    */
   public void setUserid(java.lang.String userid){
      this.userid = userid;
   }

   /**
    *密码
    *@return java.lang.String
    */
   public java.lang.String getPassword(){
      return password;
   }

   /**
    *密码
    *@param password
    */
   public void setPassword(java.lang.String password){
      this.password = password;
   }

   /**
    *加密方式
    *@return java.lang.String
    */
   public java.lang.String getEncMode(){
      return encMode;
   }

   /**
    *加密方式
    *@param encMode
    */
   public void setEncMode(java.lang.String encMode){
      this.encMode = encMode;
   }

   /**
    *修改时间
    *@return java.lang.String
    */
   public java.lang.String getModifiedTime(){
      return modifiedTime;
   }

   /**
    *修改时间
    *@param modifiedTime
    */
   public void setModifiedTime(java.lang.String modifiedTime){
      this.modifiedTime = modifiedTime;
   }

}