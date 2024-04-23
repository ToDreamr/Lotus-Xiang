

package com.yami.shop.common.bean;

import lombok.Data;

/**
 * 本地存储配置信息
 * @author 春江花朝秋月夜
 */
@Data
public class ImgUpload {

	/**
	 * 本地文件上传文件夹
	 */
	private String imagePath;

	/**
	 * 文件上传方式 1.本地文件上传 2.七牛云
	 */
	private Integer uploadType;

	/**
	 * 网站url
	 */
	private String resourceUrl;
}
