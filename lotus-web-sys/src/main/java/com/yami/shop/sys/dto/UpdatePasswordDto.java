

package com.yami.shop.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
/**
 *  @author 春江花朝秋月夜
 */
@Data
@Schema(description = "更新密码参数")
public class UpdatePasswordDto {

	@NotBlank(message="旧密码不能为空")
	@Size(max = 50)
	@Schema(description = "旧密码" ,required=true)
	private String password;

	@NotBlank(message="新密码不能为空")
	@Size(max = 50)
	@Schema(description = "新密码" ,required=true)
	private String newPassword;
}
