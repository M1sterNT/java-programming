import java.util.Scanner;

class program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pay = 0 , buy = 0;
        System.out.print("Pay : ");
        pay = scan.nextInt();
        System.out.println("Buy : ");
        buy = scan.nextInt();
        if(pay > buy) System.out.println("No Valid");
        else System.out.println(buy - pay) ;

    }
}

