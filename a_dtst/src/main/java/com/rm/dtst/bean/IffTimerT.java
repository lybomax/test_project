package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:00
 */
@Table("iff_timer_t")
public class IffTimerT{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String hisactins;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer cyltecount;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHisactins(){
      return hisactins;
   }

   /**
    *
    *@param hisactins
    */
   public void setHisactins(java.lang.String hisactins){
      this.hisactins = hisactins;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getCyltecount(){
      return cyltecount;
   }

   /**
    *
    *@param cyltecount
    */
   public void setCyltecount(java.lang.Integer cyltecount){
      this.cyltecount = cyltecount;
   }

}