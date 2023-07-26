package com.bestchoice.acl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestchoice.acl.mapper.PermissionMapper;
import com.bestchoice.acl.service.PermissionService;
import com.bestchoice.model.acl.Permission;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
