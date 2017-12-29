/*
 *  @(#) MultimapTest.java 1.0 2017/12/29
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.junit.Test;

/**
 * @author heke ,2017/12/29:10:43
 * @version 1.0.0
 */
public class MultimapTest {
    @Test
    public void test1() {
        Multimap<String, Bean> multimap = ArrayListMultimap.create();
        for (int i = 0; i < 3; i++) {
            Bean bean = new Bean();
            bean.setName("name" + i);
            bean.setAge(i);
            multimap.put(bean.getName(), bean);
        }
        System.out.println(multimap.size());
        System.out.println(multimap.keys());

        multimap.values().stream()
                .sorted((p, p2) -> (p.getName().compareTo(p2.getName())))
                .forEach((p) -> System.out.println(p.getName()+":"+p.getAge()));
    }
}
