

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.OrderItem;

import java.util.List;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/09/15.
 */
public interface OrderItemService extends IService<OrderItem> {

	/**
	 * 根据订单编号获取订单项
	 * @param orderNumber
	 * @return
	 */
	List<OrderItem> getOrderItemsByOrderNumber(String orderNumber);

}
