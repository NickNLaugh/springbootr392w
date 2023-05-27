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


import com.dao.YihurenyuantanpaifangDao;
import com.entity.YihurenyuantanpaifangEntity;
import com.service.YihurenyuantanpaifangService;
import com.entity.vo.YihurenyuantanpaifangVO;
import com.entity.view.YihurenyuantanpaifangView;

@Service("yihurenyuantanpaifangService")
public class YihurenyuantanpaifangServiceImpl extends ServiceImpl<YihurenyuantanpaifangDao, YihurenyuantanpaifangEntity> implements YihurenyuantanpaifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihurenyuantanpaifangEntity> page = this.selectPage(
                new Query<YihurenyuantanpaifangEntity>(params).getPage(),
                new EntityWrapper<YihurenyuantanpaifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihurenyuantanpaifangEntity> wrapper) {
		  Page<YihurenyuantanpaifangView> page =new Query<YihurenyuantanpaifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihurenyuantanpaifangVO> selectListVO(Wrapper<YihurenyuantanpaifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihurenyuantanpaifangVO selectVO(Wrapper<YihurenyuantanpaifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihurenyuantanpaifangView> selectListView(Wrapper<YihurenyuantanpaifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihurenyuantanpaifangView selectView(Wrapper<YihurenyuantanpaifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YihurenyuantanpaifangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YihurenyuantanpaifangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YihurenyuantanpaifangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
