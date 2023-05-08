package factory.test;

import factory;

public class Test {
    public static void main(String[] args) {
        var agentFactory = Test.createAgentFactory(Agents.INITIATOR);
        var agent = agentFactory.createAgent();
        agent.useUltimate();
    }

    private static AgentFactory createAgentFactory(Agents agent) {
        return switch (agent) {
            case CONTROLLER -> new ControllerAgentFactory();
            case INITIATOR -> new InitiatorAgentFactory();
        }
    }
}