package reflect.method;

import reflect.classmethod.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Main Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/9
 * Time: 下午12:16
 */
public class Main {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        System.out.println("AppClassLoader:"+classLoader);
        System.out.println("ExtClassLoader:"+classLoader.getParent());
        System.out.println("根装载器:"+classLoader.getParent().getParent());
        try {
            Class clazz = classLoader.loadClass("reflect.classmethod.Car");

            System.out.println("class name:" + clazz.getName());

            Constructor[] constructor = clazz.getConstructors();
            for (Constructor con : constructor){
                System.out.println("constructor:" + con);
            }

            Method[] method = clazz.getMethods();
            for (Method met : method){
                System.out.println("method:" + met);
            }

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields){
                System.out.println("field:"+field);
            }


            Constructor constructor1 = clazz.getConstructor(String.class);
            Car car = (Car)constructor1.newInstance("contract name");
            System.out.println(car.getName());

            Method method1 = clazz.getMethod("setName",String.class);
            method1.invoke(car,"method name");
            System.out.println(car.getName());

            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            field.set(car,"field name");
            System.out.println(car.getName());

            Field field1 = clazz.getDeclaredField("num");
            field1.set(car,"12");
            System.out.println(car.getNum());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
