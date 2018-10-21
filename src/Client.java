public class Client {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone make = (Phone) phoneFactory.make();
        WatchFactory watchFactory = new WatchFactory();
        watchFactory.make().start();
    }
}
