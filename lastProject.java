import java.util.Scanner;
import java.util.Random;

public class lastProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String userName = sc.next();
        System.out.println("Welcome " + userName + " !!\n");

        Random rdm = new Random();
        int guessNum ;
        int cntNum ;
        int rand_int;
        String select = "";

        do {
            cntNum = 1;
            rand_int = rdm.nextInt(100 + 1);
            
            do {
                System.out.print("Guess number : ");
                guessNum = sc.nextInt();
                if (guessNum > rand_int) 
                {
                    System.out.println("You guess " + cntNum + " turn.");
                    System.out.println("Your number is too high!\n");
                    cntNum += 1;
                }
                
                else if (guessNum < rand_int)
                {
                    System.out.println("You guess " + cntNum + " turn");
                    System.out.println("Your number is too low!\n");
                    cntNum += 1;
                }
                else if (guessNum == rand_int)
                {
                    System.out.println("You guess " + cntNum + " turn.\n");
                    
                    System.out.println("[You Win!!!]");
                    System.out.println("The Correct number is " + rand_int + "!\n");
                    break;
                    
                }


            }while(cntNum != 11);
            if (guessNum == rand_int)
            {
                break;
            }
            else if (guessNum != rand_int)
            {
                System.out.println("[Game Over]");
                System.out.println("The Correct number is " + rand_int);
                System.out.print("Play again? [y/n] : ");
                select = sc.next();
                System.out.println("");
            }
            else {
                System.out.println("Error!");
                break;
            }
            
        }while(!select.equals("n"));
        System.out.println("Exit ~ ~ ~");

       sc.close();
            
            
            
    }
}
