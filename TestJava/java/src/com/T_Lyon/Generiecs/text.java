package com.T_Lyon.Generiecs;

import lombok.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class text {
    @Test
    public void m() {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("泛型测试" + "类型相同");
        }
    }
}

@Data
@AllArgsConstructor
class demo<A> {
    private A a;

}