package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:财务报表参数扩展表
 * 创建日期:2019-07-19 17:33:16
 */
@Table("user_finrep_param_ext")
public class UserFinrepParamExt{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String baseId;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String stateCode;
   /**
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String stateName;
   /**
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String showName;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer excelLine;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer ecxelColumn;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String stateFlag;
   /**
      *数据类型：varchar(300) 
      *是否必填:false 
   **/
   private java.lang.String showControl;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBaseId(){
      return baseId;
   }

   /**
    *
    *@param baseId
    */
   public void setBaseId(java.lang.String baseId){
      this.baseId = baseId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateCode(){
      return stateCode;
   }

   /**
    *
    *@param stateCode
    */
   public void setStateCode(java.lang.String stateCode){
      this.stateCode = stateCode;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateName(){
      return stateName;
   }

   /**
    *
    *@param stateName
    */
   public void setStateName(java.lang.String stateName){
      this.stateName = stateName;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getShowName(){
      return showName;
   }

   /**
    *
    *@param showName
    */
   public void setShowName(java.lang.String showName){
      this.showName = showName;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getExcelLine(){
      return excelLine;
   }

   /**
    *
    *@param excelLine
    */
   public void setExcelLine(java.lang.Integer excelLine){
      this.excelLine = excelLine;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getEcxelColumn(){
      return ecxelColumn;
   }

   /**
    *
    *@param ecxelColumn
    */
   public void setEcxelColumn(java.lang.Integer ecxelColumn){
      this.ecxelColumn = ecxelColumn;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateFlag(){
      return stateFlag;
   }

   /**
    *
    *@param stateFlag
    */
   public void setStateFlag(java.lang.String stateFlag){
      this.stateFlag = stateFlag;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getShowControl(){
      return showControl;
   }

   /**
    *
    *@param showControl
    */
   public void setShowControl(java.lang.String showControl){
      this.showControl = showControl;
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