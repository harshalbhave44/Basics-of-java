public class StringMethods {
    public static void main(String[] args) {
        String s = "Harshal";
        String s1 = "Harshal";
        System.out.println("To check if character is present or not          " + s.contains("a"));
        System.out.println("To check if 2 strings are equal                  " + s.equals(s1));
        int index = s1.indexOf("a");
        String s2 = s1.substring(2, 5);
        System.out.println("To get the substring out of string               " + s2);

        System.out.println("To get the index of character                    " + index);
        System.out.println("To convert integer to string");
        int a = 100;
        String str1 = Integer.toString(a);
        System.out.println(str1);

    }
}
