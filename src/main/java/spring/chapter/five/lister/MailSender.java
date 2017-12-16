package spring.chapter.five.lister;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * MailSender Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 下午3:55
 */
public class MailSender implements ApplicationContextAware {
    private ApplicationContext ac;
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.ac = ac;
    }

    public void send(String to){
        System.out.println("模拟发送邮件");
        MailSendEvent event = new MailSendEvent(ac,to);
        ac.publishEvent(event);
    }
}
