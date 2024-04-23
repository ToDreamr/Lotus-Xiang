

package com.yami.shop.api.controller;

import com.google.common.collect.Maps;
import com.yami.shop.bean.app.param.SendSmsParam;
import com.yami.shop.bean.enums.SmsType;
import com.yami.shop.security.api.util.SecurityUtils;
import com.yami.shop.service.SmsLogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import com.yami.shop.common.response.ServerResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 春江花朝秋月夜
 */
@RestController
@RequestMapping("/p/sms")
@Tag(name = "发送验证码接口")
public class SmsController {

	@Autowired
	private SmsLogService smsLogService;
    /**
     * 发送验证码接口
     */
    @PostMapping("/send")
    @Operation(summary = "发送验证码" , description = "用户的发送验证码")
    public ServerResponseEntity<Void> audit(@RequestBody SendSmsParam sendSmsParam) {
		String userId = SecurityUtils.getUser().getUserId();
		smsLogService.sendSms(SmsType.VALID, userId, sendSmsParam.getMobile(),Maps.newHashMap());

		return ServerResponseEntity.success();
    }
}
