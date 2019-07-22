package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:03
 */
@Table("iff_user")
public class IffUser{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String userid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String username;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String ownerunitid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String loginid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String password;
   /**
      *0-未激活
            1-已激活 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer failedcount;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer maxfailedcount;
   /**
      *数据类型：varchar(25) 
      *是否必填:false 
   **/
   private java.lang.String loginip;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date logintime;
   /**
      *数据类型：varchar(25) 
      *是否必填:false 
   **/
   private java.lang.String lastloginip;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date lastlogintime;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String deleteflag;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String businessemail;
   /**
      *数据类型：varchar(25) 
      *是否必填:false 
   **/
   private java.lang.String phone;

  //get和set方法
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
   public java.lang.String getUsername(){
      return username;
   }

   /**
    *
    *@param username
    */
   public void setUsername(java.lang.String username){
      this.username = username;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOwnerunitid(){
      return ownerunitid;
   }

   /**
    *
    *@param ownerunitid
    */
   public void setOwnerunitid(java.lang.String ownerunitid){
      this.ownerunitid = ownerunitid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLoginid(){
      return loginid;
   }

   /**
    *
    *@param loginid
    */
   public void setLoginid(java.lang.String loginid){
      this.loginid = loginid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPassword(){
      return password;
   }

   /**
    *
    *@param password
    */
   public void setPassword(java.lang.String password){
      this.password = password;
   }

   /**
    *0-未激活
            1-已激活
    *@return java.lang.Integer
    */
   public java.lang.Integer getFailedcount(){
      return failedcount;
   }

   /**
    *0-未激活
            1-已激活
    *@param failedcount
    */
   public void setFailedcount(java.lang.Integer failedcount){
      this.failedcount = failedcount;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getMaxfailedcount(){
      return maxfailedcount;
   }

   /**
    *
    *@param maxfailedcount
    */
   public void setMaxfailedcount(java.lang.Integer maxfailedcount){
      this.maxfailedcount = maxfailedcount;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLoginip(){
      return loginip;
   }

   /**
    *
    *@param loginip
    */
   public void setLoginip(java.lang.String loginip){
      this.loginip = loginip;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getLogintime(){
      return logintime;
   }

   /**
    *
    *@param logintime
    */
   public void setLogintime(java.util.Date logintime){
      this.logintime = logintime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLastloginip(){
      return lastloginip;
   }

   /**
    *
    *@param lastloginip
    */
   public void setLastloginip(java.lang.String lastloginip){
      this.lastloginip = lastloginip;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getLastlogintime(){
      return lastlogintime;
   }

   /**
    *
    *@param lastlogintime
    */
   public void setLastlogintime(java.util.Date lastlogintime){
      this.lastlogintime = lastlogintime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDeleteflag(){
      return deleteflag;
   }

   /**
    *
    *@param deleteflag
    */
   public void setDeleteflag(java.lang.String deleteflag){
      this.deleteflag = deleteflag;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBusinessemail(){
      return businessemail;
   }

   /**
    *
    *@param businessemail
    */
   public void setBusinessemail(java.lang.String businessemail){
      this.businessemail = businessemail;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPhone(){
      return phone;
   }

   /**
    *
    *@param phone
    */
   public void setPhone(java.lang.String phone){
      this.phone = phone;
   }

}