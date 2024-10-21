import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();

        if(month<3) {
            month+=12;
            year-=1;
        }

        int k= year%100;
        int j= year/100;

        int h=(day +(13*(month+1)/5)+ k + k/4 + j/4 - 2*j)%7;

        switch (h) {
            case 0 :
                System.out.println("Saturday");
                break;
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
        }
    }
}