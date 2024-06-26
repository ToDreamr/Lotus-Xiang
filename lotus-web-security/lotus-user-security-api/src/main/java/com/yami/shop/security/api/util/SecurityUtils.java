
package com.yami.shop.security.api.util;

import com.yami.shop.common.util.HttpContextUtils;
import com.yami.shop.security.api.model.LotusUser;
import com.yami.shop.security.common.bo.UserInfoInTokenBO;
import com.yami.shop.security.common.util.AuthUserContext;
import lombok.experimental.UtilityClass;

/**
 *  @author 春江花朝秋月夜
 */
@UtilityClass
public class SecurityUtils {

    private static final String USER_REQUEST = "/p/";

    /**
     * 获取用户
     */
    public LotusUser getUser() {
        if (!HttpContextUtils.getHttpServletRequest().getRequestURI().startsWith(USER_REQUEST)) {
            // 用户相关的请求，应该以/p开头！！！
            throw new RuntimeException("yami.user.request.error");
        }
        UserInfoInTokenBO userInfoInTokenBO = AuthUserContext.get();

        LotusUser lotusUser = new LotusUser();
        lotusUser.setUserId(userInfoInTokenBO.getUserId());
        lotusUser.setBizUserId(userInfoInTokenBO.getBizUserId());
        lotusUser.setEnabled(userInfoInTokenBO.getEnabled());
        lotusUser.setShopId(userInfoInTokenBO.getShopId());
        lotusUser.setStationId(userInfoInTokenBO.getOtherId());
        return lotusUser;
    }
}
