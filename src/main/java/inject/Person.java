/*
 *  @(#) Person.java 1.0 2017/12/12
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package inject;

/**
 * @author heke ,2017/12/12:14:30
 * @version 1.0.0
 */
public class Person {
    private String sex;

    private String name;

    private Car car;

    public Person() {
    }

    public Person(String sex, String name, Car car) {
        this.sex = sex;
        this.name = name;
        this.car = car;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
