package spring.chapter.five.lister;

import org.springframework.context.ApplicationListener;

/**
 * MailSendListener Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 下午3:53
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    public void onApplicationEvent(MailSendEvent event) {
        System.out.println(event.getTo());
    }
}
