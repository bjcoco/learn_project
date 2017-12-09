package reflect.classmethod;

/**
 * CarBean Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/9
 * Time: 下午1:29
 */
public class CarBean {
    private String name;
    private String color;

    public CarBean() {
    }

    public CarBean(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
