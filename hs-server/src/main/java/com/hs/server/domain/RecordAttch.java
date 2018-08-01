package com.hs.server.domain;

public class RecordAttch extends BaseEntity {
    private String recordAttchId;

    private String recordId;

    private String customId;

    private String recordAttchType;

    private Long fileId;

    public String getRecordAttchId() {
        return recordAttchId;
    }

    public void setRecordAttchId(String recordAttchId) {
        this.recordAttchId = recordAttchId == null ? null : recordAttchId.trim();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getRecordAttchType() {
        return recordAttchType;
    }

    public void setRecordAttchType(String recordAttchType) {
        this.recordAttchType = recordAttchType == null ? null : recordAttchType.trim();
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
}