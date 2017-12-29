/*
 *  @(#) SubBean.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package gson;

/**
 * @author heke ,2017/12/26:10:50
 * @version 1.0.0
 */
public class SubBean {
    private String subName;

    private Integer subInteger;

    private int subInt;

    private byte subByte;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Integer getSubInteger() {
        return subInteger;
    }

    public void setSubInteger(Integer subInteger) {
        this.subInteger = subInteger;
    }

    public int getSubInt() {
        return subInt;
    }

    public void setSubInt(int subInt) {
        this.subInt = subInt;
    }

    public byte getSubByte() {
        return subByte;
    }

    public void setSubByte(byte subByte) {
        this.subByte = subByte;
    }

    public SubBean(String subName, Integer subInteger, int subInt, byte subByte) {
        this.subName = subName;
        this.subInteger = subInteger;
        this.subInt = subInt;
        this.subByte = subByte;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SubBean{");
        sb.append("subName='").append(subName).append('\'');
        sb.append(", subInteger=").append(subInteger);
        sb.append(", subInt=").append(subInt);
        sb.append(", subByte=").append(subByte);
        sb.append('}');
        return sb.toString();
    }
}
