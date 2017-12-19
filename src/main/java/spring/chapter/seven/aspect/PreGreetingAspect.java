package spring.chapter.seven.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * PreGreetingAspect Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/19
 * Time: 下午8:26
 */
@Aspect
public class PreGreetingAspect {
    @Before("! within(spring.chapter.six..*)")
    public void beforeGreeting(){
        System.out.println("How are you");
    }
}
