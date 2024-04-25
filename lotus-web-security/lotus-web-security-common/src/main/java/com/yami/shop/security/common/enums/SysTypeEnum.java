
package com.yami.shop.security.common.enums;

/**
 * 系统类型
 * @author 菠萝凤梨
 * @date 2022/3/25 17:33
 */
public enum SysTypeEnum {

    /**
     * 普通用户系统
     */
    ORDINARY(0),

    /**
     * 后台
     */
    ADMIN(1),
    ;

    private final Integer value;

    public Integer value() {
        return value;
    }

    SysTypeEnum(Integer value) {
        this.value = value;
    }

}
