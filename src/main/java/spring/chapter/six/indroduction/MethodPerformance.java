/*
 *  @(#) MethodPerformance.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.indroduction;

/**
 * @author heke ,2017/12/19:14:57
 * @version 1.0.0
 */
public class MethodPerformance {
    private long beign;
    private long end;
    private String serviceMethod;

    public MethodPerformance(String serviceMethod){
        this.serviceMethod = serviceMethod;
        this.beign = System.currentTimeMillis();
    }

    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end - beign;
        System.out.println(serviceMethod + "花费" + elapse + "毫秒");
    }
}
