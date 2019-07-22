package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:区域表
 * 创建日期:2019-07-22 09:36:01
 */
@Table("cfg_area")
public class CfgArea{

   /**
      *区域代码 
      *数据类型：varchar(6) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String areaCode;
   /**
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String areaName;
   /**
      *区域层级
            1-省
            2-市县
            3-区 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String areaLevel;
   /**
      *上级区域代码 
      *数据类型：varchar(6) 
      *是否必填:false 
   **/
   private java.lang.String parentAreaCode;

  //get和set方法
   /**
    *区域代码
    *@return java.lang.String
    */
   public java.lang.String getAreaCode(){
      return areaCode;
   }

   /**
    *区域代码
    *@param areaCode
    */
   public void setAreaCode(java.lang.String areaCode){
      this.areaCode = areaCode;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getAreaName(){
      return areaName;
   }

   /**
    *
    *@param areaName
    */
   public void setAreaName(java.lang.String areaName){
      this.areaName = areaName;
   }

   /**
    *区域层级
            1-省
            2-市县
            3-区
    *@return java.lang.String
    */
   public java.lang.String getAreaLevel(){
      return areaLevel;
   }

   /**
    *区域层级
            1-省
            2-市县
            3-区
    *@param areaLevel
    */
   public void setAreaLevel(java.lang.String areaLevel){
      this.areaLevel = areaLevel;
   }

   /**
    *上级区域代码
    *@return java.lang.String
    */
   public java.lang.String getParentAreaCode(){
      return parentAreaCode;
   }

   /**
    *上级区域代码
    *@param parentAreaCode
    */
   public void setParentAreaCode(java.lang.String parentAreaCode){
      this.parentAreaCode = parentAreaCode;
   }

}