/*
 *  @(#) myBeanFactoryPostProcess.java 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lifecycle.application;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author heke ,2017/12/10:14:29
 * @version 1.0.0
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        // applicationContext启动时，为配置文件中每个bean生成一个BeanDefinition对象；
        BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition("car");
        bd.getPropertyValues().addPropertyValue("brand","奔驰");
        System.out.println("调用BeanFactoryPostProcessor.postProcessBean Factory()");
    }
}
