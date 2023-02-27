package Transpose;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Transpose {
//Here collection different transpose operations for different input types

	public static void main(String[] args) {

		/*
		 * Transpoosi matriisille
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Luodaan matriisit, anna rivit:");

		int rows = sc.nextInt();

		System.out.println("Luodaan matriisi, anna sarakkeet:");

		int cols = sc.nextInt();

		// Dynaamisesti luodaan matriisit
		int matrix[][] = new int[rows][cols];
		int transpose[][] = new int[cols][rows];

		System.out.println("Anna data matriisille");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
			System.out.println("Seuraava rivi");
		}

		// Printataan matriisi
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// luodaan transpoosi matriisi
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		
		System.out.println("---------------------------------");
		
		// printataan transpoosi matriisi
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(transpose[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		// Tai eri tavoin printtaus 
		
		for (int[] is : transpose) {
			System.out.println(Arrays.toString(is));
		}
		
		

	}

}