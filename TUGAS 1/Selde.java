/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Scanner;
public class Selde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int org_number = number;
        int rev = 0;
        
        while (number!=0)
        {
            rev = rev*10 + number%10;
            number = number/10;
        }    
        
        if (org_number==rev)
        {
            System.out.println(org_number+" adalah selde.");
        }    
        else
        {
            System.out.println(org_number+" bukan selde.");
        }    
    }
    
}
