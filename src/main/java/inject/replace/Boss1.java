/*
 *  @(#) Boss1.java 1.0 2017/12/13
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject.replace;

import inject.Car;

/**
 * @author heke ,2017/12/13:11:34
 * @version 1.0.0
 */
public class Boss1 {
    public Car getCar(){
        Car car = new Car();
        car.setBrand("奔驰");
        car.setColor("白色");
        return car;
    }
}
