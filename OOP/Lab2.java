/**
 * Lab2
 */
import java.util.Scanner;
import java.io.*;
public class Lab2 {

    public static void main(String[] args) throws IOException {
        Scanner fileRead  = new Scanner(new FileReader ("data.txt"));
        int count = 0; 
        String id, dept, name, grade; 
        double mid, fin , sum_mid = 0,sum_fin = 0;
        String CheckDept= "";
        System.out.print("ID\tName\t\t\t Mid\t Final\tGrade\n");
        while(fileRead.hasNext()) {
           
            count++;
            id = fileRead.next();
            dept = fileRead.next();
            name = fileRead.next() + " " + fileRead.next();
            mid = fileRead.nextDouble();
            fin = fileRead.nextDouble();
            sum_mid += mid;
            sum_fin += fin;
            if(!dept.equals(CheckDept)){
                CheckDept = dept;
                System.out.printf("Department %s\n",dept);
            }
            System.out.printf("%3d\t%20s\t%6.2f\t%6.2f\t%c", count, formetText(name,20), mid, fin,Grade((mid +fin)/2));
            System.out.println();
        }
        System.out.printf("\t\tAvg.Mid\tAvg.Final\n");
        System.out.printf("\t\t%.2f\t%.2f",(sum_mid/count),(sum_fin/count));
    }
    public static String formetText(String con,int l) {
        int len = con.length();
        for (int i = len; i < l; i++) {
            con += " ";
        }
        return con;
    }
    public static char Grade(double d) {
        if(d > 80){
            return 'A';
        }else if(d >70){
            return 'B';
        }else if(d >60){
            return 'C';
        }else if(d > 50){
            return 'D';
        }else{
            return 'F';
        }  
            
    }
    
}