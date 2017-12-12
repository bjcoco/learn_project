/*
 *  @(#) MainTest.java 1.0 2017/12/12
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heke ,2017/12/12:19:20
 * @version 1.0.0
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/injectMethodBean.xml");
        Boss boss = ac.getBean("boss", Boss.class);
        Boss boss2 = ac.getBean("boss", Boss.class);
        System.out.println(boss.getCar().getBrand());
        System.out.println(boss.getCar().getColor());

        System.out.println(boss == boss2);
    }
}
