package com.bestchoice.acl.controller;

import com.bestchoice.acl.service.PermissionService;
import com.bestchoice.common.result.Result;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController("/admin/acl/permission")
@CrossOrigin
@Api("control user permissions")
@Slf4j
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    public Result<Object> getPermissionList() {

        return Result.ok(null);
    }
}
