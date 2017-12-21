/*
 *  @(#) Test.java 1.0 2017/12/21
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.seven.anotation;

/**
 * @author heke ,2017/12/21:10:32
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        java.lang.reflect.Method[] methods = Method.class.getDeclaredMethods();
        for (java.lang.reflect.Method method : methods){
            NeedTest needTest = method.getAnnotation(NeedTest.class);
            System.out.println(needTest.value());
        }
    }
}
