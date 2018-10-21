public class PhoneFactory extends MachineFactory {
    @Override
    public Machine make() {
        return new Phone();
    }
}
