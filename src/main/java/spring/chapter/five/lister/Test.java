package spring.chapter.five.lister;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 下午3:59
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("/spring/fiveListerBean.xml");
        MailSender mailSender = ac.getBean("mailSender", MailSender.class);
        mailSender.send("heke_coco@126.com");
    }
}
