package com.czk.gulimall.member.dao;

import com.czk.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author czk
 * @email 1376298146@qq.com
 * @date 2024-09-01 14:06:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
