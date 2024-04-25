

package com.yami.shop.api.controller;

import com.yami.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import com.yami.shop.common.response.ServerResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yami.shop.bean.app.dto.DeliveryDto;
import com.yami.shop.bean.model.Delivery;
import com.yami.shop.bean.model.Order;
import com.yami.shop.common.util.Json;
import com.yami.shop.service.DeliveryService;

import cn.hutool.http.HttpUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

/**
 *  @author 春江花朝秋月夜
 */
@RestController
@RequestMapping("/delivery")
@Tag(name = "查看物流接口")
public class DeliveryController {

	@Autowired
	private DeliveryService deliveryService;
	@Autowired
	private OrderService orderService;

    /**
     * 查看物流接口
     */
    @GetMapping("/check")
    @Operation(summary = "查看物流" , description = "根据订单号查看物流")
    @Parameter(name = "orderNumber", description = "订单号" , required = true)
    public ServerResponseEntity<DeliveryDto> checkDelivery(String orderNumber) {

    	Order order = orderService.getOrderByOrderNumber(orderNumber);
    	Delivery delivery = deliveryService.getById(order.getDvyId());
    	String url = delivery.getQueryUrl().replace("{dvyFlowId}", order.getDvyFlowId());
    	String deliveryJson = HttpUtil.get(url);

    	DeliveryDto deliveryDto = Json.parseObject(deliveryJson, DeliveryDto.class);
    	deliveryDto.setDvyFlowId(order.getDvyFlowId());
    	deliveryDto.setCompanyHomeUrl(delivery.getCompanyHomeUrl());
    	deliveryDto.setCompanyName(delivery.getDvyName());
        return ServerResponseEntity.success(deliveryDto);
    }
}
