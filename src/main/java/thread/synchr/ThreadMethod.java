/*
 *  @(#) ThreadMethod.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package thread.synchr;

/**
 * @author heke ,2017/12/26:17:44
 * @version 1.0.0
 */
public class ThreadMethod implements Runnable {

    private CountMethod countMethod;

    public void setCountMethod(CountMethod countMethod) {
        this.countMethod = countMethod;
    }

    public ThreadMethod(CountMethod countMethod) {
        this.countMethod = countMethod;
    }

    @Override
    public void run() {
        countMethod.count();
    }
}
