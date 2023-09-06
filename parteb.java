package Tareas;
import java.util.Scanner;
public class parteb {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int n = scanner.nextInt();
		if (n/2!=0) {
			System.out.println("Luna");
		}else {
			if(n>1 && n<6){
			System.out.println("Sol");
			}
			else if (n>5 && n<20){
				System.out.println("Tierra");
				}
			else {
				System.out.println("Galaxia");
			}
		}
				
		scanner.close();
	}

}
