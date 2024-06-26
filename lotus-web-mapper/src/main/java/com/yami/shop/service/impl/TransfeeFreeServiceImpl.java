

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.TransfeeFree;
import com.yami.shop.dao.TransfeeFreeMapper;

import com.yami.shop.service.TransfeeFreeService;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/12/20.
 */
@Service
public class TransfeeFreeServiceImpl extends ServiceImpl<TransfeeFreeMapper, TransfeeFree> implements TransfeeFreeService {

    @Autowired
    private TransfeeFreeMapper transfeeFreeMapper;

}
