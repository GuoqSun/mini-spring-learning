package org.springframework.beans.factory.config;

/**
 * 单例注册表的接口
 *
 * @author sunguoqiang
 * @date 2024/5/18 21:03
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
