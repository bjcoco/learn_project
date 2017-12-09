package reflect.method;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import reflect.classmethod.CarBean;

/**
 * BeanFactoryTest Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/9
 * Time: 下午1:20
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("/spring/bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(res);
        System.out.println("init beanFactory");

        CarBean car = beanFactory.getBean("car", CarBean.class);
        System.out.println(car.getName());
        System.out.println(car.getColor());
    }
}
