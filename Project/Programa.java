package Project;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("         Bem vindo         ");
		System.out.println("---------------------------");
		System.out.println();
		
		int x;
		System.out.println("Qual assunto deseja buscar?");
		System.out.println("1 - Sistema Operacional || 2 - Arquiterura de Computadores");
		x = sc.nextInt();
			
		if (x == 1) {
			System.out.println("-----------------------------------");
			System.out.println("             Bem vindo             ");
			System.out.println("Aos assuntos de Sistema Operacional");
			System.out.println();
			System.out.println("Qual tema? ");
			System.out.println("1 - HIST�RIA DOS SISTEMAS OPERACIONAIS");
			System.out.println("2 - A primeira gera��o de computadores");
			System.out.println("3 - A segunda gera��o de computadores");
			System.out.println("4 - A terceira gera��o de computadores");
			System.out.println("5 - A quarta gera��o de computadores");
			
			int y = sc.nextInt();
			if (y == 1) {
			System.out.println("Os sistemas operacionais v�m evoluindo ao longo dos anos. Nas se��es a seguir, veremos resumidamente\r\n"
					+ "alguns dos destaques. Como, historicamente, os sistemas operacionais t�m sido\r\n"
					+ "intimamente ligados � arquitetura dos computadores em que s�o executados, examinaremos\r\n"
					+ "as sucessivas gera��es de computadores para vermos como eram seus sistemas operacionais.\r\n"
					+ "Esse mapeamento das gera��es de sistema operacional para gera��es de computador � grosseiro,\r\n"
					+ "mas oferece uma base que de outra forma n�o ter�amos.");
			}
			if(y == 2) {
				System.out.println("As primeiras delas usavam rel�s mec�nicos, mas eram muito lentas, com tempos\r\n"
						+ "de ciclo medidos em segundos. Posteriormente, os rel�s foram substitu�dos por v�lvulas a\r\n"
						+ "v�cuo. Essas m�quinas eram enormes, ocupavam salas inteiras com dezenas de milhares\r\n"
						+ "de v�lvulas, mas ainda eram milh�es de vezes mais lentas do que os computadores pessoais\r\n"
						+ "mais baratos de hoje. Toda a programa��o era feita em linguagem de m�quina pura,\r\n"
						+ "freq�entemente interligando fi os atrav�s de pain�is de conectores para controlar as fun��es\r\n"
						+ "b�sicas da m�quina. As linguagens de programa��o n�o existiam (nem mesmo a linguagem\r\n"
						+ "assembly). Ningu�m tinha ouvido falar de sistemas operacionais.");
			}
			if (y == 3) {
				System.out.println("A introdu��o do transistor, em meados da d�cada de 50, mudou o quadro radicalmente. Os\r\n"
						+ "computadores se tornaram confi �veis o bastante para serem fabricados e vendidos para clientes\r\n"
						+ "com a expectativa de que continuariam a funcionar por tempo sufi ciente para realizarem\r\n"
						+ "algum trabalho �til. Pela primeira vez, havia uma separa��o clara entre projetistas, construtores,\r\n"
						+ "operadores, programadores e pessoal de manuten��o. ");
			}
			if (y == 4) {
				System.out.println("No in�cio da d�cada de 60, a maioria dos fabricantes de computadores tinha duas linhas de\r\n"
						+ "produtos distintas e totalmente incompat�veis. Por um lado, havia os computadores cient�fi cos\r\n"
						+ "de grande escala, baseados em palavras bin�rias, como o 7094, que eram utilizados para c�lculos\r\n"
						+ "num�ricos em ci�ncia e engenharia. Por outro, havia os computadores comerciais, baseados\r\n"
						+ "em caracteres, como o 1401, que eram amplamente usados por bancos e companhias\r\n"
						+ "de seguro para ordenar e imprimir fitas.");
			}
			if (y == 5) {
				System.out.println("Com o desenvolvimento dos circuitos LSI (Large Scale Integration � integra��o em larga\r\n"
						+ "escala), chips contendo milhares de transistores em um cent�metro quadrado de sil�cio, surgiu\r\n"
						+ "a era do computador pessoal baseado em microprocessador. Em termos de arquitetura, os\r\n"
						+ "computadores pessoais (inicialmente chamados de microcomputadores) n�o eram muito\r\n"
						+ "diferentes dos minicomputadores da classe PDP-11, mas em termos de pre�o, eles certamente\r\n"
						+ "eram diferentes. O minicomputador tamb�m tornou poss�vel que um departamento de uma\r\n"
						+ "empresa ou universidade tivesse seu pr�prio computador. O microcomputador tornou poss�vel\r\n"
						+ "que uma pessoa tivesse seu pr�prio computador.");
			}
		}
		if (x == 2) {
			System.out.println("-------------------------------------------");
			System.out.println("                 Bem vindo                 ");
			System.out.println("Aos assuntos de Arquiterura de Computadores");
			System.out.println();
			System.out.println("Qual tema? ");
			System.out.println("1 - Evolu��o tecnol�gica");
			System.out.println("2 - Difern�a dos componentes atuais x antigos");
			int z = sc.nextInt();
			
			if (z == 1) {
				System.out.println("O paralelismo da evolu��o tecnol�gica entre sistemas ou plataformas e\r\n"
						+ "tamb�m equipamentos ou hardware ocorre de forma constante e ascendente.\r\n"
						+ "At� pouco tempo atr�s, a plataforma de servi�os como conhecemos hoje era\r\n"
						+ "impens�vel conceitualmente e, em alguns casos, n�o havia infraestrutura\r\n"
						+ "computacional capaz de suportar esses anseios tecnol�gicos.");
			}
			if (z == 2) {
				System.out.println("Com o objetivo de tornar o mundo um lugar melhor, o impacto das gera��es\r\n"
						+ "atuais de computadores na sociedade � exponencial. A era tecnol�gica �\r\n"
						+ "fundamental para o desenvolvimento da humanidade e, ao contr�rio do que\r\n"
						+ "se pensava antes, sustent�vel. A tecnologia atual facilita essas e outras atividades do cotidiano das pessoas,\r\n"
						+ "transparecendo funcionalidade e dando facilidades ao usu�rio final.");
				System.out.println();
				char repetir;
				do {
				System.out.println("Qual componente? \r\n"
						+ "1 - Processador \r\n"
						+ "2 - Mem�ria \r\n"
						+ "3 - Disco Rigido \r\n"
						+ "4 - Placa m�e");
				int c = sc.nextInt();
				
				if(c == 1) {
					System.out.println("A evolu��o aqui ocorre a passos largos para acompanhar a sede por mais\r\n"
							+ "poder de capacidade computacional nos dias atuais.\r\n"
							+ "Como principal fabricante de processadores atualmente, a Intel � uma\r\n"
							+ "gigante tecnol�gica com grande hist�rico e capaz de fabricar estas j�ias\r\n"
							+ "t�o pequenas, mas t�o poderosas, que s�o os processadores dos computadores\r\n"
							+ "atuais.");
				}
				if(c == 2) {
					System.out.println("As mem�rias para os computadores sempre foram necess�rias, pois armazenam\r\n"
							+ "informa��es que ser�o processadas pelo CPU ou gravadas no disco r�gido.A evolu��o desse componente diz respeito � quantidade e velocidade tanto\r\n"
							+ "do pr�prio m�dulo de mem�ria quanto da interface de comunica��o com a\r\n"
							+ "placa m�e.\r\n"
							+ "A sincroniza��o de clock das mem�rias nos anos 1990 e a adi��o de mais\r\n"
							+ "um sinal por clock, totalizando dois, foram os diferenciais para que a evolu��o\r\n"
							+ "das mem�rias acompanhassem a do processador, n�o deixando gargalos de\r\n"
							+ "desempenho.");
				}
				if(c == 3) {
					System.out.println("A escrita de dados de forma permanente ocorre no disco r�gido. Sua evolu��o\r\n"
							+ "foi exponencial, indo desde os antigos big foots at� os atuais SSDs.\r\n"
							+ "Essa evolu��o tamb�m ocorreu na forma de conectores que permeiam esses\r\n"
							+ "dispositivos, indo dos antigos e lentos IDE (Figura 7) at� os atuais e r�pidos,\r\n"
							+ "do tipo SATA.");
				}
				if(c == 4) {
					System.out.println("Para suportar e dar vaz�o a todos esses conectores e poderio de processamento,\r\n"
							+ "a placa m�e tamb�m teve que se reinventar. Novas funcionalidades, controles\r\n"
							+ "e componentes foram adicionados nas estruturas desse equipamento.\r\n"
							+ "Assim, antigos conectores deram lugares a novos, como a troca de IDE\r\n"
							+ "para SATA, a troca de AGP para PCI-X, DIMM para DDR, conector AT para\r\n"
							+ "ATX, etc.");
				}
				
				System.out.println("Deseja ver outro componente? S/N");
				repetir = sc.next().charAt(0);
				} while(repetir == 'S');
			}
			
		}
		System.out.println("Obrigado por utilizar nossos servi�os. Volte sempre :)");
	sc.close();
	}
}
