package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:56
 */
@Table("iff_tempaltevariable")
public class IffTempaltevariable{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String templatehandle;
   /**
      *使用字母+数字的命名规则，与JAVA变量命名一致 
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String name;
   /**
      *使用使用者可以理解变量含义进行命名 
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String displayname;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *1：INTEGER
            2：FLOAT
            3：LONG
            4：DOUBLE
            5：CHAR
            6：DATE
            7：BOOLEAN
            8：LIST
            9：MAP 
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer type;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHandle(){
      return handle;
   }

   /**
    *
    *@param handle
    */
   public void setHandle(java.lang.String handle){
      this.handle = handle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplatehandle(){
      return templatehandle;
   }

   /**
    *
    *@param templatehandle
    */
   public void setTemplatehandle(java.lang.String templatehandle){
      this.templatehandle = templatehandle;
   }

   /**
    *使用字母+数字的命名规则，与JAVA变量命名一致
    *@return java.lang.String
    */
   public java.lang.String getName(){
      return name;
   }

   /**
    *使用字母+数字的命名规则，与JAVA变量命名一致
    *@param name
    */
   public void setName(java.lang.String name){
      this.name = name;
   }

   /**
    *使用使用者可以理解变量含义进行命名
    *@return java.lang.String
    */
   public java.lang.String getDisplayname(){
      return displayname;
   }

   /**
    *使用使用者可以理解变量含义进行命名
    *@param displayname
    */
   public void setDisplayname(java.lang.String displayname){
      this.displayname = displayname;
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
    *1：INTEGER
            2：FLOAT
            3：LONG
            4：DOUBLE
            5：CHAR
            6：DATE
            7：BOOLEAN
            8：LIST
            9：MAP
    *@return java.lang.Integer
    */
   public java.lang.Integer getType(){
      return type;
   }

   /**
    *1：INTEGER
            2：FLOAT
            3：LONG
            4：DOUBLE
            5：CHAR
            6：DATE
            7：BOOLEAN
            8：LIST
            9：MAP
    *@param type
    */
   public void setType(java.lang.Integer type){
      this.type = type;
   }

}