

package com.yami.shop.common.exception;

import com.yami.shop.common.response.ResponseEnum;
import com.yami.shop.common.response.ServerResponseEntity;
import lombok.Getter;

/**
 * @author 春江花朝秋月夜
 */
@Getter
public class YamiShopBindException extends RuntimeException{

	/**
	 *
	 */
	private static final long serialVersionUID = -4137688758944857209L;

	/**
	 * http状态码
	 */
	private String code;

	private Object object;

	private ServerResponseEntity<?> serverResponseEntity;

	public YamiShopBindException(ResponseEnum responseEnum) {
		super(responseEnum.getMsg());
		this.code = responseEnum.value();
	}
	/**
	 * @param responseEnum
	 */
	public YamiShopBindException(ResponseEnum responseEnum, String msg) {
		super(msg);
		this.code = responseEnum.value();
	}

	public YamiShopBindException(ServerResponseEntity<?> serverResponseEntity) {
		this.serverResponseEntity = serverResponseEntity;
	}


	public YamiShopBindException(String msg) {
		super(msg);
		this.code = ResponseEnum.SHOW_FAIL.value();
	}

	public YamiShopBindException(String msg, Object object) {
		super(msg);
		this.code = ResponseEnum.SHOW_FAIL.value();
		this.object = object;
	}

}
