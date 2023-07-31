package com.bestchoice.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.system.entity.Region;
import com.bestchoice.system.entity.RegionWare;
import com.bestchoice.system.mapper.RegionMapper;
import com.bestchoice.system.service.RegionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestchoice.vo.sys.RegionWareQueryVo;
import jodd.util.StringUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 地区表 服务实现类
 * </p>
 *
 * @author meicheng
 * @since 2023-07-30
 */
@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements RegionService {
    @Override
    public List<Region> findByKeyword(String keyword) {
        LambdaQueryWrapper<Region> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(Region::getName, keyword);

        return baseMapper.selectList(lambdaQueryWrapper);
    }
}