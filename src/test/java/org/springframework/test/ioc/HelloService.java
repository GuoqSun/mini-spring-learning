package org.springframework.test.ioc;

/**
 * @author sunguoqiang
 * @date 2024/5/18 21:36
 */
public class HelloService {
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
