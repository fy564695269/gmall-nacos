package org.fy.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fy.core.bean.PageVo;
import org.fy.core.bean.QueryCondition;
import org.fy.gmall.sms.entity.SeckillSkuNoticeEntity;



/**
 * 秒杀商品通知订阅
 *
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 22:28:34
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageVo queryPage(QueryCondition params);
}

