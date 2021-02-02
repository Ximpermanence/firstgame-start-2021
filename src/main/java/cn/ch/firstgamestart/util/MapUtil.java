package cn.ch.firstgamestart.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:Map工具类
 * @author: chenhao
 * @create:2020/11/20 14:16
 **/
public class MapUtil {

    /**
     * 将对象值和参数传入map
     *
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {

        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getSuperclass().getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            map.put(fieldName, value);
        }
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            map.put(fieldName, value);
        }
        return map;
    }
}
