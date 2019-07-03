package com.yidu.sinner.sysmanagement.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.sinner.sysmanagement.biz.UserBiz;
import com.yidu.sinner.sysmanagement.dao.UserDao;
import com.yidu.sinner.sysmanagement.domain.Organization;
import com.yidu.sinner.sysmanagement.domain.User;
import com.yidu.sinner.util.IDGenerator;

@Service
public class UserBizImpl implements UserBiz{
	/**
	 * 保留对UserMapper的依赖
	 */
	@Autowired
	private UserDao userDao;
	
	/**
	 * 获得数据访问层中的方法
	 * @param userDao 数据访问层
	 */
	public void setUserMapper(UserDao userMapper) {
		this.userDao = userMapper;
	}
    
	/**
	 * 添加
	 * @param user   用户
	 * @return  如果注册成功返回true，反之返回false
	 */
	public boolean addUserU(User user) {
		user.setUserId(IDGenerator.getId());
		user.setStatus(1);
		//调用数据访问层中的添加方法进行判断
		if(1==userDao.addUserU(user)) {
			return true;
		}
		return false;
	}
    
	/**
	 * 删除用户
	 * @param userId   用户Id
	 * @return   如果删除成功返回true，反之返回false
	 */
	public boolean deleteUserU(String userId) {
		//调用数据访问层中的删除方法进行判断
		if(1==userDao.deleteUserU(userId)) {
			return true;
		}
		return false;
	}
    
	/**
	 * 分页查询
	 * @param paramMap  参数集合
	 * @return   用户集合List<User>
	 */
	public List<User> userPageQuery(Map<String,Object> paramMap) {	
		//返回数据访问层中的分页查询的方法
		return userDao.userPageQuery(paramMap);
	}
    
	/**
	 * 查询总记录数
	 * @param paramMap  参数集合
	 * @return  返回总记录数
	 */
	public int userCountPageQuery(Map<String, Object> paramMap) {
		//返回数据访问层中的分查询总记录数的方法
		return userDao.userCountPageQuery(paramMap);
	}

	/**
	 * 获得组织名
	 * @return  用户集合
	 */
	public List<Organization> findAllOrganizationQuery() {
		//返回数据访问层中的查询所有组织的方法
		return userDao.findAllOrganizationQuery();
	}
      
	/**
	 * 恢复用户
	 * @param userId  用户Id
	 * @return   如果恢复成功返回1，反之返回0
	 */
	public boolean regainUserU(String userId) {
		//调用数据访问层中的恢复方法进行判断
		if(1==userDao.regainUserU(userId)) {
			return true;
		}
		return false;
	}

	public List<User> findAllUserQuery() {
		return userDao.findAllUserQuery();
	}

	public User findUserByIdQuery(String userId) {
		return userDao.findUserByIdQuery(userId);
	}

	public boolean updateUserU(User user) {
		return userDao.updateUserU(user) == 1;
	}

}