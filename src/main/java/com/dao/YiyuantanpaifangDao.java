package com.dao;

import com.entity.YiyuantanpaifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuantanpaifangVO;
import com.entity.view.YiyuantanpaifangView;


/**
 * 医院碳排放
 * 
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface YiyuantanpaifangDao extends BaseMapper<YiyuantanpaifangEntity> {
	
	List<YiyuantanpaifangVO> selectListVO(@Param("ew") Wrapper<YiyuantanpaifangEntity> wrapper);
	
	YiyuantanpaifangVO selectVO(@Param("ew") Wrapper<YiyuantanpaifangEntity> wrapper);
	
	List<YiyuantanpaifangView> selectListView(@Param("ew") Wrapper<YiyuantanpaifangEntity> wrapper);

	List<YiyuantanpaifangView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuantanpaifangEntity> wrapper);
	
	YiyuantanpaifangView selectView(@Param("ew") Wrapper<YiyuantanpaifangEntity> wrapper);
	

}
