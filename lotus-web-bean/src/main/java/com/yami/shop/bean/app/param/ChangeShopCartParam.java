

package com.yami.shop.bean.app.param;

import jakarta.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 *  @author 春江花朝秋月夜
 */
@Data
public class ChangeShopCartParam {

    @Schema(description = "购物车ID" , required = true)
    private Long basketId;

    @NotNull(message = "商品ID不能为空")
    @Schema(description = "商品ID" , required = true)
    private Long prodId;

    @NotNull(message = "skuId不能为空")
    @Schema(description = "skuId" , required = true)
    private Long skuId;

    @NotNull(message = "店铺ID不能为空")
    @Schema(description = "店铺ID" , required = true)
    private Long shopId;

    @NotNull(message = "商品个数不能为空")
    @Schema(description = "商品个数" , required = true)
    private Integer count;

    @Schema(description = "分销推广人卡号" )
    private String distributionCardNo;
}
