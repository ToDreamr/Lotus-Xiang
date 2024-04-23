

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.Transfee;
import com.yami.shop.dao.TransfeeMapper;
import com.yami.shop.service.TransfeeService;

/**
 *
 * @author 春江花朝秋月夜 on 2018/11/16.
 */
@Service
public class TransfeeServiceImpl extends ServiceImpl<TransfeeMapper, Transfee> implements TransfeeService {

    @Autowired
    private TransfeeMapper transfeeMapper;

}
