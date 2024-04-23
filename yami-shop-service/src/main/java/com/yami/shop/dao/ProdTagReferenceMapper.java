

package com.yami.shop.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.ProdTagReference;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分组标签引用
 *
 * @author hzm
 * @date 2019-04-18 16:28:01
 */
public interface ProdTagReferenceMapper extends BaseMapper<ProdTagReference> {
    /**
     * 插入标签
     * @param shopId
     * @param prodId
     * @param tagList
     */
    void insertBatch(@Param("shopId") Long shopId, @Param("prodId") Long prodId, @Param("tagList") List<Long> tagList);

    /**
     * 根据属性获取标签id列表
     * @param prodId
     * @return
     */
    List<Long> listTagIdByProdId(@Param("prodId") Long prodId);

}
