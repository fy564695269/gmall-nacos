package org.fy.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fy.core.bean.PageVo;
import org.fy.core.bean.QueryCondition;
import org.fy.gmall.sms.entity.HomeAdvEntity;



/**
 * 首页轮播广告
 *
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 22:28:34
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageVo queryPage(QueryCondition params);
}

