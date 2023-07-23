package com.bestchoice.acl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bestchoice.model.acl.Role;
import com.bestchoice.vo.acl.RoleQueryVo;

import java.util.Map;

public interface RoleService extends IService<Role> {
    IPage<Role> selectPage(Page<Role> page, RoleQueryVo roleQueryVo);
    /**
     * 分配角色
     * @param adminId
     * @param roleIds
     */
    void saveUserRoleRelationShip(Long adminId, Long[] roleIds);

    /**
     * 根据用户获取角色数据
     * @param adminId
     * @return
     */
    Map<String, Object> findRoleByUserId(Long adminId);
}
