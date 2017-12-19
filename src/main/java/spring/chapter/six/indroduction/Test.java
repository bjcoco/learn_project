/*
 *  @(#) Test.java 1.0 2017/12/19
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package spring.chapter.six.indroduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heke ,2017/12/19:15:02
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/introductbean.xml");
        ForumService forumService = ac.getBean("forumService", ForumService.class);
        forumService.removeTop();
        forumService.removeForum();
        System.out.println("============================");
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);

        forumService.removeTop();
        forumService.removeForum();
    }
}
