package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
	
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End Of program");
	}
	
	public static void method1() {
		System.out.println("*** Method1 Start***");
		methord2();
		System.out.println("*** Method1 End***");
	}
	
	public static void methord2() {
		
		System.out.println("*** Method2 Start*****");
		Scanner sc = new Scanner(System.in);
		
		try {	
		String[] vect = sc.nextLine().split(" ");
		
		int position = sc.nextInt();
		
		System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			
		} catch (InputMismatchException e) {
			System.out.println("input error");
		}
		System.out.println("*** Method2 End*****");
		
		sc.close();
	}
}
