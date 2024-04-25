

package com.yami.shop.bean.app.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yami.shop.common.serializer.json.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 *  @author 春江花朝秋月夜
 */
@Schema(description = "我的订单-订单项")
@Data
public class MyOrderItemDto {

    @Schema(description = "商品图片" , required = true)
    @JsonSerialize(using = ImgJsonSerializer.class)
    private String pic;

    @Schema(description = "商品名称" , required = true)
    private String prodName;

    @Schema(description = "商品数量" , required = true)
    private Integer prodCount;

    @Schema(description = "商品价格" , required = true)
    private Double price;

    @Schema(description = "skuName" , required = true)
    private String skuName;

}
