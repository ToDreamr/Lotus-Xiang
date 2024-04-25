

package com.yami.shop.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.yami.shop.common.response.ServerResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yami.shop.bean.model.Delivery;
import com.yami.shop.service.DeliveryService;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/11/26.
 */
@RestController
@RequestMapping("/admin/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

	/**
	 * 分页获取
	 */
    @GetMapping("/list")
	public ServerResponseEntity<List<Delivery>> page(){

		List<Delivery> list = deliveryService.list();
		return ServerResponseEntity.success(list);
	}

}
