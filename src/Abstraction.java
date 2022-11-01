abstract class Bank1 {
    abstract int getInterest();
}

class Bank_ABCD extends Bank1 {
    int getInterest() {
        return 5;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bank1 b = new Bank_ABCD();
        System.out.println(b.getInterest());
    }
}
