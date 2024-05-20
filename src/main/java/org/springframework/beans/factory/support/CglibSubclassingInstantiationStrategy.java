package org.springframework.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * 第二种bean的实例化方法
 *
 * @author sunguoqiang
 * @date 2024/5/20 11:52
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    /**
     * 使用CGLIB动态生成子类
     *
     * @param beanDefinition bean的信息
     * @return 实例化后对象
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, argsTemp, proxy) -> proxy.invokeSuper(obj, argsTemp));
        return enhancer.create();
    }
}
