

package com.yami.shop.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.sys.model.SysUserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户与角色对应关系
 * @author lanhai
 */
public interface SysUserRoleMapper  extends BaseMapper<SysUserRole> {

	/**
	 * 根据角色ID数组，批量删除
	 * @param roleIds
	 * @return
	 */
	int deleteBatch(@Param("roleIds") Long[] roleIds);

	/**
	 * 根据用户id删除用户与角色关系
	 * @param userId
	 */
	void deleteByUserId(Long userId);

	/**
	 * 根据用户id 批量添加用户角色关系
	 * @param userId
	 * @param roleIdList
	 */
	void insertUserAndUserRole(@Param("userId") Long userId, @Param("roleIdList") List<Long> roleIdList);
}
