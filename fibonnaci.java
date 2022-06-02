import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of times > ");
        int numberOfTimes = in.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");

        while(count < numberOfTimes - 2){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            count++;
        }
    }
}
