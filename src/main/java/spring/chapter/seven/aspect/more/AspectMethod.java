/*
 *  @(#) AspectMethod.java 1.0 2017/12/21
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.seven.aspect.more;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author heke ,2017/12/21:14:52
 * @version 1.0.0
 */
@Component
@Aspect
public class AspectMethod {

    @Around("args(name, count)")
    public void before(ProceedingJoinPoint point, String name, int count){
        Object[] obj = {"coco", 2};
        try {
            point.proceed(obj);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("before do sth : "+ name + "," + count);
    }

}
