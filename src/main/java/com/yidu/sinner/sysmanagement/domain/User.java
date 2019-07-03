package com.yidu.sinner.sysmanagement.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

public class User implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -137886601129187212L;
	/**
	 * 用户Id
	 */
	private String userId;
	/**
	 * 用户名
	 */
	@Length(min=6,max=18)
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 工资
	 */
	private BigDecimal salary;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 组织Id
	 */
	private String orgId;
	/**
	 * 电话
	 */
	private String telephone;
	/**
	 * 状态码
	 */
	private Integer status;
	/**
	 * 组织名
	 */
	private String orgName;
	private String description;
	/**
	 * 无参数的构造函数
	 */
	public User() {
	}

	/**
	 * 带参数的构造函数
	 * 
	 * @param userId
	 *            用户Id
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @param salary
	 *            工资
	 * @param birthday
	 *            出生日期
	 * @param gender
	 *            性别
	 * @param orgId
	 *            组织Id
	 * @param telephone
	 *            电话号码
	 * @param status
	 *            状态码
	 * @param orgName
	 *            组织名
	 */
	public User(String userId, String userName, String password, BigDecimal salary, Date birthday, String gender,
			String orgId, String telephone, Integer status, String orgName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.salary = salary;
		this.birthday = birthday;
		this.gender = gender;
		this.orgId = orgId;
		this.telephone = telephone;
		this.status = status;
		this.orgName = orgName;
	}

	/**
	 * 获得用户Id
	 * 
	 * @return 用户Id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 设置用户Id
	 * 
	 * @param userId
	 *            用户Id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 获得用户名
	 * 
	 * @return 用户名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置用户名
	 * 
	 * @param userName
	 *            用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获得密码
	 * 
	 * @return 密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置密码
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获得工资
	 * 
	 * @return 工资
	 */
	public BigDecimal getSalary() {
		return salary;
	}

	/**
	 * 设置工资
	 * 
	 * @param salary
	 *            工资
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	/**
	 * 获得出生日期
	 * 
	 * @return 出生日期
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 设置出生日期
	 * 
	 * @param birthday
	 *            出生日期
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 获得性别
	 * 
	 * @return 性别
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 设置性别
	 * 
	 * @param gender
	 *            性别
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 获得组织Id
	 * 
	 * @return 组织Id
	 */
	public String getOrgId() {
		return orgId;
	}

	/**
	 * 设置组织Id
	 * 
	 * @param orgId
	 *            组织Id
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 * 获得电话号码
	 * 
	 * @return 电话号码
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * 设置电话号码
	 * 
	 * @param telephone
	 *            电话号码
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * 获得状态码
	 * 
	 * @return 状态码
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置状态码
	 * 
	 * @param status
	 *            状态码
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获得组织名
	 * 
	 * @return 组织名
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * 设置组织名
	 * 
	 * @param orgName
	 *            组织名
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", salary=" + salary
				+ ", birthday=" + birthday + ", gender=" + gender + ", orgId=" + orgId + ", telephone=" + telephone
				+ ", status=" + status + ", orgName=" + orgName + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
