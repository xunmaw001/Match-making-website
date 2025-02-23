package com.dao;

import com.entity.HuodongleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongleixingVO;
import com.entity.view.HuodongleixingView;


/**
 * 活动类型
 * 
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface HuodongleixingDao extends BaseMapper<HuodongleixingEntity> {
	
	List<HuodongleixingVO> selectListVO(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	
	HuodongleixingVO selectVO(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	
	List<HuodongleixingView> selectListView(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);

	List<HuodongleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	
	HuodongleixingView selectView(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	
}
