package com.czk.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czk.gulimall.common.utils.PageUtils;
import com.czk.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author czk
 * @email 1376298146@qq.com
 * @date 2024-09-01 13:57:47
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

