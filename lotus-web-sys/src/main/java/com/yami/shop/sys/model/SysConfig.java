

package com.yami.shop.sys.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;

/**
 * 系统配置信息
 * @author lanhai
 */
@Data
@TableName("tz_sys_config")
public class SysConfig {
	@TableId
	private Long id;

	@NotBlank(message="参数名不能为空")
	private String paramKey;

	@NotBlank(message="参数值不能为空")
	private String paramValue;

	private String remark;

}
