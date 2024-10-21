import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] triangle = new int[N][];

        for(int i=0; i<N; i++) {
            triangle[i] = new int[i+1];
            for(int j= 0; j<i+1; j++) {
                triangle[i][j] = in.nextInt();
            }
        }

        for(int q= N-2; q>=0; q--) {
            for(int j =0; j<=q; j++) {
                triangle[q][j] += Math.max(triangle[q+1][j], triangle[q+1][j+1]);
            }
        }
        System.out.println(triangle[0][0]);
    }
}