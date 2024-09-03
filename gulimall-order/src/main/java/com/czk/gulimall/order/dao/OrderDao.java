package com.czk.gulimall.order.dao;

import com.czk.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author czk
 * @email 1376298146@qq.com
 * @date 2024-09-01 14:17:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
