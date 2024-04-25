

package com.yami.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.yami.shop.bean.model.UserAddr;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 *  @author 春江花朝秋月夜
 */
public interface UserAddrMapper extends BaseMapper<UserAddr> {
	/**
	 * 根据用户id获取默认地址
	 * @param userId
	 * @return
	 */
	UserAddr getDefaultUserAddr(@Param("userId") String userId);

	/**
	 * 移除用户默认地址
	 * @param userId
	 */
	void removeDefaultUserAddr(@Param("userId") String userId);

	/**
	 * 将地址设置为默认地址
	 * @param addrId
	 * @param userId
	 * @return
	 */
	int setDefaultUserAddr(@Param("addrId") Long addrId, @Param("userId") String userId);

	/**
	 * 根据用户id和地址id获取地址
	 * @param userId
	 * @param addrId
	 * @return
	 */
	UserAddr getUserAddrByUserIdAndAddrId(@Param("userId") String userId, @Param("addrId") Long addrId);
}
