package aitise3b;

public class SBIBank extends Bank {

    float intRate;

    SBIBank() {

    }

    SBIBank(int accNo, String accHolderName, double balance, float intRate) {
        super(accNo, accHolderName, balance);
        this.intRate = intRate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Interest Rate: " + intRate);
    }

    public static void main(String[] args) {
        SBIBank b1 = new SBIBank(101, "John", 10000, 5f);
        b1.display();
    }
}
