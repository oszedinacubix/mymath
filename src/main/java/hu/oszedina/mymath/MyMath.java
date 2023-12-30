package hu.oszedina.mymath;

public class MyMath {
    public static int myAdd(int a, int b) {
        return a + b;
    }
    
    public static int mySubtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(myAdd(3, 2));
        System.out.println(mySubtract(5, 2));
    }
}
