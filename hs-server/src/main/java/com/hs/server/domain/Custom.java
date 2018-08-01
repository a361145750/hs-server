package com.hs.server.domain;

public class Custom extends BaseAuditEntity {
    private String customId;

    private String cardId;

    private String userName;

    private String userNameEn;

    private String sex;

    private String age;

    private String phone;

    private String adress;

    private String prefer;

    private String level;

    private String job;

    private String weixin;

    private String birthday;

    private String customCharacter;

    private String hairNumber;

    private String hairLength;

    private String hairQuality;

    private String hairOprateType;

    private String hairPrefer;

    private String hairExclude;

    private String hairFrequency;

    private String comment;

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNameEn() {
        return userNameEn;
    }

    public void setUserNameEn(String userNameEn) {
        this.userNameEn = userNameEn == null ? null : userNameEn.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getPrefer() {
        return prefer;
    }

    public void setPrefer(String prefer) {
        this.prefer = prefer == null ? null : prefer.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getCustomCharacter() {
        return customCharacter;
    }

    public void setCustomCharacter(String customCharacter) {
        this.customCharacter = customCharacter == null ? null : customCharacter.trim();
    }

    public String getHairNumber() {
        return hairNumber;
    }

    public void setHairNumber(String hairNumber) {
        this.hairNumber = hairNumber == null ? null : hairNumber.trim();
    }

    public String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength == null ? null : hairLength.trim();
    }

    public String getHairQuality() {
        return hairQuality;
    }

    public void setHairQuality(String hairQuality) {
        this.hairQuality = hairQuality == null ? null : hairQuality.trim();
    }

    public String getHairOprateType() {
        return hairOprateType;
    }

    public void setHairOprateType(String hairOprateType) {
        this.hairOprateType = hairOprateType == null ? null : hairOprateType.trim();
    }

    public String getHairPrefer() {
        return hairPrefer;
    }

    public void setHairPrefer(String hairPrefer) {
        this.hairPrefer = hairPrefer == null ? null : hairPrefer.trim();
    }

    public String getHairExclude() {
        return hairExclude;
    }

    public void setHairExclude(String hairExclude) {
        this.hairExclude = hairExclude == null ? null : hairExclude.trim();
    }

    public String getHairFrequency() {
        return hairFrequency;
    }

    public void setHairFrequency(String hairFrequency) {
        this.hairFrequency = hairFrequency == null ? null : hairFrequency.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

}