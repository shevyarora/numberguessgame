import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class randomno{

       public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);  
       Random obj = new Random();
       System.out.println("Welcome to the Number guessing game !");
       System.out.println("You have only 5 attempts !");
        int numran=obj.nextInt(100-1+1)+1;
        // System.out.println(numran);
        int guess;
        int flag=0;
        int attempts=1;
        while(attempts<=5){

        System.out.println("Guess a number from (1-100) :");
        guess=sc.nextInt();
            if(guess==numran){
                System.out.println("Congrats ! you got the number in "+attempts+" attempts !");
                flag=1;
                break;
            }
            else if(guess < numran){
                System.out.println("Higher number please ! "+ (5-attempts)+" attempts left!");
            }
            else{

                System.out.println("Lower number please ! "+ (5-attempts)+" attempts left !");
            }
            attempts++;
        }

        if(flag==0){
            System.out.println("You lose !");
            System.out.println("The Number was "+ numran);
        }
    }

}
