

package com.yami.shop.bean.param;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;

/**
 * @author 春江花朝秋月夜
 */
public class DeliveryOrderParam {

	@NotBlank(message="订单号不能为空")
	@Schema(description = "订单号" ,required=true)
	private String orderNumber;

	@NotBlank(message="快递公司id不能为空")
	@Schema(description = "快递公司" ,required=true)
	private Long dvyId;

	@NotBlank(message="物流单号不能为空")
	@Schema(description = "物流单号" ,required=true)
	private String dvyFlowId;


	public Long getDvyId() {
		return dvyId;
	}

	public void setDvyId(Long dvyId) {
		this.dvyId = dvyId;
	}

	public String getDvyFlowId() {
		return dvyFlowId;
	}

	public void setDvyFlowId(String dvyFlowId) {
		this.dvyFlowId = dvyFlowId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

}
