package com.sinoservices.op.bean.auth;

public class OpRolePermissionBean {
  /** 角色权限ID */
  private Long id;

  /** 角色id */
  private Long roleId;

  /** 权限id */
  private Long permissionId;

  /** 0-可访问 1 可授权 */
  private String permissionType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public Long getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(Long permissionId) {
    this.permissionId = permissionId;
  }

  public String getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(String permissionType) {
    this.permissionType = permissionType;
  }
}
