import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        System.out.println("enter first number: ");
        Scanner int1 = new Scanner(System.in);
        int a = int1.nextInt();
        System.out.println("enter second number: ");
        Scanner int2 = new Scanner(System.in);
        int b = int2.nextInt();

        while (a++ < b)
            System.out.println(a - 1);


    }
}