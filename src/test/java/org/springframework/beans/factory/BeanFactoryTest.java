package org.springframework.beans.factory;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanFactoryTest {

    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        // 两次get的bean是同一个对象，单例模式
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        HelloService helloService1 = (HelloService) beanFactory.getBean("helloService");
        System.out.println(helloService);
        System.out.println(helloService1);
        helloService.sayHello();
    }


}
