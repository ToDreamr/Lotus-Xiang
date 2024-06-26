

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.TranscityFree;
import com.yami.shop.dao.TranscityFreeMapper;

import com.yami.shop.service.TranscityFreeService;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/12/20.
 */
@Service
public class TranscityFreeServiceImpl extends ServiceImpl<TranscityFreeMapper, TranscityFree> implements TranscityFreeService {

    @Autowired
    private TranscityFreeMapper transcityFreeMapper;

}
