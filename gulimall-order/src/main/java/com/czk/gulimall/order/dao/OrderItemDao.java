package com.czk.gulimall.order.dao;

import com.czk.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author czk
 * @email 1376298146@qq.com
 * @date 2024-09-01 14:17:45
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
