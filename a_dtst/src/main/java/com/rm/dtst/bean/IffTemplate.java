package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:57
 */
@Table("iff_template")
public class IffTemplate{

   /**
      *工作流PDID 
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String packagehandle;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String templateid;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer version;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String creatorid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String creatorname;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date createdtime;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String lastmodifierid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String lastmodifiername;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date lastmodifiedtime;
   /**
      *0：未部署
            1：已部署 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isdeployed;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date deployedtime;
   /**
      *1：立即生效
            2：预约生效
             
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String effecttype;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date appointtime;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String deploymentid;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer priority;
   /**
      *0:未锁定;1:锁定 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String islock;
   /**
      *0:不提交;1:提交 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String firsttaskcommit;

  //get和set方法
   /**
    *工作流PDID
    *@return java.lang.String
    */
   public java.lang.String getHandle(){
      return handle;
   }

   /**
    *工作流PDID
    *@param handle
    */
   public void setHandle(java.lang.String handle){
      this.handle = handle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPackagehandle(){
      return packagehandle;
   }

   /**
    *
    *@param packagehandle
    */
   public void setPackagehandle(java.lang.String packagehandle){
      this.packagehandle = packagehandle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplateid(){
      return templateid;
   }

   /**
    *
    *@param templateid
    */
   public void setTemplateid(java.lang.String templateid){
      this.templateid = templateid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getName(){
      return name;
   }

   /**
    *
    *@param name
    */
   public void setName(java.lang.String name){
      this.name = name;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getRemark(){
      return remark;
   }

   /**
    *
    *@param remark
    */
   public void setRemark(java.lang.String remark){
      this.remark = remark;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getVersion(){
      return version;
   }

   /**
    *
    *@param version
    */
   public void setVersion(java.lang.Integer version){
      this.version = version;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCreatorid(){
      return creatorid;
   }

   /**
    *
    *@param creatorid
    */
   public void setCreatorid(java.lang.String creatorid){
      this.creatorid = creatorid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCreatorname(){
      return creatorname;
   }

   /**
    *
    *@param creatorname
    */
   public void setCreatorname(java.lang.String creatorname){
      this.creatorname = creatorname;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getCreatedtime(){
      return createdtime;
   }

   /**
    *
    *@param createdtime
    */
   public void setCreatedtime(java.util.Date createdtime){
      this.createdtime = createdtime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLastmodifierid(){
      return lastmodifierid;
   }

   /**
    *
    *@param lastmodifierid
    */
   public void setLastmodifierid(java.lang.String lastmodifierid){
      this.lastmodifierid = lastmodifierid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLastmodifiername(){
      return lastmodifiername;
   }

   /**
    *
    *@param lastmodifiername
    */
   public void setLastmodifiername(java.lang.String lastmodifiername){
      this.lastmodifiername = lastmodifiername;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getLastmodifiedtime(){
      return lastmodifiedtime;
   }

   /**
    *
    *@param lastmodifiedtime
    */
   public void setLastmodifiedtime(java.util.Date lastmodifiedtime){
      this.lastmodifiedtime = lastmodifiedtime;
   }

   /**
    *0：未部署
            1：已部署
    *@return java.lang.String
    */
   public java.lang.String getIsdeployed(){
      return isdeployed;
   }

   /**
    *0：未部署
            1：已部署
    *@param isdeployed
    */
   public void setIsdeployed(java.lang.String isdeployed){
      this.isdeployed = isdeployed;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getDeployedtime(){
      return deployedtime;
   }

   /**
    *
    *@param deployedtime
    */
   public void setDeployedtime(java.util.Date deployedtime){
      this.deployedtime = deployedtime;
   }

   /**
    *1：立即生效
            2：预约生效
            
    *@return java.lang.String
    */
   public java.lang.String getEffecttype(){
      return effecttype;
   }

   /**
    *1：立即生效
            2：预约生效
            
    *@param effecttype
    */
   public void setEffecttype(java.lang.String effecttype){
      this.effecttype = effecttype;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getAppointtime(){
      return appointtime;
   }

   /**
    *
    *@param appointtime
    */
   public void setAppointtime(java.util.Date appointtime){
      this.appointtime = appointtime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDeploymentid(){
      return deploymentid;
   }

   /**
    *
    *@param deploymentid
    */
   public void setDeploymentid(java.lang.String deploymentid){
      this.deploymentid = deploymentid;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getPriority(){
      return priority;
   }

   /**
    *
    *@param priority
    */
   public void setPriority(java.lang.Integer priority){
      this.priority = priority;
   }

   /**
    *0:未锁定;1:锁定
    *@return java.lang.String
    */
   public java.lang.String getIslock(){
      return islock;
   }

   /**
    *0:未锁定;1:锁定
    *@param islock
    */
   public void setIslock(java.lang.String islock){
      this.islock = islock;
   }

   /**
    *0:不提交;1:提交
    *@return java.lang.String
    */
   public java.lang.String getFirsttaskcommit(){
      return firsttaskcommit;
   }

   /**
    *0:不提交;1:提交
    *@param firsttaskcommit
    */
   public void setFirsttaskcommit(java.lang.String firsttaskcommit){
      this.firsttaskcommit = firsttaskcommit;
   }

}