

package com.yami.shop.bean.app.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 *  @author 春江花朝秋月夜
 */
@Data
@Schema(description = "添加评论信息")
public class ProdCommParam {
    /**
     * 商品ID
     */
    @Schema(description = "商品id" )
    private Long prodId;
    /**
     * 订单项ID
     */
    @Schema(description = "订单项ID" )
    private Long orderItemId;

    /**
     * 评价，0-5分
     */
    @Schema(description = "评价，0-5分" ,required=true)
    @NotNull(message = "评价不能为空")
    private Integer score;

    @Schema(description = "评论内容" ,required=true)
    private String content;

    @Schema(description = "评论图片, 用逗号分隔" )
    private String pics;

    /**
     * 是否匿名(1:是  0:否)
     */
    @Schema(description = "是否匿名(1:是  0:否) 默认为否" )
    private Integer isAnonymous;


    @Schema(description = "* 评价(0好评 1中评 2差评)" )
    private Integer evaluate;

}
