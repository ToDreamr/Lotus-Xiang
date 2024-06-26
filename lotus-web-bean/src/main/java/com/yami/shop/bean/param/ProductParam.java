

package com.yami.shop.bean.param;

import com.yami.shop.bean.model.Product;
import com.yami.shop.bean.model.Sku;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
@Data
public class ProductParam {

    /**
     * 产品ID
     */
    private Long prodId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 商品名称
     */
    @NotBlank(message = "商品名称不能为空")
    @Size(max = 200, message = "商品名称长度应该小于{max}")
    private String prodName;


    /**
     * 商品价格
     */
    @NotNull(message = "请输入商品价格")
    private Double price;

    /**
     * 商品价格
     */
    @NotNull(message = "请输入商品原价")
    private Double oriPrice;

    /**
     * 库存量
     */
    @NotNull(message = "请输入商品库存")
    private Integer totalStocks;

    /**
     * 简要描述,卖点等
     */
    @Size(max = 500, message = "商品卖点长度应该小于{max}")
    private String brief;

    @NotBlank(message = "请选择图片上传")
    private String pic;

    /**
     * 商品图片
     */
    @NotBlank(message = "请选择图片上传")
    private String imgs;

    /**
     * 商品分类
     */
    @NotNull(message = "请选择商品分类")
    private Long categoryId;

    /**
     * sku列表字符串
     */
    private List<Sku> skuList;

    /**
     * content 商品详情
     */
    private String content;

    /**
     * 是否能够用户自提
     */
    private Product.DeliveryModeVO deliveryModeVo;

    /**
     * 运费模板id
     */
    private Long deliveryTemplateId;

    /**
     * 分组标签列表
     */
    private List<Long> tagList;

}
