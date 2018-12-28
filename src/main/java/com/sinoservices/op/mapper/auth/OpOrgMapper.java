package com.sinoservices.op.mapper.auth;

import com.sinoservices.op.model.auth.OpOrg;

public interface OpOrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OpOrg record);

    int insertSelective(OpOrg record);

    OpOrg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OpOrg record);

    int updateByPrimaryKey(OpOrg record);
}