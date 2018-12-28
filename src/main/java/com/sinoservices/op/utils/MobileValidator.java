package com.sinoservices.op.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidator implements ConstraintValidator<MobileConstraint, String> {
  @Override
  public void initialize(MobileConstraint constraintAnnotation) {}

  @Override
  public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
    if (s != null) {
      Pattern p = Pattern.compile("^((13[0-9])|(15[^4])|(18[0-9])|(17[0-9])|(147))\\d{8}$");
      Matcher m = p.matcher(s);
      if (m.matches()) {
        return true;
      } else {
        constraintValidatorContext.disableDefaultConstraintViolation(); // 禁用默认的message的值
        // 重新添加错误提示语句
        constraintValidatorContext
            .buildConstraintViolationWithTemplate("手机号码格式有误！")
            .addConstraintViolation();
      }
    }
    return false;
  }
}
