package com.sinoservices.op.bean.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** 自定义用户认证实体 */
public class UserPrincipal implements UserDetails {

  private Long id;

  private String name;

  private String username;

  @JsonIgnore private String mobile;

  @JsonIgnore private String password;

  private Collection<? extends GrantedAuthority> authorities;

  public UserPrincipal(
      Long id,
      String name,
      String username,
      String mobile,
      String password,
      Collection<? extends GrantedAuthority> authorities) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.mobile = mobile;
    this.password = password;
    this.authorities = authorities;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public static UserPrincipal create(OpUserBean user) {
    List<GrantedAuthority> authorities =
        user.getRoles()
            .stream()
            .map(role -> new SimpleGrantedAuthority(role.getRoleName()))
            .collect(Collectors.toList());

    return new UserPrincipal(
        user.getId(),
        user.getUserName(),
        user.getLoginName(),
        user.getMobile(),
        user.getPassword(),
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserPrincipal that = (UserPrincipal) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id);
  }
}
