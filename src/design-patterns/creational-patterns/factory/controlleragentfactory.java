package factory;

public class ControllerAgentFactory implements AgentFactory {
    @Override
    public Agent createAgent() {
        return new ControllerAgent();
    }
}