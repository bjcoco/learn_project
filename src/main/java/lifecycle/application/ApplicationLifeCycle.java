/*
 *  @(#) ApplicationLifeCycle.java 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lifecycle.application;

import lifecycle.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heke ,2017/12/10:14:33
 * @version 1.0.0
 */
public class ApplicationLifeCycle {
    /**
     * 根据xml配置文件可自动加载process进行注册
     * beanFactory需要代码中手工调用addBeanPoseProcess()方法进行注册
     */
    private static void lifeCycle(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationbeanlifecycle.xml");
        Car car = ac.getBean("car",Car.class);
        car.introduce();
    }

    /**
     * print info
     *
     * 调用BeanFactoryPostProcessor.postProcessBean Factory()
     调用car()构造函数
     十二月 10, 2017 2:38:53 下午 org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
     信息: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@12b0404f: defining beans [car,myBeanPostProcess,myBeanFactoryPostProcessor]; root of factory hierarchy
     调用setBrand()方法
     调用setMaxSpeed()方法
     调用setBeanName()方法
     调用setBeanFactory()方法
     调用BeanPostProcessor.postProcess BeforeInitialization(), color 为空，设置为黑色
     调用afterPropertiesSet()方法
     调用myInit()方法，将maxSpeed设置为300
     调用BeanPostProcessor.postProcessor AfterInitialization(),将maxSpeed调整为200
     调用setMaxSpeed()方法
     brand:奔驰,color黑色,maxSpeed:200
     * @param args
     */
    public static void main(String[] args) {
        lifeCycle();
    }
}
