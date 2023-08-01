package com.bestchoice.system.controller;


import com.bestchoice.common.result.Result;
import com.bestchoice.system.entity.Ware;
import com.bestchoice.system.service.WareService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 仓库表 前端控制器
 * </p>
 *
 * @author meicheng
 * @since 2023-07-30
 */
@RestController
@RequestMapping("/admin/system/ware")
@CrossOrigin
public class WareController {

    @Resource
    private WareService wareService;

    @ApiOperation("查询所有仓库列表")
    @GetMapping("findAllList")
    public Result<Object> findAllList() {
        List<Ware> list = wareService.list();
        return Result.ok(list);
    }
}

