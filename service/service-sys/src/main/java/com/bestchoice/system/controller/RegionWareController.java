package com.bestchoice.system.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.common.result.Result;
import com.bestchoice.system.entity.RegionWare;
import com.bestchoice.system.service.RegionWareService;
import com.bestchoice.vo.sys.RegionWareQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 城市仓库关联表 前端控制器
 * </p>
 *
 * @author meicheng
 * @since 2023-07-30
 */
@RestController
@RequestMapping("/admin/system/region-ware")
@Api(tags = "region ware")
@Slf4j
public class RegionWareController {
    @Resource
    private RegionWareService regionWareService;

    @ApiOperation("list all regions")
    @GetMapping("{page}/{limit}")
    public Result<Object> list(@PathVariable Long page,
                               @PathVariable Long limit,
                               RegionWareQueryVo regionWareQueryVo) {
        Page<RegionWare> iPage = new Page<>(page, limit);
        return Result.ok(
                regionWareService.selectPageRegionWare(iPage, regionWareQueryVo)
        );
    }

    @ApiOperation("update region")
    @PostMapping("update")
    public Result<Object> updateRegionWare(@RequestBody RegionWare regionWare) {
        if(regionWareService.addRegion(regionWare))
            return Result.ok(null);
        return Result.fail("failed");
    }

    @ApiOperation("delete region ware")
    @DeleteMapping("remove/{id}")
    public Result<Object> delete(@PathVariable Long id){
        regionWareService.removeById(id);
        return Result.ok(null);
    }

    @ApiOperation("inactivate region ware")
    @PostMapping("updateStatus/{id}/{status}")
    public Result<Object> updateStatus(@PathVariable Long id, @PathVariable Integer status) {
        regionWareService.updateStatus(id, status);
        return Result.ok(null);
    }
}

