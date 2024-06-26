

package com.yami.shop.bean.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *  @author 春江花朝秋月夜
 */
@Data
@TableName("tz_hot_search")
public class HotSearch implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long hotSearchId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 录入时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date recDate;

    /**
     * 顺序
     */
    private Integer seq;

    /**
     * 状态 默认是1,0为下线
     */
    private Integer status;

}
