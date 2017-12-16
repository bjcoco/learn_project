package inject.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Boss Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 上午9:37
 */
@Configuration
public class Boss {

    @Bean
    public Person1 person1(){
        return new Person1();
    }

    @Bean Person2 person2(){
        return new Person2();
    }
}
