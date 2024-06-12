package tes.java;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos numeros voce vai digitar ? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n]; 
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			}
		
		System.out.println("Numeros negativos: ");
		for (int i = 0; i < n; i++) {
			if (vet[i]<0) {
				System.out.println(vet[i]);
		
			}
			
			
		}
		
		
		sc.close();
	}
}
