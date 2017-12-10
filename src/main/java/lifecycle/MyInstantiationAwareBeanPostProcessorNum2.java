/*
 *  @(#) MyInstantiationAwareBeanPostProcessorNum2.java 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lifecycle;

import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * @author heke ,2017/12/10:13:23
 * @version 1.0.0
 */
public class MyInstantiationAwareBeanPostProcessorNum2 extends InstantiationAwareBeanPostProcessorAdapter {
    // 在实例化Bean前进行调用
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName){
        // 对容器中的carBean进行处理
        if ("car".equals(beanName)){
            System.out.println("Num2 InstantiationAware BeanPostProcessor.postProcessBeforeInstantiation");
        }

        return null;
    }

    // 在实例化Bean后调用
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName){
        // 对容器中carBean进行处理
        if ("car".equals(beanName)){
            System.out.println("Num2 Instantitation BeanPosttProcessor.postProcessAfterInstantiation");
        }

        return true;
    }

    // 设置某个属性时调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName){
        // 对容器中carBean进行和处理，还可以通过pdst入参进行过滤
        // 对car的某个特定属性进行处理
        if ("car".equals(beanName)){
            System.out.println("Num2 Instantiation AwareBeanPostProcessor.postProcessPropertyValues");
        }

        return pvs;
    }
}
