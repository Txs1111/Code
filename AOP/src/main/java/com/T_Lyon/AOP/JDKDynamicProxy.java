package com.T_Lyon.AOP;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Lyon
 * 2021年5月21日13:58:37
 */
public class JDKDynamicProxy implements InvocationHandler {
    private Object target;

    /**
     * IOC注入
     *
     * @param target
     */
    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 获取被真实对象的的代理对象
     * target.getClass().getClassLoader() 真实对象(被代理对象)的类加载器
     * target.getClass().getInterfaces() 真实对象(被代理对象)的类的接口实现的所有Class对象
     * this InvocationHandler接口
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Do something before");
        Object result = method.invoke(target, args);
        System.out.println("Do something after");
        return result;
    }
}
