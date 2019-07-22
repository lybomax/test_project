package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:订单预警基本信息表
 * 创建日期:2019-07-22 09:37:31
 */
@Table("order_warn_base_inf")
public class OrderWarnBaseInf{

   /**
      *编号:ID主键 
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
      *企业名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *数据类型：varchar(8192) 
      *是否必填:false 
   **/
   private java.lang.String bussDetail;
   /**
      *预警参数表编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String paramId;
   /**
      *预警产生日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date warnDate;
   /**
      *产品大类 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String productTopId;
   /**
      *产品小类 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String productId;
   /**
      *备注 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *状态 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
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
    *编号:ID主键
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *编号:ID主键
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
    *企业名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *企业名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBussDetail(){
      return bussDetail;
   }

   /**
    *
    *@param bussDetail
    */
   public void setBussDetail(java.lang.String bussDetail){
      this.bussDetail = bussDetail;
   }

   /**
    *预警参数表编号
    *@return java.lang.String
    */
   public java.lang.String getParamId(){
      return paramId;
   }

   /**
    *预警参数表编号
    *@param paramId
    */
   public void setParamId(java.lang.String paramId){
      this.paramId = paramId;
   }

   /**
    *预警产生日期
    *@return java.util.Date
    */
   public java.util.Date getWarnDate(){
      return warnDate;
   }

   /**
    *预警产生日期
    *@param warnDate
    */
   public void setWarnDate(java.util.Date warnDate){
      this.warnDate = warnDate;
   }

   /**
    *产品大类
    *@return java.lang.String
    */
   public java.lang.String getProductTopId(){
      return productTopId;
   }

   /**
    *产品大类
    *@param productTopId
    */
   public void setProductTopId(java.lang.String productTopId){
      this.productTopId = productTopId;
   }

   /**
    *产品小类
    *@return java.lang.String
    */
   public java.lang.String getProductId(){
      return productId;
   }

   /**
    *产品小类
    *@param productId
    */
   public void setProductId(java.lang.String productId){
      this.productId = productId;
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
    *状态
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
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