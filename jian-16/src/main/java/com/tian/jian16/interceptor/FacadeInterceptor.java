package com.tian.jian16.interceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

/**
 * Created by 52613 on 2019/8/24.
 */
public class FacadeInterceptor  implements HandlerInterceptor {

    private final String IP = "127.0.0.1";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)       throws Exception {

        HandlerMethod hand = (HandlerMethod) handler;
        if (hand.hasMethodAnnotation(RequestMapping.class)) {
            System.out.println("拦截成功！！！");
            System.out.println("调用者ip为："+request.getLocalAddr());
            if(IP.equals(request.getLocalAddr())){
                return true;
            }else {
                System.out.println("您的ip地址不在服务范围内！");
                return false;
            }

        } else {
            System.out.println("无需拦截！！！");

            Annotation[] annotations = hand.getClass().getAnnotations();
            System.out.println("注解的长度为:"+annotations.length);
            for (int i = 0; i < annotations.length; i++) {
                System.out.println("注解"+i+"是"+annotations[i]);

            }
            return true;
        }


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
