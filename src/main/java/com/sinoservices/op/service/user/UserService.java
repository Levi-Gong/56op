package com.sinoservices.op.service.user;

import com.sinoservices.op.bean.auth.OpRoleBean;
import com.sinoservices.op.bean.auth.OpUserBean;
import com.sinoservices.op.model.auth.OpUserRole;

import java.util.List;
import java.util.Set;

public interface UserService {
  /**
   * 根据用户名查找用户
   *
   * @param userName
   * @return
   */
  OpUserBean getUserDetailsByName(String userName);

  /**
   * 根据用户名获取用户角色
   *
   * @param username
   * @return
   */
  List<OpUserRole> getUserRoleByUserName(String username);

  OpUserBean findById(Long id);

  /**
   * 根据用户ID查找当前用户拥有的角色
   * @param id
   * @return
   */
  Set<OpRoleBean> getRolesById(Long id);
}
