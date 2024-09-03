package com.czk.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czk.gulimall.common.utils.PageUtils;
import com.czk.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author czk
 * @email 1376298146@qq.com
 * @date 2024-09-01 14:21:42
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

