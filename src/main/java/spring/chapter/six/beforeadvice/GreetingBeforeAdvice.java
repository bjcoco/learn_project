/*
 *  @(#) GreetingBeforeAdvice.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.beforeadvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author heke ,2017/12/19:11:03
 * @version 1.0.0
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String name = (String) args[0];
        System.out.println("say hello to :" + name);
    }
}
