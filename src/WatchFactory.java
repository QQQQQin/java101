public class WatchFactory extends MachineFactory {
    @Override
    public Machine make() {
        return new Watch();
    }
}
