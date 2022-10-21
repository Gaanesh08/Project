//Practice Java
import java.util.*;

class Hello
{

	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in); 
		System.out.println("Hello Anand");

		System.out.println("Enter your name:");
		//String name= sc.next(); //space delimited - word
		String name= sc.nextLine(); //\n delimited - line
		System.out.println("Welcome " + name);


		System.out.println("Enter your age:");
		//int age= Integer.parseInt(sc.nextLine());
		int age= sc.nextInt(); 
		System.out.println("Your age is :  " + age);


		System.out.println("Enter your salary:");
		//double salary = Double.parseDouble(sc.nextLine()); 
		double salary = sc.nextDouble(); 
		System.out.println("Your salary is :  " + salary);

		System.out.println("Are you married?:");
		
		boolean married= sc.nextBoolean(); 
		System.out.println("Married :  " + married);

		System.out.printf("Welcome %s. Your age is %d. Your salary is %8.2f. Married: %b", name, age, salary, married);

	}

	public static int GetInteger(String message)
	{

		Scanner sc= new Scanner(System.in); 
		System.out.println(message);
		int temp = sc.nextInt();
		return temp;
		
	}

}