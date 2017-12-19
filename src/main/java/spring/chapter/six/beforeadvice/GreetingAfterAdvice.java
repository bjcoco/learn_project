/*
 *  @(#) GreetingAfterAdvice.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.beforeadvice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author heke ,2017/12/19:11:10
 * @version 1.0.0
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String name = (String) args[0];
        String result = (String) returnValue;
        System.out.println("please enjoy yourself:" + name + ",result :" + result);
    }
}
