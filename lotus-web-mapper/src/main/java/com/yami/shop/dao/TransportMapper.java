

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.TransfeeFree;
import com.yami.shop.bean.model.Transport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
public interface TransportMapper extends BaseMapper<Transport> {
	/**
	 * 根据运费模板id获取运费项和运费城市
	 * @param id
	 * @return
	 */
	Transport getTransportAndTransfeeAndTranscity(@Param("id") Long id);

	/**
	 * 根据运费模板id删除运费模板
	 * @param ids
	 */
	void deleteTransports(@Param("ids") Long[] ids);

	/**
	 * 运费模板id获取包邮运费项和城市
	 * @param transportId
	 * @return
	 */
	List<TransfeeFree> getTransfeeFreeAndTranscityFreeByTransportId(@Param("transportId") Long transportId);

}
