
package com.yami.shop.security.common.bo;


import lombok.Data;

/**
 * token信息，该信息存在redis中
 *
 * @author 菠萝凤梨
 * @date 2022/3/25 17:33
 */
@Data
public class TokenInfoBO {

    /**
     * 保存在token信息里面的用户信息
     */
    private UserInfoInTokenBO userInfoInToken;

    private String accessToken;

    private String refreshToken;

    /**
     * 在多少秒后过期
     */
    private Integer expiresIn;

}
