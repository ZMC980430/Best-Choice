package com.bestchoice.acl.controller;

import com.bestchoice.acl.service.PermissionService;
import com.bestchoice.common.result.Result;
import com.bestchoice.model.acl.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController()
@CrossOrigin
@Api(tags="menu management")
@Slf4j
@RequestMapping("/admin/acl/permission")
public class PermissionController {
    @Resource
    private PermissionService permissionService;

    @ApiOperation(value = "获取菜单")
    @GetMapping
    public Result<Object> index() {
        List<Permission> list = permissionService.queryAllMenu();
        return Result.ok(list);
    }

    @ApiOperation(value = "新增菜单")
    @PostMapping("save")
    public Result<Object> save(@RequestBody Permission permission) {
        permissionService.save(permission);
        return Result.ok(null);
    }

    @ApiOperation(value = "修改菜单")
    @PutMapping("update")
    public Result<Object> updateById(@RequestBody Permission permission) {
        permissionService.updateById(permission);
        return Result.ok(null);
    }

    @ApiOperation(value = "递归删除菜单")
    @DeleteMapping("remove/{id}")
    public Result<Object> remove(@PathVariable Long id) {
        if(permissionService.removeChildById(id)) return Result.fail("remove failed");
        return Result.ok(null);
    }
}
