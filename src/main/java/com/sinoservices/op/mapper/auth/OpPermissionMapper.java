package com.sinoservices.op.mapper.auth;

import com.sinoservices.op.bean.auth.OpPermissionBean;
import com.sinoservices.op.model.auth.OpPermission;

public interface OpPermissionMapper {
  int deleteByPrimaryKey(Long id);

  int insert(OpPermission record);

  int insertSelective(OpPermission record);

  OpPermissionBean selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(OpPermission record);

  int updateByPrimaryKey(OpPermission record);
}
