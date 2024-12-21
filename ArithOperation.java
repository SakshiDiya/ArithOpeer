import java.util.*;
public class ArithOperation{
	
	int add(int a, int b)
	{
		return a+b;
	}
	int subtract(int a, int b)
	{
		return a-b;
	}
	int multiplication(int a, int b){
		return a*b;
	}
	int division(int a, int b){
		return a/b;
	}
	
	public static void main(String [] args)
	{
		
	ArithOperation Operation = new ArithOperation();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println("1. Addition of numbers");
	System.out.println("2. Subtraction of numbers");
	System.out.println("3. Multiplication of numbers");
	System.out.println("4. Division of numbers");
	System.out.println("5. Exit");
	
	System.out.println("Enter the choice of Operation: ");
	int choice= sc.nextInt();

	
	switch(choice){
		
		case 1: {
			int result = Operation.add(num1, num2);
			System.out.println("Addition of two numbers: " + result);
		}
		break;
		case 2: {
			int result = Operation.subtract(num1, num2);
			System.out.println("Subtraction of two numbers: " + result);
		}
		break;
		case 3: {
			int result = Operation.multiplication(num1,num2);
			System.out.println("Multiplication of two numbers: " + result);
		}
		break;
		case 4: {
			int result = Operation.division(num1,num2);
			System.out.println("Division of two numbers: " + result);
		}
		break;
		case 5:{
			System.out.println("Exit");
		}
		break;
		default:{
		System.out.println("Invalid Choice");
		}
		break;
	}
	sc.close(); 

	System.out.println("hELOO");
	}
	
}
	