public class ArrayOfObjects {
    int no;
    String student_name;

    ArrayOfObjects(int roll_no, String name) {
        no = roll_no;
        student_name = name;
    }

    public String get_name() {
        return student_name;
    }

    public int get_no() {
        return no;
    }

    public static void main(String[] args) {
        ArrayOfObjects arr[] = new ArrayOfObjects[5];
        arr[0] = new ArrayOfObjects(1, "Harshal");
        arr[1] = new ArrayOfObjects(2, "Bhvae");
        System.out.println(arr[0].get_name());
        System.out.println(arr[1].get_name());

    }
}
