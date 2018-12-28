package com.sinoservices.op.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = MobileValidator.class) // 具体的实现
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MobileConstraint {

    String message() default "手机格式有误！";

    Class<?>[]groups()default {};
    Class<? extends Payload>[]payload() default {};
}
