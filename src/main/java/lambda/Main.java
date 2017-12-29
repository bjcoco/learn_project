/*
 *  @(#) Main.java 1.0 2017/12/28
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * @author heke ,2017/12/28:16:14
 * @version 1.0.0
 */
public class Main {

    @Test
    public void test() {
        Runnable r = () -> System.out.println("hello world");
        r.run();

        new Thread(
                () -> System.out.println("hello world")
        ).start();
    }

    public void execute(Method method){
        method.doSth();
    }

    @Test
    public void test1(){
        execute(new Method() {
            @Override
            public void doSth() {
                System.out.println("override do sth method");
            }
        });

        execute(() -> System.out.println("lambda do sth method"));

        execute(System.out::println);
    }

    @Test
    public void test2(){
//        Predicate<String> filter = (p) -> (!p.equals("123"));
        Predicate<String> filter = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.equals("123");
            }
        };
        Predicate<String> negateFilter = filter.negate();
        Predicate predicate = Predicate.isEqual("wqw");
        List<String> list = asList("123","wqw", "123","df");
        /*list.stream().filter(filter).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        list.stream().filter(negateFilter).forEach((s) -> print(s));
        list.stream().filter(predicate).forEach((s) -> print(s));
    }

    public void print(Object obj){
        System.out.println(obj);
    }

    @Test
    public void test3(){
        Interface1Impl interface1 = new Interface1Impl();
        interface1.method2();
        Interface1.method1();
        Interface1 interface11 = interface1.addMethod();
        interface11.method2();
    }

    @Test
    public void test4() {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected = collected.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));//注意发生的变化
        System.out.println(collected);
    }

    @Test
    public void test5(){
        int a = 100;
        if (a > 10){
            if (a > 20){
                System.out.println("yes");
                return;
            }
        }

        System.out.println("yes3");
    }
}
