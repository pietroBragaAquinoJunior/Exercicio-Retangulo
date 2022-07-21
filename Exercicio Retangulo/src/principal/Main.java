package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		System.out.println("AREA = "+ret.Area());
		System.out.println("PERIMETER = "+ret.Perimeter());
		System.out.println("DIAGONAL = "+ret.Diagonal());
	
	}

}
