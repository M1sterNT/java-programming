import java.util.Scanner;
import java.util.Random;
class program {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Guess => ");
       char guess = scan.next().charAt(0);
       Random rand = new Random();
       int total = 0;
       for(int i = 1; i <= 3; i++){
         total += rand.nextInt(5) + 1;
       }
       if(total <= 10 && guess  == 'L') System.out.println("WIN");
       else if (total > 10 && guess == 'H') System.out.println("WIN");
       else System.out.println("LOST");
       System.out.println(total);
    }
}