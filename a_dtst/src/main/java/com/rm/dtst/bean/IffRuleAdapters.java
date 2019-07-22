package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:55
 */
@Table("iff_rule_adapters")
public class IffRuleAdapters{

   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   @Id
   private java.lang.Integer id;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer parentId;
   /**
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String code;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(2000) 
      *是否必填:false 
   **/
   private java.lang.String value;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer priority;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer systemFlag;
   /**
      *数据类型：varchar(4000) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer activeFlag;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer customTableValueId;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String createUserId;
   /**
      *数据类型：timestamp 
      *是否必填:true 
   **/
   private java.lang.String createDate;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String modifiedUserId;
   /**
      *数据类型：timestamp 
      *是否必填:false 
   **/
   private java.lang.String modifiedDate;

  //get和set方法
   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getId(){
      return id;
   }

   /**
    *
    *@param id
    */
   public void setId(java.lang.Integer id){
      this.id = id;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getParentId(){
      return parentId;
   }

   /**
    *
    *@param parentId
    */
   public void setParentId(java.lang.Integer parentId){
      this.parentId = parentId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCode(){
      return code;
   }

   /**
    *
    *@param code
    */
   public void setCode(java.lang.String code){
      this.code = code;
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
   public java.lang.String getValue(){
      return value;
   }

   /**
    *
    *@param value
    */
   public void setValue(java.lang.String value){
      this.value = value;
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
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getSystemFlag(){
      return systemFlag;
   }

   /**
    *
    *@param systemFlag
    */
   public void setSystemFlag(java.lang.Integer systemFlag){
      this.systemFlag = systemFlag;
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
   public java.lang.Integer getActiveFlag(){
      return activeFlag;
   }

   /**
    *
    *@param activeFlag
    */
   public void setActiveFlag(java.lang.Integer activeFlag){
      this.activeFlag = activeFlag;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getCustomTableValueId(){
      return customTableValueId;
   }

   /**
    *
    *@param customTableValueId
    */
   public void setCustomTableValueId(java.lang.Integer customTableValueId){
      this.customTableValueId = customTableValueId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCreateUserId(){
      return createUserId;
   }

   /**
    *
    *@param createUserId
    */
   public void setCreateUserId(java.lang.String createUserId){
      this.createUserId = createUserId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCreateDate(){
      return createDate;
   }

   /**
    *
    *@param createDate
    */
   public void setCreateDate(java.lang.String createDate){
      this.createDate = createDate;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getModifiedUserId(){
      return modifiedUserId;
   }

   /**
    *
    *@param modifiedUserId
    */
   public void setModifiedUserId(java.lang.String modifiedUserId){
      this.modifiedUserId = modifiedUserId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getModifiedDate(){
      return modifiedDate;
   }

   /**
    *
    *@param modifiedDate
    */
   public void setModifiedDate(java.lang.String modifiedDate){
      this.modifiedDate = modifiedDate;
   }

}