package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:25
 */
@Table("iff_category")
public class IffCategory{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String poid;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String upperpoid;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String code;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *CONFIG：配置
            LOG：日志 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String type;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPoid(){
      return poid;
   }

   /**
    *
    *@param poid
    */
   public void setPoid(java.lang.String poid){
      this.poid = poid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUpperpoid(){
      return upperpoid;
   }

   /**
    *
    *@param upperpoid
    */
   public void setUpperpoid(java.lang.String upperpoid){
      this.upperpoid = upperpoid;
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
    *CONFIG：配置
            LOG：日志
    *@return java.lang.String
    */
   public java.lang.String getType(){
      return type;
   }

   /**
    *CONFIG：配置
            LOG：日志
    *@param type
    */
   public void setType(java.lang.String type){
      this.type = type;
   }

}