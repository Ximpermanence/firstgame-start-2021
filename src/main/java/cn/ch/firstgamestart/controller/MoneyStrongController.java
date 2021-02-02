package cn.ch.firstgamestart.controller;


import cn.ch.firstgamestart.entity.MoneyStrong;
import cn.ch.firstgamestart.service.MoneyStrongService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 充值现金提升 前端控制器
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/moneyStrong")
public class MoneyStrongController {

    @Autowired
    private MoneyStrongService moneyStrongService;

    @GetMapping("/getall")
    @ApiOperation("金钱使用")
    public List<MoneyStrong> getAll() {

        return moneyStrongService.list();
    }

}

