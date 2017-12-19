/*
 *  @(#) GreetingInterceptor.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.beforeadvice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author heke ,2017/12/19:11:32
 * @version 1.0.0
 */
public class GreetingInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String name = (String) args[0];
        System.out.println("around method before, say hello :" + name);
        Object obj = methodInvocation.proceed();
        System.out.println("around method after , say hello :" + name);
        return obj;
    }
}
