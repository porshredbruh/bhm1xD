import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        trans(n, 'A', 'C', 'B'); // 1-3-2
    }

    public static void trans(int n, char from, char to, char sup) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            return;
        }

        trans(n - 1, from, sup, to); //1-2
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        trans(n - 1, sup, to, from); //2-3
    }
}
