

package com.yami.shop.bean.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 *  @author 春江花朝秋月夜
 */
@Data
@TableName("tz_pick_addr")
public class PickAddr implements Serializable {
    /**
     * ID
     */
    @TableId
    private Long addrId;

    /**
     * 自提点名称
     */

    private String addrName;

    /**
     * 地址
     */
    private String addr;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 省份ID
     */
    private Long provinceId;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市ID
     */
    private Long cityId;

    /**
     * 城市
     */
    private String city;

    /**
     * 区/县ID
     */
    private Long areaId;

    /**
     * 区
     */
    private String area;

    /**
     * 店铺id
     */
    private Long shopId;

}
