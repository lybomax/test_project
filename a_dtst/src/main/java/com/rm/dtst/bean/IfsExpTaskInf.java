package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]批量导出任务表
 * 创建日期:2019-07-22 09:37:12
 */
@Table("ifs_exp_task_inf")
public class IfsExpTaskInf{

   /**
      *主键 
      *数据类型：char(36) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String tskId;
   /**
      *任务名称 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String tskNm;
   /**
      *任务发起时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String tskStartTms;
   /**
      *任务发起人 
      *数据类型：varchar(40) 
      *是否必填:false 
   **/
   private java.lang.String tskStartOp;
   /**
      *任务描述 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String tskDesc;
   /**
      *任务参数1 
      *数据类型：varchar(2048) 
      *是否必填:false 
   **/
   private java.lang.String tskParam1;
   /**
      *任务参数2 
      *数据类型：varchar(2048) 
      *是否必填:false 
   **/
   private java.lang.String tskParam2;
   /**
      *任务拥有者 
      *数据类型：varchar(40) 
      *是否必填:false 
   **/
   private java.lang.String tskOwner;
   /**
      *任务完成时间 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String tskEndTms;
   /**
      *任务运行类型，默认01 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String tskRunClass;
   /**
      *导出文件路径 
      *数据类型：varchar(128) 
      *是否必填:false 
   **/
   private java.lang.String expFileNm;
   /**
      *已导出记录笔数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer expRcdNum;
   /**
      *导出记录总笔数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer expRcdSumNum;
   /**
      *导出文件大小（以byte为单位） 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer expFileSize;
   /**
      *任务执行状态0:初始状态 1:准备执行 2:正在执行 3:任务完成 4执行失败 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String tskStat;
   /**
      *运行失败原因 
      *数据类型：varchar(2048) 
      *是否必填:false 
   **/
   private java.lang.String tskErrMsg;

  //get和set方法
   /**
    *主键
    *@return java.lang.String
    */
   public java.lang.String getTskId(){
      return tskId;
   }

   /**
    *主键
    *@param tskId
    */
   public void setTskId(java.lang.String tskId){
      this.tskId = tskId;
   }

   /**
    *任务名称
    *@return java.lang.String
    */
   public java.lang.String getTskNm(){
      return tskNm;
   }

   /**
    *任务名称
    *@param tskNm
    */
   public void setTskNm(java.lang.String tskNm){
      this.tskNm = tskNm;
   }

   /**
    *任务发起时间
    *@return java.lang.String
    */
   public java.lang.String getTskStartTms(){
      return tskStartTms;
   }

   /**
    *任务发起时间
    *@param tskStartTms
    */
   public void setTskStartTms(java.lang.String tskStartTms){
      this.tskStartTms = tskStartTms;
   }

   /**
    *任务发起人
    *@return java.lang.String
    */
   public java.lang.String getTskStartOp(){
      return tskStartOp;
   }

   /**
    *任务发起人
    *@param tskStartOp
    */
   public void setTskStartOp(java.lang.String tskStartOp){
      this.tskStartOp = tskStartOp;
   }

   /**
    *任务描述
    *@return java.lang.String
    */
   public java.lang.String getTskDesc(){
      return tskDesc;
   }

   /**
    *任务描述
    *@param tskDesc
    */
   public void setTskDesc(java.lang.String tskDesc){
      this.tskDesc = tskDesc;
   }

   /**
    *任务参数1
    *@return java.lang.String
    */
   public java.lang.String getTskParam1(){
      return tskParam1;
   }

   /**
    *任务参数1
    *@param tskParam1
    */
   public void setTskParam1(java.lang.String tskParam1){
      this.tskParam1 = tskParam1;
   }

   /**
    *任务参数2
    *@return java.lang.String
    */
   public java.lang.String getTskParam2(){
      return tskParam2;
   }

   /**
    *任务参数2
    *@param tskParam2
    */
   public void setTskParam2(java.lang.String tskParam2){
      this.tskParam2 = tskParam2;
   }

   /**
    *任务拥有者
    *@return java.lang.String
    */
   public java.lang.String getTskOwner(){
      return tskOwner;
   }

   /**
    *任务拥有者
    *@param tskOwner
    */
   public void setTskOwner(java.lang.String tskOwner){
      this.tskOwner = tskOwner;
   }

   /**
    *任务完成时间
    *@return java.lang.String
    */
   public java.lang.String getTskEndTms(){
      return tskEndTms;
   }

   /**
    *任务完成时间
    *@param tskEndTms
    */
   public void setTskEndTms(java.lang.String tskEndTms){
      this.tskEndTms = tskEndTms;
   }

   /**
    *任务运行类型，默认01
    *@return java.lang.String
    */
   public java.lang.String getTskRunClass(){
      return tskRunClass;
   }

   /**
    *任务运行类型，默认01
    *@param tskRunClass
    */
   public void setTskRunClass(java.lang.String tskRunClass){
      this.tskRunClass = tskRunClass;
   }

   /**
    *导出文件路径
    *@return java.lang.String
    */
   public java.lang.String getExpFileNm(){
      return expFileNm;
   }

   /**
    *导出文件路径
    *@param expFileNm
    */
   public void setExpFileNm(java.lang.String expFileNm){
      this.expFileNm = expFileNm;
   }

   /**
    *已导出记录笔数
    *@return java.lang.Integer
    */
   public java.lang.Integer getExpRcdNum(){
      return expRcdNum;
   }

   /**
    *已导出记录笔数
    *@param expRcdNum
    */
   public void setExpRcdNum(java.lang.Integer expRcdNum){
      this.expRcdNum = expRcdNum;
   }

   /**
    *导出记录总笔数
    *@return java.lang.Integer
    */
   public java.lang.Integer getExpRcdSumNum(){
      return expRcdSumNum;
   }

   /**
    *导出记录总笔数
    *@param expRcdSumNum
    */
   public void setExpRcdSumNum(java.lang.Integer expRcdSumNum){
      this.expRcdSumNum = expRcdSumNum;
   }

   /**
    *导出文件大小（以byte为单位）
    *@return java.lang.Integer
    */
   public java.lang.Integer getExpFileSize(){
      return expFileSize;
   }

   /**
    *导出文件大小（以byte为单位）
    *@param expFileSize
    */
   public void setExpFileSize(java.lang.Integer expFileSize){
      this.expFileSize = expFileSize;
   }

   /**
    *任务执行状态0:初始状态 1:准备执行 2:正在执行 3:任务完成 4执行失败
    *@return java.lang.String
    */
   public java.lang.String getTskStat(){
      return tskStat;
   }

   /**
    *任务执行状态0:初始状态 1:准备执行 2:正在执行 3:任务完成 4执行失败
    *@param tskStat
    */
   public void setTskStat(java.lang.String tskStat){
      this.tskStat = tskStat;
   }

   /**
    *运行失败原因
    *@return java.lang.String
    */
   public java.lang.String getTskErrMsg(){
      return tskErrMsg;
   }

   /**
    *运行失败原因
    *@param tskErrMsg
    */
   public void setTskErrMsg(java.lang.String tskErrMsg){
      this.tskErrMsg = tskErrMsg;
   }

}