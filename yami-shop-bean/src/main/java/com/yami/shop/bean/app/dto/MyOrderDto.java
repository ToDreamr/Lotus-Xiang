

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author 春江花朝秋月夜
 */
@Data
@Schema(description = "我的订单")
public class MyOrderDto {
	
	@Schema(description = "订单项" ,required=true)
	private List<MyOrderItemDto> orderItemDtos;
	
	@Schema(description = "订单号" ,required=true)
	private String orderNumber;
	
	@Schema(description = "总价" ,required=true)
	private Double actualTotal;
	
	@Schema(description = "订单状态" ,required=true)
	private Integer status;
	
}
