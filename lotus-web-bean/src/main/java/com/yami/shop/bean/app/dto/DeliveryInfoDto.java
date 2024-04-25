

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 *  @author 春江花朝秋月夜
 */
@Data
public class DeliveryInfoDto {

	@Schema(description = "详细信息" ,required=true)
	private String context;

	private String ftime;

	@Schema(description = "快递所在区域" ,required=true)
	private String location;

	@Schema(description = "物流更新时间" ,required=true)
	private String time;

}
