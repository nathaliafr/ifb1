package ex2;

public class ex2 {
	
	/*
	 * Nathalia Felix da Rocha - 192010010016
	*/

	/*
	 * Questão 2: [1.0 ponto] Qual saida deve ser apresentada quando for executado o seguinte programa? Justifique.
	 * public class Simples {
	 * public static void main(String[] args) {
	 * int x = 2;
	 * int y = 4;
	 * if (x < 3) {
	 * if (y > 5) {
	 * System.out.println("escreve um");
	 * } else {
	 * System.out.println("escreve dois");
	 * }
	 * } else {
	 * if (y < 5) {
	 * System.out.println("escreve tres");
	 * } else {
	 * System.out.println("escreve quatro");
	 * }
	 * }
	 * }
	 * 
	 * a( ) escreve um
	 * b( ) escreve dois
	 * c( ) escreve tres
	 * d( ) escreve quatro
	 */

	/* RESPOSTA
	 * B) escreve dois.
	 * Ao começar a ser executado o programa determina os valores para as variáeis a e b, no primeiro if ele faz a comparação x<3,
	 *  a valida a informação como verdadeira então entra nele e analiza o if dentro dele onde compara se y>5 e valida a informação 
	 *  como falsa e passa para o else imprimindo "escreve dois" e encerra o programa pois pula o else referente ao primeiro if.
	*/
}
