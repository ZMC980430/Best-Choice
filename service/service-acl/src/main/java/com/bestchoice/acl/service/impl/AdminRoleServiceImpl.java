package com.bestchoice.acl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestchoice.acl.mapper.AdminRoleMapper;
import com.bestchoice.acl.service.AdminRoleService;
import com.bestchoice.model.acl.AdminRole;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {
}
