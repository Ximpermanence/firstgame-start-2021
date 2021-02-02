package cn.ch.firstgamestart.controller;


import cn.ch.firstgamestart.entity.GpStrong;
import cn.ch.firstgamestart.service.GpStrongService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 金币提升表 前端控制器
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/gpStrong")
public class GpStrongController {
    @Autowired
    private GpStrongService gpStrongService;
    @GetMapping("/getall")
    @ApiOperation("使用gp变强列表")
    public List<GpStrong> getAll(){
        return gpStrongService.list();
    }
}

