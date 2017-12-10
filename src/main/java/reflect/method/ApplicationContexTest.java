/*
 *  @(#) 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package reflect.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import reflect.classmethod.AnimalBean;
import reflect.classmethod.CarBean;

/**
 * @author heke ,2017/12/10:10:05
 * @version 1.0.0
 */
public class ApplicationContexTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/bean.xml");
        System.out.println(context);
        System.out.println(context.getClass());
        System.out.println(context.getParent());
        System.out.println(context.getParentBeanFactory());

        CarBean car = (CarBean) context.getBean("car");
        System.out.println(car);
        System.out.println(car.getName());
        System.out.println(car.getColor());

        AnimalBean animal = (AnimalBean) context.getBean("animal");
        System.out.println(animal.getClassName());
        System.out.println(animal.getColor());
        System.out.println(animal.getNum());

    }
}
