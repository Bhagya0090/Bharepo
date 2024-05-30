
public class method {

	public static void main(String[] args) 
	{
		prtinhello();
		prtinName("demoname",67);
		//int d=printsquare(8);
		System.out.println(printsquare(8));
		System.out.println(demomethod());
	}
		//Different methods
		
		
		//1) without input parametrs   and without return type
		//void return madhe kahicha deta nahi
	public static void prtinhello()
	{
		System.out.println("hello");
		
	}
	
	//2.with input parameter and without return  value
	public static void prtinName(String name,int age)
	{
		System.out.println("Your name is "+name);
		System.out.println("Your name is "+age);
		
		
	}
	//3.with input parameter and with return type
	public static int printsquare(int number)
	{
		int s=number*number;
		return s;
		//System.out.println()
	}
	//4.without input parameter and with return value
	public static String demomethod()
	{
		String demo="hi";
		 return demo;
	}
//***********************************************		
//public-----accessmodifire
//void --return type
//main--method
//static--keyword
		//********************************************
		/*
		int a=10;
		printhellomethod();
		int b=20;
		printhellomethod();
		int c=a+b;
		System.out.println("the resultis"+c);
		printhellomethod();
		printnumber();*/
		/*
		mul();
		printnumber();
		printhellomethod();
		*/
		
	//***************************************************************	
		
		
	
	/*
	public  static void printhellomethod()
	{
		System.out.println("hello word");
	}
	public  static void printnumber()
	{
		int i=0;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
	} 
	
	public  static void mul()
	{
		int i=0;
		for(i=0;i<=20;i++)
			if(i%2==0)
		{
			System.out.println(i);
		}
		
		
		
	} */

}
