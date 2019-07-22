package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:39
 */
@Table("iff_j_property")
public class IffJProperty{

   /**
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String key;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer version;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String value;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getKey(){
      return key;
   }

   /**
    *
    *@param key
    */
   public void setKey(java.lang.String key){
      this.key = key;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getVersion(){
      return version;
   }

   /**
    *
    *@param version
    */
   public void setVersion(java.lang.Integer version){
      this.version = version;
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

}