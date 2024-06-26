

package com.yami.shop.bean.enums;

/**
 *  @author 春江花朝秋月夜
 */
public enum MessageStatus {

	/**
	 * 小程序
	 */
	CANCEL(0),
	RELEASE(1);

	private Integer num;

	public Integer value() {
		return num;
	}

	MessageStatus(Integer num){
		this.num = num;
	}
}
