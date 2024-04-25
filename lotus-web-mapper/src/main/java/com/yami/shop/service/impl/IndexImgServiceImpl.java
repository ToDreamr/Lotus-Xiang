

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.IndexImg;
import com.yami.shop.dao.IndexImgMapper;
import com.yami.shop.service.IndexImgService;

import java.util.List;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/11/26.
 */
@Service
public class IndexImgServiceImpl extends ServiceImpl<IndexImgMapper, IndexImg> implements IndexImgService {

    @Autowired
    private IndexImgMapper indexImgMapper;

	@Override
	public void deleteIndexImgByIds(Long[] ids) {
		indexImgMapper.deleteIndexImgByIds(ids);
	}

    @Override
    @Cacheable(cacheNames = "indexImg", key = "'indexImg'")
    public List<IndexImg> listIndexImg() {
        return indexImgMapper.listIndexImg();
    }

    @Override
    @CacheEvict(cacheNames = "indexImg", key = "'indexImg'")
    public void removeIndexImgCache() {
    }
}
