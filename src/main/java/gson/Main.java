/*
 *  @(#) Main.java 1.0 2017/12/26
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package gson;

import com.alibaba.fastjson.JSON;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author heke ,2017/12/26:10:31
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        SubBean subBean = new SubBean("coco1", 2000, 3500, new Byte("0"));
        Bean bean = new Bean("coco", 1000, 3500, new Byte("1"), subBean);
        System.out.println(JSON.toJSONString(bean));
        String string = "{\"aByte\":1,\"anInt\":3500,\"integer\":1000,\"name\":\"coco\",\"t\":{\"subByte\":0,\"subInt\":3500,\"subInteger\":2000,\"subName\":\"coco1\"}}";
        // gson2 避免整形转换为dubbo类型
        Gson gson2 = new GsonBuilder()
                .registerTypeAdapter(
                        new TypeToken<TreeMap<String, Object>>() {
                        }.getType(),
                        new JsonDeserializer<TreeMap<String, Object>>() {
                            @Override
                            public TreeMap<String, Object> deserialize(
                                    JsonElement json, Type typeOfT,
                                    JsonDeserializationContext context) throws JsonParseException {

                                TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
                                JsonObject jsonObject = json.getAsJsonObject();
                                Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
                                for (Map.Entry<String, JsonElement> entry : entrySet) {
                                    treeMap.put(entry.getKey(), entry.getValue());
                                }
                                return treeMap;
                            }
                        }).create();

        TreeMap<String, Object> map =
                gson2.fromJson(string, new TypeToken<TreeMap<String, Object>>(){}.getType());
        System.out.println("map:" + map);

        Gson gson = new Gson();
        Bean trans = gson.fromJson(string, Bean.class);
        System.out.println(trans);
    }
}
