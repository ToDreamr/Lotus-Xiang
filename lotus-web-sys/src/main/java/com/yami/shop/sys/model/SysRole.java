

package com.yami.shop.sys.model;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色
 * @author lanhai
 */
@Data
@TableName("tz_sys_role")
public class SysRole implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色ID
	 *
	 */
	@TableId

	private Long roleId;

	/**
	 * 角色名称
	 */
	@NotBlank(message="角色名称不能为空")
	private String roleName;

	/**
	 * 备注
	 */
	private String remark;

	@TableField(exist=false)
	private List<Long> menuIdList;

	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
}
