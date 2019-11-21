package com.ruoyi.project.system.gbdata.mapper;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import com.ruoyi.project.system.gbdata.domain.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by issuser on 2019/11/14.
 */
public interface GbDataViewMapper {
    @DataSource(DataSourceType.GB)
    List<DataDictionary> getDataDictionary();

    @DataSource(DataSourceType.GB)
    List<ImplementOrgCode> getImplementOrgCode();

    @DataSource(DataSourceType.GB)
    void updateDataDictionary(@Param("dkey") String dkey, @Param("dvalue") String dvalue, @Param("update_time") String update_time);

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @DataSource(DataSourceType.GB)
    public JgJgxwCheckAction selectJgJgxwCheckActionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param jgJgxwCheckAction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    @DataSource(DataSourceType.GB)
    public List<JgJgxwCheckAction> selectJgJgxwCheckActionList(JgJgxwCheckAction jgJgxwCheckAction);

    /**
     * 新增【请填写功能名称】
     *
     * @param jgJgxwCheckAction 【请填写功能名称】
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int insertJgJgxwCheckAction(JgJgxwCheckAction jgJgxwCheckAction) throws Exception;

    /**
     * 修改【请填写功能名称】
     *
     * @param jgJgxwCheckAction 【请填写功能名称】
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int updateJgJgxwCheckAction(JgJgxwCheckAction jgJgxwCheckAction);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwCheckActionById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwCheckActionByIds(String[] ids);

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @DataSource(DataSourceType.GB)
    public JgJgxwOtherAction selectJgJgxwOtherActionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param jgJgxwOtherAction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    @DataSource(DataSourceType.GB)
    public List<JgJgxwOtherAction> selectJgJgxwOtherActionList(JgJgxwOtherAction jgJgxwOtherAction);

    /**
     * 新增【请填写功能名称】
     *
     * @param jgJgxwOtherAction 【请填写功能名称】
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int insertJgJgxwOtherAction(JgJgxwOtherAction jgJgxwOtherAction) throws Exception;

    /**
     * 修改【请填写功能名称】
     *
     * @param jgJgxwOtherAction 【请填写功能名称】
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int updateJgJgxwOtherAction(JgJgxwOtherAction jgJgxwOtherAction);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwOtherActionById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwOtherActionByIds(String[] ids);

    /**
     * 查询【请填写功能名称】
     *
     * @param submittedDate 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @DataSource(DataSourceType.GB)
    public JgJgxwPunishAction selectJgJgxwPunishActionById(String submittedDate);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param jgJgxwPunishAction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    @DataSource(DataSourceType.GB)
    public List<JgJgxwPunishAction> selectJgJgxwPunishActionList(JgJgxwPunishAction jgJgxwPunishAction);

    /**
     * 新增【请填写功能名称】
     *
     * @param jgJgxwPunishAction 【请填写功能名称】
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int insertJgJgxwPunishAction(JgJgxwPunishAction jgJgxwPunishAction) throws Exception;

    /**
     * 修改【请填写功能名称】
     *
     * @param jgJgxwPunishAction 【请填写功能名称】
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int updateJgJgxwPunishAction(JgJgxwPunishAction jgJgxwPunishAction);

    /**
     * 删除【请填写功能名称】
     *
     * @param submittedDate 【请填写功能名称】ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwPunishActionById(String submittedDate);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param submittedDates 需要删除的数据ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwPunishActionByIds(String[] submittedDates);


    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @DataSource(DataSourceType.GB)
    public JgJgxwForceAction selectJgJgxwForceActionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param jgJgxwForceAction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    @DataSource(DataSourceType.GB)
    public List<JgJgxwForceAction> selectJgJgxwForceActionList(JgJgxwForceAction jgJgxwForceAction);

    /**
     * 新增【请填写功能名称】
     *
     * @param jgJgxwForceAction 【请填写功能名称】
     * @return 结果
     */

    @DataSource(DataSourceType.GB)
    public int insertJgJgxwForceAction(JgJgxwForceAction jgJgxwForceAction) throws Exception;

    /**
     * 修改【请填写功能名称】
     *
     * @param jgJgxwForceAction 【请填写功能名称】
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int updateJgJgxwForceAction(JgJgxwForceAction jgJgxwForceAction);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwForceActionById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteJgJgxwForceActionByIds(String[] ids);

    /**
     * 查询未保存成功的数据，方便以后插入
     *
     * @param id 未保存成功的数据，方便以后插入ID
     * @return 未保存成功的数据，方便以后插入
     */
    @DataSource(DataSourceType.GB)
    public ErrorRecord selectErrorRecordById(Long id);

    /**
     * 查询未保存成功的数据，方便以后插入列表
     *
     * @param errorRecord 未保存成功的数据，方便以后插入
     * @return 未保存成功的数据，方便以后插入集合
     */
    @DataSource(DataSourceType.GB)
    public List<ErrorRecord> selectErrorRecordList(ErrorRecord errorRecord);

    /**
     * 新增未保存成功的数据，方便以后插入
     *
     * @param errorRecord 未保存成功的数据，方便以后插入
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int insertErrorRecord(ErrorRecord errorRecord);

    /**
     * 修改未保存成功的数据，方便以后插入
     *
     * @param errorRecord 未保存成功的数据，方便以后插入
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int updateErrorRecord(ErrorRecord errorRecord);

    /**
     * 删除未保存成功的数据，方便以后插入
     *
     * @param id 未保存成功的数据，方便以后插入ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteErrorRecordById(Long id);

    /**
     * 批量删除未保存成功的数据，方便以后插入
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @DataSource(DataSourceType.GB)
    public int deleteErrorRecordByIds(String[] ids);
}
