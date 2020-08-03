public class VariablesDemo {
    public static void main(String [] args) {
        int x = 10;
        System.out.println("My variable x contains " + x);
        x = 15;
        System.out.println("My variable x contains " + x);
    }

    public static void myMethod() {
        String myString = "My variable contains ";
        int x = 10;
        System.out.println(myString + x);
    }
}
