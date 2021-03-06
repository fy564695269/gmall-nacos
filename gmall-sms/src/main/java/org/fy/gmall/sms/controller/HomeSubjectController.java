package org.fy.gmall.sms.controller;

import java.util.Arrays;
import java.util.Map;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.fy.core.bean.PageVo;
import org.fy.core.bean.QueryCondition;
import org.fy.core.bean.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import org.fy.gmall.sms.entity.HomeSubjectEntity;
import org.fy.gmall.sms.service.HomeSubjectService;




/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author fy
 * @email 2990598716@qq.com
 * @date 2020-04-27 22:28:34
 */
@Api(tags = "首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 管理")
@RestController
@RequestMapping("sms/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homesubject:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeSubjectService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homesubject:info')")
    public Resp<HomeSubjectEntity> info(@PathVariable("id") Long id){
		HomeSubjectEntity homeSubject = homeSubjectService.getById(id);

        return Resp.ok(homeSubject);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homesubject:save')")
    public Resp<Object> save(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.save(homeSubject);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homesubject:update')")
    public Resp<Object> update(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.updateById(homeSubject);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homesubject:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		homeSubjectService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
