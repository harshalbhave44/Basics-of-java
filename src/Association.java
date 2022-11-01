class Car {
    String name;
    int price;

    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void information() {
        System.out.println(name + " with price : " + price);
    }
}

class CompanyABC extends Car {
    String name;
    int price;
    int model_no;

    CompanyABC(String name, int price, int model_no) {
        super(name, price);
        this.name = name;
        this.price = price;
        this.model_no = model_no;
    }
}

public class Association {
    public static void main(String[] args) {
        Car c = new CompanyABC("Tata", 100000, 123);
        c.information();

    }
}