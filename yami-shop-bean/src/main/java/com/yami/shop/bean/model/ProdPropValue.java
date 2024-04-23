

package com.yami.shop.bean.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 春江花朝秋月夜
 */
@Data
@TableName("tz_prod_prop_value")
public class ProdPropValue implements Serializable{
    /**
	 *
	 */
	private static final long serialVersionUID = 6604406039354172708L;

	/**
     * 属性值ID
     */
    @TableId

    private Long valueId;

    /**
     * 属性值名称
     */

    private String propValue;

    /**
     * 属性ID
     */

    private Long propId;

}
