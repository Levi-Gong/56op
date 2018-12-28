package com.sinoservices.op.security;

import com.sinoservices.op.bean.auth.OpRoleBean;
import com.sinoservices.op.bean.auth.OpUserBean;
import com.sinoservices.op.bean.auth.UserPrincipal;
import com.sinoservices.op.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class OpUserDetailsService implements UserDetailsService {

  @Autowired private UserService userService;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {

    OpUserBean userBean = userService.getUserDetailsByName(loginName);
    setUserRole(userBean);
    if (userBean == null) {
      throw new UsernameNotFoundException("用户信息不存在，找不到该用户！");
    }
    return UserPrincipal.create(userBean);
  }

  private void setUserRole(OpUserBean userBean) {
    Set<OpRoleBean> userRoles = userService.getRolesById(userBean.getId());
    if (userRoles != null) {
      userBean.setRoles(userRoles);
    }
  }

  @Transactional
  public UserDetails loadUserById(Long id) {
    OpUserBean userBean = userService.findById(id);
    if (userBean == null) {
      throw new UsernameNotFoundException("用户信息不存在，找不到该用户！");
    }
    return UserPrincipal.create(userBean);
  }
}
