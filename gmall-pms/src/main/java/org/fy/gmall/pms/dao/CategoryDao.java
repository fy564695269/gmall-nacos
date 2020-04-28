package org.fy.gmall.pms.dao;

import org.fy.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 12:11:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
