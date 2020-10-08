import java.util.Scanner;

public class lingkaran{
	static double pi=3.14;
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		double jari,luas;
		System.out.print("Jari-Jari lingkaran = ");
		jari=input.nextDouble();
		luas=pi*jari*jari;
		System.out.println();
		System.out.println("Luas = " +pi+ " x "+jari+" x " +jari);
		System.out.println("Luas Lingkaran = "+luas);
	}
}