

package com.yami.shop.api.controller;

import com.yami.shop.bean.app.dto.ProdTagDto;
import com.yami.shop.bean.model.ProdTag;
import com.yami.shop.service.ProdTagService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import cn.hutool.core.bean.BeanUtil;
import com.yami.shop.common.response.ServerResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
@RestController
@RequestMapping("/prod/tag")
@Tag(name = "商品分组标签接口")
@AllArgsConstructor
public class ProdTagController {

    private ProdTagService prodTagService;



    /**
     * 商品分组标签列表接口
     */
    @GetMapping("/prodTagList")
    @Operation(summary = "商品分组标签列表" , description = "获取所有的商品分组列表")
    public ServerResponseEntity<List<ProdTagDto>> getProdTagList() {
        List<ProdTag> prodTagList = prodTagService.listProdTag();
        List<ProdTagDto> prodTagDtoList = BeanUtil.copyToList(prodTagList, ProdTagDto.class);
        return ServerResponseEntity.success(prodTagDtoList);
    }

}
