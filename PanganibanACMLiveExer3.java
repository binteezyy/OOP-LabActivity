import java.util.*;

public class PanganibanACMLiveExer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int quotient = 0, remainder = 0, GCF = 0;
        while (true) {
            quotient = num1 / num2;
            remainder = num1 % num2;
            if (remainder == 0) {
                GCF = num2;
                break;
            } else {
                num1 = num2;
                num2 = remainder;
            }
        }
        System.out.println("GCF: " + GCF);
    }
}