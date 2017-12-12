/*
 *  @(#) MainTest.java 1.0 2017/12/12
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heke ,2017/12/12:14:35
 * @version 1.0.0
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ax = new ClassPathXmlApplicationContext("/spring/injectBean1.xml");
        Car car = ax.getBean("car", Car.class);
        Person person = ax.getBean("person", Person.class);
        System.out.println(car.getBrand());
        System.out.println(person.getName());
    }
}
