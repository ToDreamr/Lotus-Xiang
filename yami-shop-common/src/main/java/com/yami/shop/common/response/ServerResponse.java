

package com.yami.shop.common.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 春江花朝秋月夜
 */
@Data
public class ServerResponse<T> implements Serializable {


    private int code;

    private String msg;

    private T obj;

    public boolean isSuccess(){
        return Objects.equals(ResponseCode.SUCCESS, this.code);
    }


}
