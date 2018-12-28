package com.sinoservices.op.model.auth;

import java.util.Date;

public class OpRole {
    /** 角色ID*/
    private Long id;

    /** 父角色ID*/
    private Long parentRoleId;

    /** 角色名称*/
    private String roleName;

    /** 创建时间*/
    private Date createTime;

    /** 创建描述*/
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentRoleId() {
        return parentRoleId;
    }

    public void setParentRoleId(Long parentRoleId) {
        this.parentRoleId = parentRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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