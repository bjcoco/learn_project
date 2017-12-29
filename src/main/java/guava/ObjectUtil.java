/*
 *  @(#) ObjectUtil.java 1.0 2017/12/28
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package guava;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author heke ,2017/12/28:15:02
 * @version 1.0.0
 */
public class ObjectUtil {
    public static void doList(){
        List<String> keys = Arrays.asList("a","b","c");
        List<String> keyList = Lists.transform(keys, new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input + "+" + input;
            }
        });
        System.out.println(keys);
        System.out.println(keyList);
    }

}
