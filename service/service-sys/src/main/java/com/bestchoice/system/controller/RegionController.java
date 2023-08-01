package com.bestchoice.system.controller;


import com.bestchoice.common.result.Result;
import com.bestchoice.system.entity.Region;
import com.bestchoice.system.service.RegionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.License;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 地区表 前端控制器
 * </p>
 *
 * @author meicheng
 * @since 2023-07-30
 */
@RestController
@RequestMapping("/admin/system/region")
@CrossOrigin
public class RegionController {

    @Resource
    private RegionService regionService;
    @ApiOperation("get all ware")
    @GetMapping("findAllList")
    public Result<Object> findAll() {
//        regionService.
        return null;
    }

    @ApiOperation("get wares by keyword")
    @GetMapping("findRegionByKeyword/{keyword}")
    public  Result<Object> findByKeyword(@PathVariable String keyword) {
        List<Region> byKeyword = regionService.findByKeyword(keyword);
        return Result.ok(byKeyword);
    }
}

