package com.hs.server.domain;

public class ConfAttr extends BaseEntity {
    private String confId;

    private String confCode;

    private String confName;

    private String confType;

    private String confOrder;

    public String getConfId() {
        return confId;
    }

    public void setConfId(String confId) {
        this.confId = confId == null ? null : confId.trim();
    }

    public String getConfCode() {
        return confCode;
    }

    public void setConfCode(String confCode) {
        this.confCode = confCode == null ? null : confCode.trim();
    }

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName == null ? null : confName.trim();
    }

    public String getConfType() {
        return confType;
    }

    public void setConfType(String confType) {
        this.confType = confType == null ? null : confType.trim();
    }

    public String getConfOrder() {
        return confOrder;
    }

    public void setConfOrder(String confOrder) {
        this.confOrder = confOrder == null ? null : confOrder.trim();
    }
}