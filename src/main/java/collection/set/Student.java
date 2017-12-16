package collection.set;

/**
 * Student Created by IntelliJ IDEA.
 * User: heke
 * Contract: heke_coco@126.com
 * Date: 2017/12/16
 * Time: 上午9:56
 */
public class Student {
    private String idCard;
    private String info;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("idCard='").append(idCard).append('\'');
        sb.append(", info='").append(info).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return getIdCard() != null ? getIdCard().equals(student.getIdCard()) : student.getIdCard() == null;
    }

    @Override
    public int hashCode() {
        return getIdCard() != null ? getIdCard().hashCode() : 0;
    }
}
