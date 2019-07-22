package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:授信担保关系表
 * 创建日期:2019-07-22 09:36:05
 */
@Table("cfg_credit_guarantee_rel")
public class CfgCreditGuaranteeRel{

   /**
      *id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *额度编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String creditId;
   /**
      *被担保方id 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *被担保方名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *申请Appno 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String applyLogId;
   /**
      *担保类型:01-企业法人担保,02-自然人担保 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String guaranteeType;
   /**
      *担保方名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String guaranteeName;
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
    *id
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *id
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *额度编号
    *@return java.lang.String
    */
   public java.lang.String getCreditId(){
      return creditId;
   }

   /**
    *额度编号
    *@param creditId
    */
   public void setCreditId(java.lang.String creditId){
      this.creditId = creditId;
   }

   /**
    *被担保方id
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *被担保方id
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *被担保方名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *被担保方名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *申请Appno
    *@return java.lang.String
    */
   public java.lang.String getApplyLogId(){
      return applyLogId;
   }

   /**
    *申请Appno
    *@param applyLogId
    */
   public void setApplyLogId(java.lang.String applyLogId){
      this.applyLogId = applyLogId;
   }

   /**
    *担保类型:01-企业法人担保,02-自然人担保
    *@return java.lang.String
    */
   public java.lang.String getGuaranteeType(){
      return guaranteeType;
   }

   /**
    *担保类型:01-企业法人担保,02-自然人担保
    *@param guaranteeType
    */
   public void setGuaranteeType(java.lang.String guaranteeType){
      this.guaranteeType = guaranteeType;
   }

   /**
    *担保方名称
    *@return java.lang.String
    */
   public java.lang.String getGuaranteeName(){
      return guaranteeName;
   }

   /**
    *担保方名称
    *@param guaranteeName
    */
   public void setGuaranteeName(java.lang.String guaranteeName){
      this.guaranteeName = guaranteeName;
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