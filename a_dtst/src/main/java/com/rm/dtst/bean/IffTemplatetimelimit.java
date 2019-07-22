package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:59
 */
@Table("iff_templatetimelimit")
public class IffTemplatetimelimit{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String poid;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String templatehandle;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String timingscheme;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer consumeday;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer consumehour;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer consumeminute;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer consumesecond;
   /**
      *1:SPRING BEAN
            2:普通JAVA类 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String adaptertype;
   /**
      *当适配器类型为“0”时，名称为JAVA完整类名（包+名称）
            当适配器类型为“1”时，名称为SPRING配置的BEAN ID 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String adaptername;

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
    *
    *@return java.lang.String
    */
   public java.lang.String getTimingscheme(){
      return timingscheme;
   }

   /**
    *
    *@param timingscheme
    */
   public void setTimingscheme(java.lang.String timingscheme){
      this.timingscheme = timingscheme;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getConsumeday(){
      return consumeday;
   }

   /**
    *
    *@param consumeday
    */
   public void setConsumeday(java.lang.Integer consumeday){
      this.consumeday = consumeday;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getConsumehour(){
      return consumehour;
   }

   /**
    *
    *@param consumehour
    */
   public void setConsumehour(java.lang.Integer consumehour){
      this.consumehour = consumehour;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getConsumeminute(){
      return consumeminute;
   }

   /**
    *
    *@param consumeminute
    */
   public void setConsumeminute(java.lang.Integer consumeminute){
      this.consumeminute = consumeminute;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getConsumesecond(){
      return consumesecond;
   }

   /**
    *
    *@param consumesecond
    */
   public void setConsumesecond(java.lang.Integer consumesecond){
      this.consumesecond = consumesecond;
   }

   /**
    *1:SPRING BEAN
            2:普通JAVA类
    *@return java.lang.String
    */
   public java.lang.String getAdaptertype(){
      return adaptertype;
   }

   /**
    *1:SPRING BEAN
            2:普通JAVA类
    *@param adaptertype
    */
   public void setAdaptertype(java.lang.String adaptertype){
      this.adaptertype = adaptertype;
   }

   /**
    *当适配器类型为“0”时，名称为JAVA完整类名（包+名称）
            当适配器类型为“1”时，名称为SPRING配置的BEAN ID
    *@return java.lang.String
    */
   public java.lang.String getAdaptername(){
      return adaptername;
   }

   /**
    *当适配器类型为“0”时，名称为JAVA完整类名（包+名称）
            当适配器类型为“1”时，名称为SPRING配置的BEAN ID
    *@param adaptername
    */
   public void setAdaptername(java.lang.String adaptername){
      this.adaptername = adaptername;
   }

}