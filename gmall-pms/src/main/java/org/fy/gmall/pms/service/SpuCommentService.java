package org.fy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fy.core.bean.PageVo;
import org.fy.core.bean.QueryCondition;
import org.fy.gmall.pms.entity.SpuCommentEntity;


/**
 * 商品评价
 *
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 12:11:45
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

