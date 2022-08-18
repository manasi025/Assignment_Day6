package day6;

public class FibbonacciSeries 
{
	  public static void main(String[] args) 
	  {

	        int i, fs1 = 0, fs2 = 1, fs3 = 0;

	        for(i = 2; i <= 5 ;i++)
	        {

	            fs3 = fs1 + fs2;
	            System.out.println(" "+fs3);
	            fs1 = fs2;
	            fs2 = fs3;
	        }
	    }
}
