public class Client {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.make().start();
        WatchFactory watchFactory = new WatchFactory();
        watchFactory.make().start();
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.make().start();
    }
}
