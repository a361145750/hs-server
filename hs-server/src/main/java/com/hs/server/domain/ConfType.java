package com.hs.server.domain;

public class ConfType extends BaseEntity {
    private String confTypeId;

    private String confType;

    private String confTypeName;

    public String getConfTypeId() {
        return confTypeId;
    }

    public void setConfTypeId(String confTypeId) {
        this.confTypeId = confTypeId == null ? null : confTypeId.trim();
    }

    public String getConfType() {
        return confType;
    }

    public void setConfType(String confType) {
        this.confType = confType == null ? null : confType.trim();
    }

    public String getConfTypeName() {
        return confTypeName;
    }

    public void setConfTypeName(String confTypeName) {
        this.confTypeName = confTypeName == null ? null : confTypeName.trim();
    }
}