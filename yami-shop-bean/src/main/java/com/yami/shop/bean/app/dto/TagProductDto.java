

package com.yami.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author 春江花朝秋月夜
 */
@Data
public class TagProductDto {

    @Schema(description = "分组标签id" )
    private Long id;

    @Schema(description = "分组标签标题" )
    private String title;

    @Schema(description = "排序（数值越高越靠前）" )
    private String seq;

    @Schema(description = "列表样式(0:一列一个,1:一列两个,2:一列三个)" )
    private String style;

    private List<ProductDto> productDtoList;
}
