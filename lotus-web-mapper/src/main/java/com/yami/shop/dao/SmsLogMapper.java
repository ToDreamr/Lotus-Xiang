

package com.yami.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.yami.shop.bean.model.SmsLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 *  @author 春江花朝秋月夜
 */
public interface SmsLogMapper extends BaseMapper<SmsLog> {
	/**
	 * 根据手机号和短信类型失效短信
	 * @param mobile
	 * @param type
	 */
	void invalidSmsByMobileAndType(@Param("mobile") String mobile, @Param("type") Integer type);
}
