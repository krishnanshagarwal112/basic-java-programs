import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principal amount > ");
        int principal = input.nextInt();
        System.out.print("Enter rate  > ");
        int rate =  input.nextInt();
        System.out.print("Enter time  > ");
        int time =  input.nextInt();
        int interest = (principal * rate * time)/100;
        System.out.println("Your simple interest is " + interest);

    }
}
