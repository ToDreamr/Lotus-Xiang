
package com.yami.shop.security.api.model;

import lombok.Data;

/**
 * 用户详细信息
 * @author 春江花朝秋月夜
 */
@Data
public class YamiUser {

    /**
     * 用户ID
     */
    private String userId;

    private String bizUserId;

    private Boolean enabled;

    /**
     * 自提点Id
     */
    private Long stationId;

    /**
     * 店铺Id
     */
    private Long shopId;
}
