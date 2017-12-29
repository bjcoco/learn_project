/*
 *  @(#) Bean.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package gson;

/**
 * @author heke ,2017/12/26:10:38
 * @version 1.0.0
 */
public class Bean<T> {
    private String name;

    private Integer integer;

    private int anInt;

    private byte aByte;

    private T t;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Bean(String name, Integer integer, int anInt, byte aByte, T t) {
        this.name = name;
        this.integer = integer;
        this.anInt = anInt;
        this.aByte = aByte;
        this.t = t;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bean{");
        sb.append("name='").append(name).append('\'');
        sb.append(", integer=").append(integer);
        sb.append(", anInt=").append(anInt);
        sb.append(", aByte=").append(aByte);
        sb.append(", t=").append(t);
        sb.append('}');
        return sb.toString();
    }
}
