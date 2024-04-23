

package com.yami.shop.common.serializer.json;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.yami.shop.common.bean.Qiniu;
import com.yami.shop.common.util.ImgUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Objects;

/**
 * @author 春江花朝秋月夜
 */
@Component
public class ImgJsonSerializer extends JsonSerializer<String> {

    @Autowired
    private Qiniu qiniu;
    @Autowired
    private ImgUploadUtil imgUploadUtil;

    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (StrUtil.isBlank(value)) {
            gen.writeString(StrUtil.EMPTY);
            return;
        }
        String[] imgs = value.split(StrUtil.COMMA);
        StringBuilder sb = new StringBuilder();
        String resourceUrl = "";
        if (Objects.equals(imgUploadUtil.getUploadType(), 2)) {
            resourceUrl = qiniu.getResourcesUrl();
        } else if (Objects.equals(imgUploadUtil.getUploadType(), 1)) {
            resourceUrl = imgUploadUtil.getResourceUrl();
        }
        for (String img : imgs) {
            sb.append(resourceUrl).append(img).append(StrUtil.COMMA);
        }
        sb.deleteCharAt(sb.length()-1);
        gen.writeString(sb.toString());
    }
}
