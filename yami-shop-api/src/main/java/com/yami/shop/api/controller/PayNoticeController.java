

package com.yami.shop.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Hidden;

/**
 * @author 春江花朝秋月夜
 */
@Hidden
@RestController
@RequestMapping("/notice/pay")
@AllArgsConstructor
public class PayNoticeController {
//模拟支付不需要回调
//    /**
//     * 小程序支付
//     */
//    private final WxPayService wxMiniPayService;
//
//    private final PayService payService;
//
//
//    @RequestMapping("/order")
//    public ServerResponseEntity<Void> submit(@RequestBody String xmlData) throws WxPayException {
//        WxPayOrderNotifyResult parseOrderNotifyResult = wxMiniPayService.parseOrderNotifyResult(xmlData);
//
//        String payNo = parseOrderNotifyResult.getOutTradeNo();
//        String bizPayNo = parseOrderNotifyResult.getTransactionId();
//
//        // 根据内部订单号更新order settlement
//        payService.paySuccess(payNo, bizPayNo);
//
//
//        return ServerResponseEntity.success();
//    }
}
