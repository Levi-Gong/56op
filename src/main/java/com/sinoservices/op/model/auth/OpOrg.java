package com.sinoservices.op.model.auth;

import java.util.Date;

public class OpOrg {
    /** 组织ID*/
    private Long id;

    /** 组织名称*/
    private String orgName;

    /** 父组织ID*/
    private Long parentOrgId;

    /** 创建时间*/
    private Date createTime;

    /** 组织描述*/
    private String description;

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

    public Long getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Long parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}