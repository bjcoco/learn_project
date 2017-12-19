/*
 *  @(#) PerformanceMonitor.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.indroduction;

/**
 * @author heke ,2017/12/19:14:55
 * @version 1.0.0
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

    public static void begin(String method) {
        System.out.println("begin monitor");
        MethodPerformance mp = new MethodPerformance(method);
        performanceRecord.set(mp);
    }

    public static void end(){
        System.out.println("end monitor");
        MethodPerformance mp = performanceRecord.get();
        mp.printPerformance();
    }
}
