import java.util.Scanner;

public class sum_of_digits{

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int k, sum = 0;
        if (num >= 0 && num <= 1000) {
            while (num!=0) {
                k = num % 10;
                sum = sum + k;
                num = num / 10;
            }
            System.out.println("the sum of digits is 455" +
                    "" + sum);
        }
    }
}
