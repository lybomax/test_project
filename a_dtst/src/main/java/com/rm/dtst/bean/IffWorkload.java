package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:07
 */
@Table("iff_workload")
public class IffWorkload{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String staffid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String staffname;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer workload;
   /**
      *数据类型：bigint(20) 
      *是否必填:false 
   **/
   private java.lang.String doneworkcount;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStaffid(){
      return staffid;
   }

   /**
    *
    *@param staffid
    */
   public void setStaffid(java.lang.String staffid){
      this.staffid = staffid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStaffname(){
      return staffname;
   }

   /**
    *
    *@param staffname
    */
   public void setStaffname(java.lang.String staffname){
      this.staffname = staffname;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getWorkload(){
      return workload;
   }

   /**
    *
    *@param workload
    */
   public void setWorkload(java.lang.Integer workload){
      this.workload = workload;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDoneworkcount(){
      return doneworkcount;
   }

   /**
    *
    *@param doneworkcount
    */
   public void setDoneworkcount(java.lang.String doneworkcount){
      this.doneworkcount = doneworkcount;
   }

}