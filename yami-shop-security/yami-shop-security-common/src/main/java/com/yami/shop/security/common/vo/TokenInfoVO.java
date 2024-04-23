
package com.yami.shop.security.common.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * token信息，该信息用户返回给前端，前端请求携带accessToken进行用户校验
 *
 * @author FrozenWatermelon
 * @date 2020/7/2
 */
@Data
public class TokenInfoVO {

    @Schema(description = "accessToken" )
    private String accessToken;

    @Schema(description = "refreshToken" )
    private String refreshToken;

    @Schema(description = "在多少秒后过期" )
    private Integer expiresIn;
}
