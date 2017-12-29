/*
 *  @(#) Interface1.java 1.0 2017/12/28
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lambda;

/**
 * @author heke ,2017/12/28:18:26
 * @version 1.0.0
 */
public interface Interface1 {
    public static void method1(){
        System.out.println("static method");
    }

    default Interface1 addMethod(){
        System.out.println("defalut way");
        return () -> method2();
    }

    public void method2();
}
