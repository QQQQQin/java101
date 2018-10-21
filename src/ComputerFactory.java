public class ComputerFactory extends MachineFactory {
    @Override
    public Machine make() {
        return new Computer();
    }
}
