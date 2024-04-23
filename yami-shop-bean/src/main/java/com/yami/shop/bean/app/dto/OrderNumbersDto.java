

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author 春江花朝秋月夜
 */
@Data
public class OrderNumbersDto {

	@Schema(description = "多个订单号拼接的字符串" ,required=true)
	private String orderNumbers;

	public OrderNumbersDto(String orderNumbers) {
		this.orderNumbers = orderNumbers;
	}
	public OrderNumbersDto(){}
}
