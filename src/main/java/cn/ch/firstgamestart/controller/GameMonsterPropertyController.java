package cn.ch.firstgamestart.controller;


import cn.ch.firstgamestart.entity.GameMonsterProperty;
import cn.ch.firstgamestart.service.GameMonsterPropertyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 怪物属性表 前端控制器
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/gameMonsterProperty")
public class GameMonsterPropertyController {

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @Autowired
    private GameMonsterPropertyService gameMonsterPropertyService;

    @GetMapping("/getall")
    @ApiOperation("得到所有怪属性")
    public List<GameMonsterProperty> getAll() {
        return gameMonsterPropertyService.list();
    }
    
    //TODO: 2021/2/1 各个类的增删改加上 ，且返回的List全部改成Page  @陈浩
}

