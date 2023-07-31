package com.bestchoice.acl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.acl.service.RoleService;
import com.bestchoice.common.result.Result;
import com.bestchoice.model.acl.Role;
import com.bestchoice.vo.acl.RoleQueryVo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/acl/role")
@CrossOrigin
public class RoleController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(RoleController.class);
    @Resource
    private RoleService roleService;

    @ApiOperation("Roles querying")
    @GetMapping("{page}/{limit}")
    public Result<Object> index(@PathVariable Long page,
                                @PathVariable Long limit,
                                RoleQueryVo roleQueryVo) {

        Page<Role> objectPage = new Page<>(page, limit);
        IPage<Role> roleIPage = roleService.selectPage(objectPage, roleQueryVo);
        return Result.ok(roleIPage);
    }

    @ApiOperation("save user")
    @PostMapping("save")
    public Result<Object> save(@RequestBody Role role) {
        if (roleService.save(role)) return Result.ok(null);
        return Result.fail("save failed");
    }

    @ApiOperation("get user by id")
    @GetMapping("get/{id}")
    public Result<Object> get(@PathVariable Long id) {
        Role role = roleService.getById(id);
        return Result.ok(role);
    }

    @ApiOperation("update a role")
    @PostMapping("update")
    public Result<Object> update(@RequestBody Role role) {
        if (roleService.updateById(role)) return Result.ok(null);
        return Result.fail("update error");
    }

    public Result<Object> getAssign() {
        return null;
    }


    public Result<Object> toAssign() {
        return null;
    }

    @ApiOperation("remove by id")
    @DeleteMapping("remove/{id}")
    public Result<Object> remove(@PathVariable Long id) {
        if (roleService.removeById(id)) return Result.ok(null);
        return Result.fail("remove failed");
    }

    @ApiOperation("remove roles by batches")
    @PostMapping("batchRemove")
    public Result<Object> batchRemove(@RequestBody List<Long> ids) {
        if (roleService.removeByIds(ids)) {
            return Result.ok(null);
        }
        return Result.fail("remove failed");
    }

}
