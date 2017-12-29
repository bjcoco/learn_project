/*
 *  @(#) CountMethod.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author heke ,2017/12/26:17:42
 * @version 1.0.0
 */
public class CountMethod {

    Lock lock = new ReentrantLock();

    public  void count() {
        lock.lock();
        try {
            System.out.println("thread begin:" + ThreadMethod.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread end:" + ThreadMethod.currentThread());
        } finally {
            lock.unlock();
        }

    }
}
