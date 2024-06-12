package tes.java;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int N;
			
			System.out.print("Quantos números você vai digitar?  ");
			
			N = sc.nextInt();
			
			double[] vet = new double [N];
			
			for (int i = 0; i < N; i++){
			
				System.out.print("Digite um número: ");
		
					vet[i] = sc.nextDouble();
			
			}	
			
			System.out.println();
			System.out.println("NUMEROS DIGITADOS: ");
			
			
			for(int i = 0; i < N; i++ ){
				System.out.println(vet[i]);
				}
			
			
			sc.close();
		}
}
