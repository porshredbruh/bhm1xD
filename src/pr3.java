import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        boolean[] usedDigets = new boolean[1000000000];
        int[] retArr = new int[N];

        int usedSpace=0;
        for(int i = 0; i<N; i++) {
            int dig = in.nextInt();

            if(!usedDigets[dig]) {
                usedDigets[dig] = true;
                retArr[usedSpace] = dig;
                usedSpace++;
            }
        }

        for (int i = 0; i < usedSpace; i++) {
            System.out.print(retArr[i]+ " ");
        }
    }
}