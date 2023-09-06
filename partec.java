package Tareas;
import java.util.Scanner;
public class partec {

	public static void main(String[] args) {
		double currentSalary;
		double rating;
		double raise;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el salario actual");
		currentSalary = scan.nextDouble();
		
		System.out.println("Ingrese la calificacion del empleado (1,2,3)");
		rating = scan.nextDouble();
		
		if (rating==1) {
			raise=currentSalary*0.06;
		}
		else if (rating == 2) {
			raise=currentSalary*0.04;
		}else {
			raise=currentSalary*0.015;
		}
		currentSalary=currentSalary+raise;
		System.out.println("El monto adicional es:"+raise);
		System.out.println("El nuevo salario sera de:"+currentSalary);
		
	}

}
