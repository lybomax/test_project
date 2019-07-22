package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业外部信息表
 * 创建日期:2019-07-22 09:37:41
 */
@Table("user_cust_external_inf")
public class UserCustExternalInf{

   /**
      *信息编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *所属企业 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *发布时间 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date pubTime;
   /**
      *信息类别:01-舆情信息 02-法院判决信息 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String type;
   /**
      *发布机构 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String pubOrg;
   /**
      *内容级别:01-正面 02-中性 03-负面 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String level;
   /**
      *内容详情 
      *数据类型：varchar(5000) 
      *是否必填:false 
   **/
   private java.lang.String detail;
   /**
      *记录状态 
      *数据类型：char(1) 
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
    *信息编号
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *信息编号
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *所属企业
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *所属企业
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *发布时间
    *@return java.util.Date
    */
   public java.util.Date getPubTime(){
      return pubTime;
   }

   /**
    *发布时间
    *@param pubTime
    */
   public void setPubTime(java.util.Date pubTime){
      this.pubTime = pubTime;
   }

   /**
    *信息类别:01-舆情信息 02-法院判决信息
    *@return java.lang.String
    */
   public java.lang.String getType(){
      return type;
   }

   /**
    *信息类别:01-舆情信息 02-法院判决信息
    *@param type
    */
   public void setType(java.lang.String type){
      this.type = type;
   }

   /**
    *发布机构
    *@return java.lang.String
    */
   public java.lang.String getPubOrg(){
      return pubOrg;
   }

   /**
    *发布机构
    *@param pubOrg
    */
   public void setPubOrg(java.lang.String pubOrg){
      this.pubOrg = pubOrg;
   }

   /**
    *内容级别:01-正面 02-中性 03-负面
    *@return java.lang.String
    */
   public java.lang.String getLevel(){
      return level;
   }

   /**
    *内容级别:01-正面 02-中性 03-负面
    *@param level
    */
   public void setLevel(java.lang.String level){
      this.level = level;
   }

   /**
    *内容详情
    *@return java.lang.String
    */
   public java.lang.String getDetail(){
      return detail;
   }

   /**
    *内容详情
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