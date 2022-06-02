import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number > ");
        int numbers  = in.nextInt();
        System.out.print("Enter the number whose frequency you want to check > ");
        int ele = in.nextInt();

        int count = 0;
        while(numbers > 0){
            int remainder = numbers %10;
            int quotient = numbers / 10;
            if(remainder == ele){
                count++;
            }
            numbers = quotient;s
        }
        System.out.println("Frequency is > "+count);
    }
}
