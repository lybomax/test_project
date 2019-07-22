package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]序号控制表
 * 创建日期:2019-07-22 09:37:18
 */
@Table("ifs_ser_num")
public class IfsSerNum{

   /**
      *主键 
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *序号类型 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer valueNo;
   /**
      *序号索引 
      *数据类型：varchar(40) 
      *是否必填:false 
   **/
   private java.lang.String valueIndex;
   /**
      *当前值 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer valueCurr;
   /**
      *最大值 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer maxValue;
   /**
      *最小值 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer minValue;

  //get和set方法
   /**
    *主键
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *序号类型
    *@return java.lang.Integer
    */
   public java.lang.Integer getValueNo(){
      return valueNo;
   }

   /**
    *序号类型
    *@param valueNo
    */
   public void setValueNo(java.lang.Integer valueNo){
      this.valueNo = valueNo;
   }

   /**
    *序号索引
    *@return java.lang.String
    */
   public java.lang.String getValueIndex(){
      return valueIndex;
   }

   /**
    *序号索引
    *@param valueIndex
    */
   public void setValueIndex(java.lang.String valueIndex){
      this.valueIndex = valueIndex;
   }

   /**
    *当前值
    *@return java.lang.Integer
    */
   public java.lang.Integer getValueCurr(){
      return valueCurr;
   }

   /**
    *当前值
    *@param valueCurr
    */
   public void setValueCurr(java.lang.Integer valueCurr){
      this.valueCurr = valueCurr;
   }

   /**
    *最大值
    *@return java.lang.Integer
    */
   public java.lang.Integer getMaxValue(){
      return maxValue;
   }

   /**
    *最大值
    *@param maxValue
    */
   public void setMaxValue(java.lang.Integer maxValue){
      this.maxValue = maxValue;
   }

   /**
    *最小值
    *@return java.lang.Integer
    */
   public java.lang.Integer getMinValue(){
      return minValue;
   }

   /**
    *最小值
    *@param minValue
    */
   public void setMinValue(java.lang.Integer minValue){
      this.minValue = minValue;
   }

}