/*
 *  @(#) MainTest.java 1.0 2017/12/13
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject.replace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heke ,2017/12/13:11:38
 * @version 1.0.0
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/replaceBean.xml");
        Boss1 boss1 = ac.getBean("boss1", Boss1.class);
        System.out.println(boss1.getCar().getBrand());
        System.out.println(boss1.getCar().getColor());
    }
}
