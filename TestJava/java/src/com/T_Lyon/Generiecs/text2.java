package com.T_Lyon.Generiecs;

import org.junit.Test;

public class text2 {


    @Test

    public void aa() {
        demo<?> name = new demo<>("afsd");
        demo<? extends Number> age = new demo<>(712);

        System.out.println("name class:" + name.getClass());      // com.qqyumidi.Box
        System.out.println("age class:" + age.getClass());        // com.qqyumidi.Box
        System.out.println(name.getClass() == age.getClass());    // true
        sfd(1,12,3,123,21,"3",31,new String(String.valueOf(1)),false);
    }

    public <AT> void sfd(AT ... agesasf){
        System.out.println("引用一次");
    }
}
