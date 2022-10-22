import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a=s.nextDouble();
		System.out.println("Enter the value of b");
		double b=s.nextDouble();
		System.out.println("Enter \nADD to perform Addition\nSUB to perform Subtractions\nMUL to perfome Multiplication \nDIV to Division");
		String type_of_operator=s.next();
		
		switch(type_of_operator)
		{
		case "ADD":System.out.println("Addition of two numbers is :"+(a+b));
		break;
		case "SUB":System.out.println(" Subtractions of two numbers is :"+(a-b));
		break;
		case "MUL":System.out.println(" Multiplication of two numbers is :"+(a*b));
		break;
		case "DIV":System.out.println("Division of two numbers is: "+(a/b));
		break;
		}

	}

}