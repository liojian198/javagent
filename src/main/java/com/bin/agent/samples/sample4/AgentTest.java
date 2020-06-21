package com.bin.agent.samples.sample4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AgentTest {
    public static void main(String[] args) {
        boolean is = true;
        while (is) {
            List<Object> list = new ArrayList<>();
            list.add(UUID.randomUUID());
        }
    }

}
