package com.bin.agent.samples.sample1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.instrument.Instrumentation;

public class AgentTest {
    public static void main(String[] args) {
        System.out.println("start " + add());
    }
    public static String add() {
        return "hello world@";
    }
    public static void premain(String agentOps, Instrumentation inst) {

        System.out.println("--------agentOps-------->" + agentOps);
        inst.addTransformer(new InjectPrintTransformer());


    }
}
