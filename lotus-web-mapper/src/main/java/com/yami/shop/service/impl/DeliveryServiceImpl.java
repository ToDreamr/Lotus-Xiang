

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.Delivery;
import com.yami.shop.dao.DeliveryMapper;

import com.yami.shop.service.DeliveryService;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/11/26.
 */
@Service
public class DeliveryServiceImpl extends ServiceImpl<DeliveryMapper, Delivery> implements DeliveryService {

    @Autowired
    private DeliveryMapper deliveryMapper;

}
