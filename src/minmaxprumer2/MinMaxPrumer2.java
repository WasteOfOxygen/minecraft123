package minmaxprumer2;

import java.util.Scanner;

public class MinMaxPrumer2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soucet = 0, pocet = 0;
        while (true) {
            pocet++;
            System.out.print("vlož"+pocet+ ". číslo: ");
            int vstup = sc.nextInt();
            if (vstup == 0) break;
            soucet = soucet + vstup;
            if (vstup < min) min = vstup;
            if (vstup > max) max = vstup;
            
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
            System.out.println("průměr: "+((float) soucet/pocet));
        
            
        }       
    } 
}
