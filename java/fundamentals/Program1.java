// 1.Program showing an Integer value Entered by the User
import java.util.Scanner;

public class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // Creates a reader instance which takes input from standard input - keyboard
        System.out.println("Enter a Number  : ");
        int number = sc.nextInt();
        System.out.println("You Entered Number "+number);

    }
}

// Note: User will get - Exception in thread "main" java.util.InputMismatchException if wrong type of input entered !
