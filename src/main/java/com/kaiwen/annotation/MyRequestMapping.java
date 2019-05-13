package com.kaiwen.annotation;

import java.lang.annotation.*;

/**
 * @author kaiwen
 * @create 2019-05-13 10:51
 * @since 1.0
 **/
@Target({ElementType.TYPE,ElementType.METHOD}) // 可以标注在类和方法上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {

    /**
     * 标识访问该方法的url
     * @return
     */
    String value() default "";
}
