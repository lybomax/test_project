package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:文件资源表
 * 创建日期:2019-07-22 09:37:35
 */
@Table("sys_file_resource")
public class SysFileResource{

   /**
      *资源编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String resourceId;
   /**
      *资源大类 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String resourceCat;
   /**
      *资源子类 
      *数据类型：char(2) 
      *是否必填:true 
   **/
   private java.lang.String resourceSubCat;
   /**
      *关联流水号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String relLogId;
   /**
      *文件名称 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String fileName;
   /**
      *文件URI 
      *数据类型：varchar(512) 
      *是否必填:true 
   **/
   private java.lang.String fileUri;
   /**
      *文件大小 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer fileSize;
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
    *资源编号
    *@return java.lang.String
    */
   public java.lang.String getResourceId(){
      return resourceId;
   }

   /**
    *资源编号
    *@param resourceId
    */
   public void setResourceId(java.lang.String resourceId){
      this.resourceId = resourceId;
   }

   /**
    *资源大类
    *@return java.lang.String
    */
   public java.lang.String getResourceCat(){
      return resourceCat;
   }

   /**
    *资源大类
    *@param resourceCat
    */
   public void setResourceCat(java.lang.String resourceCat){
      this.resourceCat = resourceCat;
   }

   /**
    *资源子类
    *@return java.lang.String
    */
   public java.lang.String getResourceSubCat(){
      return resourceSubCat;
   }

   /**
    *资源子类
    *@param resourceSubCat
    */
   public void setResourceSubCat(java.lang.String resourceSubCat){
      this.resourceSubCat = resourceSubCat;
   }

   /**
    *关联流水号
    *@return java.lang.String
    */
   public java.lang.String getRelLogId(){
      return relLogId;
   }

   /**
    *关联流水号
    *@param relLogId
    */
   public void setRelLogId(java.lang.String relLogId){
      this.relLogId = relLogId;
   }

   /**
    *文件名称
    *@return java.lang.String
    */
   public java.lang.String getFileName(){
      return fileName;
   }

   /**
    *文件名称
    *@param fileName
    */
   public void setFileName(java.lang.String fileName){
      this.fileName = fileName;
   }

   /**
    *文件URI
    *@return java.lang.String
    */
   public java.lang.String getFileUri(){
      return fileUri;
   }

   /**
    *文件URI
    *@param fileUri
    */
   public void setFileUri(java.lang.String fileUri){
      this.fileUri = fileUri;
   }

   /**
    *文件大小
    *@return java.lang.Integer
    */
   public java.lang.Integer getFileSize(){
      return fileSize;
   }

   /**
    *文件大小
    *@param fileSize
    */
   public void setFileSize(java.lang.Integer fileSize){
      this.fileSize = fileSize;
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