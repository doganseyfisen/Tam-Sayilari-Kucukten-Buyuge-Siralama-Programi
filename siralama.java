import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int x, y, z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üç adet tam sayı giriniz...\nBirinci sayı (x): ");
		x = input.nextInt();
		System.out.print("İkinci sayı (y): ");
		y = input.nextInt();
		System.out.print("Üçüncü sayı (z): ");
		z = input.nextInt();
		
		if((x > y) && (y > z)) 				   {System.out.println("z < y < x");}
		else if((x > y) && (z > y) && (x > z)) {System.out.println("y < z < x");}
		else if((x > y) && (z > y) && (z > x)) {System.out.println("y < x < z");}
		else if((y > x) && (y > z) && (x > z)) {System.out.println("z < x < y");}
		else if((y > x) && (y > z) && (z > x)) {System.out.println("x < z < y");}
		else if((z > x) && (z > y) && (y > x)) {System.out.println("x < y < z");}
	}
}
