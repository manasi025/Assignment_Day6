package day6;

import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args)
	{
        int num;
        boolean val = false;
        
        Scanner scan = new Scanner(System.in);
        {
	        System.out.println("Enter a number");
	        num = scan.nextInt();
        }
        
        for(int i = 2; i <= num/2; i++)
        {
            if(num%i == 0)
            {
                val = true;

            }
        }

        if(!val) 
        {
            System.out.println("Given no. is a Prime no.!");
        }
        else
        {
            System.out.println("Given no. is not a Prime no.!");
        }
    }
}
