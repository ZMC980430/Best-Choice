package com.bestchoice.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bestchoice.system.entity.Region;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bestchoice.system.entity.RegionWare;
import com.bestchoice.vo.sys.RegionWareQueryVo;

import java.util.List;

/**
 * <p>
 * 地区表 服务类
 * </p>
 *
 * @author meicheng
 * @since 2023-07-30
 */
public interface RegionService extends IService<Region> {
    public List<Region> findByKeyword(String keyword);
}
