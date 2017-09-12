import java.util.Scanner;
class program {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Amount => ");
       int amount = scan.nextInt();
       System.out.println("Price => ");
       int price = scan.nextInt();
       System.out.println("Money => ");
       double money = scan.nextDouble();
       double total = amount * price;
       if(total > 300) total = total - (total* 0.03);
       total = total + (total * 0.07);
       if(total > money) System.out.println("No Valid");
       else System.out.println("Change : " + (money - total));
    }
}