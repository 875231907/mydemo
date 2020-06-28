package com.example.demo.Interceptor;

import com.example.demo.dto.user;
import com.example.demo.tools.UserTool;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试拦截器
 */
public class TestInterceptor implements HandlerInterceptor {
    /**
     * 在业务处理器处理请求之前被调用
     * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        System.out.println("经过拦截器");
        user u = new user();
        u.setId("1");
        u.setName("账号");
        u.setPassword("密码");

        UserTool.setUserTool(u);
        return true;
    }
    /**
     * 在业务处理器处理请求完成之后，生成视图之前执行
     * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception{
    }
    /**
     * 在DispatcherServlet完全处理完请求之后被调用，可用于清理资源
     * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception{
    }

}
