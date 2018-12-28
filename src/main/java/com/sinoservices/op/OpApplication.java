package com.sinoservices.op;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan("com.sinoservices.op.mapper")
public class OpApplication implements WebMvcConfigurer {

  public static void main(String[] args) {

    new SpringApplicationBuilder(OpApplication.class).run(args);
  }

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/login").setViewName("login");
  }

  /* @Configuration
  @Order(1)
  public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
      http.csrf().disable();
      http.antMatcher("/api/**").authorizeRequests().anyRequest().permitAll();
    }
  }*/
}
