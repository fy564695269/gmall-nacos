package org.fy.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fy.core.bean.PageVo;
import org.fy.core.bean.QueryCondition;
import org.fy.gmall.sms.entity.SpuBoundsEntity;


/**
 * 商品spu积分设置
 *
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 22:28:34
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

