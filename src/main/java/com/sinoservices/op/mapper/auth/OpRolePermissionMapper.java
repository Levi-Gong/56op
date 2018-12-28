package com.sinoservices.op.mapper.auth;

import com.sinoservices.op.bean.auth.OpRolePermissionBean;
import com.sinoservices.op.model.auth.OpRolePermission;

public interface OpRolePermissionMapper {
  int deleteByPrimaryKey(Long id);

  int insert(OpRolePermission record);

  int insertSelective(OpRolePermission record);

  OpRolePermissionBean selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(OpRolePermission record);

  int updateByPrimaryKey(OpRolePermission record);
}
