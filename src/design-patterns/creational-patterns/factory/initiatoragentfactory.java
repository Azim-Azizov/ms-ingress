package factory;

public class InitiatorAgentFactory implements AgentFactory {
    @Override
    public Agent createAgent() {
        return new InitiatorAgent();
    }
}