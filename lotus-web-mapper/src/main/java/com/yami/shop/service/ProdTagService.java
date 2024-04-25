

package com.yami.shop.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.ProdTag;

import java.util.List;

/**
 * 商品分组标签
 *
 * @author hzm
 * @date 2019-04-18 10:48:44
 */
public interface ProdTagService extends IService<ProdTag> {
    /**
     * 获取商品分组标签列表
     * @return
     */
    List<ProdTag> listProdTag();

    /**
     * 删除商品分组标签缓存
     */
    void removeProdTag();
}
