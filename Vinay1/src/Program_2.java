import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of values to be print");
		int x = s.nextInt();
		int a = x;
		for (int i = 0; i < a; i++) {
			System.out.print(((i + 1) + i) + ",");
		}

	}

}