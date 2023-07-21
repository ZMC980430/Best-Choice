package com.bestchoice.acl.controller;

import com.bestchoice.common.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/acl/index")
public class IndexController {

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
        map.put("avatar", "www.aaa.com");
        return Result.ok(map);
    }

    @PostMapping("logout")
    public  Result<Object> logout(){
        return Result.ok(null);
    }

}
