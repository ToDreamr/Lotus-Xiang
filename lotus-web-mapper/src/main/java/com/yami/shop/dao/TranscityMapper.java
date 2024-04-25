

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.Transcity;
import com.yami.shop.bean.model.TranscityFree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
public interface TranscityMapper extends BaseMapper<Transcity> {
	/**
	 * 插入运费项中的城市
	 * @param transcities
	 */
	void insertTranscities(@Param("transcities") List<Transcity> transcities);

	/**
	 * 插入运费
	 * @param transcityFrees
	 */
	void insertTranscityFrees(@Param("transcityFrees") List<TranscityFree> transcityFrees);

	/**
	 * 根据运费id删除运费项
	 * @param transfeeIds
	 */
	void deleteBatchByTransfeeIds(@Param("transfeeIds") List<Long> transfeeIds);

	/**
	 * 根据运费金额项id删除运费金额
	 * @param transfeeFreeIds
	 */
	void deleteBatchByTransfeeFreeIds(@Param("transfeeFreeIds") List<Long> transfeeFreeIds);

}
