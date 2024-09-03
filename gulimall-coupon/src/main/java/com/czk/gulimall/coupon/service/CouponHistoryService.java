package com.czk.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czk.gulimall.common.utils.PageUtils;
import com.czk.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author czk
 * @email 1376298146@qq.com
 * @date 2024-09-01 13:57:47
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

