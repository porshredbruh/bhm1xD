import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word1 = in.nextLine();
        String word2 = in.nextLine();

        word1=word1.toLowerCase();
        word1=word1.replaceAll(" ", "");
        word2=word2.toLowerCase();
        word2=word2.replaceAll(" ", "");

        char[] word1Let = word1.toCharArray();
        int len1 = word1Let.length;
        char[] word2Let = word2.toCharArray();
        int len2 = word2Let.length;

        if (len1 == len2) {
            boolean flag = true;
            boolean finFlag = true;
            for (int i = 0; i < len2; i++) {
                if (flag == true) flag = false;
                else {
                    System.out.println("No");
                    finFlag = false;
                    break;
                }
                for (int j = 0; j < len1; j++) {
                    if (word2Let[i] == word1Let[j]) {
                        word1Let[j] = '0';
                        flag = true;
                    }
                }
            }

            if (finFlag) System.out.println("Yes");
        }
        else System.out.println("No");
    }
}