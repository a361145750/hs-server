package com.hs.server.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Record extends BaseAuditEntity {
    private String recordId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date oprateDate;

    private String description;

    private String disinerId;

    private String customId;

    private String totalFee;

    private String disinType;

    private String hairLevel;

    private String hairLength;

    private String hairBar;

    private String hairPermBrand;

    private String hairDyeBrand;

    private String hairCairBrand;

    private String hairHateItems;

    private String customRequireItems;

    private String oprateNoticeItems;

    private String imgUrl;

    private List<Long> cusRecordFileIds;

    private List<Long> desRecordFileIds;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public Date getOprateDate() {
        return oprateDate;
    }

    public void setOprateDate(Date oprateDate) {
        this.oprateDate = oprateDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDisinerId() {
        return disinerId;
    }

    public void setDisinerId(String disinerId) {
        this.disinerId = disinerId == null ? null : disinerId.trim();
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee == null ? null : totalFee.trim();
    }

    public String getDisinType() {
        return disinType;
    }

    public void setDisinType(String disinType) {
        this.disinType = disinType == null ? null : disinType.trim();
    }

    public String getHairLevel() {
        return hairLevel;
    }

    public void setHairLevel(String hairLevel) {
        this.hairLevel = hairLevel == null ? null : hairLevel.trim();
    }

    public String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength == null ? null : hairLength.trim();
    }

    public String getHairBar() {
        return hairBar;
    }

    public void setHairBar(String hairBar) {
        this.hairBar = hairBar == null ? null : hairBar.trim();
    }

    public String getHairPermBrand() {
        return hairPermBrand;
    }

    public void setHairPermBrand(String hairPermBrand) {
        this.hairPermBrand = hairPermBrand == null ? null : hairPermBrand.trim();
    }

    public String getHairDyeBrand() {
        return hairDyeBrand;
    }

    public void setHairDyeBrand(String hairDyeBrand) {
        this.hairDyeBrand = hairDyeBrand == null ? null : hairDyeBrand.trim();
    }

    public String getHairCairBrand() {
        return hairCairBrand;
    }

    public void setHairCairBrand(String hairCairBrand) {
        this.hairCairBrand = hairCairBrand == null ? null : hairCairBrand.trim();
    }

    public String getHairHateItems() {
        return hairHateItems;
    }

    public void setHairHateItems(String hairHateItems) {
        this.hairHateItems = hairHateItems == null ? null : hairHateItems.trim();
    }

    public String getCustomRequireItems() {
        return customRequireItems;
    }

    public void setCustomRequireItems(String customRequireItems) {
        this.customRequireItems = customRequireItems == null ? null : customRequireItems.trim();
    }

    public String getOprateNoticeItems() {
        return oprateNoticeItems;
    }

    public void setOprateNoticeItems(String oprateNoticeItems) {
        this.oprateNoticeItems = oprateNoticeItems == null ? null : oprateNoticeItems.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public List<Long> getCusRecordFileIds() {
        return cusRecordFileIds;
    }

    public void setCusRecordFileIds(List<Long> cusRecordFileIds) {
        this.cusRecordFileIds = cusRecordFileIds;
    }

    public List<Long> getDesRecordFileIds() {
        return desRecordFileIds;
    }

    public void setDesRecordFileIds(List<Long> desRecordFileIds) {
        this.desRecordFileIds = desRecordFileIds;
    }
}