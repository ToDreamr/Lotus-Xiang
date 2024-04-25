

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.PickAddr;
import com.yami.shop.dao.PickAddrMapper;
import com.yami.shop.service.PickAddrService;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/10/17.
 */
@Service
public class PickAddrServiceImpl extends ServiceImpl<PickAddrMapper, PickAddr> implements PickAddrService {

    @Autowired
    private PickAddrMapper pickAddrMapper;


}
