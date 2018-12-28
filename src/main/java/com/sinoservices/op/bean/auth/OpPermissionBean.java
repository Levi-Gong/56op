package com.sinoservices.op.bean.auth;

public class OpPermissionBean {
  /** 权限id */
  private Long id;

  /** 父权限id */
  private Long parentPermissionId;

  /** 权限名称 */
  private String permissionName;

  /** 权限描述 */
  private String description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getParentPermissionId() {
    return parentPermissionId;
  }

  public void setParentPermissionId(Long parentPermissionId) {
    this.parentPermissionId = parentPermissionId;
  }

  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
