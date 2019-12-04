package com.rm.enums;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

/**
 * @class: EnumProvisionStat
 * @title: //备款状态
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年12月04日 13:59
 * @since: 1.0.0
 */
public enum EnumProvisionStat {
    /**
     * 01-已备款
     */
    PROVISION("01", "已备款"),
    /**
     * 02-未备款
     */
    UN_PROVISION("02", "未备款"),
    ;
    private String code;

    private String description;

    public String getCode() {
        return code.trim();
    }

    EnumProvisionStat(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static EnumProvisionStat getByKey(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (EnumProvisionStat type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static Map<String, String> toMap() {
        Map<String, String> enumProvisionMap = new HashMap<String, String>();
        for (EnumProvisionStat key : values()) {
            enumProvisionMap.put(key.getCode(), key.getDescription());
        }
        return enumProvisionMap;
    }


}
