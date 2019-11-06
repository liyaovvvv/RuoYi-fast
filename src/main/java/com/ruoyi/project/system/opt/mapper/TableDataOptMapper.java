package com.ruoyi.project.system.opt.mapper;

import com.ruoyi.project.system.opt.domain.TableDataOpt;
import java.util.List;

/**
 * 合表配置Mapper接口
 * 
 * @author ruoyi
 * @date 2019-09-20
 */
public interface TableDataOptMapper 
{
    /**
     * 查询合表配置
     * 
     * @param id 合表配置ID
     * @return 合表配置
     */
    public TableDataOpt selectTableDataOptById(Long id);

    /**
     * 查询合表配置列表
     * 
     * @param tableDataOpt 合表配置
     * @return 合表配置集合
     */
    public List<TableDataOpt> selectTableDataOptList(TableDataOpt tableDataOpt);

    /**
     * 新增合表配置
     * 
     * @param tableDataOpt 合表配置
     * @return 结果
     */
    public int insertTableDataOpt(TableDataOpt tableDataOpt);

    /**
     * 修改合表配置
     * 
     * @param tableDataOpt 合表配置
     * @return 结果
     */
    public int updateTableDataOpt(TableDataOpt tableDataOpt);

    /**
     * 删除合表配置
     * 
     * @param id 合表配置ID
     * @return 结果
     */
    public int deleteTableDataOptById(Long id);

    /**
     * 批量删除合表配置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTableDataOptByIds(String[] ids);
}
