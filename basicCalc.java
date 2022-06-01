import java.util.Scanner;

public class basicCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an operand out of {+,-,*,/}> ");
        char operand = input.next().charAt(0);
        System.out.print("Enter first number > ");
        int number1 = input.nextInt();
        System.out.print("Enter second number > ");
        int number2 = input.nextInt();
        if(operand == '+'){
            int sum = number1 + number2;
            System.out.println("Sum is "+ sum );
        }
        else if(operand == '-'){
            int difference = number1 - number2;
            System.out.println("Difference is "+ difference );
        }
        else if(operand == '*'){
            int product = number1 * number2;
            System.out.println("Product is "+ product );
        }
        else if(operand == '/'){
            int quotient = number1 / number2;
            System.out.println("quotient is "+ quotient );
        }
        else{
            System.out.println("Enter valid operand");
        }

    }
}


