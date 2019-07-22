package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:36
 */
@Table("iff_j_processexception")
public class IffJProcessexception{

   /**
      *参数编号 
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String packageid;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hproci;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hmprocl;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hacti;
   /**
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String expcode;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String expmessage;
   /**
      *0：未解决
            1：已解决 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer status;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String nodeid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String nodename;
   /**
      *1:开始节点
            2:结束节点
            3:人工节点
            4:自动节点
            5:并行分支节点
            6:并行汇聚节点
            7:决策分支节点
            8:决策汇聚节点
            9:等待节点
            10:定时节点
            11:抄送节点
            12:子流程节点
            13:虚拟节点 
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer nodekind;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String templateid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String templatename;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer templateversion;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String subject;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date createddatetime;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String resolverid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String resolvername;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date resolvedtime;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer exceptionpos;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer executionstatus;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String executionid;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer executionstate;
   /**
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String operationname;

  //get和set方法
   /**
    *参数编号
    *@return java.lang.String
    */
   public java.lang.String getDbid(){
      return dbid;
   }

   /**
    *参数编号
    *@param dbid
    */
   public void setDbid(java.lang.String dbid){
      this.dbid = dbid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPackageid(){
      return packageid;
   }

   /**
    *
    *@param packageid
    */
   public void setPackageid(java.lang.String packageid){
      this.packageid = packageid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHproci(){
      return hproci;
   }

   /**
    *
    *@param hproci
    */
   public void setHproci(java.lang.String hproci){
      this.hproci = hproci;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHmprocl(){
      return hmprocl;
   }

   /**
    *
    *@param hmprocl
    */
   public void setHmprocl(java.lang.String hmprocl){
      this.hmprocl = hmprocl;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHacti(){
      return hacti;
   }

   /**
    *
    *@param hacti
    */
   public void setHacti(java.lang.String hacti){
      this.hacti = hacti;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExpcode(){
      return expcode;
   }

   /**
    *
    *@param expcode
    */
   public void setExpcode(java.lang.String expcode){
      this.expcode = expcode;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExpmessage(){
      return expmessage;
   }

   /**
    *
    *@param expmessage
    */
   public void setExpmessage(java.lang.String expmessage){
      this.expmessage = expmessage;
   }

   /**
    *0：未解决
            1：已解决
    *@return java.lang.Integer
    */
   public java.lang.Integer getStatus(){
      return status;
   }

   /**
    *0：未解决
            1：已解决
    *@param status
    */
   public void setStatus(java.lang.Integer status){
      this.status = status;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNodeid(){
      return nodeid;
   }

   /**
    *
    *@param nodeid
    */
   public void setNodeid(java.lang.String nodeid){
      this.nodeid = nodeid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNodename(){
      return nodename;
   }

   /**
    *
    *@param nodename
    */
   public void setNodename(java.lang.String nodename){
      this.nodename = nodename;
   }

   /**
    *1:开始节点
            2:结束节点
            3:人工节点
            4:自动节点
            5:并行分支节点
            6:并行汇聚节点
            7:决策分支节点
            8:决策汇聚节点
            9:等待节点
            10:定时节点
            11:抄送节点
            12:子流程节点
            13:虚拟节点
    *@return java.lang.Integer
    */
   public java.lang.Integer getNodekind(){
      return nodekind;
   }

   /**
    *1:开始节点
            2:结束节点
            3:人工节点
            4:自动节点
            5:并行分支节点
            6:并行汇聚节点
            7:决策分支节点
            8:决策汇聚节点
            9:等待节点
            10:定时节点
            11:抄送节点
            12:子流程节点
            13:虚拟节点
    *@param nodekind
    */
   public void setNodekind(java.lang.Integer nodekind){
      this.nodekind = nodekind;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplateid(){
      return templateid;
   }

   /**
    *
    *@param templateid
    */
   public void setTemplateid(java.lang.String templateid){
      this.templateid = templateid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplatename(){
      return templatename;
   }

   /**
    *
    *@param templatename
    */
   public void setTemplatename(java.lang.String templatename){
      this.templatename = templatename;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getTemplateversion(){
      return templateversion;
   }

   /**
    *
    *@param templateversion
    */
   public void setTemplateversion(java.lang.Integer templateversion){
      this.templateversion = templateversion;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSubject(){
      return subject;
   }

   /**
    *
    *@param subject
    */
   public void setSubject(java.lang.String subject){
      this.subject = subject;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getCreateddatetime(){
      return createddatetime;
   }

   /**
    *
    *@param createddatetime
    */
   public void setCreateddatetime(java.util.Date createddatetime){
      this.createddatetime = createddatetime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getResolverid(){
      return resolverid;
   }

   /**
    *
    *@param resolverid
    */
   public void setResolverid(java.lang.String resolverid){
      this.resolverid = resolverid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getResolvername(){
      return resolvername;
   }

   /**
    *
    *@param resolvername
    */
   public void setResolvername(java.lang.String resolvername){
      this.resolvername = resolvername;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getResolvedtime(){
      return resolvedtime;
   }

   /**
    *
    *@param resolvedtime
    */
   public void setResolvedtime(java.util.Date resolvedtime){
      this.resolvedtime = resolvedtime;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getExceptionpos(){
      return exceptionpos;
   }

   /**
    *
    *@param exceptionpos
    */
   public void setExceptionpos(java.lang.Integer exceptionpos){
      this.exceptionpos = exceptionpos;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getExecutionstatus(){
      return executionstatus;
   }

   /**
    *
    *@param executionstatus
    */
   public void setExecutionstatus(java.lang.Integer executionstatus){
      this.executionstatus = executionstatus;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExecutionid(){
      return executionid;
   }

   /**
    *
    *@param executionid
    */
   public void setExecutionid(java.lang.String executionid){
      this.executionid = executionid;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getExecutionstate(){
      return executionstate;
   }

   /**
    *
    *@param executionstate
    */
   public void setExecutionstate(java.lang.Integer executionstate){
      this.executionstate = executionstate;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOperationname(){
      return operationname;
   }

   /**
    *
    *@param operationname
    */
   public void setOperationname(java.lang.String operationname){
      this.operationname = operationname;
   }

}