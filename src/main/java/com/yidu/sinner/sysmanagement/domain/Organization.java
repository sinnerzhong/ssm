package com.yidu.sinner.sysmanagement.domain;

import java.io.Serializable;

public class Organization implements Serializable {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 组织id
	 */
	private String orgId;
	/**
	 * 父组织id
	 */
	private String parentId;
	/**
	 * 组织类型 参考辅助字典表
	 */
	private String type;
	/**
	 * 负责人id参考职员表
	 */
	private String empId;
	/**
	 * 组织名
	 */
	private String orgName;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 序号
	 */
	private String orderBy;
	/**
	 * 所在地
	 */
	private String location;
	/**
	 * 作废标记
	 */
	private Integer cancel;
	/**
	 * 辅助字典名
	 */
	private String subsetName;
	/**
	 * 负责人名
	 */
	private String staffName;

	public Organization() {

	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCancel() {
		return cancel;
	}

	public void setCancel(Integer cancel) {
		this.cancel = cancel;
	}

	public String getSubsetName() {
		return subsetName;
	}

	public void setSubsetName(String subsetName) {
		this.subsetName = subsetName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Organization(String orgId, String parentId, String type, String empId, String orgName, String description,
			String orderBy, String location, Integer cancel, String subsetName, String staffName) {
		super();
		this.orgId = orgId;
		this.parentId = parentId;
		this.type = type;
		this.empId = empId;
		this.orgName = orgName;
		this.description = description;
		this.orderBy = orderBy;
		this.location = location;
		this.cancel = cancel;
		this.subsetName = subsetName;
		this.staffName = staffName;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", parentId=" + parentId + ", type=" + type + ", empId=" + empId
				+ ", orgName=" + orgName + ", description=" + description + ", orderBy=" + orderBy + ", location="
				+ location + ", cancel=" + cancel + ", subsetName=" + subsetName + ", staffName=" + staffName + "]";
	}

}