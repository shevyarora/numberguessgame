import java.util.*;
import java.io.*;
public class randomno {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Random obj=new Random();
        int guess;
        int count=4;
        int randomNum= obj.nextInt(100-1+1)+1;
        int flag=0;
        System.out.println("**********WELCOME TO NUMBER GUESSING GAME **************");
        // System.out.println(randomNum);
        do{

            System.out.println("Guess a number (1-100) :");
            guess=sc.nextInt();
            
           
            if(guess < randomNum){
                System.out.println(" Higher number please !");
            }
            else if(guess > randomNum){
                System.out.println(" Lower number please !");
            }
            else if(guess==randomNum){
                System.out.println(" Congrats! you got the number .");
                System.out.println("The Number was "+ randomNum);
                flag=1;
                break;
            }
            
            count--;
        }while(count>=0);

        if(flag==0){
            System.out.println("You Lose !");
        }

    }
}
