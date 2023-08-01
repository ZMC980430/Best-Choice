package com.bestchoice.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.common.exception.BaseException;
import com.bestchoice.common.result.Result;
import com.bestchoice.common.result.ResultCodeEnum;
import com.bestchoice.system.entity.RegionWare;
import com.bestchoice.system.mapper.RegionWareMapper;
import com.bestchoice.system.service.RegionWareService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestchoice.vo.sys.RegionWareQueryVo;
import jodd.util.StringUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 城市仓库关联表 服务实现类
 * </p>
 *
 * @author meicheng
 * @since 2023-07-30
 */
@Service
public class RegionWareServiceImpl extends ServiceImpl<RegionWareMapper, RegionWare> implements RegionWareService {
    @Override
    public IPage<RegionWare> selectPageRegionWare(Page<RegionWare> pageParam, RegionWareQueryVo regionWareQueryVo) {
        String keyword = regionWareQueryVo.getKeyword();

        LambdaQueryWrapper<RegionWare> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if (!StringUtil.isEmpty(keyword)) {
            lambdaQueryWrapper.like(RegionWare::getWareName, keyword).or().like(RegionWare::getRegionName, keyword);
        }

        return baseMapper.selectPage(pageParam, lambdaQueryWrapper);
    }

    @Override
    public boolean addRegion(RegionWare regionWare) {
        LambdaQueryWrapper<RegionWare> lambdaQueryWrapper = new LambdaQueryWrapper<>();
//        lambdaQueryWrapper.eq(RegionWare::getRegionId, regionWare.getRegionId());
        Map<SFunction<RegionWare, ?>, Object> params = new HashMap<>();
        params.put(RegionWare::getRegionId, regionWare.getRegionId());
        params.put(RegionWare::getWareId, regionWare.getWareId());
        lambdaQueryWrapper.allEq(params);
        RegionWare ware = baseMapper.selectOne(lambdaQueryWrapper);

        // ware being null means no query result
        if (ware != null) throw new BaseException(ResultCodeEnum.REGION_OPEN);
        baseMapper.insert(regionWare);
        return true;
    }

    @Override
    public void updateStatus(Long id, Integer status) {
        RegionWare regionWare = baseMapper.selectById(id);
        regionWare.setStatus(status);
        baseMapper.updateById(regionWare);
    }
}
