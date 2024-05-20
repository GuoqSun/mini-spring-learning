package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 第一种Bean实例化方法
 *
 * @author sunguoqiang
 * @date 2024/5/20 11:49
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    /**
     * 简单的Bean实例化策略，根据bean的无参构造函数实例化对象
     *
     * @param beanDefinition bean的信息
     * @return 实例化后对象
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            Constructor constructor = beanClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
