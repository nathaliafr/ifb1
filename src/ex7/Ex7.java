package ex7;

import javax.swing.*;

/*
 * Nathalia Felix da Rocha - 192010010016
*/

/*
 * Questao 7: [1.0 ponto] Escreva um programa que receba um numero inteiro e depois informe se ele e
maior ou menor que 10.
 */

public class Ex7 {

	public static void main(String[] args) {
		String variavel = JOptionPane.showInputDialog("Digite um número");
		int a=Integer.parseInt(variavel);
		if(a<10){
			JOptionPane.showMessageDialog(null, "numero menor que 10");
		}else{
			JOptionPane.showMessageDialog(null, "numero maior que 10");
		}
	}
}
