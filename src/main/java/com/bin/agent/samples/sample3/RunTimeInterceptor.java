package com.bin.agent.samples.sample3;

import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class RunTimeInterceptor {
    @RuntimeType
    public static Object intercept(@Origin Method method, @SuperCall Callable<?> callable) throws Exception {
        long startTime = System.currentTimeMillis();
        try {
            // 执行原函数的业务逻辑
            return callable.call();
        } finally {
            System.out.println(method + ": took " + (System.currentTimeMillis() - startTime) + "ms\n\n");
        }
    }
}
