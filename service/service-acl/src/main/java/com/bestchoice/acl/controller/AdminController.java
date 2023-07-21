package com.bestchoice.acl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.acl.service.AdminService;
import com.bestchoice.acl.service.RoleService;
import com.bestchoice.common.result.Result;
import com.bestchoice.model.acl.Admin;
import com.bestchoice.model.acl.Role;
import com.bestchoice.vo.acl.AdminQueryVo;
import com.bestchoice.vo.acl.RoleQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/acl/user")
@Slf4j
@Api(tags = "user manage")
@CrossOrigin
public class AdminController {
    @Autowired
    RoleService roleService;

    @Autowired
    AdminService adminService;

    @ApiOperation("get admin list")
    @GetMapping("{page}/{limit}")
    public Result<Object> index(@PathVariable Long page,
                                @PathVariable Long limit,
                                AdminQueryVo adminQueryVo) {
        Page<Admin> page1 = new Page<>(page, limit);

        IPage<Admin> adminIPage = adminService.selectPage(page1, adminQueryVo);
        return Result.ok(adminIPage);
    }

    @ApiOperation("get user by id")
    @GetMapping("get/{id}")
    public Result<Object> get(@PathVariable Long id) {
        Role byId = roleService.getById(id);
        return Result.ok(byId);
    }

    @ApiOperation("add user")
    @PostMapping("save")
    public Result<Object> save(@RequestBody Role role) {
        boolean save = roleService.save(role);
        if(save) return Result.ok(null);
        else return Result.fail("add user failed");
    }

    // TODO: unfinished apis, see src/api/acl/use.js
}
