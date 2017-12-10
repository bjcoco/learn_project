/*
 *  @(#) 1.0 2017/12/10
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package reflect.classmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author heke ,2017/12/10:9:49
 * @version 1.0.0
 */
// Configuration 表示是一个配置信息提供类
@Configuration
public class Beans {

    // 定义一个bean carBean 并注入属性值
    @Bean(name = "car")
    public CarBean buildCar(){
        CarBean car = new CarBean();
        car.setName("config car name");
        car.setColor("config car color");
        return car;
    }
}
