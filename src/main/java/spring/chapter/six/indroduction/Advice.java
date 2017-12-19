/*
 *  @(#) Advice.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.indroduction;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @author heke ,2017/12/19:16:35
 * @version 1.0.0
 */
public class Advice extends StaticMethodMatcherPointcutAdvisor {

    public boolean matches(Method method, Class<?> targetClass) {
        return false;
    }

    @Override
    public ClassFilter getClassFilter() {
        return super.getClassFilter();
    }
}
