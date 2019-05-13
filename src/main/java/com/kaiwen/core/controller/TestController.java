package com.kaiwen.core.controller;

import com.kaiwen.annotation.MyController;
import com.kaiwen.annotation.MyRequestMapping;
import com.kaiwen.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kaiwen
 * @create 2019-05-13 14:12
 * @since 1.0
 **/
@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @MyRequestParam("param") String param) {
        System.out.println(param);
        try {
            response.getWriter().write("doTest method success! param:" + param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @MyRequestMapping("/doTest2")
    public void test2(HttpServletRequest request,HttpServletResponse response) {
        try {
            response.getWriter().write("doTest2 method success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
