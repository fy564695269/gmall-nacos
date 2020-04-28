package org.fy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fy.core.bean.PageVo;
import org.fy.core.bean.QueryCondition;
import org.fy.gmall.pms.entity.AttrGroupEntity;


/**
 * 属性分组
 *
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 12:11:45
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

