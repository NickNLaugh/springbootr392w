package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiyuantanpaifangDao;
import com.entity.YiyuantanpaifangEntity;
import com.service.YiyuantanpaifangService;
import com.entity.vo.YiyuantanpaifangVO;
import com.entity.view.YiyuantanpaifangView;

@Service("yiyuantanpaifangService")
public class YiyuantanpaifangServiceImpl extends ServiceImpl<YiyuantanpaifangDao, YiyuantanpaifangEntity> implements YiyuantanpaifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuantanpaifangEntity> page = this.selectPage(
                new Query<YiyuantanpaifangEntity>(params).getPage(),
                new EntityWrapper<YiyuantanpaifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuantanpaifangEntity> wrapper) {
		  Page<YiyuantanpaifangView> page =new Query<YiyuantanpaifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuantanpaifangVO> selectListVO(Wrapper<YiyuantanpaifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuantanpaifangVO selectVO(Wrapper<YiyuantanpaifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuantanpaifangView> selectListView(Wrapper<YiyuantanpaifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuantanpaifangView selectView(Wrapper<YiyuantanpaifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
