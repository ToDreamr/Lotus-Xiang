

package com.yami.shop.bean.app.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yami.shop.common.serializer.json.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * @author 春江花朝秋月夜
 */
@Schema(description = "首页图片对象")
@Data
public class IndexImgDto {

    /**
     * 图片
     */
    @JsonSerialize(using = ImgJsonSerializer.class)
    @Schema(description = "图片Url" , required = true)
    private String imgUrl;

    /**
     * 顺序
     */
    @Schema(description = "图片顺序" , required = true)
    private Integer seq;

    /**
     * 上传时间
     */
    @Schema(description = "上传时间" , required = true)
    private Date uploadTime;

    /**
     * 类型
     */
    @Schema(description = "类型" , required = true)
    private int type;

    /**
     * 关联id
     */
    @Schema(description = "关联id" , required = true)
    private Long relation;



}
