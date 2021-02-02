package cn.ch.firstgamestart.common.result;


import cn.ch.firstgamestart.common.constant.HttpStatus;
import cn.ch.firstgamestart.common.exception.CustomException;
import cn.ch.firstgamestart.enums.ResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:通用返回
 * @author: chenhao
 * @create:2021/1/28 10:20
 **/
@Data
@ApiModel(value = "接口出参", description = "接口出参")
public class Result<T> implements Serializable {

    /**
     * 状态码,200为成功
     */
    @ApiModelProperty(value = "返回代码")
    private Integer code;

    /**
     * 返回给前端的提示信息
     */
    @ApiModelProperty(value = "返回处理消息")
    private String msg;

    /**
     * 返回给前端的数据
     */
    @ApiModelProperty(value = "返回数据对象")
    private T data;

    /**
     * 构造函数
     *
     * @param code 状态码
     * @param msg  提示信息
     */
    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 构造函数
     *
     * @param code 状态码
     * @param msg  提示信息
     * @param data 数据
     */
    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 访问成功时调用
     *
     * @param <T> 类型
     * @return 结果
     */
    public static <T> Result<T> success() {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
    }

    /**
     * 访问成功时调用
     *
     * @param msg 提示信息
     * @param <T> 类型
     * @return 结果
     */
    public static <T> Result<T> success(String msg) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), msg);
    }

    /**
     * 访问成功时调用
     *
     * @param data 数据
     * @param <T>  类型
     * @return 结果
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), "操作成功", data);
    }

    /**
     * 访问成功时调用
     *
     * @param msg  提示信息
     * @param data 数据
     * @param <T>  类型
     * @return 结果
     */
    public static <T> Result<T> success(String msg, T data) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), msg, data);
    }

    /**
     * 返回异常情况
     *
     * @param <T> 数据
     * @return 结果
     */
    public static <T> Result<T> error() {
        return error(HttpStatus.ERROR, "操作失败");
    }

    /**
     * 返回异常情况
     *
     * @param msg 提示信息
     * @param <T> 数据
     * @return 结果
     */
    public static <T> Result<T> error(String msg) {
        return error(HttpStatus.ERROR, msg);
    }

    /**
     * 返回异常情况 不包含data
     *
     * @param code 状态码
     * @param msg  消息
     * @return 结果
     */
    public static <T> Result<T> error(Integer code, String msg) {
        return new Result<>(code, msg);
    }

    /**
     * 返回异常情况 不包含data
     *
     * @param sysErrorCodeEnum 系统级错误码枚举类
     * @return 结果
     */
    public static <T> Result<T> error(ResultCode sysErrorCodeEnum) {
        return error(sysErrorCodeEnum.getCode(), sysErrorCodeEnum.getMsg());
    }

    /**
     * 返回异常情况 包含data
     *
     * @param sysErrorCodeEnum 系统级错误码枚举类
     * @param data             返回数据
     * @return 结果
     */
    public static <T> Result<T> error(ResultCode sysErrorCodeEnum, T data) {
        Result<T> commonVO = error(sysErrorCodeEnum);
        commonVO.setData(data);
        return commonVO;
    }

    /**
     * 全局基类自定义异常 异常处理
     *
     * @param e 自定义异常类
     * @return 结果
     */
    public static <T> Result<T> error(CustomException e) {
        return error(e.getCode(), e.getMessage());
    }

}
