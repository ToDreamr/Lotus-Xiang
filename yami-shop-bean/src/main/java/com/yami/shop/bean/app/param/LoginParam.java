

package com.yami.shop.bean.app.param;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author 春江花朝秋月夜
 */
@Schema(description = "登陆参数")
public class LoginParam {

	@Schema(description = "小程序登陆时返回的code(使用code登陆必填)" ,required=true)
	private String code;
	@Schema(description = "登陆时的用户名(账号密码登陆必填)" ,required=true)
	private String mobile;
	@Schema(description = "登陆时的密码(账号密码登陆必填)" ,required=true)
	private String password;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
