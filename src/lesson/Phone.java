package lesson;

public class Phone {
    private String number;
    private Network network;

    public Phone() {
        super();
    }

    public Phone(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void registerNumberInNetwork(Network network) {
        this.network = network;
        this.network.registerNumber(this);
    }

    public void inboundCall(String number) {
        System.out.println("Number " + number + " is calling!");

    }

    public void outboundCall(String outboundNumber) {
        if (network != null && network.isRegistered(this.number)) {
            if (network.isRegistered(outboundNumber)) {
                Phone outcomePhone = network.searchPhoneByNumber(outboundNumber);
                outcomePhone.inboundCall(this.number);
            } else {
                System.out.println("The subscriber is not registered in the network!");
            }
        } else {
            System.out.println("This number is not registered in the network!");
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", network=" + network +
                '}';
    }
}


