package com.bestchoice.acl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bestchoice.model.acl.Role;
import com.bestchoice.vo.acl.RoleQueryVo;

public interface RoleService extends IService<Role> {
    IPage<Role> selectPage(Page<Role> page, RoleQueryVo roleQueryVo);
}
