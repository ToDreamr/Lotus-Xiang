

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author 春江花朝秋月夜
 */
public interface UserMapper extends BaseMapper<User> {
	/**
	 * 根据用户邮箱获取用户信息
	 * @param userMail
	 * @return
	 */
	User getUserByUserMail(@Param("userMail") String userMail);

	/**
	 * 根据用户名称获取一个用户信息
	 * @param userName
	 * @return
	 */
	User selectOneByUserName(@Param("userName") String userName);
}
