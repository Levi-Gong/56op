package com.sinoservices.op.mapper.auth;

import com.sinoservices.op.bean.auth.OpUserPermissionBean;
import com.sinoservices.op.model.auth.OpUserPermission;

public interface OpUserPermissionMapper {
  int deleteByPrimaryKey(Long id);

  int insert(OpUserPermission record);

  int insertSelective(OpUserPermission record);

  OpUserPermissionBean selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(OpUserPermission record);

  int updateByPrimaryKey(OpUserPermission record);
}
