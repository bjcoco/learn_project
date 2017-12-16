package inject.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import reflect.method.ApplicationContexTest;

/**
 * MainTest Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 上午9:40
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Boss.class);
        Boss boss = ac.getBean("boss",Boss.class);
        Person1 person1 = boss.person1();
        System.out.println(person1);
        person1.setName("person1");
        System.out.println(person1.getName());

        Person2 person2 = boss.person2();
        System.out.println(person2);
        person2.setName("person2");
        System.out.println(person2.getName());
    }
}
