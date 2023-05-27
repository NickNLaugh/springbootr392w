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


import com.dao.HuanzhetanpaifangDao;
import com.entity.HuanzhetanpaifangEntity;
import com.service.HuanzhetanpaifangService;
import com.entity.vo.HuanzhetanpaifangVO;
import com.entity.view.HuanzhetanpaifangView;

@Service("huanzhetanpaifangService")
public class HuanzhetanpaifangServiceImpl extends ServiceImpl<HuanzhetanpaifangDao, HuanzhetanpaifangEntity> implements HuanzhetanpaifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanzhetanpaifangEntity> page = this.selectPage(
                new Query<HuanzhetanpaifangEntity>(params).getPage(),
                new EntityWrapper<HuanzhetanpaifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanzhetanpaifangEntity> wrapper) {
		  Page<HuanzhetanpaifangView> page =new Query<HuanzhetanpaifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanzhetanpaifangVO> selectListVO(Wrapper<HuanzhetanpaifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanzhetanpaifangVO selectVO(Wrapper<HuanzhetanpaifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanzhetanpaifangView> selectListView(Wrapper<HuanzhetanpaifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanzhetanpaifangView selectView(Wrapper<HuanzhetanpaifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuanzhetanpaifangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuanzhetanpaifangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuanzhetanpaifangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
