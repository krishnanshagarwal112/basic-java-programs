import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number > ");
        int num = in.nextInt();
        while(num > 0){
            int remainder = num % 10;
            int quotient = num / 10;
            System.out.print(remainder);
            num = quotient;
        }
    }
}
