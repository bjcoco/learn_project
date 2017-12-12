/*
 *  @(#) Person.java 1.0 2017/12/12
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject.container;

/**
 * @author heke ,2017/12/12:16:25
 * @version 1.0.0
 */
public class Person {
    private String name;
    private SunCar car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SunCar getCar() {
        return car;
    }

    public void setCar(SunCar car) {
        this.car = car;
    }
}
