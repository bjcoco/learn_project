/*
 *  @(#) Boss2.java 1.0 2017/12/13
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject.replace;

import inject.Car;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author heke ,2017/12/13:11:34
 * @version 1.0.0
 */
public class Boss2 implements MethodReplacer{
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        Car car = new Car();
        car.setBrand("宝马");
        car.setColor("红色");
        return car;
    }
}
