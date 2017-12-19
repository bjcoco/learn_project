/*
 *  @(#) Test.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.beforeadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author heke ,2017/12/19:11:04
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Waiter waiter = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        AfterReturningAdvice afterAdvice = new GreetingAfterAdvice();
        MethodInterceptor interceptor = new GreetingInterceptor();

        ProxyFactory pf = new ProxyFactory();
//        pf.setInterfaces(waiter.getClass().getInterfaces());
        pf.setTarget(waiter);
        pf.addAdvice(advice);
        pf.addAdvice(afterAdvice);
        pf.addAdvice(interceptor);

        Waiter proxy = (Waiter) pf.getProxy();
//        System.out.println("proxy:"+ proxy.getClass());
        proxy.greetTo("coco1");
        proxy.serveTo("coco2");
    }
}
