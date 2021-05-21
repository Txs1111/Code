package com.T_Lyon.AOP;

/**
 * @author Lyon
 * 2021年5月21日13:42:33
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("我可以做任何事情，我是真实主体");
    }
}
