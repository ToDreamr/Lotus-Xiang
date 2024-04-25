
package com.yami.shop.security.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;

/**
 * 刷新token
 *
 * @author 菠萝凤梨
 * @date 2022/3/25 17:33
 */
public class RefreshTokenDTO {

    /**
     * refreshToken
     */
    @NotBlank(message = "refreshToken不能为空")
    @Schema(description = "refreshToken" , required = true)
    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "RefreshTokenDTO{" + "refreshToken='" + refreshToken + '\'' + '}';
    }

}
