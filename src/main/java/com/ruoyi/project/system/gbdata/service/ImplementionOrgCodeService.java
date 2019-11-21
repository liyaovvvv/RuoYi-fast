package com.ruoyi.project.system.gbdata.service;

import com.google.common.collect.Maps;
import com.ruoyi.common.constant.GbDataConstants;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.gbdata.domain.*;
import com.ruoyi.project.system.gbdata.mapper.impl.GbDataViewMapperImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * Created by issuser on 2019/11/19.
 */
@Service
public class ImplementionOrgCodeService {
    private static final Map<String, ImplementOrgCode> provinceCodeMap = Maps.newHashMap();
    private static final Map<String, ImplementOrgCode> cityCodeMap = Maps.newHashMap();

    @Autowired
    GbDataViewMapperImpl gbDataViewMapper;

    @PostConstruct
    public void init(){
        refreshImplementOrgCode();
    }

    public void refreshImplementOrgCode(){
        List<ImplementOrgCode> resultList = gbDataViewMapper.queryImplementOrgCode();
        setOrgCodeToMap(resultList);
    }

    private void setOrgCodeToMap(List<ImplementOrgCode> resultList){
        for(ImplementOrgCode orgCode : resultList){
            if(GbDataConstants.PROVNICE_AREA_NUMBER.equals(orgCode.getAreaNumber())){
                provinceCodeMap.put(orgCode.getImplementInstitutionCode(), orgCode);
            }else{
                cityCodeMap.put(orgCode.getImplementInstitutionCode(), orgCode);
            }
        }
    }

    public String getCdHbSource(String areaNumber, String implementCode){
        String cdHbSource = "";
        ImplementOrgCode implementOrgCode = getImplementOrgCode(areaNumber, implementCode);

        if(null != implementOrgCode){
            cdHbSource = implementOrgCode.getCdHbSource();
        }else{
            refreshImplementOrgCode();
            implementOrgCode = getImplementOrgCode(areaNumber, implementCode);
            if(null != implementOrgCode){
                cdHbSource = implementOrgCode.getCdHbSource();
            }
        }

        return cdHbSource;
    }

    private ImplementOrgCode getImplementOrgCode(String areaNumber, String implementCode) {
        ImplementOrgCode implementOrgCode;

        if(GbDataConstants.PROVNICE_AREA_NUMBER.equals(areaNumber)){
            implementOrgCode = provinceCodeMap.get(implementCode);
        }else{
            String cityOrgCode = getCityOrgCode(areaNumber);
            implementOrgCode = cityCodeMap.get(cityOrgCode);
        }
        return implementOrgCode;
    }

    private String getCityOrgCode(String areaNumber){
        if(StringUtils.isEmpty(areaNumber)){
            return "";
        }

        String cityOrgCode;
        if(areaNumber.contains("4290")){
            cityOrgCode = areaNumber;
        }else{
            cityOrgCode = areaNumber.substring(0, 4);
        }
        return cityOrgCode;
    }

    public <T>T buildCdHbSource(T action){
        String cdHbSource;
        String areaNumber;
        String implementCode;
        if( action instanceof JgJgxwCheckAction){
            areaNumber = ((JgJgxwCheckAction) action).getAreaNumber();
            implementCode = ((JgJgxwCheckAction) action).getImplementInstitutionCode();
            cdHbSource = getCdHbSource(areaNumber, implementCode);
            ((JgJgxwCheckAction) action).setCdHbSource(cdHbSource);
        }

        if(action instanceof JgJgxwForceAction){
            areaNumber = ((JgJgxwForceAction) action).getAreaNumber();
            implementCode = ((JgJgxwForceAction) action).getImplementInstitutionCode();
            cdHbSource = getCdHbSource(areaNumber, implementCode);
            ((JgJgxwForceAction) action).setCdHbSource(cdHbSource);
        }

        if(action instanceof JgJgxwOtherAction){
            areaNumber = ((JgJgxwOtherAction) action).getAreaNumber();
            implementCode = ((JgJgxwOtherAction) action).getImplementInstitutionCode();
            cdHbSource = getCdHbSource(areaNumber, implementCode);
            ((JgJgxwOtherAction) action).setCdHbSource(cdHbSource);
        }

        if(action instanceof JgJgxwPunishAction){
            areaNumber = ((JgJgxwPunishAction) action).getAreaNumber();
            implementCode = ((JgJgxwPunishAction) action).getImplementInstitutionCode();
            cdHbSource = getCdHbSource(areaNumber, implementCode);
            ((JgJgxwPunishAction) action).setCdHbSource(cdHbSource);
        }

        return action;
    }
}
