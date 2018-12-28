package com.sinoservices.op.payload;

import com.sinoservices.op.utils.MobileConstraint;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequest {
  @NotBlank
  @Size(min = 4, max = 40)
  private String username;

  @NotBlank
  @Size(min = 3, max = 15)
  private String loginname;

  @NotBlank
  @Size(max = 11)
  @MobileConstraint
  private String mobile;

  @NotBlank
  @Size(max = 40)
  @Email
  private String email;

  @NotBlank
  @Size(min = 6, max = 20)
  private String password;

  @NotBlank
  @Size(min = 6, max = 20)
  private String dbcPassword;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getLoginname() {
    return loginname;
  }

  public void setLoginname(String loginname) {
    this.loginname = loginname;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDbcPassword() {
    return dbcPassword;
  }

  public void setDbcPassword(String dbcPassword) {
    this.dbcPassword = dbcPassword;
  }
}
