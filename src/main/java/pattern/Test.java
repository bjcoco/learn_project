/*
 *  @(#) Test.java 1.0 2017/12/18
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package pattern;

import java.util.regex.Pattern;

/**
 * @author heke ,2017/12/18:15:43
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        String reg = "/+.*";

        String str = "";
       /* Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
        System.out.println(matcher.find());
        System.out.println(matcher.lookingAt());
*/

        System.out.println(Pattern.matches(reg, str));
    }
}
