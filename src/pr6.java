import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int sum=a, car=b;


        while(car!=0) {
            int newCar = sum & car;
            sum=sum^car;
            car=newCar<<1;
        }

        System.out.println(sum);
    }
}