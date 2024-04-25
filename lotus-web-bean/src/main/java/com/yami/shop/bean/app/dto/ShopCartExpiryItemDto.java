

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
@Data
@Schema(description = "购物车失效商品对象")
public class ShopCartExpiryItemDto {
    @Schema(description = "店铺ID" , required = true)
    private Long shopId;

    @Schema(description = "店铺名称" , required = true)
    private String shopName;

    @Schema(description = "商品项" , required = true)
    private List<ShopCartItemDto> shopCartItemDtoList;

}
