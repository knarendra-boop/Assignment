package org.example;

public class NormalUser {

    public double calculateFee() {
        return 100.0;
    }
}

class PreminumUser extends NormalUser {
    public double calculateFee() {
        return 200.0;
    }
}
class calculationFeeApp {
    public static void main(String[] args) {
        NormalUser nu = new NormalUser();
        System.out.println("NormalUser " + nu.calculateFee());
        PreminumUser pu = new PreminumUser();
        System.out.println("PreminumUser " + pu.calculateFee());
    }

}