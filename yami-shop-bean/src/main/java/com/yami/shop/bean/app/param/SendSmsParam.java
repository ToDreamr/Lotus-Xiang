

package com.yami.shop.bean.app.param;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.Pattern;

/**
 * @author 春江花朝秋月夜
 */
@Schema(description = "发送验证码参数")
public class SendSmsParam {

	@Schema(description = "手机号" )
	@Pattern(regexp="1[0-9]{10}",message = "请输入正确的手机号")
	private String mobile;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


}
