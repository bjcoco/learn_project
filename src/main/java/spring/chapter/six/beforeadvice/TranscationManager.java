/*
 *  @(#) TranscationManager.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.beforeadvice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author heke ,2017/12/19:14:24
 * @version 1.0.0
 */
public class TranscationManager implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable{
        System.out.println("------------");
        System.out.println("method:" + method.getName());
        System.out.println("异常：" + ex.getMessage());
    }
}
