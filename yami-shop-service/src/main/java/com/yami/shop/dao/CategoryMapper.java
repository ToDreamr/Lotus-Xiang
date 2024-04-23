

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.Category;

import java.util.List;

/**
 * @author 春江花朝秋月夜
 */
public interface CategoryMapper extends BaseMapper<Category> {

	/**
	 * 根据父级id获取分类列表
	 *
	 * @param parentId
	 * @return
	 */
	List<Category> listByParentId(Long parentId);

	/**
	 * 根据店铺id获取分类列表
	 *
	 * @param shopId
	 * @return
	 */
	List<Category> tableCategory(Long shopId);
}
