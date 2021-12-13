package lesson;

import java.util.Arrays;

public class Network {

    private Phone[] registeredNumbers = new Phone[100];

    public Network() {
        super();
    }

    public Network(Phone[] registeredPhones) {
        this.registeredNumbers = registeredPhones;
    }

    public Phone[] getRegisteredNumbers() {
        return registeredNumbers;
    }

    public void setRegisteredNumbers(Phone[] registeredNumbers) {
        this.registeredNumbers = registeredNumbers;
    }

    public void registerNumber(Phone phone) {
        for (int i = 0; i < this.registeredNumbers.length; i++) {
            if (this.registeredNumbers[i] == null) {
                this.registeredNumbers[i] = new Phone(phone.getNumber());
                break;
            }
        }
    }

    public boolean isRegistered(String number) {
        for (int i = 0; i < this.registeredNumbers.length; i++) {
            if (this.registeredNumbers[i] != null) {
                if (this.registeredNumbers[i].getNumber().equals(number))
                    return true;
            }
        }
        return false;
    }

    public Phone searchPhoneByNumber(String number) {
        for (int i = 0; i < this.registeredNumbers.length; i++) {
            if (this.registeredNumbers[i] != null) {
                if (this.registeredNumbers[i].getNumber().equals(number)) {
                    return this.registeredNumbers[i];
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Network{" +
                "registeredNumbers=" + Arrays.toString(registeredNumbers) +
                '}';
    }
}

