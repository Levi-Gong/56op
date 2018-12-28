package com.sinoservices.op.mapper.auth;

import com.sinoservices.op.bean.auth.OpUserBean;
import com.sinoservices.op.model.auth.OpUser;
import org.apache.ibatis.annotations.Param;

public interface OpUserMapper {
  int deleteByPrimaryKey(Long id);

  int insert(OpUser record);

  int insertSelective(OpUser record);

  OpUserBean selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(OpUser record);

  int updateByPrimaryKey(OpUser record);

  OpUserBean selectUserByLoginName(@Param("loginName") String loginName);
}
