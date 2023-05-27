package com.dao;

import com.entity.DiscussyiyuantanpaifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyiyuantanpaifangVO;
import com.entity.view.DiscussyiyuantanpaifangView;


/**
 * 医院碳排放评论表
 * 
 * @author 
 * @email 
 * @date 2022-07-23 20:16:45
 */
public interface DiscussyiyuantanpaifangDao extends BaseMapper<DiscussyiyuantanpaifangEntity> {
	
	List<DiscussyiyuantanpaifangVO> selectListVO(@Param("ew") Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
	
	DiscussyiyuantanpaifangVO selectVO(@Param("ew") Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
	
	List<DiscussyiyuantanpaifangView> selectListView(@Param("ew") Wrapper<DiscussyiyuantanpaifangEntity> wrapper);

	List<DiscussyiyuantanpaifangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
	
	DiscussyiyuantanpaifangView selectView(@Param("ew") Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
	

}
