package com.ruoyi.project.system.recode.service;

import com.ruoyi.project.system.recode.domain.AccountRecode;
import java.util.List;

/**
 * 统计数据存储Service接口
 * 
 * @author ruoyi
 * @date 2019-09-21
 */
public interface IAccountRecodeService 
{
    /**
     * 查询统计数据存储
     * 
     * @param id 统计数据存储ID
     * @return 统计数据存储
     */
    public AccountRecode selectAccountRecodeById(Long id);

    /**
     * 查询统计数据存储列表
     * 
     * @param accountRecode 统计数据存储
     * @return 统计数据存储集合
     */
    public List<AccountRecode> selectAccountRecodeList(AccountRecode accountRecode);

    /**
     * 新增统计数据存储
     * 
     * @param accountRecode 统计数据存储
     * @return 结果
     */
    public int insertAccountRecode(AccountRecode accountRecode);

    /**
     * 修改统计数据存储
     * 
     * @param accountRecode 统计数据存储
     * @return 结果
     */
    public int updateAccountRecode(AccountRecode accountRecode);

    /**
     * 批量删除统计数据存储
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAccountRecodeByIds(String ids);

    /**
     * 删除统计数据存储信息
     * 
     * @param id 统计数据存储ID
     * @return 结果
     */
    public int deleteAccountRecodeById(Long id);
}
