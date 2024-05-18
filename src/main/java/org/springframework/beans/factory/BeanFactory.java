package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义一个简单的bean容器BeanFactory
 */
public class BeanFactory {
    private Map<String, Object> beanMap = new HashMap<>();

    // 保存bean
    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    // 获取bean
    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
