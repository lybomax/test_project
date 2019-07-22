package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]系统参数表
 * 创建日期:2019-07-22 09:37:23
 */
@Table("ifs_sys_param")
public class IfsSysParam{

   /**
      *参数分组(主键) 
      *数据类型：varchar(4) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String paramId;
   /**
      *参数编号(主键) 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String magicId;
   /**
      *有效期开始日期(暂未使用) 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String paramStartTm;
   /**
      *有效期截止日期(暂未使用) 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String paramEndTm;
   /**
      *参数修改标识(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String paramChangFlag;
   /**
      *参数值 
      *数据类型：varchar(512) 
      *是否必填:false 
   **/
   private java.lang.String paramValueTx;
   /**
      *最后更新操作员 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdTlr;
   /**
      *最后修改交易码 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdFunc;
   /**
      *最后更新日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdDate;
   /**
      *参数描述 
      *数据类型：varchar(256) 
      *是否必填:false 
   **/
   private java.lang.String desc0;
   /**
      *状态(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String st;
   /**
      *是否锁定(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLock;
   /**
      *是否删除(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isDel;

  //get和set方法
   /**
    *参数分组(主键)
    *@return java.lang.String
    */
   public java.lang.String getParamId(){
      return paramId;
   }

   /**
    *参数分组(主键)
    *@param paramId
    */
   public void setParamId(java.lang.String paramId){
      this.paramId = paramId;
   }

   /**
    *参数编号(主键)
    *@return java.lang.String
    */
   public java.lang.String getMagicId(){
      return magicId;
   }

   /**
    *参数编号(主键)
    *@param magicId
    */
   public void setMagicId(java.lang.String magicId){
      this.magicId = magicId;
   }

   /**
    *有效期开始日期(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getParamStartTm(){
      return paramStartTm;
   }

   /**
    *有效期开始日期(暂未使用)
    *@param paramStartTm
    */
   public void setParamStartTm(java.lang.String paramStartTm){
      this.paramStartTm = paramStartTm;
   }

   /**
    *有效期截止日期(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getParamEndTm(){
      return paramEndTm;
   }

   /**
    *有效期截止日期(暂未使用)
    *@param paramEndTm
    */
   public void setParamEndTm(java.lang.String paramEndTm){
      this.paramEndTm = paramEndTm;
   }

   /**
    *参数修改标识(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getParamChangFlag(){
      return paramChangFlag;
   }

   /**
    *参数修改标识(暂未使用)
    *@param paramChangFlag
    */
   public void setParamChangFlag(java.lang.String paramChangFlag){
      this.paramChangFlag = paramChangFlag;
   }

   /**
    *参数值
    *@return java.lang.String
    */
   public java.lang.String getParamValueTx(){
      return paramValueTx;
   }

   /**
    *参数值
    *@param paramValueTx
    */
   public void setParamValueTx(java.lang.String paramValueTx){
      this.paramValueTx = paramValueTx;
   }

   /**
    *最后更新操作员
    *@return java.lang.String
    */
   public java.lang.String getLastUpdTlr(){
      return lastUpdTlr;
   }

   /**
    *最后更新操作员
    *@param lastUpdTlr
    */
   public void setLastUpdTlr(java.lang.String lastUpdTlr){
      this.lastUpdTlr = lastUpdTlr;
   }

   /**
    *最后修改交易码
    *@return java.lang.String
    */
   public java.lang.String getLastUpdFunc(){
      return lastUpdFunc;
   }

   /**
    *最后修改交易码
    *@param lastUpdFunc
    */
   public void setLastUpdFunc(java.lang.String lastUpdFunc){
      this.lastUpdFunc = lastUpdFunc;
   }

   /**
    *最后更新日期
    *@return java.lang.String
    */
   public java.lang.String getLastUpdDate(){
      return lastUpdDate;
   }

   /**
    *最后更新日期
    *@param lastUpdDate
    */
   public void setLastUpdDate(java.lang.String lastUpdDate){
      this.lastUpdDate = lastUpdDate;
   }

   /**
    *参数描述
    *@return java.lang.String
    */
   public java.lang.String getDesc0(){
      return desc0;
   }

   /**
    *参数描述
    *@param desc0
    */
   public void setDesc0(java.lang.String desc0){
      this.desc0 = desc0;
   }

   /**
    *状态(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getSt(){
      return st;
   }

   /**
    *状态(暂未使用)
    *@param st
    */
   public void setSt(java.lang.String st){
      this.st = st;
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
    *是否删除(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getIsDel(){
      return isDel;
   }

   /**
    *是否删除(暂未使用)
    *@param isDel
    */
   public void setIsDel(java.lang.String isDel){
      this.isDel = isDel;
   }

}