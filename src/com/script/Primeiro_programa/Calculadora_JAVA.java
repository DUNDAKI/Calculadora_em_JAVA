package com.script.Primeiro_programa;

import java.util.Scanner;

public class Calculadora_JAVA {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 0;
		double num1 , num2, resultado;
		num1 = num2 = resultado = 0;
		do {
		System.out.println("1) Somar");
		System.out.println("2) Subtrair");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		System.out.println("0) sair");
		
		System.out.println("Digite o c�digo da Opera��o: ");
		x = in.nextInt();
		if(x != 0) {
				System.out.println("Digite o primeiro n�mero: ");
				num1 = in.nextDouble();
				
				System.out.println("Digite o Segundo n�mero: ");
				num2 = in.nextDouble();
				
				if(x==1) {
					resultado = num1 + num2;
				}else {
					if(x == 2) {
						resultado = num1 - num2;
					}else {
						if(x == 3) {
							resultado = num1 * num2;
						}else {
							if(x == 4) {
								resultado = num1 / num2;
							}
						}
					}
				}
				System.out.println();
				System.out.println("O resultado �: "+resultado);
				System.out.println("----------------------");
				System.out.println();
			}
		}while(x !=0);

	}

}
