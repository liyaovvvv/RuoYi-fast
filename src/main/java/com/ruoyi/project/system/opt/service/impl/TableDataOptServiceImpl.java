package com.ruoyi.project.system.opt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.opt.mapper.TableDataOptMapper;
import com.ruoyi.project.system.opt.domain.TableDataOpt;
import com.ruoyi.project.system.opt.service.ITableDataOptService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 合表配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-20
 */
@Service
public class TableDataOptServiceImpl implements ITableDataOptService 
{
    @Autowired
    private TableDataOptMapper tableDataOptMapper;

    /**
     * 查询合表配置
     * 
     * @param id 合表配置ID
     * @return 合表配置
     */
    @Override
    public TableDataOpt selectTableDataOptById(Long id)
    {
        return tableDataOptMapper.selectTableDataOptById(id);
    }

    /**
     * 查询合表配置列表
     * 
     * @param tableDataOpt 合表配置
     * @return 合表配置
     */
    @Override
    public List<TableDataOpt> selectTableDataOptList(TableDataOpt tableDataOpt)
    {
        return tableDataOptMapper.selectTableDataOptList(tableDataOpt);
    }

    /**
     * 新增合表配置
     * 
     * @param tableDataOpt 合表配置
     * @return 结果
     */
    @Override
    public int insertTableDataOpt(TableDataOpt tableDataOpt)
    {
        tableDataOpt.setCreateTime(DateUtils.getNowDate());
        return tableDataOptMapper.insertTableDataOpt(tableDataOpt);
    }

    /**
     * 修改合表配置
     * 
     * @param tableDataOpt 合表配置
     * @return 结果
     */
    @Override
    public int updateTableDataOpt(TableDataOpt tableDataOpt)
    {
        tableDataOpt.setUpdateTime(DateUtils.getNowDate());
        return tableDataOptMapper.updateTableDataOpt(tableDataOpt);
    }

    /**
     * 删除合表配置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTableDataOptByIds(String ids)
    {
        return tableDataOptMapper.deleteTableDataOptByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除合表配置信息
     * 
     * @param id 合表配置ID
     * @return 结果
     */
    public int deleteTableDataOptById(Long id)
    {
        return tableDataOptMapper.deleteTableDataOptById(id);
    }
}
