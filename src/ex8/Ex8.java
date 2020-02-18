package ex8;

import javax.swing.*;

/*
 * Nathalia Felix da Rocha - 192010010016
*/

/*
 * Questao 8: [1.0 ponto] Escreva um programa que receba dois numeros e apresente na tela a soma destes
numeros.
 */

public class Ex8 {

	public static void main(String[] args) {
		String num1 =JOptionPane.showInputDialog("Digite um número");
		int numero1= Integer.parseInt(num1);
		String num2 =JOptionPane.showInputDialog("Digite um número");
		int numero2= Integer.parseInt(num2);
		int soma = (numero1+numero2);
		JOptionPane.showMessageDialog(null, "A soma é: "+soma);
	}

}
