

package com.yami.shop.bean.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 春江花朝秋月夜
 */
@Data
@TableName("tz_delivery")
public class Delivery implements Serializable {
    /**
     * ID
     */
    @TableId

    private Long dvyId;

    /**
     * 物流公司名称
     */

    private String dvyName;

    /**
     * 公司主页
     */

    private String companyHomeUrl;

    /**
     * 建立时间
     */

    private Date recTime;

    /**
     * 修改时间
     */

    private Date modifyTime;

    /**
     * 物流查询接口
     */

    private String queryUrl;
}
