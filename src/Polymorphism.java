class Bank {
    int getInterest() {
        return 5;
    }
}

class Bank_ABC extends Bank {
    int getInterest() {
        return 10;
    }
}

class Bank_DEF extends Bank {
    int getInterest() {
        return 20;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Bank b = new Bank_ABC();
        Bank c = new Bank_DEF();
        System.out.println(b.getInterest());
        System.out.println(c.getInterest());
    }
}
