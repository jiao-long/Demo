package com.zhangqi;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AsPectB {
    @Before("execution(* HelloWorld.*(..))")
    public void beginTransaction() {
        System.out.println("事务切面：开启事务");
    }
}
