package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * Bean的实例化策略，有两个实现类，一个是通过bean的构造方法，一个是通过CGLIB动态生成子类
 *
 * @author sunguoqiang
 * @date 2024/5/20 11:47
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
