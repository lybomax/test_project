package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:产品信息表
 * 创建日期:2019-07-22 09:36:11
 */
@Table("cfg_product")
public class CfgProduct{

   /**
      *产品编号 
      *数据类型：varchar(10) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String productId;
   /**
      *产品名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String productName;
   /**
      *产品大类 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String productCat;
   /**
      *产品子类 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String productSubCat;
   /**
      *上级产品编号 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String parentProductId;
   /**
      *有效标识
            0-无效
            1-有效 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String validFlag;
   /**
      *备注 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *创建时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *更新程序 
      *数据类型：varchar(128) 
      *是否必填:true 
   **/
   private java.lang.String updateProgram;

  //get和set方法
   /**
    *产品编号
    *@return java.lang.String
    */
   public java.lang.String getProductId(){
      return productId;
   }

   /**
    *产品编号
    *@param productId
    */
   public void setProductId(java.lang.String productId){
      this.productId = productId;
   }

   /**
    *产品名称
    *@return java.lang.String
    */
   public java.lang.String getProductName(){
      return productName;
   }

   /**
    *产品名称
    *@param productName
    */
   public void setProductName(java.lang.String productName){
      this.productName = productName;
   }

   /**
    *产品大类
    *@return java.lang.String
    */
   public java.lang.String getProductCat(){
      return productCat;
   }

   /**
    *产品大类
    *@param productCat
    */
   public void setProductCat(java.lang.String productCat){
      this.productCat = productCat;
   }

   /**
    *产品子类
    *@return java.lang.String
    */
   public java.lang.String getProductSubCat(){
      return productSubCat;
   }

   /**
    *产品子类
    *@param productSubCat
    */
   public void setProductSubCat(java.lang.String productSubCat){
      this.productSubCat = productSubCat;
   }

   /**
    *上级产品编号
    *@return java.lang.String
    */
   public java.lang.String getParentProductId(){
      return parentProductId;
   }

   /**
    *上级产品编号
    *@param parentProductId
    */
   public void setParentProductId(java.lang.String parentProductId){
      this.parentProductId = parentProductId;
   }

   /**
    *有效标识
            0-无效
            1-有效
    *@return java.lang.String
    */
   public java.lang.String getValidFlag(){
      return validFlag;
   }

   /**
    *有效标识
            0-无效
            1-有效
    *@param validFlag
    */
   public void setValidFlag(java.lang.String validFlag){
      this.validFlag = validFlag;
   }

   /**
    *备注
    *@return java.lang.String
    */
   public java.lang.String getRemark(){
      return remark;
   }

   /**
    *备注
    *@param remark
    */
   public void setRemark(java.lang.String remark){
      this.remark = remark;
   }

   /**
    *创建时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *创建时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
      this.updateTime = updateTime;
   }

   /**
    *更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProgram(){
      return updateProgram;
   }

   /**
    *更新程序
    *@param updateProgram
    */
   public void setUpdateProgram(java.lang.String updateProgram){
      this.updateProgram = updateProgram;
   }

}