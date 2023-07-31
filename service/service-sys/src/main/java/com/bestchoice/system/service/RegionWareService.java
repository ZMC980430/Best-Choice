package com.bestchoice.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.system.entity.RegionWare;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bestchoice.vo.sys.RegionWareQueryVo;

/**
 * <p>
 * 城市仓库关联表 服务类
 * </p>
 *
 * @author meicheng
 * @since 2023-07-30
 */
public interface RegionWareService extends IService<RegionWare> {
    IPage<RegionWare> selectPageRegionWare(Page<RegionWare> pageParam, RegionWareQueryVo regionWareQueryVo);

    boolean addRegion(RegionWare regionWare);

    void updateStatus(Long id, Integer status);
}
