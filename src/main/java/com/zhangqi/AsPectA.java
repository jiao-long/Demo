package com.zhangqi;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AsPectA {
    @Before("execution(* HelloWorld.*(..))")
    public void checkPermission() {
        System.out.println("安全切面：权限校验");
    }
}
