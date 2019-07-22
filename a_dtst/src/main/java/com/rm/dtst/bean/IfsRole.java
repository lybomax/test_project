package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]岗位/角色表
 * 创建日期:2019-07-22 09:37:17
 */
@Table("ifs_role")
public class IfsRole{

   /**
      *岗位编号(主键) 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   @Id
   private java.lang.Integer roleId;
   /**
      *岗位名称 
      *数据类型：varchar(30) 
      *是否必填:false 
   **/
   private java.lang.String roleName;
   /**
      *状态 1有效,0无效 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *有效日期开始(暂未使用) 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String effectDate;
   /**
      *有效日期结束(暂未使用) 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String expireDate;
   /**
      *所属行级别(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String brclass;
   /**
      *扩展字段 
      *数据类型：char(20) 
      *是否必填:false 
   **/
   private java.lang.String miscflgs;
   /**
      *扩展字段 
      *数据类型：varchar(256) 
      *是否必填:false 
   **/
   private java.lang.String misc;
   /**
      *岗位类型(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String roleType;
   /**
      *是否锁定(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLock;
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
      *最后更新人 
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

  //get和set方法
   /**
    *岗位编号(主键)
    *@return java.lang.Integer
    */
   public java.lang.Integer getRoleId(){
      return roleId;
   }

   /**
    *岗位编号(主键)
    *@param roleId
    */
   public void setRoleId(java.lang.Integer roleId){
      this.roleId = roleId;
   }

   /**
    *岗位名称
    *@return java.lang.String
    */
   public java.lang.String getRoleName(){
      return roleName;
   }

   /**
    *岗位名称
    *@param roleName
    */
   public void setRoleName(java.lang.String roleName){
      this.roleName = roleName;
   }

   /**
    *状态 1有效,0无效
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态 1有效,0无效
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *有效日期开始(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getEffectDate(){
      return effectDate;
   }

   /**
    *有效日期开始(暂未使用)
    *@param effectDate
    */
   public void setEffectDate(java.lang.String effectDate){
      this.effectDate = effectDate;
   }

   /**
    *有效日期结束(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getExpireDate(){
      return expireDate;
   }

   /**
    *有效日期结束(暂未使用)
    *@param expireDate
    */
   public void setExpireDate(java.lang.String expireDate){
      this.expireDate = expireDate;
   }

   /**
    *所属行级别(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getBrclass(){
      return brclass;
   }

   /**
    *所属行级别(暂未使用)
    *@param brclass
    */
   public void setBrclass(java.lang.String brclass){
      this.brclass = brclass;
   }

   /**
    *扩展字段
    *@return java.lang.String
    */
   public java.lang.String getMiscflgs(){
      return miscflgs;
   }

   /**
    *扩展字段
    *@param miscflgs
    */
   public void setMiscflgs(java.lang.String miscflgs){
      this.miscflgs = miscflgs;
   }

   /**
    *扩展字段
    *@return java.lang.String
    */
   public java.lang.String getMisc(){
      return misc;
   }

   /**
    *扩展字段
    *@param misc
    */
   public void setMisc(java.lang.String misc){
      this.misc = misc;
   }

   /**
    *岗位类型(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getRoleType(){
      return roleType;
   }

   /**
    *岗位类型(暂未使用)
    *@param roleType
    */
   public void setRoleType(java.lang.String roleType){
      this.roleType = roleType;
   }

   /**
    *是否锁定(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getIsLock(){
      return isLock;
   }

   /**
    *是否锁定(暂未使用)
    *@param isLock
    */
   public void setIsLock(java.lang.String isLock){
      this.isLock = isLock;
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
    *最后更新人
    *@return java.lang.String
    */
   public java.lang.String getLastUpdOper(){
      return lastUpdOper;
   }

   /**
    *最后更新人
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

}