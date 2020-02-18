package ex9;

import javax.swing.*;

/*
 * Nathalia Felix da Rocha - 192010010016
*/

/*
 * Questao 9: [1.0 ponto] Escreva um programa que receba dois numeros inteiros e depois informe se a
soma dos dois e maior ou menor que 10.
 */

public class Ex9 {

	public static void main(String[] args) {
		String num1 =JOptionPane.showInputDialog("Digite um número");
		int numero1= Integer.parseInt(num1);
		String num2 =JOptionPane.showInputDialog("Digite um número");
		int numero2= Integer.parseInt(num2);
		int soma = numero1+numero2;
		if(soma<10){
			JOptionPane.showMessageDialog(null, "numero menor que 10");
		}else{
			JOptionPane.showMessageDialog(null, "numero maior que 10");
		}
	}

}
