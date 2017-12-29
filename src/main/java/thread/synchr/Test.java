/*
 *  @(#) Test.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package thread.synchr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author heke ,2017/12/26:17:43
 * @version 1.0.0
 */
public class Test{

    private static final ExecutorService exec = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        CountMethod method = new CountMethod();
        for (int i = 0; i < 3 ;i ++){
            ThreadMethod thread = new ThreadMethod(method);
            exec.execute(thread);
        }

        exec.shutdown();
    }

    static{ //
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("addShutdownHook begin");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("addShutdownHook end");
            }
        }));
    }
}
