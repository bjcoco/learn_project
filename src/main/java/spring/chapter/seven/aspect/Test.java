package spring.chapter.seven.aspect;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Test Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/19
 * Time: 下午8:14
 */
public class Test {
    public static void main(String[] args) {
        AspectJProxyFactory factory = new AspectJProxyFactory();
        Waiter waiter = new NaiveWaiter();

        factory.setTarget(waiter);
        factory.addAspect(PreGreetingAspect.class);

        Waiter proxy = factory.getProxy();
        proxy.greetTo("coco");
        proxy.serveTo("coco");
    }
}
