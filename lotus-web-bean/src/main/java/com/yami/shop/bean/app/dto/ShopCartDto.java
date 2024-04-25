

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
@Data
public class ShopCartDto implements Serializable {

	@Schema(description = "店铺ID" , required = true)
	private Long shopId;

	@Schema(description = "店铺名称" , required = true)
	private String shopName;

	@Schema(description = "购物车商品" , required = true)
	private List<ShopCartItemDiscountDto> shopCartItemDiscounts;


}
