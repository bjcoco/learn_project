/*
 *  @(#) Test.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package thread.lock;

/**
 * @author heke ,2017/12/26:17:43
 * @version 1.0.0
 */
public class Test{

    public static void main(String[] args) {
        CountMethod method = new CountMethod();
        for (int i = 0; i < 3 ;i ++){
            Thread thread = new ThreadMethod(method);
            thread.start();
        }
    }
}
