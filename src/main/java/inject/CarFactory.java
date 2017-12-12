/*
 *  @(#) CarFactory.java 1.0 2017/12/12
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject;

/**
 * @author heke ,2017/12/12:15:26
 * @version 1.0.0
 */
public class CarFactory {
    public static Car createCar(){
        Car car = new Car();
        car.setBrand("奔驰");
        car.setColor("白色");
        return car;
    }
}
