package com.T_Lyon.CGIIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class InvocationHandler1 {
    public static void main(String[] args) {
        try {
            testInvocationHandler();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void testInvocationHandler() throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                    return "hello cglib";
                } else {
                    throw new RuntimeException("Do not know what to do");
                }
            }
        });
        SampleClass proxy = (SampleClass) enhancer.create();
//        System.out.println("hello cglib" + "====" + proxy.test(null));
        System.out.println("Hello cglib" + "====" + proxy.toString());
    }
}
