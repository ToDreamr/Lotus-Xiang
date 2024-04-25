

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
public interface BrandMapper extends BaseMapper<Brand> {

	/**
	 * 根据品牌名称获取品牌
	 * @param brandName 品牌名称
	 * @return 品牌信息
	 */
	Brand getByBrandName(String brandName);

	/**
	 * 根据分类id获取品牌列表
	 * @param categoryId 分类id
	 * @return 品牌列表
	 */
	List<Brand> listByCategoryId(@Param("categoryId")Long categoryId);
}
