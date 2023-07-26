package com.bestchoice.acl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bestchoice.model.acl.Permission;

import java.util.List;

public interface PermissionService extends IService<Permission> {
    List<Permission> queryAllMenu();

    boolean removeChildById(Long id);
}
