package com.yidu.sinner.sysmanagement.dao;

import java.util.List;
import java.util.Map;

import com.yidu.sinner.sysmanagement.domain.Organization;
import com.yidu.sinner.sysmanagement.domain.User;

public interface UserDao {
	
	public abstract List<User> findAllUserQuery();
	
	public abstract User findUserByIdQuery(String userId);
	/**
	 * 分页查询
	 * @return 用户集合List<User>
	 */
	public abstract List<User> userPageQuery(Map<String,Object> paramMap);
	/**
	 * 添加用户
	 * @param user  用户 
	 * @return  如果添加成功返回1，反之返回0
	 */
	public abstract int addUserU(User user);
	
	public abstract int updateUserU(User user);
	
	
	/**
	 * 删除用户
	 * @param userId   用户Id
	 * @return  如果删除成功返回1，反之返回0
	 */
	public abstract int deleteUserU(String userId);
	/**
	 * 查询总记录数
	 * @param paramMap  参数集合
	 * @return  返回总记录数
	 */
	public abstract int userCountPageQuery(Map<String,Object> paramMap);
	
	/**
	 * 查询所有组织
	 * @return  组织集合
	 */
	public abstract List<Organization> findAllOrganizationQuery();

	/**
	 * 恢复用户
	 * @param userId  用户Id
	 * @return   如果恢复成功返回1，反之返回0
	 */
	public abstract int  regainUserU(String userId);
}
