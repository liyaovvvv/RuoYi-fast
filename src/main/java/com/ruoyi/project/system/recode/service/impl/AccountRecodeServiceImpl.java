package com.ruoyi.project.system.recode.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.recode.mapper.AccountRecodeMapper;
import com.ruoyi.project.system.recode.domain.AccountRecode;
import com.ruoyi.project.system.recode.service.IAccountRecodeService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 统计数据存储Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-09-21
 */
@Service
public class AccountRecodeServiceImpl implements IAccountRecodeService 
{
    @Autowired
    private AccountRecodeMapper accountRecodeMapper;

    /**
     * 查询统计数据存储
     * 
     * @param id 统计数据存储ID
     * @return 统计数据存储
     */
    @Override
    public AccountRecode selectAccountRecodeById(Long id)
    {
        return accountRecodeMapper.selectAccountRecodeById(id);
    }

    /**
     * 查询统计数据存储列表
     * 
     * @param accountRecode 统计数据存储
     * @return 统计数据存储
     */
    @Override
    public List<AccountRecode> selectAccountRecodeList(AccountRecode accountRecode)
    {
        return accountRecodeMapper.selectAccountRecodeList(accountRecode);
    }

    /**
     * 查询统计数据存储列表（地市变化）
     *
     * @param accountRecode 统计数据存储
     * @return 统计数据存储
     */
    @Override
    public List<AccountRecode> selectAccountRecodeListChangeDs(AccountRecode accountRecode)
    {
        return accountRecodeMapper.selectAccountRecodeListChangeDs(accountRecode);
    }

    /**
     * 查询统计数据存储列表（省直变化）
     *
     * @param accountRecode 统计数据存储
     * @return 统计数据存储
     */
    @Override
    public List<AccountRecode> selectAccountRecodeListChangeSz(AccountRecode accountRecode)
    {
        return accountRecodeMapper.selectAccountRecodeListChangeSz(accountRecode);
    }
    /**
     * 新增统计数据存储
     * 
     * @param accountRecode 统计数据存储
     * @return 结果
     */
    @Override
    public int insertAccountRecode(AccountRecode accountRecode)
    {
        accountRecode.setCreateTime(DateUtils.getNowDate());
        accountRecode.setCreateTime(DateUtils.getNowDate());
        return accountRecodeMapper.insertAccountRecode(accountRecode);
    }

    /**
     * 修改统计数据存储
     * 
     * @param accountRecode 统计数据存储
     * @return 结果
     */
    @Override
    public int updateAccountRecode(AccountRecode accountRecode)
    {
        accountRecode.setUpdateTime(DateUtils.getNowDate());
        accountRecode.setUpdateTime(DateUtils.getNowDate());
        return accountRecodeMapper.updateAccountRecode(accountRecode);
    }

    /**
     * 删除统计数据存储对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAccountRecodeByIds(String ids)
    {
        return accountRecodeMapper.deleteAccountRecodeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除统计数据存储信息
     * 
     * @param id 统计数据存储ID
     * @return 结果
     */
    public int deleteAccountRecodeById(Long id)
    {
        return accountRecodeMapper.deleteAccountRecodeById(id);
    }
}
