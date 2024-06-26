

package com.yami.shop.bean;

import java.util.ArrayList;
import java.util.List;

import com.yami.shop.bean.bo.SmsInfoBo;

import cn.hutool.core.collection.CollectionUtil;

/**
 *  @author 春江花朝秋月夜
 */
public class SmsInfoContext {

	/** The request holder. */
	private static ThreadLocal<List<SmsInfoBo>> smsInfoHolder = new ThreadLocal<List<SmsInfoBo>>();


	public static List<SmsInfoBo> get(){
		List<SmsInfoBo> list = smsInfoHolder.get();
		if (CollectionUtil.isEmpty(list)) {
			return new ArrayList<>();
		}
		return smsInfoHolder.get();
	}

	public static void set(List<SmsInfoBo> smsInfoBos){
		 smsInfoHolder.set(smsInfoBos);
	}

	public static void put(SmsInfoBo smsInfoBo){
		List<SmsInfoBo> smsInfoBos = smsInfoHolder.get();
		if (CollectionUtil.isEmpty(smsInfoBos)) {
			smsInfoBos = new ArrayList<>();
		}
		smsInfoBos.add(smsInfoBo);
		smsInfoHolder.set(smsInfoBos);
	}

	public static void clean() {
		if (smsInfoHolder.get() != null) {
			smsInfoHolder.remove();
		}
	}
}
