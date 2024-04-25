

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.app.dto.ShopCartItemDto;
import com.yami.shop.bean.app.param.ShopCartParam;
import com.yami.shop.bean.model.Basket;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *  @author 春江花朝秋月夜
 */
public interface BasketMapper extends BaseMapper<Basket> {

    /**
     * 获取购物项
     * @param userId 用户id
     * @return 购物项列表
     */
    List<ShopCartItemDto> getShopCartItems(@Param("userId") String userId);

    /**
     * 根据购物车id列表和用户id删除购物车
     * @param userId 用户id
     * @param basketIds 购物车id列表
     */
    void deleteShopCartItemsByBasketIds(@Param("userId") String userId, @Param("basketIds") List<Long> basketIds);

    /**
     * 删除所有购物车
     * @param userId 用户id
     */
    void deleteAllShopCartItems(@Param("userId") String userId);

    /**
     * 获取失效的购物项
     * @param userId 用户id
     * @return 失效的购物项
     */
    List<ShopCartItemDto> getShopCartExpiryItems(@Param("userId") String userId);

    /**
     * 删除失效的购物项
     * @param userId 用户id
     */
    void cleanExpiryProdList(@Param("userId") String userId);

    /**
     * 更新购物车满减活动id
     * @param userId 用户id
     * @param basketIdShopCartParamMap 购物项map
     */
    void updateDiscountItemId(@Param("userId")String userId, @Param("basketIdShopCartParamMap") Map<Long, ShopCartParam> basketIdShopCartParamMap);

    /**
     * 根据商品id获取用户id列表
     * @param prodId
     * @return
     */
    List<String> listUserIdByProdId(@Param("prodId")Long prodId);

}
