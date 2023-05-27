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


import com.dao.YihucheliangtanpaifangDao;
import com.entity.YihucheliangtanpaifangEntity;
import com.service.YihucheliangtanpaifangService;
import com.entity.vo.YihucheliangtanpaifangVO;
import com.entity.view.YihucheliangtanpaifangView;

@Service("yihucheliangtanpaifangService")
public class YihucheliangtanpaifangServiceImpl extends ServiceImpl<YihucheliangtanpaifangDao, YihucheliangtanpaifangEntity> implements YihucheliangtanpaifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihucheliangtanpaifangEntity> page = this.selectPage(
                new Query<YihucheliangtanpaifangEntity>(params).getPage(),
                new EntityWrapper<YihucheliangtanpaifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihucheliangtanpaifangEntity> wrapper) {
		  Page<YihucheliangtanpaifangView> page =new Query<YihucheliangtanpaifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihucheliangtanpaifangVO> selectListVO(Wrapper<YihucheliangtanpaifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihucheliangtanpaifangVO selectVO(Wrapper<YihucheliangtanpaifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihucheliangtanpaifangView> selectListView(Wrapper<YihucheliangtanpaifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihucheliangtanpaifangView selectView(Wrapper<YihucheliangtanpaifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YihucheliangtanpaifangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YihucheliangtanpaifangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YihucheliangtanpaifangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
