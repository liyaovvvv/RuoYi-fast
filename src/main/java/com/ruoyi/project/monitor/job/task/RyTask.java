package com.ruoyi.project.monitor.job.task;

import com.ruoyi.project.system.data.service.IDataViewService;
import org.springframework.stereotype.Component;
import com.ruoyi.common.utils.StringUtils;

import javax.annotation.Resource;

/**
 * 定时任务调度测试
 * 
 * @author ruoyi
 */
@Component("ryTask")
public class RyTask
{

    @Resource
    IDataViewService dataViewService;

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams()
    {
        System.out.println("执行无参方法");
    }

    /**
     * 地市合表统计定时任务
     */
    public void getDsTableGroupData(){
        dataViewService.getDsTableGroupData();
    }

    /**
     * 省直合表统计定时任务
     */
    public void getSzTableGroupData(){
        dataViewService.getSzTableGroupData();
    }

    /**
     * 数据治理明细统计定时任务
     */
    public void accountData(){
        dataViewService.accountData();
    }

    /**
     * 前置库省直数据量统计定时任务
     */
    public void accountSz(){
        dataViewService.accountSz();
    }

    /**
     * 前置库地市数据量统计定时任务
     */
    public void accountQZ(){
        dataViewService.accountQZ();
    }

    /**
     * 错误数据统计定时任务
     */
    public void getZlErrorData(){
        dataViewService.getZlErrorData();
    }

    /**
     * 省直监管事项主营覆盖率
     */
    public void getSzJgsxZyfgl(){
        dataViewService.getSzJgsxZyfgl();
    }

    /**
     * 地市监管事项主营覆盖率
     */
    public void getDsJgsxZyfgl(){
        dataViewService.getDsJgsxZyfgl();
    }

}
