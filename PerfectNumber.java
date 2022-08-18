package day6;

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
        int i, num, sum = 0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number = ");
        num=scan.nextInt();

        for(i = 1; i < num; i++)
        {
            if(num%i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == num)
        {
            System.out.println("The given number is a Perfect number!!");

        }
        else
        {

            System.out.println("The given number is not a Perfect number!!");
        }
    }
}
