package com.bin.agent.samples.sample2;

public class AgentTest {
    public static void main(String[] args) {
        AgentTest agentTest = new AgentTest();
        agentTest.fun1();
        agentTest.fun2();

        AgentTest1 agentTest1 = new AgentTest1();
        agentTest1.fun3();
        agentTest1.fun4();
    }


    private void fun1() {
        System.out.println("this is fun 1.");
    }

    private void fun2() {
        System.out.println("this is fun 2.");
    }
}
