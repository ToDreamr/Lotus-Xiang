
package com.yami.shop.security.admin.util;

import com.yami.shop.security.admin.model.LotusSysUser;
import com.yami.shop.security.common.bo.UserInfoInTokenBO;
import com.yami.shop.security.common.util.AuthUserContext;
import lombok.experimental.UtilityClass;

/**
 *
 *  @author 春江花朝秋月夜
 */
@UtilityClass
public class SecurityUtils {
    /**
     * 获取用户
     */
    public LotusSysUser getSysUser() {
        UserInfoInTokenBO userInfoInTokenBO = AuthUserContext.get();

        LotusSysUser details = new LotusSysUser();
        details.setUserId(Long.valueOf(userInfoInTokenBO.getUserId()));
        details.setEnabled(userInfoInTokenBO.getEnabled());
        details.setUsername(userInfoInTokenBO.getNickName());
        details.setAuthorities(userInfoInTokenBO.getPerms());
        details.setShopId(userInfoInTokenBO.getShopId());
        return details;
    }
}

