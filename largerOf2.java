import java.util.Scanner;

public class largerOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number > ");
        int number1 = input.nextInt();
        System.out.print("Enter second number > ");
        int number2  = input.nextInt();
        System.out.print("Enter third number > ");
        int number3  = input.nextInt();

        int max = number1;
        if(number2 > max){
            max = number2;
        }else{
            max = number3;
        }
        System.out.println("Max number is "+max);
    }
}
