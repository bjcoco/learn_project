package spring.chapter.five.editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import reflect.method.ApplicationContexTest;

/**
 * Test Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 上午11:32
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/fiveEditorBean.xml");
        Boss boss = ac.getBean("boss", Boss.class);
        System.out.println(boss);
        System.out.println(boss.getCar());
        System.out.println(boss.getCar().getName() + "," + boss.getCar().getColor());
    }
}
