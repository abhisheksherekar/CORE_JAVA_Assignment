Q1================================================


public class Q1 {

	public static void main (String [] args) {
		
		System.out.println("Hello World");
		
	}
	
}
Q2==========================================================


public class Q2 {
	public static void main(String args[]) {
		
		int rollNo =100;
		
		System.out.println("roll no = "+rollNo);
		
	}
	
	
}

Q3===============================================


public class Q3 {
	
public static void main(String args[]) {
	

	int x,y;
	x=10;
	y=(x*x)+(3*x)-7;
	System.out.println("Value of y ="+y);
	

	y=x++ + ++x;
	System.out.println("Value of X = " + x + " and Y = "+y);
	
	
	int z = x++ - --y - --x + x++;
	
	
	System.out.println("x = "+x+", y = "+y+", z = "+z);
	
	boolean a=true;
	boolean b=false;
	boolean c;
	
	c = a && b || !(a || b); 
	
	System.out.println("C = "+c);
	
	
	
	
}	
}

Q4==================
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		byte b1 = sc.nextByte();
		byte b2 = sc.nextByte();
		byte bsum = (byte) (b1+b2);
		System.out.println("The addition is :"+bsum);
	}

Q5====================
public class Tp {

public static void main(String args [] ){
String nm = args[0];

System.out.println("Welcome "+ nm);

}
}

Q6=======================

public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Radius");
		int i = scanner.nextInt();
		double pi =3.14;
		double area = pi*(i * i);
		double cir = 2 * pi * i;
		System.out.println("The area of circle is "+area);
		System.out.println("The circumference is :"+cir);
		
	}

Q7=======================
import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marks in subject a : ");
		int a = sc.nextInt();
		System.out.println("Marks in subject b : ");
		int b = sc.nextInt();
		System.out.println("Marks in subject c : ");
		int c = sc.nextInt();
		System.out.println("Marks in subject d : ");
		int d = sc.nextInt();
		System.out.println("Marks in subject e : ");
		int e = sc.nextInt();
		double sum = a+b+c+d+e;
		double per = (sum / 500)*100 ;
		
		System.out.println("percentage marks = "+per+" %");
		

	}

}

Q8======================
import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal : ");
		double p = sc.nextDouble();
		System.out.println("Rate of Interest : " );
		double r = sc.nextDouble();
		System.out.println("Time : ");
		int t = sc.nextInt();
		
		double si = (p*r*t)/100;
		System.out.println("Simple Interest : "+si);

	}

}
Q9===========================
import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Days : ");
		int input = sc.nextInt();
		
		int year = input/365;
		input  = input % 365;
		int month = input / 30 ;
		int day = input % 30;
	
		
		System.out.println("Years : " +year);
		System.out.println("Months : " +month);
		System.out.println("Days : " +day);
	}

}

Q10=====================================

import java.util.Scanner;
public class Fahrenheit_Celsius 
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit-32)*5/9;
        
        System.out.println("Temperature in Celsius:"+celsius);        
    }
}

Q11==========================================
import java.util.Scanner;
public class SwapNumbers
{ 
     
      
    public static void main(String args[])
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 Number");
        int x = sc.nextInt();
        System.out.println("Enter the 2 Number");
        int y = sc.nextInt();

        System.out.println("Before swap:");
        System.out.println("x value: "+x); //x=10
        System.out.println("y value: "+y);  // y=20
        x = x+y; //30
        y=x-y;   //10
        x=x-y;   //20
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
}




Q12======================================================
import java.util.Scanner;
public class GrossSalary
{ 

    public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
	double HRA;
	double DA;
	double basic = sc.nextDouble();
        if (basic < 10000)
	{
	   HRA = 0.1*basic;
	   DA = 0.9*basic;
         }
	else {

	HRA = 2000;
	 DA = 0.98*basic;
      }

double GS = basic + HRA + DA;

System.out.println("GROSS SALARY "+GS);

}

}
Q13==============================
import java.util.Scanner;

public class Greater_between_three
{ 
    

    public static void main(String args[])
{
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int b = sc.nextInt();	
        System.out.println("Enter 3rd Number :"); 
        int c = sc.nextInt();
      if( a > b && b > c )
           System.out.println("Greater no is "+ a);
      if( b > a && b > c )
           System.out.println("Greater no is "+ b);
      else
	 System.out.println("Greater no is "+ c);
}

/*TERNARY OPERATOR*/
/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Number a : ");
		int a=50;
		int b=40;
		int c=30;
		int ans = (a > b) ? ( b > c ? a : c) : (b > c ? b:c);
		System.out.println("Days : " +ans);
	}*/

}



Q14==============================
import java.util.Scanner;

public class Q14 {
	
	//	Program to check that entered year is a leap year or not.

	
	public static void main(String args[]) {
		
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the year");
		int year = ip.nextInt();
		
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
               
                if ( year % 400 == 0)
                   System.out.println("Yes it is a leap Year");
                else
                    System.out.println("Not a leap year");
            }
            else
                System.out.println("Yes it is a leap year");
        }
        else
            System.out.println("Not a leap year");
	}
	
	
}

Q15=====================================
import java.util.Scanner;

public class gender {	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the gender and age: ");
		char sex = sc.next().charAt(0);
		int age = sc.nextInt();
		if((sex=='F' && age>=18) || (sex=='M' && age>=21)) {
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Not Eligible for marriage");
		}
	}
}

