import java.util.Scanner;

public class pr9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num = in.nextLine();

        boolean[] used = new boolean[num.length()];
        StringBuilder cur = new StringBuilder();

        generateNum(num, used, cur);
    }

    private static void generateNum(String input, boolean[] used, StringBuilder cur) {
        if (cur.length() == input.length()) {
            if (cur.charAt(0) != '0') {
                System.out.print(cur+" ");
            }
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (!used[i]) {

                if (i > 0 && input.charAt(i) == input.charAt(i - 1) && !used[i - 1]) {
                    continue;
                }

                used[i] = true;
                cur.append(input.charAt(i));

                generateNum(input, used, cur);

                used[i] = false;
                cur.deleteCharAt(cur.length() - 1);
            }
        }
    }
}
