/*
 *  @(#) Method.java 1.0 2017/12/21
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.seven.anotation;

/**
 * @author heke ,2017/12/21:10:35
 * @version 1.0.0
 */
public class Method {
    @NeedTest(value = false)
    public void doSth(){
        System.out.println("do sth");
    }

    public void doNoting(){
        System.out.println("do nothing");
    }
}
