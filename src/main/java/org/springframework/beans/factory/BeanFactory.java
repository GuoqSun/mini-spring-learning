package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * BeanFactory接口
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
