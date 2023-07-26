package com.bestchoice.acl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestchoice.acl.mapper.RoleMapper;
import com.bestchoice.acl.service.AdminRoleService;
import com.bestchoice.acl.service.RoleService;
import com.bestchoice.model.acl.AdminRole;
import com.bestchoice.model.acl.Role;
import com.bestchoice.vo.acl.RoleQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Resource
    private AdminRoleService adminRoleService;
    @Override
    public IPage<Role> selectPage(Page<Role> page, RoleQueryVo roleQueryVo) {
        String roleName = roleQueryVo.getRoleName();
        LambdaQueryWrapper<Role> wrapper = new LambdaQueryWrapper<>();
        if(StringUtils.isEmpty(roleName)){
            wrapper.like(Role::getRoleName, roleName);
        }
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public void saveUserRoleRelationShip(Long adminId, Long[] roleIds) {
        // delete
        adminRoleService.remove(new QueryWrapper<AdminRole>().eq("admin_id", adminId));

        // assign new role
        List<AdminRole> userRoleList = new ArrayList<>();
        for(Long roleId: roleIds){
            if(!StringUtils.isEmpty(roleId)) {
                AdminRole adminRole = new AdminRole();
                adminRole.setAdminId(adminId);
                adminRole.setRoleId(roleId);
                userRoleList.add(adminRole);
            }
        }
        adminRoleService.saveBatch(userRoleList);
    }

    @Override
    public Map<String, Object> findRoleByAdminId(Long adminId) {

        // query all roles
        List<Role> roleList = baseMapper.selectList(null);

        // select role arrange by admin id
        LambdaQueryWrapper<AdminRole> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(AdminRole::getAdminId, adminId);
        List<AdminRole> adminRoleList = adminRoleService.list(lambdaQueryWrapper);

        // classify role
        List<Role> assignRoles = new ArrayList<>();
        for(Role role: roleList){
            if(adminRoleList.contains(role.getId()))
                assignRoles.add(role);
        }
        Map<String, Object> roleMap = new HashMap<>();
        roleMap.put("assignRoles", assignRoles);
        roleMap.put("allRolesList", roleList);

        return roleMap;
    }
}
