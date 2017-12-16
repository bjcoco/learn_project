package spring.chapter.five.editor;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * CarEditor Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 上午11:20
 */
public class CarEditor extends PropertyEditorSupport {
    public void setAsText(String text){
        if (text == null || ! text.contains(",")){
            throw new IllegalArgumentException("入参非法");
        }

        String[] strings = text.split(",");
        Car car = new Car();
        car.setName(strings[0]);
        car.setColor(strings[1]);

        setValue(car);
    }


}
