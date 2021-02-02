package cn.ch.firstgamestart.enums;

/**
 * @description: 通用返回枚举
 * @author: chenhao
 * @create:2021/1/28 10:26
 **/

public enum ResultCode {

    SUCCESS("成功", 1),
    FAILED("失败", 2);

    private String msg;
    private Integer code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    ResultCode(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }
}
