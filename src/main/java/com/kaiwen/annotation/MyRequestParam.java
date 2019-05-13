package com.kaiwen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author kaiwen
 * @create 2019-05-13 10:53
 * @since 1.0
 **/
@Target(ElementType.PARAMETER)  //只能注解在参数上
public @interface MyRequestParam {

    /**
     * 标识参数的别名 必填
     * @return
     */
    String value();
}
