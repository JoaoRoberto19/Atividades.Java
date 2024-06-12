package tes.java;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Quantos alturas voce vai digitar ?");
		
		int n = sc.nextInt();
		double[]vect = new double [n];
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Qual é a altura ?");
			vect[i] =sc.nextDouble();
		}
		
		double sum = 0.0; 
		for (int i=0; i < n;  i++) {
			sum += vect [i];
		}
		
		double avg = sum/n;
		
		System.out.println("A média das alturas é: " + avg);
		
		sc.close();
		
	}
	}
