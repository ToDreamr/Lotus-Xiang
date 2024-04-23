

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author 春江花朝秋月夜
 */
@Data
public class DeliveryDto {

	@Schema(description = "物流公司名称" ,required=true)
	private String companyName;
	
	@Schema(description = "物流公司官网" ,required=true)
	private String companyHomeUrl;
	
	@Schema(description = "物流订单号" ,required=true)
	private String dvyFlowId;
	
	@Schema(description = "查询出的物流信息" ,required=true)
	private List<DeliveryInfoDto> data;

}
