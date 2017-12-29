/*
 *  @(#) CountMethod.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package thread.synchr;

/**
 * @author heke ,2017/12/26:17:42
 * @version 1.0.0
 */
public class CountMethod {

    //    public void count() {
    public synchronized void count() {  //1.方法同步
//        synchronized (CountMethod.class){ //2.类对象同步
//        synchronized (this){ //3.代码块同步
        System.out.println("thread begin:" + Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread end:" + Thread.currentThread());
    }
}
