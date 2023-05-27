package com.dao;

import com.entity.HuanzhetanpaifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanzhetanpaifangVO;
import com.entity.view.HuanzhetanpaifangView;


/**
 * 患者碳排放
 * 
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface HuanzhetanpaifangDao extends BaseMapper<HuanzhetanpaifangEntity> {
	
	List<HuanzhetanpaifangVO> selectListVO(@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);
	
	HuanzhetanpaifangVO selectVO(@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);
	
	List<HuanzhetanpaifangView> selectListView(@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);

	List<HuanzhetanpaifangView> selectListView(Pagination page,@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);
	
	HuanzhetanpaifangView selectView(@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);
}
