import java.util.Arrays;

public class test9 {
    public static void main(String[] args) {
        int numbers[] = new int[]{33,53,73,94,22,45,23,87};
        int smallest_num = numbers[0];
        int biggest_num = numbers[0];

        for(int i=1; i< numbers.length; i++)
        {
            if(numbers[i] > biggest_num)
                biggest_num = numbers[i];
            else if (numbers[i] < smallest_num)
                smallest_num = numbers[i];

        }
        System.out.println("Array contains next numbers : " + Arrays.toString(numbers));
        System.out.println("Largest Number is : " + biggest_num);
        System.out.println("Smallest Number is : " + smallest_num);
    }
}

