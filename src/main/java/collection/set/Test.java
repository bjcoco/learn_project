package collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Test Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 上午9:59
 */
public class Test {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<Student>();
        Student s1 = new Student();
        s1.setIdCard("1234567");
        s1.setInfo("num1");
        sets.add(s1);

        Student s2 = new Student();
        s2.setIdCard("12345678");
        s2.setInfo("num2");
        sets.add(s2);

        Student s3 = new Student();
        s3.setIdCard("1234567");
        s3.setInfo("num3");
        sets.add(s3);

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        for (Student student : sets){
            System.out.println(student);
        }
    }
}
