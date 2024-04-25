

package com.yami.shop.bean.app.param;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *  @author 春江花朝秋月夜
 */
@Schema(description = "支付参数")
public class PayParam {

	/**
	  * 订单号
	 */
	@NotBlank(message="订单号不能为空")
	@Schema(description = "订单号" ,required=true)
	private String orderNumbers;

	/**
	 * 支付方式
	 */
	@NotNull(message="支付方式不能为空")
	@Schema(description = "支付方式 (1:微信支付 2:支付宝)" ,required=true)
	private Integer payType;

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public String getOrderNumbers() {
		return orderNumbers;
	}

	public void setOrderNumbers(String orderNumbers) {
		this.orderNumbers = orderNumbers;
	}

}
