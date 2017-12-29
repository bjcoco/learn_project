/*
 *  @(#) GetName.java 1.0 2017/12/25
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package mockito;

/**
 * @author heke ,2017/12/25:17:54
 * @version 1.0.0
 */
public class GetName {
    InnerName innerName = new InnerName();
    public String getName(){
        return innerName.innerName();
    }

    public void setInnerName(InnerName innerName){
        this.innerName = innerName;
    }
}
