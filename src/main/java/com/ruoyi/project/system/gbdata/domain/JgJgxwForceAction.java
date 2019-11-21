package com.ruoyi.project.system.gbdata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 【请填写功能名称】对象 jg_jgxw_force_action
 * 
 * @author ruoyi
 * @date 2019-11-20
 */
public class JgJgxwForceAction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date submittedDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String forceExecutionType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String forceType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkActionCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String forceActionName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String addressRegistered;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String illegalFact;

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
    private String mandatoryBasis;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdSource;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCpCeType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String coerciveMeasureType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String forceExtendDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String addressOperating;

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
    private String forceActionCode;

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
    private String cdOperation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdBatch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String implementInstitution;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mandatoryDecisionPatify;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date cdTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mandatoryDecisionNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String superviseItemCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date mandatoryDecisionSevDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String administrativeCp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdLsh;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdLshSrc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdHbSource;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }
    public void setSubmittedDate(Date submittedDate) 
    {
        this.submittedDate = submittedDate;
    }

    public Date getSubmittedDate() 
    {
        return submittedDate;
    }
    public void setForceExecutionType(String forceExecutionType) 
    {
        this.forceExecutionType = forceExecutionType;
    }

    public String getForceExecutionType() 
    {
        return forceExecutionType;
    }
    public void setForceType(String forceType) 
    {
        this.forceType = forceType;
    }

    public String getForceType() 
    {
        return forceType;
    }
    public void setCheckActionCode(String checkActionCode) 
    {
        this.checkActionCode = checkActionCode;
    }

    public String getCheckActionCode() 
    {
        return checkActionCode;
    }
    public void setForceActionName(String forceActionName) 
    {
        this.forceActionName = forceActionName;
    }

    public String getForceActionName() 
    {
        return forceActionName;
    }
    public void setAddressRegistered(String addressRegistered) 
    {
        this.addressRegistered = addressRegistered;
    }

    public String getAddressRegistered() 
    {
        return addressRegistered;
    }
    public void setIllegalFact(String illegalFact) 
    {
        this.illegalFact = illegalFact;
    }

    public String getIllegalFact() 
    {
        return illegalFact;
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
    public void setMandatoryBasis(String mandatoryBasis) 
    {
        this.mandatoryBasis = mandatoryBasis;
    }

    public String getMandatoryBasis() 
    {
        return mandatoryBasis;
    }
    public void setCdSource(String cdSource) 
    {
        this.cdSource = cdSource;
    }

    public String getCdSource() 
    {
        return cdSource;
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
    public void setCoerciveMeasureType(String coerciveMeasureType) 
    {
        this.coerciveMeasureType = coerciveMeasureType;
    }

    public String getCoerciveMeasureType() 
    {
        return coerciveMeasureType;
    }
    public void setForceExtendDate(String forceExtendDate) 
    {
        this.forceExtendDate = forceExtendDate;
    }

    public String getForceExtendDate() 
    {
        return forceExtendDate;
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
    public void setForceActionCode(String forceActionCode) 
    {
        this.forceActionCode = forceActionCode;
    }

    public String getForceActionCode() 
    {
        return forceActionCode;
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
    public void setMandatoryDecisionPatify(String mandatoryDecisionPatify) 
    {
        this.mandatoryDecisionPatify = mandatoryDecisionPatify;
    }

    public String getMandatoryDecisionPatify() 
    {
        return mandatoryDecisionPatify;
    }
    public void setCdTime(Date cdTime) 
    {
        this.cdTime = cdTime;
    }

    public Date getCdTime() 
    {
        return cdTime;
    }
    public void setMandatoryDecisionNumber(String mandatoryDecisionNumber) 
    {
        this.mandatoryDecisionNumber = mandatoryDecisionNumber;
    }

    public String getMandatoryDecisionNumber() 
    {
        return mandatoryDecisionNumber;
    }
    public void setSuperviseItemCode(String superviseItemCode) 
    {
        this.superviseItemCode = superviseItemCode;
    }

    public String getSuperviseItemCode() 
    {
        return superviseItemCode;
    }
    public void setMandatoryDecisionSevDate(Date mandatoryDecisionSevDate) 
    {
        this.mandatoryDecisionSevDate = mandatoryDecisionSevDate;
    }

    public Date getMandatoryDecisionSevDate() 
    {
        return mandatoryDecisionSevDate;
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
    public void setCdHbSource(String cdHbSource) 
    {
        this.cdHbSource = cdHbSource;
    }

    public String getCdHbSource() 
    {
        return cdHbSource;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("endDate", getEndDate())
            .append("submittedDate", getSubmittedDate())
            .append("forceExecutionType", getForceExecutionType())
            .append("forceType", getForceType())
            .append("checkActionCode", getCheckActionCode())
            .append("forceActionName", getForceActionName())
            .append("addressRegistered", getAddressRegistered())
            .append("illegalFact", getIllegalFact())
            .append("cdIdBef", getCdIdBef())
            .append("areaNumber", getAreaNumber())
            .append("implementInstitutionCode", getImplementInstitutionCode())
            .append("mandatoryBasis", getMandatoryBasis())
            .append("updateTime", getUpdateTime())
            .append("cdSource", getCdSource())
            .append("administrativeCpCeType", getAdministrativeCpCeType())
            .append("cdId", getCdId())
            .append("coerciveMeasureType", getCoerciveMeasureType())
            .append("forceExtendDate", getForceExtendDate())
            .append("addressOperating", getAddressOperating())
            .append("lyType", getLyType())
            .append("submittedPersonnel", getSubmittedPersonnel())
            .append("administrativeCpNa", getAdministrativeCpNa())
            .append("createTime", getCreateTime())
            .append("forceActionCode", getForceActionCode())
            .append("recordUniqueIdentity", getRecordUniqueIdentity())
            .append("administrativeCpUiCode", getAdministrativeCpUiCode())
            .append("superviseObject", getSuperviseObject())
            .append("cdOperation", getCdOperation())
            .append("cdBatch", getCdBatch())
            .append("implementInstitution", getImplementInstitution())
            .append("mandatoryDecisionPatify", getMandatoryDecisionPatify())
            .append("cdTime", getCdTime())
            .append("mandatoryDecisionNumber", getMandatoryDecisionNumber())
            .append("superviseItemCode", getSuperviseItemCode())
            .append("mandatoryDecisionSevDate", getMandatoryDecisionSevDate())
            .append("administrativeCp", getAdministrativeCp())
            .append("cdLsh", getCdLsh())
            .append("cdLshSrc", getCdLshSrc())
            .append("cdHbSource", getCdHbSource())
            .toString();
    }
}
