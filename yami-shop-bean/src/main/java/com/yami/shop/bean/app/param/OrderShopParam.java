

package com.yami.shop.bean.app.param;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author 春江花朝秋月夜
 */
public class OrderShopParam {

	/** 店铺ID **/
	@Schema(description = "店铺id" ,required=true)
	private Long shopId;

	/**
	 * 订单备注信息
	 */
	@Schema(description = "订单备注信息" ,required=true)
	private String remarks;

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
