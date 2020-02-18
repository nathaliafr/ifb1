package ex10;

import javax.swing.*;

/*
 * Nathalia Felix da Rocha - 192010010016
*/

/*
 * Questao 10: [2.0 ponto] Escreva um programa que receba uma temperatura em graus Celsius e a converta para graus Fahrenheit.
 */

public class Ex10 {

	public static void main(String[] args) {
		String variavel =JOptionPane.showInputDialog("Digite a temperatura em Celsius");
		int var = Integer.parseInt(variavel);
		int f = ((9*var)/5)+32;
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: "+f);
	}

}
