

package com.yami.shop.sys.service;


import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.sys.model.SysRole;

/**
 * 角色
 *  @author 春江花朝秋月夜
 */
public interface SysRoleService extends IService<SysRole> {

	/**
	 * 根据id批量删除
	 * @param roleIds
	 */
	void deleteBatch(Long[] roleIds);

	/**
	 * 保存角色 与 角色菜单关系
	 * @param role
	 */
	void saveRoleAndRoleMenu(SysRole role);

	/**
	 * 更新角色 与 角色菜单关系
	 * @param role
	 */
	void updateRoleAndRoleMenu(SysRole role);

	/**
	 * 根据用户ID，获取角色ID列表
	 * @param userId 用户id
	 * @return 角色id列表
	 */
	List<Long> listRoleIdByUserId(Long userId);

}
