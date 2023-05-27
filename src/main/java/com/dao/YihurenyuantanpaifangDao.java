package com.dao;

import com.entity.YihurenyuantanpaifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihurenyuantanpaifangVO;
import com.entity.view.YihurenyuantanpaifangView;


/**
 * 医护人员碳排放
 * 
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface YihurenyuantanpaifangDao extends BaseMapper<YihurenyuantanpaifangEntity> {
	
	List<YihurenyuantanpaifangVO> selectListVO(@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);
	
	YihurenyuantanpaifangVO selectVO(@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);
	
	List<YihurenyuantanpaifangView> selectListView(@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);

	List<YihurenyuantanpaifangView> selectListView(Pagination page,@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);
	
	YihurenyuantanpaifangView selectView(@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);
}
