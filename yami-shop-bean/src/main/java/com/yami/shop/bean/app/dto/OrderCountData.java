

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author 春江花朝秋月夜
 */
@Data
@Schema(description = "我的订单数量")
public class OrderCountData {

    @Schema(description = "所有订单数量" )
    private Integer allCount;

    @Schema(description = "待付款" )
    private Integer unPay;

    @Schema(description = "待发货" )
    private Integer payed;

    @Schema(description = "待收货" )
    private Integer consignment;

    @Schema(description = "待评价" )
    private Integer confirm;

    @Schema(description = "成功" )
    private Integer success;

    @Schema(description = "失败" )
    private Integer close;


}
