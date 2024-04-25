

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.enums.SmsType;
import com.yami.shop.bean.model.SmsLog;

import java.util.Map;

/**
 *
 *  @author 春江花朝秋月夜 on 2018/11/29.
 */
public interface SmsLogService extends IService<SmsLog> {
	/**
	 * 发送短信
	 * @param smsType 短信类型
	 * @param userId 用户id
	 * @param mobile 手机号
	 * @param params 内容
	 */
	void sendSms(SmsType smsType, String userId, String mobile, Map<String, String> params);
}
