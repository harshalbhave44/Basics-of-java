public class MultipleInstance {
    static int count = 0;

    MultipleInstance() {
        count++;
    }

    static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new MultipleInstance();
        }

        System.out.println(MultipleInstance.getCount());
    }
}