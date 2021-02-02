package cn.ch.firstgamestart.controller;


import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.entity.PlayerInfo;
import cn.ch.firstgamestart.pojo.vo.PlayerPropertyVO;
import cn.ch.firstgamestart.service.PlayerInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 玩家属性 前端控制器
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/playerInfo")
@Api(tags = "获取玩家属性")
public class PlayerInfoController {
    @Autowired
    private PlayerInfoService playerInfoService;

    @GetMapping("/getproperty")
    @ApiOperation("获取玩家个人属性")
    public Result<PlayerPropertyVO> getProperty(Integer id){
        return playerInfoService.selectPropertyById(id);
    }
    @GetMapping("/getallplayerinfo")
    @ApiOperation("获取所有玩家信息")
    public Result<List<PlayerInfo>> getAllPlayerInfo(){
        return playerInfoService.getAllPlayerInfo();
    }


    @GetMapping("/getallproperty")
    @ApiOperation("获取所有玩家属性")
    public List<PlayerInfo> getAllProperty(){
        return playerInfoService.list();
    }

}



