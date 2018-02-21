/**
 * Lab3
 */ 
import java.util.Scanner;
import java.io.*;
public class Lab3 {

    public static void main(String[] args) throws IOException {
        Scanner fileRead  = new Scanner(new FileReader ("data2.txt"));
        String name,tel,address;
        int zipcode;
        System.out.printf("Name\t\tTel\t\t\tAddress\t\tZipcode\n");
        while(fileRead.hasNext()) {
            name = fileRead.next();
            tel =  fileRead.next();
            address = fileRead.next() +" "+fileRead.next() + " "+fileRead.next();
            zipcode = fileRead.nextInt();
            System.out.printf("%s\t\t%s\t%s\t%d\n",name,tel,address,zipcode);
        }
        
    }
    
}