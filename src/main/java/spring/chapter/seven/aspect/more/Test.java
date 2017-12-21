/*
 *  @(#) Test.java 1.0 2017/12/21
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.seven.aspect.more;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heke ,2017/12/21:14:58
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/aspectmore.xml");
        WaiterMethod waiterMethod = ctx.getBean("waiterMethod", WaiterMethod.class);
        waiterMethod.serverTo("", 0);
    }
}
