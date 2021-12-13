package lesson;

public class Main {
    public static void main(String[] args) {
        Network network = new Network();
        Phone phone1 = new Phone("+380661453695");
        Phone phone2 = new Phone("+380501479856");

        phone1.outboundCall(phone2.getNumber());

        phone1.registerNumberInNetwork(network);
        phone1.outboundCall(phone2.getNumber());

        phone2.registerNumberInNetwork(network);
        phone1.outboundCall(phone2.getNumber());
        phone2.outboundCall(phone1.getNumber());

    }
}

