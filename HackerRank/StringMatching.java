import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringMatching {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter=0;
        String[] sArray = new String[n];
        for(int i=0;i<n;i++){
            sArray[i]=scan.next();
        }
        int q = scan.nextInt();
        String[] sQuery = new String[q];
        for(int i=0;i<q;i++){
            sQuery[i]=scan.next();
        }
        
        for(int i=0;i<q;i++){
			counter=0;
            for(int j=0;j<n;j++){
                if(sQuery[i].equals(sArray[j])){
                    counter++;
                }
            }
            System.out.println(counter);
        }
        
    }
}