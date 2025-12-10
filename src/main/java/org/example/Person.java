package org.example;

public class Person {

    private String name;
    private String email;
    private String phone;
    public Person(String name, String email, String phone) {
        this.name  = name;
        this.email = email;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name  = name;
    }

    public String getEmail() {
        return email;

    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}

class User extends Person {
    private String walletId;
   private double walletBalance;

    public User(String name, String email, String phone, String walletId, double walletBalance) {
        super(name, email, phone);
        this.walletId = walletId;
        this.walletBalance = walletBalance;

    }

    public String getWalletId() {
        return walletId;
    }
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }
    public double getWalletBalance() {
        return walletBalance;
    }
    public void setWalletBalance(double walletBalance) {
        this.walletBalance=walletBalance;
    }
    public boolean deposit(double amount) {
        if(amount<0) {
            return false;
        }
        walletBalance+=amount;
        return true;
    }

    public boolean spend(double amount) {
        if(amount <=0) {
            return false;
        }
if(walletBalance>=amount) {
    walletBalance-=amount;
    return true;
}else {
    return false;
}
    }
}
class  walletDemo {
    public static void main(String[] args) {
        User u = new User("narendra","narendra@gmail.com", "9618800617", "1234", 1234.15);
        System.out.println("name " +  u.getName());
        System.out.println("intial Balance " + u.getWalletBalance());
        u.deposit(500);
        System.out.println("sucees fully added");
        System.out.println(u.getWalletBalance());
        u.spend(700);
        System.out.println("reduced");
        System.out.println(u.getWalletBalance());

    }
}
