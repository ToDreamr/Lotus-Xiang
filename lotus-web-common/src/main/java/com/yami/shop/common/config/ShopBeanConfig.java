

package com.yami.shop.common.config;

import cn.hutool.crypto.symmetric.AES;
import com.yami.shop.common.bean.AliDaYu;
import com.yami.shop.common.bean.ImgUpload;
import com.yami.shop.common.bean.Qiniu;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @author 春江花朝秋月夜
 */
@Configuration
@AllArgsConstructor
public class ShopBeanConfig {

	private final ShopBasicConfig shopBasicConfig;

    @Bean
    public Qiniu qiniu() {
    	return shopBasicConfig.getQiniu();
    }

    @Bean
    public AES tokenAes() {
    	return new AES(shopBasicConfig.getTokenAesKey().getBytes());
    }

    @Bean
    public AliDaYu aLiDaYu () {
    	return shopBasicConfig.getALiDaYu();
    }

    @Bean
    public ImgUpload imgUpload() {
        return shopBasicConfig.getImgUpload();
    }
}
