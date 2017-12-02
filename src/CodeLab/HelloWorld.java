package CodeLab;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);


        System.out.println("enter a number: ");

        int input = stdin.nextInt();


        do {
            int sum = 0;
            while (input.hasNextint()) {
                input = stdin.nextInt();
                if (input % 2 == 0) {
                    sum += input;
                }
            
                System.out.print(sum);

            }
        }
            while (input>0) ;

        }
        stdin.close();
    }









