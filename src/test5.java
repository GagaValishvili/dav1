import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        System.out.println("enter number which contains 4 digits: ");
        int a = int1.nextInt();

        int dig1 = a / 1000;
        int dig2 = (a % 1000)/100;
        int dig3 = (a % 100)/10;
        int dig4 = a % 10;

        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);
        System.out.println(dig4);



    }
}
