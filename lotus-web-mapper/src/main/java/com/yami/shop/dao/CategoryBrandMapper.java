

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.CategoryBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
public interface CategoryBrandMapper extends BaseMapper<CategoryBrand> {

	/**
	 * 增加分类品牌
	 * @param categoryId 分类id
	 * @param brandIds 品牌id列表
	 */
	void insertCategoryBrand(@Param("categoryId") Long categoryId, @Param("brandIds") List<Long> brandIds);

	/**
	 * 删除分类
	 * @param categoryId 分类id
	 */
	void deleteByCategoryId(Long categoryId);

	/**
	 * 根据品牌名称删除分类品牌
	 * @param brandId 品牌id
	 */
	void deleteByBrandId(Long brandId);
}
