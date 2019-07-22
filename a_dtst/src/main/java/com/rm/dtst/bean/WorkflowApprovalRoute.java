package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:审批路线表
 * 创建日期:2019-07-22 09:37:50
 */
@Table("workflow_approval_route")
public class WorkflowApprovalRoute{

   /**
      *站点ID 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String routeId;
   /**
      *配置表id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String templateRouteId;
   /**
      *站点名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String routeName;
   /**
      *站点类型：
            01-普通节点
            02-会签节点
            03-等待节点 
      *数据类型：varchar(2) 
      *是否必填:true 
   **/
   private java.lang.String routeType;
   /**
      *站点参与者类型：
            01-分配到人
            02-分配到角色
            03-分配到机构+角色 
      *数据类型：varchar(2) 
      *是否必填:true 
   **/
   private java.lang.String participantType;
   /**
      *站点参与机构 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String participantBrcode;
   /**
      *站点参与角色 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer participantRole;
   /**
      *站点参与人 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String participantStaff;
   /**
      *会签策略:
            01-按完成条件百分比
            02-按完成条件个数 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String signingStrategy;
   /**
      *会签策略值 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer signingStrategyValue;
   /**
      *本站点退回策略：01-上站点，02-首站点，03-首节点 
      *数据类型：varchar(2) 
      *是否必填:true 
   **/
   private java.lang.String gobackStrategy;
   /**
      *是否个性化站点：
            0-否
            1-是 
      *数据类型：varchar(1) 
      *是否必填:false 
   **/
   private java.lang.String personaliseFlag;
   /**
      *节点URL 
      *数据类型：varchar(300) 
      *是否必填:false 
   **/
   private java.lang.String routeUrl;
   /**
      *上一站点ID 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String upRouteId;
   /**
      *是否金额策略：
            0-否
            1-是 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String amtStrategyFlag;
   /**
      *单笔限额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal singleLimit;
   /**
      *是否可删除：
            0-否
            1-是 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String deleteFlag;
   /**
      *是否审批路线首站点：
            0-否
            1-是 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String firstRouteFlag;
   /**
      *创建时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *更新程序 
      *数据类型：varchar(128) 
      *是否必填:true 
   **/
   private java.lang.String updateProgram;

  //get和set方法
   /**
    *站点ID
    *@return java.lang.String
    */
   public java.lang.String getRouteId(){
      return routeId;
   }

   /**
    *站点ID
    *@param routeId
    */
   public void setRouteId(java.lang.String routeId){
      this.routeId = routeId;
   }

   /**
    *配置表id
    *@return java.lang.String
    */
   public java.lang.String getTemplateRouteId(){
      return templateRouteId;
   }

   /**
    *配置表id
    *@param templateRouteId
    */
   public void setTemplateRouteId(java.lang.String templateRouteId){
      this.templateRouteId = templateRouteId;
   }

   /**
    *站点名称
    *@return java.lang.String
    */
   public java.lang.String getRouteName(){
      return routeName;
   }

   /**
    *站点名称
    *@param routeName
    */
   public void setRouteName(java.lang.String routeName){
      this.routeName = routeName;
   }

   /**
    *站点类型：
            01-普通节点
            02-会签节点
            03-等待节点
    *@return java.lang.String
    */
   public java.lang.String getRouteType(){
      return routeType;
   }

   /**
    *站点类型：
            01-普通节点
            02-会签节点
            03-等待节点
    *@param routeType
    */
   public void setRouteType(java.lang.String routeType){
      this.routeType = routeType;
   }

   /**
    *站点参与者类型：
            01-分配到人
            02-分配到角色
            03-分配到机构+角色
    *@return java.lang.String
    */
   public java.lang.String getParticipantType(){
      return participantType;
   }

   /**
    *站点参与者类型：
            01-分配到人
            02-分配到角色
            03-分配到机构+角色
    *@param participantType
    */
   public void setParticipantType(java.lang.String participantType){
      this.participantType = participantType;
   }

   /**
    *站点参与机构
    *@return java.lang.String
    */
   public java.lang.String getParticipantBrcode(){
      return participantBrcode;
   }

   /**
    *站点参与机构
    *@param participantBrcode
    */
   public void setParticipantBrcode(java.lang.String participantBrcode){
      this.participantBrcode = participantBrcode;
   }

   /**
    *站点参与角色
    *@return java.lang.Integer
    */
   public java.lang.Integer getParticipantRole(){
      return participantRole;
   }

   /**
    *站点参与角色
    *@param participantRole
    */
   public void setParticipantRole(java.lang.Integer participantRole){
      this.participantRole = participantRole;
   }

