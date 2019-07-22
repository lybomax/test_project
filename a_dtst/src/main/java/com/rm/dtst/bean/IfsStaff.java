package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]用户信息表
 * 创建日期:2019-07-22 09:37:19
 */
@Table("ifs_staff")
public class IfsStaff{

   /**
      *操作员编号(主键) 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String tlrno;
   /**
      *操作员名称 
      *数据类型：varchar(30) 
      *是否必填:false 
   **/
   private java.lang.String tlrName;
   /**
      *操作员类型(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String tlrType;
   /**
      *邮箱 
      *数据类型：varchar(40) 
      *是否必填:false 
   **/
   private java.lang.String email;
   /**
      *所属机构号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String brcode;
   /**
      *操作员密码 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String password;
   /**
      *状态 0-签退、1-签到、2-离职 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *默认岗位(暂未使用) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer roleid;
   /**
      *分区编号(暂未使用) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer msrno;
   /**
      *有效标识(1-有效0-无效) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String flag;
   /**
      *登录IP 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String loginIp;
   /**
      *会话ID 
      *数据类型：varchar(256) 
      *是否必填:false 
   **/
   private java.lang.String sessionId;
   /**
      *是否校验动态码(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String chekDpwdFlg;
   /**
      *创建日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String createDate;
   /**
      *上次成功登录时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String lastaccesstm;
   /**
      *上次登出时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String lastlogouttm;
   /**
      *上次密码修改时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String lastpwdchgtm;
   /**
      *上次登陆失败时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String lastfailedtm;
   /**
      *密码输入错次数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer pswderrcnt;
   /**
      *密码连续错误次数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer totpswderrcnt;
   /**
      *密码输入错误日期(暂未使用) 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String pswderrdate;
   /**
      *密码加密算法 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String passwdenc;
   /**
      *最大错误输入次数(暂未使用) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer failmaxlogin;
   /**
      *密码更换间隔天数(暂未使用) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer passwdchginterval;
   /**
      *密码更换提醒天数(暂未使用) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer passwdwarninterval;
   /**
      *是否锁定(0-未锁定1-锁定) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLock;
   /**
      *锁定原因 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String lockReason;
   /**
      *锁定修改(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLockModify;
   /**
      *创建日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String crtDt;
   /**
      *最后更新时间 
      *数据类型：varchar(14) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdTms;
   /**
      *最后更新操作员 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdOper;
   /**
      *记录状态(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String st;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String legalPersonBrcode;

  //get和set方法
   /**
    *操作员编号(主键)
    *@return java.lang.String
    */
   public java.lang.String getTlrno(){
      return tlrno;
   }

   /**
    *操作员编号(主键)
    *@param tlrno
    */
   public void setTlrno(java.lang.String tlrno){
      this.tlrno = tlrno;
   }

   /**
    *操作员名称
    *@return java.lang.String
    */
   public java.lang.String getTlrName(){
      return tlrName;
   }

   /**
    *操作员名称
    *@param tlrName
    */
   public void setTlrName(java.lang.String tlrName){
      this.tlrName = tlrName;
   }

   /**
    *操作员类型(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getTlrType(){
      return tlrType;
   }

   /**
    *操作员类型(暂未使用)
    *@param tlrType
    */
   public void setTlrType(java.lang.String tlrType){
      this.tlrType = tlrType;
   }

   /**
    *邮箱
    *@return java.lang.String
    */
   public java.lang.String getEmail(){
      return email;
   }

   /**
    *邮箱
    *@param email
    */
   public void setEmail(java.lang.String email){
      this.email = email;
   }

   /**
    *所属机构号
    *@return java.lang.String
    */
   public java.lang.String getBrcode(){
      return brcode;
   }

   /**
    *所属机构号
    *@param brcode
    */
   public void setBrcode(java.lang.String brcode){
      this.brcode = brcode;
   }

   /**
    *操作员密码
    *@return java.lang.String
    */
   public java.lang.String getPassword(){
      return password;
   }

   /**
    *操作员密码
    *@param password
    */
   public void setPassword(java.lang.String password){
      this.password = password;
   }

