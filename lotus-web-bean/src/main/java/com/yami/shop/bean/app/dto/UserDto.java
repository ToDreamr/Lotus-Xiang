

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 *  @author 春江花朝秋月夜
 */
public class UserDto {


	@Schema(description = "用户状态：0禁用 1正常" ,required=true)
	private Integer status;
	@Schema(description = "token" ,required=true)
	private String token;

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
