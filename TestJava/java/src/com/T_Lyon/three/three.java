package com.T_Lyon.three;

import org.junit.Test;

import java.util.*;

public class three {

    Set port = new HashSet<>();
    Map map = new HashMap<>();

    @Test
    private void main() {

        map.put("a", "5");
        map.put("b", "6");
        map.put("c", "7");
        map.put("d", "8");
        map.put("e", "9");
        port.add(map);
        addPort(port);
    }

    private void addPort(Set port) {
        getPort();
    }


    public Object getPort() {
        return port;
    }

}
