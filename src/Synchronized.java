//Deo class contains synchronized methods

class Demo {
    public synchronized void wish(String name) {
        System.out.println("My name is " + name);
    }
}

class Mythread extends Thread {
    QuiIckSORT object;
    String input;

    Mythread(QuiIckSORT d, String name) {
        object = d;
        input = name;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            object.wish(input);
        }
    }
}

public class Synchronized {
    public static void main(String[] args) {
        QuiIckSORT d = new QuiIckSORT();
        Mythread t1 = new Mythread(d, "harshal");
        Mythread t2 = new Mythread(d, "bhave");
        t1.start();
        t2.start();
    }
}
