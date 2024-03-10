import java.util.Scanner;

class Ques1 {
    public static int operations(String str) {
        int res = 0;
        if(str.length()==0)
        return -1;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            //The necessity of subtracting from 0 is to convert it to intger from characters beacuse bit-wise operations work on integers not on characters.. 

            if (currentChar == 'C' && i < str.length() - 1) {
                res = res ^ (str.charAt(i - 1) - '0') ^ (str.charAt(i + 1) - '0');
            } else if (currentChar == 'A' && i < str.length() - 1) {
                res = res & (str.charAt(i + 1) - '0');
            } else if (currentChar == 'B' && i < str.length() - 1) {
                res = res | (str.charAt(i + 1) - '0');
            }
        }

        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary String: ");
        String str1 = sc.next();
        int hold = operations(str1);
        System.out.println("The result is: " + hold);
    }
}
