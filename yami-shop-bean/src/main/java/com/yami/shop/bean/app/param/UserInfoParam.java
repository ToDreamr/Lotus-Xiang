

package com.yami.shop.bean.app.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
/**
 * @author 春江花朝秋月夜
 */
@Data
@Schema(description = "设置用户信息")
public class UserInfoParam {

	@Schema(description = "用户昵称" )
	private String nickName;

	@Schema(description = "用户头像" )
	private String avatarUrl;

}
