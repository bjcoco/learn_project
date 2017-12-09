package reflect.classmethod;

/**
 * Car Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/9
 * Time: 下午12:13
 */
public class Car {
    private String name;

    private String color;

    public String num;

    public Car(String name) {
        this.name = name;
    }

    private Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(String name, String color, String num) {
        this.name = name;
        this.color = color;
        this.num = num;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!getName().equals(car.getName())) return false;
        if (!getColor().equals(car.getColor())) return false;
        return getNum().equals(car.getNum());
    }
}
