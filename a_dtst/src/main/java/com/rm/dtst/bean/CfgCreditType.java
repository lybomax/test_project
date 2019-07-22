package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:额度分类表
 * 创建日期:2019-07-22 09:36:06
 */
@Table("cfg_credit_type")
public class CfgCreditType{

   /**
      *额度分类编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String creditTypeCode;
   /**
      *额度分类名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String creditTypeName;
   /**
      *授信类型
            1-直接授信
            2-第三方授信
            3-间接授信
            4-买方授信 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String grantType;
   /**
      *产品额度类型
            01-订单融资额度
            02-保理融资额度
            03-提货担保融资额度
            04-预付款融资额度
            05-商票保贴融资额度
             
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String productCreditType;
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
    *额度分类编号
    *@return java.lang.String
    */
   public java.lang.String getCreditTypeCode(){
      return creditTypeCode;
   }

   /**
    *额度分类编号
    *@param creditTypeCode
    */
   public void setCreditTypeCode(java.lang.String creditTypeCode){
      this.creditTypeCode = creditTypeCode;
   }

   /**
    *额度分类名称
    *@return java.lang.String
    */
   public java.lang.String getCreditTypeName(){
      return creditTypeName;
   }

   /**
    *额度分类名称
    *@param creditTypeName
    */
   public void setCreditTypeName(java.lang.String creditTypeName){
      this.creditTypeName = creditTypeName;
   }

   /**
    *授信类型
            1-直接授信
            2-第三方授信
            3-间接授信
            4-买方授信
    *@return java.lang.String
    */
   public java.lang.String getGrantType(){
      return grantType;
   }

   /**
    *授信类型
            1-直接授信
            2-第三方授信
            3-间接授信
            4-买方授信
    *@param grantType
    */
   public void setGrantType(java.lang.String grantType){
      this.grantType = grantType;
   }

   /**
    *产品额度类型
            01-订单融资额度
            02-保理融资额度
            03-提货担保融资额度
            04-预付款融资额度
            05-商票保贴融资额度
            
    *@return java.lang.String
    */
   public java.lang.String getProductCreditType(){
      return productCreditType;
   }

   /**
    *产品额度类型
            01-订单融资额度
            02-保理融资额度
            03-提货担保融资额度
            04-预付款融资额度
            05-商票保贴融资额度
            
    *@param productCreditType
    */
   public void setProductCreditType(java.lang.String productCreditType){
      this.productCreditType = productCreditType;
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