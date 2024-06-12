package tes.java;
	
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

	public class ex04 {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in); 
				
				Triangle x, y;
				x = new Triangle();
				y = new Triangle();
				
				System.out.println("Enter the measures of triangle X: ");
				x.a = sc.nextDouble();
				x.b = sc.nextDouble();
				x.c = sc.nextDouble();
				System.out.println("Enter the measures of triangle Y: ");
				y.a = sc.nextDouble();
				y.b = sc.nextDouble();
				y.c = sc.nextDouble();
				
				double p = (x.a + x.b + x.c)/2;
				double areaX = Math.sqrt (p * (p - x.a) * (p - x.b) * (p - x.c));
				p = (y.a + y.b + y.c)/2;
				double areaY = Math.sqrt (p * (p - y.a) * (p - y.b) * (p - y.c));
				
				System.out.println("Area do triangulo X: "+ areaX);
				System.out.println("Area do triangulo Y: "+ areaY);
				
				if(areaX > areaY) {
					System.out.println("Area do triangulo X é maior ");
				}
				else {
					System.out.println("Area do triangulo Y é maior");
				}
					
					
					
					
				sc.close();
			}

		}

	