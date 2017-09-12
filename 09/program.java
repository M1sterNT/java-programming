import java.util.Scanner;
class program {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Unit => ");
       double unit = scan.nextDouble();
       double total = 0;
       if(unit <= 20) {
            total = ( unit * 2 ) + (unit * 0.47); 
            unit = unit % 20;
       }
       if(unit <= 100) {
            total += ( unit * 3 ) + (unit * 0.47); 
            unit = unit % 20;
       }
       if(unit <= 500) {
            total += ( unit * 3.5 ) + (unit * 0.47); 
            unit = unit % 500;
       }
       if(unit > 500) {
           total += ( unit * 4 ) + (unit * 0.47);      
       }
       System.out.println("Total => " + total);
    }

}