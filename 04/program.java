import java.util.Scanner;
class program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int score = 0 ;
        score = scan.nextInt();
        if(score >= 50 ) System.out.println("Pass");
        else System.out.println("Fall");
    }
}
