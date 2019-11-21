package com.ruoyi.project.system.gbdata.domain;


import java.io.Serializable;

/**
 * Created by issuser on 2019/11/16.
 */
public class DataDictionary implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long id;
    private String dkey;
    private String dvalue;
    private String updateTime;
    private String description;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDkey() {
        return dkey;
    }

    public void setDkey(String dkey) {
        this.dkey = dkey;
    }

    public String getDvalue() {
        return dvalue;
    }

    public void setDvalue(String dvalue) {
        this.dvalue = dvalue;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
