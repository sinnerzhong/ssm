package com.yidu.sinner.sysmanagement.biz;

import java.util.List;
import java.util.Map;

import com.yidu.sinner.sysmanagement.domain.Organization;
import com.yidu.sinner.sysmanagement.domain.User;

public interface UserBiz {
	
	public abstract List<User> findAllUserQuery();
	
	public User findUserByIdQuery(String userId);
	
	public abstract List<User> userPageQuery(Map<String,Object> paramMap);

	public abstract boolean addUserU(User user);
	
	public abstract boolean updateUserU(User user);
	
	public abstract boolean deleteUserU(String userId);
	
	public abstract int userCountPageQuery(Map<String,Object> paramMap);
	
	public abstract List<Organization> findAllOrganizationQuery();

	/**
	 * 恢复用户
	 * @param userId   用户Id
	 * @return   如果恢复成功返回true，反之返回false
	 */
	public abstract boolean regainUserU(String userId);
}
