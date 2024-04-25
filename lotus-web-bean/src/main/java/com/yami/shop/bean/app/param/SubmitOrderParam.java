

package com.yami.shop.bean.app.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
@Data
@Schema(description = "提交订单参数")
public class SubmitOrderParam {
	@Schema(description = "每个店铺提交的订单信息" ,required=true)
	private List<OrderShopParam> orderShopParam;
}
