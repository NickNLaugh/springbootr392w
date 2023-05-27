package com.dao;

import com.entity.DitanzhihuiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DitanzhihuiyuanVO;
import com.entity.view.DitanzhihuiyuanView;


/**
 * 低碳智慧园
 * 
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface DitanzhihuiyuanDao extends BaseMapper<DitanzhihuiyuanEntity> {
	
	List<DitanzhihuiyuanVO> selectListVO(@Param("ew") Wrapper<DitanzhihuiyuanEntity> wrapper);
	
	DitanzhihuiyuanVO selectVO(@Param("ew") Wrapper<DitanzhihuiyuanEntity> wrapper);
	
	List<DitanzhihuiyuanView> selectListView(@Param("ew") Wrapper<DitanzhihuiyuanEntity> wrapper);

	List<DitanzhihuiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DitanzhihuiyuanEntity> wrapper);
	
	DitanzhihuiyuanView selectView(@Param("ew") Wrapper<DitanzhihuiyuanEntity> wrapper);
	

}
