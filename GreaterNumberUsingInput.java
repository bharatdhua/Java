package Assignment;
import java.util.*;
public class Greater_Number {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int no1=sc.nextInt();
      int no2=sc.nextInt();
      int no3=sc.nextInt();
      
      if(no1>=no2 && no1>=no3)
      {
    	  System.out.println(no1);
      }
      else if(no2>=no1 && no2>=no3)
      {
    	  System.out.println(no2);
      }
      else
      {
      System.out.println(no3);
      }

	}

}



package Assignment;
import java.util.*;
public class Perfect_Square {

	public static void main(String[] args) 
	{
		Scanner gk=new Scanner(System.in);
		int No=gk.nextInt();
		for(int i=1;i<=No;i++)
		{
			if(i*i==No)
			{
				System.out.println("Number Is Perfect Squer");
			}
						
		}
		System.out.println("Number Is Not Perfect Squer");
	}

}






package Assignment;
import java.util.*;
public class Count_Digit_Scanner {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int count=0;
		while(Num>0)
		{
			Num=Num/10;
			count=count+1;
		}
		System.out.println(count);
	}

}






package Assignment;
import java.util.*;
public class OddEven 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				{
					if(num%2==0)
					{
						System.out.println("Number is Even");	
					}
					else
					{
						System.out.println("Number is Odd");
					}
					
				}
	}

}

