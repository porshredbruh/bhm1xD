import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String input = in.nextLine();
        String underString = in.nextLine();

        char[] inputChecking = input.toCharArray();
        char[] check = underString.toCharArray();

        boolean flag = false;

        for (int i = 0; i<inputChecking.length - check.length + 1; i++) {
            for (int j = 0; j < check.length; j++) {
                if(check[j] != inputChecking[i+j]) break;
                else if(j == check.length-1) {
                    System.out.print(i+ " ");
                    flag = true;
                }
            }
        }

        if(flag == false) System.out.println(-1);
    }
}