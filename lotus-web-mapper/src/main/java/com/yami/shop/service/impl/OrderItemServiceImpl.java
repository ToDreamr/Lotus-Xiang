

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yami.shop.bean.model.OrderItem;
import com.yami.shop.dao.OrderItemMapper;
import com.yami.shop.service.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/09/15.
 */
@Service
@AllArgsConstructor
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

    private final OrderItemMapper orderItemMapper;

	@Override
	@Cacheable(cacheNames = "OrderItems", key = "#orderNumber")
	public List<OrderItem> getOrderItemsByOrderNumber(String orderNumber) {
		return orderItemMapper.listByOrderNumber(orderNumber);
	}


}
