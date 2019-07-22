package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]登录日志表
 * 创建日期:2019-07-22 09:37:13
 */
@Table("ifs_login_log")
public class IfsLoginLog{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String logId;
   /**
      *用户编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String tlrNo;
   /**
      *外部机构编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String brNo;
   /**
      *登录成功时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String loginSucTm;
   /**
      *退出时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String loginOutTm;
   /**
      *登录失败时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String loginFailTm;
   /**
      *登录IP地址 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String loginAddr;
   /**
      *备注 
      *数据类型：varchar(256) 
      *是否必填:false 
   **/
   private java.lang.String loginRemark;
   /**
      *会话ID 
      *数据类型：varchar(256) 
      *是否必填:false 
   **/
   private java.lang.String sessionId;
   /**
      *创建时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String crtTm;

  //get和set方法
   /**
    *主键
    *@return java.lang.String
    */
   public java.lang.String getLogId(){
      return logId;
   }

   /**
    *主键
    *@param logId
    */
   public void setLogId(java.lang.String logId){
      this.logId = logId;
   }

   /**
    *用户编号
    *@return java.lang.String
    */
   public java.lang.String getTlrNo(){
      return tlrNo;
   }

   /**
    *用户编号
    *@param tlrNo
    */
   public void setTlrNo(java.lang.String tlrNo){
      this.tlrNo = tlrNo;
   }

   /**
    *外部机构编号
    *@return java.lang.String
    */
   public java.lang.String getBrNo(){
      return brNo;
   }

   /**
    *外部机构编号
    *@param brNo
    */
   public void setBrNo(java.lang.String brNo){
      this.brNo = brNo;
   }

   /**
    *登录成功时间
    *@return java.lang.String
    */
   public java.lang.String getLoginSucTm(){
      return loginSucTm;
   }

   /**
    *登录成功时间
    *@param loginSucTm
    */
   public void setLoginSucTm(java.lang.String loginSucTm){
      this.loginSucTm = loginSucTm;
   }

   /**
    *退出时间
    *@return java.lang.String
    */
   public java.lang.String getLoginOutTm(){
      return loginOutTm;
   }

   /**
    *退出时间
    *@param loginOutTm
    */
   public void setLoginOutTm(java.lang.String loginOutTm){
      this.loginOutTm = loginOutTm;
   }

   /**
    *登录失败时间
    *@return java.lang.String
    */
   public java.lang.String getLoginFailTm(){
      return loginFailTm;
   }

   /**
    *登录失败时间
    *@param loginFailTm
    */
   public void setLoginFailTm(java.lang.String loginFailTm){
      this.loginFailTm = loginFailTm;
   }

   /**
    *登录IP地址
    *@return java.lang.String
    */
   public java.lang.String getLoginAddr(){
      return loginAddr;
   }

   /**
    *登录IP地址
    *@param loginAddr
    */
   public void setLoginAddr(java.lang.String loginAddr){
      this.loginAddr = loginAddr;
   }

   /**
    *备注
    *@return java.lang.String
    */
   public java.lang.String getLoginRemark(){
      return loginRemark;
   }

   /**
    *备注
    *@param loginRemark
    */
   public void setLoginRemark(java.lang.String loginRemark){
      this.loginRemark = loginRemark;
   }

   /**
    *会话ID
    *@return java.lang.String
    */
   public java.lang.String getSessionId(){
      return sessionId;
   }

   /**
    *会话ID
    *@param sessionId
    */
   public void setSessionId(java.lang.String sessionId){
      this.sessionId = sessionId;
   }

   /**
    *创建时间
    *@return java.lang.String
    */
   public java.lang.String getCrtTm(){
      return crtTm;
   }

   /**
    *创建时间
    *@param crtTm
    */
   public void setCrtTm(java.lang.String crtTm){
      this.crtTm = crtTm;
   }

}