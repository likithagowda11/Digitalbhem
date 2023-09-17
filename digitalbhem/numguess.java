import java.util.*;
import java.util.Random;
public class numguess{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Random rand = new Random();
      int guess=rand.nextInt(100)+1;
      System.out.println("Hello, Welcome to number guessing game");
      System.out.println("Enter any number between 1 to 100 to guess");
      while(true){
        int inputguess=in.nextInt();
        if(inputguess==guess){
            System.out.println("Amazing!! you have guessed the right number");
            break;
        }
        else{
            System.out.println("Try again...");
        }
    }
      in.close(); 
    }
}