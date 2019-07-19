package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业外部评级登记簿
 * 创建日期:2019-07-19 17:33:10
 */
@Table("user_cust_level_hist")
public class UserCustLevelHist{

   /**
      *ID 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *企业编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *评级时间 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date pubTime;
   /**
      *评级单位 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String pubOrg;
   /**
      *评级数据 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String detail;
   /**
      *记录状态 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *机构号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String branchId;
   /**
      *建立时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *最后更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

  //get和set方法
   /**
    *ID
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *ID
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *企业编号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *企业编号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *评级时间
    *@return java.util.Date
    */
   public java.util.Date getPubTime(){
      return pubTime;
   }

   /**
    *评级时间
    *@param pubTime
    */
   public void setPubTime(java.util.Date pubTime){
      this.pubTime = pubTime;
   }

   /**
    *评级单位
    *@return java.lang.String
    */
   public java.lang.String getPubOrg(){
      return pubOrg;
   }

   /**
    *评级单位
    *@param pubOrg
    */
   public void setPubOrg(java.lang.String pubOrg){
      this.pubOrg = pubOrg;
   }

   /**
    *评级数据
    *@return java.lang.String
    */
   public java.lang.String getDetail(){
      return detail;
   }

   /**
    *评级数据
    *@param detail
    */
   public void setDetail(java.lang.String detail){
      this.detail = detail;
   }

   /**
    *记录状态
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *记录状态
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *机构号
    *@return java.lang.String
    */
   public java.lang.String getBranchId(){
      return branchId;
   }

   /**
    *机构号
    *@param branchId
    */
   public void setBranchId(java.lang.String branchId){
      this.branchId = branchId;
   }

   /**
    *建立时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *最后更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
      this.updateTime = updateTime;
   }

   /**
    *最后更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProg(){
      return updateProg;
   }

   /**
    *最后更新程序
    *@param updateProg
    */
   public void setUpdateProg(java.lang.String updateProg){
      this.updateProg = updateProg;
   }

}