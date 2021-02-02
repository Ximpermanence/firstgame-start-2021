package cn.ch.firstgamestart.controller;

import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.service.FightService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:客户端
 * @author: chenhao
 * @create:2020/9/29 10:26
 **/

@RestController
@RequestMapping("/client/main")
@Api(tags = "战斗首页")
public class ClientMainController {

    @Autowired
    private FightService fightService;

    /**
     * 获取个人属性
     */

    /**
     * 获取当前经济情况
     */

    /**
     * 战斗首页
     */
    @GetMapping("/fightIndex")
    public Result<String[]> fightIndex() {
        return Result.success(fightService.fightIndex());
    }

    /**
     * 发起战斗
     */
    @GetMapping("/startFight")
    public Result startFight(String monsterName, String userId) {
        return Result.success(fightService.startFight(monsterName, userId));
    }
}
