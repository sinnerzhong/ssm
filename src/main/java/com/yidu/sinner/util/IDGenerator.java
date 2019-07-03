package com.yidu.sinner.util;

import java.util.UUID;

/**
 * ID生成器
 * @author sinner
 *
 */
public class IDGenerator {

	public static void main(String[] args) {
		String uuid = UUID.randomUUID()
				.toString()
				.replace("-", "")
				.toUpperCase()
				.substring(0, 16);
		
		System.out.println(uuid);
	}
	
	/**
	 * 获得ID
	 * @return 返回不重复的16位字符串
	 */
	public static String getId(){
		return UUID.randomUUID()   //获取UUID
				.toString() //转为字符串
				.replace("-", "") //去除中间 -
				.toUpperCase() //转为大写
				.substring(0, 16); //取前面16个字符
	}
}
	