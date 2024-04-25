

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 *  @author 春江花朝秋月夜
 */
@Data
@Schema(description = "购物车合计")
public class ShopCartAmountDto {

    @Schema(description = "总额" )
    private Double totalMoney;

    @Schema(description = "总计" )
    private Double finalMoney;

    @Schema(description = "减额" )
    private Double subtractMoney;

    @Schema(description = "商品数量" )
    private Integer count;
}