   /**
    *站点参与人
    *@return java.lang.String
    */
   public java.lang.String getParticipantStaff(){
      return participantStaff;
   }

   /**
    *站点参与人
    *@param participantStaff
    */
   public void setParticipantStaff(java.lang.String participantStaff){
      this.participantStaff = participantStaff;
   }

   /**
    *会签策略:
            01-按完成条件百分比
            02-按完成条件个数
    *@return java.lang.String
    */
   public java.lang.String getSigningStrategy(){
      return signingStrategy;
   }

   /**
    *会签策略:
            01-按完成条件百分比
            02-按完成条件个数
    *@param signingStrategy
    */
   public void setSigningStrategy(java.lang.String signingStrategy){
      this.signingStrategy = signingStrategy;
   }

   /**
    *会签策略值
    *@return java.lang.Integer
    */
   public java.lang.Integer getSigningStrategyValue(){
      return signingStrategyValue;
   }

   /**
    *会签策略值
    *@param signingStrategyValue
    */
   public void setSigningStrategyValue(java.lang.Integer signingStrategyValue){
      this.signingStrategyValue = signingStrategyValue;
   }

   /**
    *本站点退回策略：01-上站点，02-首站点，03-首节点
    *@return java.lang.String
    */
   public java.lang.String getGobackStrategy(){
      return gobackStrategy;
   }

   /**
    *本站点退回策略：01-上站点，02-首站点，03-首节点
    *@param gobackStrategy
    */
   public void setGobackStrategy(java.lang.String gobackStrategy){
      this.gobackStrategy = gobackStrategy;
   }

   /**
    *是否个性化站点：
            0-否
            1-是
    *@return java.lang.String
    */
   public java.lang.String getPersonaliseFlag(){
      return personaliseFlag;
   }

   /**
    *是否个性化站点：
            0-否
            1-是
    *@param personaliseFlag
    */
   public void setPersonaliseFlag(java.lang.String personaliseFlag){
      this.personaliseFlag = personaliseFlag;
   }

   /**
    *节点URL
    *@return java.lang.String
    */
   public java.lang.String getRouteUrl(){
      return routeUrl;
   }

   /**
    *节点URL
    *@param routeUrl
    */
   public void setRouteUrl(java.lang.String routeUrl){
      this.routeUrl = routeUrl;
   }

   /**
    *上一站点ID
    *@return java.lang.String
    */
   public java.lang.String getUpRouteId(){
      return upRouteId;
   }

   /**
    *上一站点ID
    *@param upRouteId
    */
   public void setUpRouteId(java.lang.String upRouteId){
      this.upRouteId = upRouteId;
   }

   /**
    *是否金额策略：
            0-否
            1-是
    *@return java.lang.String
    */
   public java.lang.String getAmtStrategyFlag(){
      return amtStrategyFlag;
   }

   /**
    *是否金额策略：
            0-否
            1-是
    *@param amtStrategyFlag
    */
   public void setAmtStrategyFlag(java.lang.String amtStrategyFlag){
      this.amtStrategyFlag = amtStrategyFlag;
   }

   /**
    *单笔限额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getSingleLimit(){
      return singleLimit;
   }

   /**
    *单笔限额
    *@param singleLimit
    */
   public void setSingleLimit(java.math.BigDecimal singleLimit){
      this.singleLimit = singleLimit;
   }

   /**
    *是否可删除：
            0-否
            1-是
    *@return java.lang.String
    */
   public java.lang.String getDeleteFlag(){
      return deleteFlag;
   }

   /**
    *是否可删除：
            0-否
            1-是
    *@param deleteFlag
    */
   public void setDeleteFlag(java.lang.String deleteFlag){
      this.deleteFlag = deleteFlag;
   }

   /**
    *是否审批路线首站点：
            0-否
            1-是
    *@return java.lang.String
    */
   public java.lang.String getFirstRouteFlag(){
      return firstRouteFlag;
   }

   /**
    *是否审批路线首站点：
            0-否
            1-是
    *@param firstRouteFlag
    */
   public void setFirstRouteFlag(java.lang.String firstRouteFlag){
      this.firstRouteFlag = firstRouteFlag;
   }

   /**
    *创建时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *创建时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
      this.updateTime = updateTime;
   }

   /**
    *更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProgram(){
      return updateProgram;
   }

   /**
    *更新程序
    *@param updateProgram
    */
   public void setUpdateProgram(java.lang.String updateProgram){
      this.updateProgram = updateProgram;
   }

}