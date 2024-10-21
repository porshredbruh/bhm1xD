import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String mainStr = in.nextLine();
        String rleStr="";

        char[] symb = mainStr.toCharArray();
        int len = symb.length;

        rleStr += symb[0];

        int count=1;

        for(int i = 1; i<len; i++) {
            if(symb[i] == symb[i-1]) count++;
            else {
                rleStr += count;
                rleStr += symb[i];
                count=1;
            }
        }
        rleStr+=count;

        System.out.println(rleStr);
    }
}