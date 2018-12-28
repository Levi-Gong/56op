package com.sinoservices.op.mapper.auth;

import com.sinoservices.op.bean.auth.OpUserRoleBean;
import com.sinoservices.op.model.auth.OpUserRole;

public interface OpUserRoleMapper {
  int deleteByPrimaryKey(Long id);

  int insert(OpUserRole record);

  int insertSelective(OpUserRole record);

  OpUserRoleBean selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(OpUserRole record);

  int updateByPrimaryKey(OpUserRole record);
}
