

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.Sku;

import java.util.List;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/09/29.
 */
public interface SkuService extends IService<Sku> {

	/**
	 * 根据商品id获取商品中的sku列表（将会被缓存起来）
	 * @param prodId 商品id
	 * @return sku列表
	 */
	List<Sku> listByProdId(Long prodId);

	/**
	 * 根据skuId获取sku信息（将会被缓存起来）
	 * @param skuId
	 * @return
	 */
	Sku getSkuBySkuId(Long skuId);

	/**
	 * 根据商品id和skuId删除缓存
	 * @param skuId
	 * @param prodId
	 */
	void removeSkuCacheBySkuId(Long skuId,Long prodId);
}
