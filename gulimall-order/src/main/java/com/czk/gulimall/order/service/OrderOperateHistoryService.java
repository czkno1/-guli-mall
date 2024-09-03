package com.czk.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czk.gulimall.common.utils.PageUtils;
import com.czk.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author czk
 * @email 1376298146@qq.com
 * @date 2024-09-01 14:17:45
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

