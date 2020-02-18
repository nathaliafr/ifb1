package ex6;

import javax.swing.*;

/*
 * Nathalia Felix da Rocha - 192010010016
*/

/*
 *Questao 6: [1.0 ponto] Escreva um programa que receba um numero e apresente na tela o dobro deste
numero. 
 */

public class Ex6 {
	public static void main(String[] args) {
		String variavel =JOptionPane.showInputDialog("Digite um número");
		int a = Integer.parseInt(variavel);
		a=a*2;
		JOptionPane.showMessageDialog(null, a );
	}
}
