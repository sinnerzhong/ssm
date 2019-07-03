package com.yidu.sinner.sysmanagement.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yidu.sinner.sysmanagement.biz.UserBiz;
import com.yidu.sinner.sysmanagement.domain.User;

@Controller
@RequestMapping("/sysmanagement")
public class UserController {
	
	@Autowired
	private UserBiz userBiz;
	
	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	/**
	 * 获得所有用户
	 * @param requestMap
	 * @return
	 */
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public String findAllUser(Map<String,Object> requestMap){
		List<User> userList = userBiz.findAllUserQuery();
		requestMap.put("userList", userList);
		return "sysmanagement/user/listUser";
	}
	
	/**
	 * 获取修改用户页面
	 * @return
	 */
	@RequestMapping(value="/user/{userId}",method=RequestMethod.GET)
	public String getUpdateEmp(@PathVariable(name="userId") String userId,Map<String,User> requestMap){
		System.out.println(userId);
		User user = userBiz.findUserByIdQuery(userId);
		System.out.println(user);
		//请求域中存入一个用户对象,用于回显数据
		requestMap.put("user", user);
		return "sysmanagement/user/updateUser";
	}
	
	/**
	 * 修改用户
	 * @return
	 */
	@RequestMapping(value="/user",method = RequestMethod.PUT)
	public String updateUser(User user){
		userBiz.updateUserU(user);
		//重定向到这个控制器中的获取所有用户方法，再转发到userList.jsp
		return "redirect:/sysmanagement/users";
	}
	
	/**
	 * 删除用户(逻辑删除)
	 * @return
	 */
	@RequestMapping(value="/user/{userId}",method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable(name="userId") String userId){
		System.out.println("deleteUser: " +  userId);
		//这里是逻辑删除，将用户的状态改掉
		userBiz.deleteUserU(userId);
		//重定向到这个控制器中的获取所有用户方法，再转发到userList.jsp
		return "redirect:/sysmanagement/users";
	}
	
	/**
	 * 获取添加用户页面
	 * @return
	 */
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String getAddUser(Map<String,User> requestMap){
		requestMap.put("user", new User());
		return "sysmanagement/user/addUser";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String addUser(@Valid User user,BindingResult result,Map<String,Object> reqScopeMap){
		if(result.getErrorCount() > 0 ){  //转换、校验失败
			//为SpringMVC的表单标签准备数据
			reqScopeMap.put("user", user);
			return "sysmanagement/user/addUser";
		}else{
			userBiz.addUserU(user);
			//重定向到这个控制器中的获取所有用户方法，再转发到userList.jsp
			return "redirect:/sysmanagement/users";
		}
	}
	
	
	
	/**
	 * 查询所有用户(带分页)
	 * @return
	 */
	public String pageQueryAllUser(){
		return "success";
	}
	
	/**
	 * 条件查询用户(带分页)
	 * @return
	 */
	public String pageQueryUserWithCateria(){
		return "success";
	}
	
	/**
	 * 添加用户
	 * @return
	 */
	public String addUser(){
		return "";
	}
	
	
	



	
	
}
