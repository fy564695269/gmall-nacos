package org.fy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fy.core.bean.PageVo;
import org.fy.core.bean.QueryCondition;
import org.fy.gmall.pms.entity.AttrAttrgroupRelationEntity;



/**
 * 属性&属性分组关联
 *
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 12:11:45
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

