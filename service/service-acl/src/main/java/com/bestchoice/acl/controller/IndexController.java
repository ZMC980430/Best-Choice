package com.bestchoice.acl.controller;

import com.bestchoice.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "user login info")
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/admin/acl/index")
public class IndexController {

    // match the api in frontend
    @ApiOperation("Login")
    @PostMapping("login")
    public Result<Object> login() {
        Map<String, String> map = new HashMap<>();
        map.put("token", "token-admin");
        return Result.ok(map);
    }

    @GetMapping("info")
    public Result<Object> info() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "admin");
        map.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    @PostMapping("logout")
    public Result<Object> logout() {
        return Result.ok(null);
    }

}