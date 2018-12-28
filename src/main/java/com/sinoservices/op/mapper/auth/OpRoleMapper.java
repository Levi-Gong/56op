package com.sinoservices.op.mapper.auth;

import com.sinoservices.op.bean.auth.OpRoleBean;
import com.sinoservices.op.model.auth.OpRole;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface OpRoleMapper {
  int deleteByPrimaryKey(Long id);

  int insert(OpRole record);

  int insertSelective(OpRole record);

  OpRoleBean selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(OpRole record);

  int updateByPrimaryKey(OpRole record);

  Set<OpRoleBean> selectRolesByUserId(@Param("userId") Long userId);
}
