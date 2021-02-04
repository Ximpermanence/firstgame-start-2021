package cn.ch.firstgamestart.controller;


import cn.ch.firstgamestart.entity.GameMonsterProperty;
import cn.ch.firstgamestart.entity.GamePlayerProperty;
import cn.ch.firstgamestart.service.GamePlayerPropertyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 玩家属性表 前端控制器
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/gamePlayerProperty")
public class GamePlayerPropertyController {

    @Autowired
    private GamePlayerPropertyService gamePlayerPropertyService;

    @GetMapping("/getall")
    @ApiOperation("得到所有玩家属性")
    public List<GamePlayerProperty> getAll() {
        List<GamePlayerProperty> list = gamePlayerPropertyService.list();
        System.out.println(1);
        return list;
    }
}

