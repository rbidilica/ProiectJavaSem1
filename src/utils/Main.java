package utils;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Subiecte: ");
		
		System.out.println("1._Romana");
		System.out.println("2._Matematica");
		System.out.println("3._Fizica");
		System.out.println("4._Informatica");
		System.out.println("Introdu nota :");
		
		Integer x = sc.nextInt();
		System.out.println("Alege subiectul :");
		Integer op = sc.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Nota la romana este :" + x);
			break;
		case 2:
			System.out.println("Nota la matematica este :" + x);
			break;
		case 3:
			System.out.println("Nota la fizica este :" + x);
			break;
		case 4:
			System.out.println("Nota la informatica este :" + x);
			break;
		
		}
	}

}
