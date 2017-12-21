/*
 *  @(#) WaiterMethod.java 1.0 2017/12/21
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.seven.aspect.more;

/**
 * @author heke ,2017/12/21:14:51
 * @version 1.0.0
 */
public class WaiterMethod {
    public void greetTo(String name){
        System.out.println("greet to :" + name);
    }

    public void serverTo(String name, int count){
        System.out.println("server to :" + name + ", total :" + count);
    }
}
