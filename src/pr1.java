import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long num = in.nextLong(), temp=num;
        long reversed=0;
        int len=0;

        while(temp!=0) {
            temp/=10;
            len++;
        }

        for (int i = 0; i < len; i++) {
            reversed+=num%10 * Math.pow(10, len-i-1);
            num/=10;
        }
        System.out.println(reversed);
    }
}