   /**
    *状态 0-签退、1-签到、2-离职
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态 0-签退、1-签到、2-离职
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *默认岗位(暂未使用)
    *@return java.lang.Integer
    */
   public java.lang.Integer getRoleid(){
      return roleid;
   }

   /**
    *默认岗位(暂未使用)
    *@param roleid
    */
   public void setRoleid(java.lang.Integer roleid){
      this.roleid = roleid;
   }

   /**
    *分区编号(暂未使用)
    *@return java.lang.Integer
    */
   public java.lang.Integer getMsrno(){
      return msrno;
   }

   /**
    *分区编号(暂未使用)
    *@param msrno
    */
   public void setMsrno(java.lang.Integer msrno){
      this.msrno = msrno;
   }

   /**
    *有效标识(1-有效0-无效)
    *@return java.lang.String
    */
   public java.lang.String getFlag(){
      return flag;
   }

   /**
    *有效标识(1-有效0-无效)
    *@param flag
    */
   public void setFlag(java.lang.String flag){
      this.flag = flag;
   }

   /**
    *登录IP
    *@return java.lang.String
    */
   public java.lang.String getLoginIp(){
      return loginIp;
   }

   /**
    *登录IP
    *@param loginIp
    */
   public void setLoginIp(java.lang.String loginIp){
      this.loginIp = loginIp;
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
    *是否校验动态码(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getChekDpwdFlg(){
      return chekDpwdFlg;
   }

   /**
    *是否校验动态码(暂未使用)
    *@param chekDpwdFlg
    */
   public void setChekDpwdFlg(java.lang.String chekDpwdFlg){
      this.chekDpwdFlg = chekDpwdFlg;
   }

   /**
    *创建日期
    *@return java.lang.String
    */
   public java.lang.String getCreateDate(){
      return createDate;
   }

   /**
    *创建日期
    *@param createDate
    */
   public void setCreateDate(java.lang.String createDate){
      this.createDate = createDate;
   }

   /**
    *上次成功登录时间
    *@return java.lang.String
    */
   public java.lang.String getLastaccesstm(){
      return lastaccesstm;
   }

   /**
    *上次成功登录时间
    *@param lastaccesstm
    */
   public void setLastaccesstm(java.lang.String lastaccesstm){
      this.lastaccesstm = lastaccesstm;
   }

   /**
    *上次登出时间
    *@return java.lang.String
    */
   public java.lang.String getLastlogouttm(){
      return lastlogouttm;
   }

   /**
    *上次登出时间
    *@param lastlogouttm
    */
   public void setLastlogouttm(java.lang.String lastlogouttm){
      this.lastlogouttm = lastlogouttm;
   }

   /**
    *上次密码修改时间
    *@return java.lang.String
    */
   public java.lang.String getLastpwdchgtm(){
      return lastpwdchgtm;
   }

   /**
    *上次密码修改时间
    *@param lastpwdchgtm
    */
   public void setLastpwdchgtm(java.lang.String lastpwdchgtm){
      this.lastpwdchgtm = lastpwdchgtm;
   }

   /**
    *上次登陆失败时间
    *@return java.lang.String
    */
   public java.lang.String getLastfailedtm(){
      return lastfailedtm;
   }

   /**
    *上次登陆失败时间
    *@param lastfailedtm
    */
   public void setLastfailedtm(java.lang.String lastfailedtm){
      this.lastfailedtm = lastfailedtm;
   }

   /**
    *密码输入错次数
    *@return java.lang.Integer
    */
   public java.lang.Integer getPswderrcnt(){
      return pswderrcnt;
   }

   /**
    *密码输入错次数
    *@param pswderrcnt
    */
   public void setPswderrcnt(java.lang.Integer pswderrcnt){
      this.pswderrcnt = pswderrcnt;
   }

   /**
    *密码连续错误次数
    *@return java.lang.Integer
    */
   public java.lang.Integer getTotpswderrcnt(){
      return totpswderrcnt;
   }

   /**
    *密码连续错误次数
    *@param totpswderrcnt
    */
   public void setTotpswderrcnt(java.lang.Integer totpswderrcnt){
      this.totpswderrcnt = totpswderrcnt;
   }

   /**
    *密码输入错误日期(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getPswderrdate(){
      return pswderrdate;
   }

   /**
    *密码输入错误日期(暂未使用)
    *@param pswderrdate
    */
   public void setPswderrdate(java.lang.String pswderrdate){
      this.pswderrdate = pswderrdate;
   }

   /**
    *密码加密算法
    *@return java.lang.String
    */
   public java.lang.String getPasswdenc(){
      return passwdenc;
   }

   /**
    *密码加密算法
    *@param passwdenc
    */
   public void setPasswdenc(java.lang.String passwdenc){
      this.passwdenc = passwdenc;
   }

   /**
    *最大错误输入次数(暂未使用)
    *@return java.lang.Integer
    */
   public java.lang.Integer getFailmaxlogin(){
      return failmaxlogin;
   }

   /**
    *最大错误输入次数(暂未使用)
    *@param failmaxlogin
    */
   public void setFailmaxlogin(java.lang.Integer failmaxlogin){
      this.failmaxlogin = failmaxlogin;
   }

   /**
    *密码更换间隔天数(暂未使用)
    *@return java.lang.Integer
    */
   public java.lang.Integer getPasswdchginterval(){
      return passwdchginterval;
   }

   /**
    *密码更换间隔天数(暂未使用)
    *@param passwdchginterval
    */
   public void setPasswdchginterval(java.lang.Integer passwdchginterval){
      this.passwdchginterval = passwdchginterval;
   }

   /**
    *密码更换提醒天数(暂未使用)
    *@return java.lang.Integer
    */
   public java.lang.Integer getPasswdwarninterval(){
      return passwdwarninterval;
   }

   /**
    *密码更换提醒天数(暂未使用)
    *@param passwdwarninterval
    */
   public void setPasswdwarninterval(java.lang.Integer passwdwarninterval){
      this.passwdwarninterval = passwdwarninterval;
   }

   /**
    *是否锁定(0-未锁定1-锁定)
    *@return java.lang.String
    */
   public java.lang.String getIsLock(){
      return isLock;
   }

   /**
    *是否锁定(0-未锁定1-锁定)
    *@param isLock
    */
   public void setIsLock(java.lang.String isLock){
      this.isLock = isLock;
   }

   /**
    *锁定原因
    *@return java.lang.String
    */
   public java.lang.String getLockReason(){
      return lockReason;
   }

   /**
    *锁定原因
    *@param lockReason
    */
   public void setLockReason(java.lang.String lockReason){
      this.lockReason = lockReason;
   }

   /**
    *锁定修改(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getIsLockModify(){
      return isLockModify;
   }

   /**
    *锁定修改(暂未使用)
    *@param isLockModify
    */
   public void setIsLockModify(java.lang.String isLockModify){
      this.isLockModify = isLockModify;
   }

   /**
    *创建日期
    *@return java.lang.String
    */
   public java.lang.String getCrtDt(){
      return crtDt;
   }

   /**
    *创建日期
    *@param crtDt
    */
   public void setCrtDt(java.lang.String crtDt){
      this.crtDt = crtDt;
   }

   /**
    *最后更新时间
    *@return java.lang.String
    */
   public java.lang.String getLastUpdTms(){
      return lastUpdTms;
   }

   /**
    *最后更新时间
    *@param lastUpdTms
    */
   public void setLastUpdTms(java.lang.String lastUpdTms){
      this.lastUpdTms = lastUpdTms;
   }

   /**
    *最后更新操作员
    *@return java.lang.String
    */
   public java.lang.String getLastUpdOper(){
      return lastUpdOper;
   }

   /**
    *最后更新操作员
    *@param lastUpdOper
    */
   public void setLastUpdOper(java.lang.String lastUpdOper){
      this.lastUpdOper = lastUpdOper;
   }

   /**
    *记录状态(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getSt(){
      return st;
   }

   /**
    *记录状态(暂未使用)
    *@param st
    */
   public void setSt(java.lang.String st){
      this.st = st;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLegalPersonBrcode(){
      return legalPersonBrcode;
   }

   /**
    *
    *@param legalPersonBrcode
    */
   public void setLegalPersonBrcode(java.lang.String legalPersonBrcode){
      this.legalPersonBrcode = legalPersonBrcode;
   }

}