package com.dao;

import com.entity.YihucheliangtanpaifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihucheliangtanpaifangVO;
import com.entity.view.YihucheliangtanpaifangView;


/**
 * 医护车辆碳排放
 * 
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface YihucheliangtanpaifangDao extends BaseMapper<YihucheliangtanpaifangEntity> {
	
	List<YihucheliangtanpaifangVO> selectListVO(@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);
	
	YihucheliangtanpaifangVO selectVO(@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);
	
	List<YihucheliangtanpaifangView> selectListView(@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);

	List<YihucheliangtanpaifangView> selectListView(Pagination page,@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);
	
	YihucheliangtanpaifangView selectView(@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);
}
