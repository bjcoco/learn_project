/*
 *  @(#) NaiveWaiter.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.beforeadvice;

/**
 * @author heke ,2017/12/19:11:02
 * @version 1.0.0
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println("greet TO :" + name);
    }

    public void serveTo(String name) {
        System.out.println("serve To :" + name);
    }
}
