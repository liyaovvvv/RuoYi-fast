package com.ruoyi.project.system.action.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 jg_jgxw_other_action
 * 
 * @author ruoyi
 * @date 2019-11-15
 */
public class JgJgxwOtherAction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String submittedDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String closingCase;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String actionCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String addressRegistered;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdIdBef;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String areaNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String implementInstitutionCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdSource;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String actionName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCpCeType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String addressOperating;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lyType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String submittedPersonnel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCpNa;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String superviseMeasure;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkBehaviorNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recordUniqueIdentity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCpUiCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String superviseObject;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String entrustDeptCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdOperation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdBatch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String implementInstitution;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String itemSource;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String entrustDept;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String superviseItemCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdLsh;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdLshSrc;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEndDate(String endDate) 
    {
        this.endDate = endDate;
    }

    public String getEndDate() 
    {
        return endDate;
    }
    public void setSubmittedDate(String submittedDate) 
    {
        this.submittedDate = submittedDate;
    }

    public String getSubmittedDate() 
    {
        return submittedDate;
    }
    public void setClosingCase(String closingCase) 
    {
        this.closingCase = closingCase;
    }

    public String getClosingCase() 
    {
        return closingCase;
    }
    public void setActionCode(String actionCode) 
    {
        this.actionCode = actionCode;
    }

    public String getActionCode() 
    {
        return actionCode;
    }
    public void setAddressRegistered(String addressRegistered) 
    {
        this.addressRegistered = addressRegistered;
    }

    public String getAddressRegistered() 
    {
        return addressRegistered;
    }
    public void setCdIdBef(String cdIdBef) 
    {
        this.cdIdBef = cdIdBef;
    }

    public String getCdIdBef() 
    {
        return cdIdBef;
    }
    public void setAreaNumber(String areaNumber) 
    {
        this.areaNumber = areaNumber;
    }

    public String getAreaNumber() 
    {
        return areaNumber;
    }
    public void setImplementInstitutionCode(String implementInstitutionCode) 
    {
        this.implementInstitutionCode = implementInstitutionCode;
    }

    public String getImplementInstitutionCode() 
    {
        return implementInstitutionCode;
    }
    public void setCdSource(String cdSource) 
    {
        this.cdSource = cdSource;
    }

    public String getCdSource() 
    {
        return cdSource;
    }
    public void setActionName(String actionName) 
    {
        this.actionName = actionName;
    }

    public String getActionName() 
    {
        return actionName;
    }
    public void setAdministrativeCpCeType(String administrativeCpCeType) 
    {
        this.administrativeCpCeType = administrativeCpCeType;
    }

    public String getAdministrativeCpCeType() 
    {
        return administrativeCpCeType;
    }
    public void setCdId(String cdId) 
    {
        this.cdId = cdId;
    }

    public String getCdId() 
    {
        return cdId;
    }
    public void setAddressOperating(String addressOperating) 
    {
        this.addressOperating = addressOperating;
    }

    public String getAddressOperating() 
    {
        return addressOperating;
    }
    public void setStartDate(String startDate) 
    {
        this.startDate = startDate;
    }

    public String getStartDate() 
    {
        return startDate;
    }
    public void setLyType(String lyType) 
    {
        this.lyType = lyType;
    }

    public String getLyType() 
    {
        return lyType;
    }
    public void setSubmittedPersonnel(String submittedPersonnel) 
    {
        this.submittedPersonnel = submittedPersonnel;
    }

    public String getSubmittedPersonnel() 
    {
        return submittedPersonnel;
    }
    public void setAdministrativeCpNa(String administrativeCpNa) 
    {
        this.administrativeCpNa = administrativeCpNa;
    }

    public String getAdministrativeCpNa() 
    {
        return administrativeCpNa;
    }
    public void setSuperviseMeasure(String superviseMeasure) 
    {
        this.superviseMeasure = superviseMeasure;
    }

    public String getSuperviseMeasure() 
    {
        return superviseMeasure;
    }
    public void setCheckBehaviorNumber(String checkBehaviorNumber) 
    {
        this.checkBehaviorNumber = checkBehaviorNumber;
    }

    public String getCheckBehaviorNumber() 
    {
        return checkBehaviorNumber;
    }
    public void setRecordUniqueIdentity(String recordUniqueIdentity) 
    {
        this.recordUniqueIdentity = recordUniqueIdentity;
    }

    public String getRecordUniqueIdentity() 
    {
        return recordUniqueIdentity;
    }
    public void setAdministrativeCpUiCode(String administrativeCpUiCode) 
    {
        this.administrativeCpUiCode = administrativeCpUiCode;
    }

    public String getAdministrativeCpUiCode() 
    {
        return administrativeCpUiCode;
    }
    public void setSuperviseObject(String superviseObject) 
    {
        this.superviseObject = superviseObject;
    }

    public String getSuperviseObject() 
    {
        return superviseObject;
    }
    public void setEntrustDeptCode(String entrustDeptCode) 
    {
        this.entrustDeptCode = entrustDeptCode;
    }

    public String getEntrustDeptCode() 
    {
        return entrustDeptCode;
    }
    public void setCdOperation(String cdOperation) 
    {
        this.cdOperation = cdOperation;
    }

    public String getCdOperation() 
    {
        return cdOperation;
    }
    public void setCdBatch(String cdBatch) 
    {
        this.cdBatch = cdBatch;
    }

    public String getCdBatch() 
    {
        return cdBatch;
    }
    public void setImplementInstitution(String implementInstitution) 
    {
        this.implementInstitution = implementInstitution;
    }

    public String getImplementInstitution() 
    {
        return implementInstitution;
    }
    public void setItemSource(String itemSource) 
    {
        this.itemSource = itemSource;
    }

    public String getItemSource() 
    {
        return itemSource;
    }
    public void setCdTime(String cdTime) 
    {
        this.cdTime = cdTime;
    }

    public String getCdTime() 
    {
        return cdTime;
    }
    public void setEntrustDept(String entrustDept) 
    {
        this.entrustDept = entrustDept;
    }

    public String getEntrustDept() 
    {
        return entrustDept;
    }
    public void setSuperviseItemCode(String superviseItemCode) 
    {
        this.superviseItemCode = superviseItemCode;
    }

    public String getSuperviseItemCode() 
    {
        return superviseItemCode;
    }
    public void setAdministrativeCp(String administrativeCp) 
    {
        this.administrativeCp = administrativeCp;
    }

    public String getAdministrativeCp() 
    {
        return administrativeCp;
    }
    public void setCdLsh(String cdLsh) 
    {
        this.cdLsh = cdLsh;
    }

    public String getCdLsh() 
    {
        return cdLsh;
    }
    public void setCdLshSrc(String cdLshSrc) 
    {
        this.cdLshSrc = cdLshSrc;
    }

    public String getCdLshSrc() 
    {
        return cdLshSrc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("endDate", getEndDate())
            .append("submittedDate", getSubmittedDate())
            .append("closingCase", getClosingCase())
            .append("actionCode", getActionCode())
            .append("addressRegistered", getAddressRegistered())
            .append("cdIdBef", getCdIdBef())
            .append("areaNumber", getAreaNumber())
            .append("implementInstitutionCode", getImplementInstitutionCode())
            .append("updateTime", getUpdateTime())
            .append("cdSource", getCdSource())
            .append("actionName", getActionName())
            .append("administrativeCpCeType", getAdministrativeCpCeType())
            .append("cdId", getCdId())
            .append("addressOperating", getAddressOperating())
            .append("startDate", getStartDate())
            .append("lyType", getLyType())
            .append("submittedPersonnel", getSubmittedPersonnel())
            .append("administrativeCpNa", getAdministrativeCpNa())
            .append("superviseMeasure", getSuperviseMeasure())
            .append("createTime", getCreateTime())
            .append("checkBehaviorNumber", getCheckBehaviorNumber())
            .append("recordUniqueIdentity", getRecordUniqueIdentity())
            .append("administrativeCpUiCode", getAdministrativeCpUiCode())
            .append("superviseObject", getSuperviseObject())
            .append("entrustDeptCode", getEntrustDeptCode())
            .append("cdOperation", getCdOperation())
            .append("cdBatch", getCdBatch())
            .append("implementInstitution", getImplementInstitution())
            .append("itemSource", getItemSource())
            .append("cdTime", getCdTime())
            .append("entrustDept", getEntrustDept())
            .append("superviseItemCode", getSuperviseItemCode())
            .append("administrativeCp", getAdministrativeCp())
            .append("cdLsh", getCdLsh())
            .append("cdLshSrc", getCdLshSrc())
            .toString();
    }
}
