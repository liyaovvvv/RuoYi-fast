package com.ruoyi.project.system.action.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 jg_jgxw_force_action
 * 
 * @author ruoyi
 * @date 2019-11-18
 */
public class JgJgxwForceAction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String submittedDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkActionCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String addressRegistered;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdIdBef;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String areaNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkPersonnelCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkForm;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String implementInstitutionCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkResult;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdSource;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCpCeType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String superviseItemImplementCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String addressOperating;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lyType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkActionName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String submittedPersonnel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCpNa;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkPersonnel;

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
    private String checkMode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdOperation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdBatch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String superviseItemCheckIcode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String implementInstitution;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String entrustDept;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String planId;

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
    public void setSubmittedDate(String submittedDate) 
    {
        this.submittedDate = submittedDate;
    }

    public String getSubmittedDate() 
    {
        return submittedDate;
    }
    public void setCheckActionCode(String checkActionCode) 
    {
        this.checkActionCode = checkActionCode;
    }

    public String getCheckActionCode() 
    {
        return checkActionCode;
    }
    public void setAddressRegistered(String addressRegistered) 
    {
        this.addressRegistered = addressRegistered;
    }

    public String getAddressRegistered() 
    {
        return addressRegistered;
    }
    public void setCheckType(String checkType) 
    {
        this.checkType = checkType;
    }

    public String getCheckType() 
    {
        return checkType;
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
    public void setCheckPersonnelCode(String checkPersonnelCode) 
    {
        this.checkPersonnelCode = checkPersonnelCode;
    }

    public String getCheckPersonnelCode() 
    {
        return checkPersonnelCode;
    }
    public void setCheckForm(String checkForm) 
    {
        this.checkForm = checkForm;
    }

    public String getCheckForm() 
    {
        return checkForm;
    }
    public void setImplementInstitutionCode(String implementInstitutionCode) 
    {
        this.implementInstitutionCode = implementInstitutionCode;
    }

    public String getImplementInstitutionCode() 
    {
        return implementInstitutionCode;
    }
    public void setCheckResult(String checkResult) 
    {
        this.checkResult = checkResult;
    }

    public String getCheckResult() 
    {
        return checkResult;
    }
    public void setCdSource(String cdSource) 
    {
        this.cdSource = cdSource;
    }

    public String getCdSource() 
    {
        return cdSource;
    }
    public void setCheckDate(String checkDate) 
    {
        this.checkDate = checkDate;
    }

    public String getCheckDate() 
    {
        return checkDate;
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
    public void setSuperviseItemImplementCode(String superviseItemImplementCode) 
    {
        this.superviseItemImplementCode = superviseItemImplementCode;
    }

    public String getSuperviseItemImplementCode() 
    {
        return superviseItemImplementCode;
    }
    public void setAddressOperating(String addressOperating) 
    {
        this.addressOperating = addressOperating;
    }

    public String getAddressOperating() 
    {
        return addressOperating;
    }
    public void setLyType(String lyType) 
    {
        this.lyType = lyType;
    }

    public String getLyType() 
    {
        return lyType;
    }
    public void setCheckActionName(String checkActionName) 
    {
        this.checkActionName = checkActionName;
    }

    public String getCheckActionName() 
    {
        return checkActionName;
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
    public void setCheckPersonnel(String checkPersonnel) 
    {
        this.checkPersonnel = checkPersonnel;
    }

    public String getCheckPersonnel() 
    {
        return checkPersonnel;
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
    public void setCheckMode(String checkMode) 
    {
        this.checkMode = checkMode;
    }

    public String getCheckMode() 
    {
        return checkMode;
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
    public void setSuperviseItemCheckIcode(String superviseItemCheckIcode) 
    {
        this.superviseItemCheckIcode = superviseItemCheckIcode;
    }

    public String getSuperviseItemCheckIcode() 
    {
        return superviseItemCheckIcode;
    }
    public void setImplementInstitution(String implementInstitution) 
    {
        this.implementInstitution = implementInstitution;
    }

    public String getImplementInstitution() 
    {
        return implementInstitution;
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
    public void setAdministrativeCp(String administrativeCp) 
    {
        this.administrativeCp = administrativeCp;
    }

    public String getAdministrativeCp() 
    {
        return administrativeCp;
    }
    public void setPlanId(String planId) 
    {
        this.planId = planId;
    }

    public String getPlanId() 
    {
        return planId;
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
            .append("submittedDate", getSubmittedDate())
            .append("checkActionCode", getCheckActionCode())
            .append("addressRegistered", getAddressRegistered())
            .append("checkType", getCheckType())
            .append("cdIdBef", getCdIdBef())
            .append("areaNumber", getAreaNumber())
            .append("checkPersonnelCode", getCheckPersonnelCode())
            .append("checkForm", getCheckForm())
            .append("implementInstitutionCode", getImplementInstitutionCode())
            .append("updateTime", getUpdateTime())
            .append("checkResult", getCheckResult())
            .append("cdSource", getCdSource())
            .append("checkDate", getCheckDate())
            .append("administrativeCpCeType", getAdministrativeCpCeType())
            .append("cdId", getCdId())
            .append("superviseItemImplementCode", getSuperviseItemImplementCode())
            .append("addressOperating", getAddressOperating())
            .append("lyType", getLyType())
            .append("checkActionName", getCheckActionName())
            .append("submittedPersonnel", getSubmittedPersonnel())
            .append("administrativeCpNa", getAdministrativeCpNa())
            .append("checkPersonnel", getCheckPersonnel())
            .append("createTime", getCreateTime())
            .append("recordUniqueIdentity", getRecordUniqueIdentity())
            .append("administrativeCpUiCode", getAdministrativeCpUiCode())
            .append("superviseObject", getSuperviseObject())
            .append("entrustDeptCode", getEntrustDeptCode())
            .append("checkMode", getCheckMode())
            .append("cdOperation", getCdOperation())
            .append("cdBatch", getCdBatch())
            .append("superviseItemCheckIcode", getSuperviseItemCheckIcode())
            .append("implementInstitution", getImplementInstitution())
            .append("cdTime", getCdTime())
            .append("entrustDept", getEntrustDept())
            .append("administrativeCp", getAdministrativeCp())
            .append("planId", getPlanId())
            .append("cdLsh", getCdLsh())
            .append("cdLshSrc", getCdLshSrc())
            .toString();
    }
}
