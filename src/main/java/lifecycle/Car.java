/*
 *  @(#) Car.java 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author heke ,2017/12/10:10:16
 * @version 1.0.0
 */
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用car()构造函数");
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()方法");
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        System.out.println("调用setMaxSpeed()方法");
        this.maxSpeed = maxSpeed;
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void introduce(){
        System.out.println("brand:" + brand + ",color" + color +",maxSpeed:" + maxSpeed) ;
    }

    public void setBeanName(String beanName) {
        System.out.println("调用setBeanName()方法");
        this.beanName = beanName;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用setBeanFactory()方法");
        this.beanFactory = beanFactory;
    }

    public void destroy() throws Exception {
        System.out.println("调用destroy()方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet()方法");
    }

    public void myInit(){
        System.out.println("调用myInit()方法，将maxSpeed设置为300");
        this.maxSpeed = 300;
    }

    public void myDestory(){
        System.out.println("调用myDestory()方法");
    }
}
