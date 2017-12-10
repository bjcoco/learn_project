/*
 *  @(#) BeanLifeCycle.java 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author heke ,2017/12/10:13:37
 * @version 1.0.0
 */
public class BeanLifeCycle {
    private static void LifeCycleBeanFactory(){
        // 装载配置文件
        Resource resource = new ClassPathResource("spring/beanlifecycle.xml");
        BeanFactory bf = new XmlBeanFactory(resource);

        // 注册后处理器，实际调用顺序和注册顺序无关，
        // 需要实现Ordered接口确定调用顺序
//        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessorNum2());
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyBeanPostProcessor());
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        // 从容器中获取car，出发容器实例化bean，引发bean生命周期方法调用
        Car car1 = (Car) bf.getBean("car");
        car1.introduce();
        car1.setColor("红色");

        // 容器中获取car，直接从缓存池中获取
        Car car2 = (Car) bf.getBean("car");
        car2.introduce();

        // 是否是同一引用（单实例）
        System.out.println("car1==car2:"+(car1==car2));

        // 关闭容器
        ((XmlBeanFactory) bf).destroySingletons();
    }

    /**
     * 模拟beanfactory生命周期
     *
     * print info
     InstantiationAware BeanPostProcessor.postProcessBeforeInstantiation
     调用car()构造函数
     Instantitation BeanPosttProcessor.postProcessAfterInstantiation
     Instantiation AwareBeanPostProcessor.postProcessPropertyValues
     调用setBrand()方法
     调用setMaxSpeed()方法
     调用setBeanName()方法
     调用setBeanFactory()方法
     调用BeanPostProcessor.postProcess BeforeInitialization(), color 为空，设置为黑色
     调用afterPropertiesSet()方法
     调用myInit()方法，将maxSpeed设置为300
     调用BeanPostProcessor.postProcessor AfterInitialization(),将maxSpeed调整为200
     调用setMaxSpeed()方法
     brand:凯德拉克,color黑色,maxSpeed:200
     brand:凯德拉克,color红色,maxSpeed:200
     car1==car2:true
     调用destroy()方法
     调用myDestory()方法
     */

    /**
     * scope="prototype"多实例化，第二次实例化bean会引发生命中期相关方法执行，返回新的实例
     *
     * print info
     * InstantiationAware BeanPostProcessor.postProcessBeforeInstantiation
     调用car()构造函数
     Instantitation BeanPosttProcessor.postProcessAfterInstantiation
     Instantiation AwareBeanPostProcessor.postProcessPropertyValues
     调用setBrand()方法
     调用setMaxSpeed()方法
     调用setBeanName()方法
     调用setBeanFactory()方法
     调用BeanPostProcessor.postProcess BeforeInitialization(), color 为空，设置为黑色
     调用afterPropertiesSet()方法
     调用myInit()方法，将maxSpeed设置为300
     调用BeanPostProcessor.postProcessor AfterInitialization(),将maxSpeed调整为200
     调用setMaxSpeed()方法
     brand:凯德拉克,color黑色,maxSpeed:200
     调用car()构造函数
     Instantitation BeanPosttProcessor.postProcessAfterInstantiation
     Instantiation AwareBeanPostProcessor.postProcessPropertyValues
     调用setBrand()方法
     调用setMaxSpeed()方法
     调用setBeanName()方法
     调用setBeanFactory()方法
     调用BeanPostProcessor.postProcess BeforeInitialization(), color 为空，设置为黑色
     调用afterPropertiesSet()方法
     调用myInit()方法，将maxSpeed设置为300
     调用BeanPostProcessor.postProcessor AfterInitialization(),将maxSpeed调整为200
     调用setMaxSpeed()方法
     brand:凯德拉克,color黑色,maxSpeed:200
     car1==car2:false
    * */
    public static void main(String[] args) {
        LifeCycleBeanFactory();
    }
}
