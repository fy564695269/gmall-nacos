package org.fy.gmall.sms.service.impl;

import org.fy.core.bean.PageVo;
import org.fy.core.bean.Query;
import org.fy.core.bean.QueryCondition;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import org.fy.gmall.sms.dao.MemberPriceDao;
import org.fy.gmall.sms.entity.MemberPriceEntity;
import org.fy.gmall.sms.service.MemberPriceService;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberPriceEntity> page = this.page(
                new Query<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

        return new PageVo(page);
    }

}