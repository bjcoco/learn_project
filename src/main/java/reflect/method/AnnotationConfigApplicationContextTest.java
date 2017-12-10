/*
 *  @(#) 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package reflect.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import reflect.classmethod.Beans;
import reflect.classmethod.CarBean;

/**
 * @author heke ,2017/12/10:10:07
 * @version 1.0.0
 */
public class AnnotationConfigApplicationContextTest {
    public static void main(String[] args) {
        // 通过一个带@configuration的POJO装在Bean配置
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        CarBean car = context.getBean("car", CarBean.class);
        System.out.println(car);
        System.out.println(car.getName());
        System.out.println(car.getColor());
    }
}
