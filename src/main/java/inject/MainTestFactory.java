/*
 *  @(#) MainTestFactory.java 1.0 2017/12/12
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author heke ,2017/12/12:15:28
 * @version 1.0.0
 */
public class MainTestFactory {
    public static void main(String[] args) {
        Resource rs = new ClassPathResource("/spring/injectFactoryBean.xml");
        BeanFactory bf = new XmlBeanFactory(rs);
        Car car = bf.getBean("car", Car.class);
        System.out.println(car);
        System.out.println(car.getBrand() + "," + car.getColor());
    }
}
