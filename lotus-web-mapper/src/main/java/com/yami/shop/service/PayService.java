

package com.yami.shop.service;

import com.yami.shop.bean.app.param.PayParam;
import com.yami.shop.bean.pay.PayInfoDto;

import java.util.List;

/**
 *  @author 春江花朝秋月夜 on 2018/09/15.
 */
public interface PayService {

    /**
     * 支付
     * @param userId
     * @param payParam
     * @return
     */
    PayInfoDto pay(String userId, PayParam payParam);

    /**
     * 支付成功
     * @param payNo
     * @param bizPayNo
     * @return
     */
    List<String> paySuccess(String payNo, String bizPayNo);

}
