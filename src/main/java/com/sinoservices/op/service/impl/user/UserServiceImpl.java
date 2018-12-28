package com.sinoservices.op.service.impl.user;

import com.sinoservices.op.bean.auth.OpRoleBean;
import com.sinoservices.op.bean.auth.OpUserBean;
import com.sinoservices.op.mapper.auth.OpRoleMapper;
import com.sinoservices.op.mapper.auth.OpUserMapper;
import com.sinoservices.op.model.auth.OpUserRole;
import com.sinoservices.op.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private OpUserMapper opUserMapper;
  @Autowired private OpRoleMapper opRoleMapper;

  @Override
  public OpUserBean getUserDetailsByName(String userName) {

    return opUserMapper.selectUserByLoginName(userName);
  }

  @Override
  public List<OpUserRole> getUserRoleByUserName(String username) {
    return null;
  }

  @Override
  public OpUserBean findById(Long id) {
    return opUserMapper.selectByPrimaryKey(id);
  }

  @Override
  public Set<OpRoleBean> getRolesById(Long id) {
    return opRoleMapper.selectRolesByUserId(id);
  }
}
