package com.ruoyi.project.system.opt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 合表配置对象 sys_table_data_opt
 * 
 * @author ruoyi
 * @date 2019-09-20
 */
public class TableDataOpt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 配置名称 */
    @Excel(name = "配置名称")
    private String optName;

    /** 配置信息 */
    @Excel(name = "配置信息")
    private String optInfo;

    /** null */
    @Excel(name = "null", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updataTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOptName(String optName) 
    {
        this.optName = optName;
    }

    public String getOptName() 
    {
        return optName;
    }
    public void setOptInfo(String optInfo) 
    {
        this.optInfo = optInfo;
    }

    public String getOptInfo() 
    {
        return optInfo;
    }
    public void setUpdataTime(Date updataTime) 
    {
        this.updataTime = updataTime;
    }

    public Date getUpdataTime() 
    {
        return updataTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("optName", getOptName())
            .append("optInfo", getOptInfo())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updataTime", getUpdataTime())
            .append("remark", getRemark())
            .toString();
    }
}
