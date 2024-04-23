

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
/**
 * @author 春江花朝秋月夜
 */
@Schema(description = "收藏对象")
@Data
public class UserCollectionDto {

    @Schema(description = "收藏id" )
    private Long id;

    @Schema(description = "商品名称" )
    private String prodName;

    @Schema(description = "收藏时间" )
    private Date createTime;

}
