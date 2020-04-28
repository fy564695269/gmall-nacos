package org.fy.gmall.sms.service.impl;

import org.fy.core.bean.PageVo;
import org.fy.core.bean.Query;
import org.fy.core.bean.QueryCondition;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.fy.gmall.sms.dao.SpuFullReductionDao;
import org.fy.gmall.sms.entity.SpuFullReductionEntity;
import org.fy.gmall.sms.service.SpuFullReductionService;


@Service("spuFullReductionService")
public class SpuFullReductionServiceImpl extends ServiceImpl<SpuFullReductionDao, SpuFullReductionEntity> implements SpuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuFullReductionEntity> page = this.page(
                new Query<SpuFullReductionEntity>().getPage(params),
                new QueryWrapper<SpuFullReductionEntity>()
        );

        return new PageVo(page);
    }

}