package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:账户信息
 * 创建日期:2019-07-22 09:35:59
 */
@Table("acct_cust_acct_info")
public class AcctCustAcctInfo{

   /**
      *主键UUID 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *账户类型：1-结算账户;2-回款账户;3-保证金账户 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String acctType;
   /**
      *币种 
      *数据类型：char(3) 
      *是否必填:false 
   **/
   private java.lang.String curcd;
   /**
      *账号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String acctNo;
   /**
      *经办机构 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String branchId;
   /**
      *账户名称 
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String acctName;
   /**
      *账户金额/余额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal acct;
   /**
      *创建日期 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String crtTime;
   /**
      *账户状态：0-无效、1-有效 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *客户经理 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String mgrno;
   /**
      *开户行 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String bank;
   /**
      *建立时间 
      *数据类型：char(17) 
      *是否必填:true 
   **/
   private java.lang.String createTime;
   /**
      *最后更新时间 
      *数据类型：char(17) 
      *是否必填:true 
   **/
   private java.lang.String updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

  //get和set方法
   /**
    *主键UUID
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键UUID
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *客户号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *客户号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *账户类型：1-结算账户;2-回款账户;3-保证金账户
    *@return java.lang.String
    */
   public java.lang.String getAcctType(){
      return acctType;
   }

   /**
    *账户类型：1-结算账户;2-回款账户;3-保证金账户
    *@param acctType
    */
   public void setAcctType(java.lang.String acctType){
      this.acctType = acctType;
   }

   /**
    *币种
    *@return java.lang.String
    */
   public java.lang.String getCurcd(){
      return curcd;
   }

   /**
    *币种
    *@param curcd
    */
   public void setCurcd(java.lang.String curcd){
      this.curcd = curcd;
   }

   /**
    *账号
    *@return java.lang.String
    */
   public java.lang.String getAcctNo(){
      return acctNo;
   }

   /**
    *账号
    *@param acctNo
    */
   public void setAcctNo(java.lang.String acctNo){
      this.acctNo = acctNo;
   }

   /**
    *经办机构
    *@return java.lang.String
    */
   public java.lang.String getBranchId(){
      return branchId;
   }

   /**
    *经办机构
    *@param branchId
    */
   public void setBranchId(java.lang.String branchId){
      this.branchId = branchId;
   }

   /**
    *账户名称
    *@return java.lang.String
    */
   public java.lang.String getAcctName(){
      return acctName;
   }

   /**
    *账户名称
    *@param acctName
    */
   public void setAcctName(java.lang.String acctName){
      this.acctName = acctName;
   }

   /**
    *账户金额/余额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAcct(){
      return acct;
   }

   /**
    *账户金额/余额
    *@param acct
    */
   public void setAcct(java.math.BigDecimal acct){
      this.acct = acct;
   }

   /**
    *创建日期
    *@return java.lang.String
    */
   public java.lang.String getCrtTime(){
      return crtTime;
   }

   /**
    *创建日期
    *@param crtTime
    */
   public void setCrtTime(java.lang.String crtTime){
      this.crtTime = crtTime;
   }

   /**
    *账户状态：0-无效、1-有效
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *账户状态：0-无效、1-有效
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *客户经理
    *@return java.lang.String
    */
   public java.lang.String getMgrno(){
      return mgrno;
   }

   /**
    *客户经理
    *@param mgrno
    */
   public void setMgrno(java.lang.String mgrno){
      this.mgrno = mgrno;
   }

   /**
    *开户行
    *@return java.lang.String
    */
   public java.lang.String getBank(){
      return bank;
   }

   /**
    *开户行
    *@param bank
    */
   public void setBank(java.lang.String bank){
      this.bank = bank;
   }

   /**
    *建立时间
    *@return java.lang.String
    */
   public java.lang.String getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.lang.String createTime){
      this.createTime = createTime;
   }

   /**
    *最后更新时间
    *@return java.lang.String
    */
   public java.lang.String getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.lang.String updateTime){
      this.updateTime = updateTime;
   }

   /**
    *最后更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProg(){
      return updateProg;
   }

   /**
    *最后更新程序
    *@param updateProg
    */
   public void setUpdateProg(java.lang.String updateProg){
      this.updateProg = updateProg;
   }

}