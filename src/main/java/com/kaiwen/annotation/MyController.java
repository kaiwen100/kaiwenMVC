package com.kaiwen.annotation;

import java.lang.annotation.*;

/**
 * @author kaiwen
 * @create 2019-05-13 10:48
 * @since 1.0
 **/
@Target(ElementType.TYPE) //只能标注在类上面
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

    /**
     * 表示给controller注册别名
     * @return
     */
    String value() default "";
}
