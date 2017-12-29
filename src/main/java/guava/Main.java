/*
 *  @(#) Main.java 1.0 2017/12/27
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package guava;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.sun.istack.internal.Nullable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author heke ,2017/12/27:10:57
 * @version 1.0.0
 */
public class Main {
    @Test
    public void test1(){
        List<Bean> list = new ArrayList<Bean>(){{
            add(new Bean(){{
                setName("name1");
                setAge(1);
            }});
            add(new Bean(){{
                setName("name2");
                setAge(2);
            }});
        }};

        Map<String, Bean> jdk8Map = list
                .stream()
                .collect(Collectors.toMap(Bean::getName, java.util.function.Function.identity()));
        System.out.println("jdk8Map:" + jdk8Map);

        Map<String, Bean> guavaMap = Maps.uniqueIndex(list, new Function<Bean, String>() {
            @Nullable
            @Override
            public String apply(@Nullable Bean k) {
                return k.getName();
            }
        });
        System.out.println("guavaMap:"+guavaMap);
    }
}
