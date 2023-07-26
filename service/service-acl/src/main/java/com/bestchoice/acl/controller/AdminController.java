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

import java.util.List;
import java.util.Map;

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
        Admin byId = adminService.getById(id);
        return Result.ok(byId);
    }

    @ApiOperation("add user")
    @PostMapping("save")
    public Result<Object> save(@RequestBody Admin admin) {
        if(adminService.save(admin)) return Result.ok(null);
        return Result.fail("add admin failed");
    }

    @ApiOperation("modify role by id")
    @PostMapping("update")
    public Result<Object> update(@RequestBody Admin admin) {
        if(adminService.updateById(admin)) return Result.ok(null);
        return Result.fail("update failed");
    }

    @ApiOperation("remove admin by id")
    @DeleteMapping("remove/{id}")
    public Result<Object> remove(@PathVariable Long id){
        if(adminService.removeById(id)) return Result.ok(null);
        return Result.fail("delete role failed");
    }

    @ApiOperation("remove admins by batch of ids")
    @PostMapping("batchRemove")
    public Result<Object> batchRemove(@RequestBody List<Long> idList) {
        if(adminService.removeByIds(idList)) return Result.ok(null);
        return Result.fail("");
    }

    @ApiOperation(value = "根据用户获取角色数据")
    @GetMapping("/toAssign/{adminId}")
    public Result<Object> toAssign(@PathVariable Long adminId) {
        Map<String, Object> roleMap = roleService.findRoleByAdminId(adminId);
        return Result.ok(roleMap);
    }

    @ApiOperation(value = "根据用户分配角色")
    @PostMapping("/doAssign")
    public Result<Object> doAssign(@RequestParam Long adminId,@RequestParam Long[] roleId) {
        roleService.saveUserRoleRelationShip(adminId,roleId);
        return Result.ok(null);
    }
}
