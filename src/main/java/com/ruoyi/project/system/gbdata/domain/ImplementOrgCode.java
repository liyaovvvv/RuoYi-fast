package com.ruoyi.project.system.gbdata.domain;

import java.io.Serializable;

/**
 * Created by issuser on 2019/11/19.
 */
public class ImplementOrgCode implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String orgName;
    private String implementInstitutionCode;
    private String cdHbSource;
    private String areaNumber;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getImplementInstitutionCode() {
        return implementInstitutionCode;
    }

    public void setImplementInstitutionCode(String implementInstitutionCode) {
        this.implementInstitutionCode = implementInstitutionCode;
    }

    public String getCdHbSource() {
        return cdHbSource;
    }

    public void setCdHbSource(String cdHbSource) {
        this.cdHbSource = cdHbSource;
    }

    public String getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(String areaNumber) {
        this.areaNumber = areaNumber;
    }
}
