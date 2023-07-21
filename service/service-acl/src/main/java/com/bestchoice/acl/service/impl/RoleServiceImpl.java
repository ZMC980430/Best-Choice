package com.bestchoice.acl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestchoice.acl.mapper.RoleMapper;
import com.bestchoice.acl.service.RoleService;
import com.bestchoice.model.acl.Admin;
import com.bestchoice.model.acl.Role;
import com.bestchoice.vo.acl.AdminQueryVo;
import com.bestchoice.vo.acl.RoleQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Override
    public IPage<Role> selectPage(Page<Role> page, RoleQueryVo roleQueryVo) {
        String roleName = roleQueryVo.getRoleName();
        LambdaQueryWrapper<Role> wrapper = new LambdaQueryWrapper<>();
        if(StringUtils.isEmpty(roleName)){
            wrapper.like(Role::getRoleName, roleName);
        }
        return baseMapper.selectPage(page, wrapper);
    }
}
