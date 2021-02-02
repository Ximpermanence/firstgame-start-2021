package cn.ch.firstgamestart.controller;


import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.pojo.param.LoginParam;
import cn.ch.firstgamestart.service.PlayerUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户属性 前端控制器
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/playerUser")
public class PlayerUserController {

    @Autowired
    private PlayerUserService playerUserService;

    /**
     * 登录
     *
     * @param loginParam
     * @return
     */
    @GetMapping("/login")
    @ApiOperation(value = "登录")
    public Result login(LoginParam loginParam) {
        return playerUserService.login(loginParam);
    }

    /**
     * 注册
     *
     * @param loginParam
     * @return
     */
    @GetMapping("/register")
    @ApiOperation(value = "注册")
    public Result register(LoginParam loginParam) {
        return playerUserService.register(loginParam);
    }

}

