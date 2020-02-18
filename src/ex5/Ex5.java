package ex5;

import javax.swing.*;

/*
 * Nathalia Felix da Rocha - 192010010016
*/

/*
 * Questao 5: [1.0 ponto] Escreva um programa que receba duas informacoes (podem ser textuais) e as 
 * apresente na ordem inversa a sua insercao (A que foi inserida por ultimo apareca primeiro).
 */

public class Ex5 {
	
	public static void main(String[] args) {
		String nome =JOptionPane.showInputDialog("Digite o seu primeiro nome");
		String sobre =JOptionPane.showInputDialog("Digite o seu segundo nome");
		String nomeComlpeto = sobre+" "+nome;
		JOptionPane.showMessageDialog(null, nomeComlpeto );
	}

}
