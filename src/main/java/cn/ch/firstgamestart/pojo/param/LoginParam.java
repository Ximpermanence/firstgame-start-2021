package cn.ch.firstgamestart.pojo.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 登录/注册入参
 * @author: chenhao
 * @create:2021/1/28 11:14
 **/
@Data
@ApiModel("登录/注册入参")
public class LoginParam {

    @ApiModelProperty("username")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    public LoginParam() {
    }

    public LoginParam(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
