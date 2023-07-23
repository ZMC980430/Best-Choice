package com.bestchoice.acl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.acl.service.RoleService;
import com.bestchoice.common.result.Result;
import com.bestchoice.model.acl.Role;
import com.bestchoice.vo.acl.RoleQueryVo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/acl/role")
@Slf4j
@CrossOrigin
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation("Roles querying")
    @GetMapping("{page}/{limit}")
    public Result<Object> index(@PathVariable Long page,
                                   @PathVariable Long limit,
                                   RoleQueryVo roleQueryVo){

        Page<Role> objectPage = new Page<>(page, limit);
        IPage<Role> roleIPage = roleService.selectPage(objectPage, roleQueryVo);
        return Result.ok(roleIPage);
    }

    @ApiOperation("save user")
    @PostMapping("save")
    public Result<Object> save(@RequestBody Role role) {
        if(roleService.save(role)) return Result.ok(null);
        return Result.fail("save failed");
    }

    public Result<Object> get() {
        return null;
    }

    public Result<Object> getAssign() {
        return null;
    }


    public Result<Object> toAssign() {
        return null;
    }

    public Result<Object> remove() {
        return null;
    }

    public Result<Object> batchRemove() {
        return null;
    }


}
