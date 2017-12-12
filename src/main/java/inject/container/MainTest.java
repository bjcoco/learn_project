/*
 *  @(#) MainTest.java 1.0 2017/12/12
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heke ,2017/12/12:17:04
 * @version 1.0.0
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/containerBean1.xml");
        ApplicationContext ac2 = new ClassPathXmlApplicationContext(new String[]{"/spring/containerBean2.xml"}, ac);
        Person person = ac2.getBean("person", Person.class);
        System.out.println(person.getCar().getBrand());
        System.out.println(person.getCar().getColor());
    }
}
