import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = int1.nextInt();

        Scanner int2 = new Scanner(System.in);
        System.out.println("enter second number: ");
        int b = int2.nextInt();

        Scanner int3 = new Scanner(System.in);
        System.out.println("enter third number: ");
        int c = int3.nextInt();




        int result1 = a + b + c;
        int result2 = a * b * c;

        System.out.println("ჯამი " + result1);
        System.out.println("ნამრავლი " + result2);

    }
}
