package org.springframework.beans;

/**
 * 相关的异常
 *
 * @author sunguoqiang
 * @date 2024/5/18 21:19
 */
public class BeansException extends RuntimeException {
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
