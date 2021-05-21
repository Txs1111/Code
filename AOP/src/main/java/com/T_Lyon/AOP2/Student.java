package com.T_Lyon.AOP2;

/**
 * @author Lyon
 * 2021年5月21日16:19:35
 */
public class Student implements Person {

    @Override
    public String say(String message) {
        return "Hello" + message;
    }
}
