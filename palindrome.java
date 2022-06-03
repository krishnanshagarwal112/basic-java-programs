import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string > ");
        String word = in.next() ;
        String revString = "";

        int length = word.length();
        for(int i = length - 1; i != -1; i--){
            revString +=  word.charAt(i);
        }

        System.out.println("Reverse string is " + revString);
//        System.out.println("word length "+ word.length());
//        System.out.println("revString length "+ revString.length());
//        System.out.println(revString.equals(word));

        if(revString.equals(word)){
            System.out.println("It is a palindrome ");
        }else{
            System.out.println("It is not a palindrome");
        }
    }


}
