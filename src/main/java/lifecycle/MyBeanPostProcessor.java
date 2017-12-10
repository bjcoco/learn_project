/*
 *  @(#) MyBeanPostProcessor.java 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author heke ,2017/12/10:13:31
 * @version 1.0.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car = (Car) bean;
            if (car.getColor() == null){
                System.out.println("调用BeanPostProcessor.postProcess BeforeInitialization(), color 为空，设置为黑色");
                car.setColor("黑色");
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)){
            Car car = (Car) bean;
            if(car.getMaxSpeed() >= 200){
                System.out.println("调用BeanPostProcessor.postProcessor AfterInitialization(),将maxSpeed调整为200");
                car.setMaxSpeed(200);
            }
        }

        return bean;
    }

}
