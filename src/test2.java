import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = int1.nextInt();

        Scanner int2 = new Scanner(System.in);
        System.out.println("enter second number: ");
        int b = int2.nextInt();



        int result1 = a / b;
        int result2 = b % a;

        System.out.println(result1);
        System.out.println(result2);

    }
}
