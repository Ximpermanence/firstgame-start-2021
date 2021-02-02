package cn.ch.firstgamestart.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;

/**
 * @program: bms-server
 * @description: ...
 * @author: zhangshaolin
 * @create: 2020-02-28 17:01
 **/
@Slf4j
public class EnumUtils {

    /**
     * 根据value获取label       (注意:label和value都要定义为String)
     *
     * @param clazz
     * @param value
     * @return
     */
    public static String getLabelByValue(Class clazz, String value) throws Exception {
        try {
            if (clazz.isEnum()) {
                Enum[] enumConstants = (Enum[]) clazz.getEnumConstants();
                Method getValue = clazz.getMethod("getValue");
                Method getLable = clazz.getMethod("getLabel");
                for (Enum e : enumConstants) {
                    String name = e.name();
                    String val = (String) getValue.invoke(e);
                    if (StringUtils.equals(value, val)) {
                        return (String) getLable.invoke(e);
                    }
                }
            }
        } catch (Exception e) {
            log.info("{}", clazz.getCanonicalName(), e);
        }
        throw new Exception("通过label获取value失败");
    }

    /**
     * 根据label获取value        (注意:label和value都要定义为String)
     *
     * @param clazz
     * @param label
     * @return
     */
    public static String getValueByLabel(Class clazz, String label) throws Exception {
        try {
            if (clazz.isEnum()) {
                Enum[] enumConstants = (Enum[]) clazz.getEnumConstants();
                Method getValue = clazz.getMethod("getValue");
                Method getLable = clazz.getMethod("getLabel");
                for (Enum e : enumConstants) {
                    String name = e.name();
                    String tempLabel = (String) getLable.invoke(e);
                    if (StringUtils.equals(label, tempLabel)) {
                        return (String) getValue.invoke(e);
                    }
                }
            }
        } catch (Exception e) {
            log.info("{}", clazz.getCanonicalName(), e);
        }
        throw new Exception("通过value获取label失败");
    }

}
