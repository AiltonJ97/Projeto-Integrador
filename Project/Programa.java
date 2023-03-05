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
			System.out.println("1 - HISTÓRIA DOS SISTEMAS OPERACIONAIS");
			System.out.println("2 - A primeira geração de computadores");
			System.out.println("3 - A segunda geração de computadores");
			System.out.println("4 - A terceira geração de computadores");
			System.out.println("5 - A quarta geração de computadores");
			
			int y = sc.nextInt();
			if (y == 1) {
			System.out.println("Os sistemas operacionais vêm evoluindo ao longo dos anos. Nas seções a seguir, veremos resumidamente\r\n"
					+ "alguns dos destaques. Como, historicamente, os sistemas operacionais têm sido\r\n"
					+ "intimamente ligados à arquitetura dos computadores em que são executados, examinaremos\r\n"
					+ "as sucessivas gerações de computadores para vermos como eram seus sistemas operacionais.\r\n"
					+ "Esse mapeamento das gerações de sistema operacional para gerações de computador é grosseiro,\r\n"
					+ "mas oferece uma base que de outra forma não teríamos.");
			}
			if(y == 2) {
				System.out.println("As primeiras delas usavam relés mecânicos, mas eram muito lentas, com tempos\r\n"
						+ "de ciclo medidos em segundos. Posteriormente, os relés foram substituídos por válvulas a\r\n"
						+ "vácuo. Essas máquinas eram enormes, ocupavam salas inteiras com dezenas de milhares\r\n"
						+ "de válvulas, mas ainda eram milhões de vezes mais lentas do que os computadores pessoais\r\n"
						+ "mais baratos de hoje. Toda a programação era feita em linguagem de máquina pura,\r\n"
						+ "freqüentemente interligando fi os através de painéis de conectores para controlar as funções\r\n"
						+ "básicas da máquina. As linguagens de programação não existiam (nem mesmo a linguagem\r\n"
						+ "assembly). Ninguém tinha ouvido falar de sistemas operacionais.");
			}
			if (y == 3) {
				System.out.println("A introdução do transistor, em meados da década de 50, mudou o quadro radicalmente. Os\r\n"
						+ "computadores se tornaram confi áveis o bastante para serem fabricados e vendidos para clientes\r\n"
						+ "com a expectativa de que continuariam a funcionar por tempo sufi ciente para realizarem\r\n"
						+ "algum trabalho útil. Pela primeira vez, havia uma separação clara entre projetistas, construtores,\r\n"
						+ "operadores, programadores e pessoal de manutenção. ");
			}
			if (y == 4) {
				System.out.println("No início da década de 60, a maioria dos fabricantes de computadores tinha duas linhas de\r\n"
						+ "produtos distintas e totalmente incompatíveis. Por um lado, havia os computadores científi cos\r\n"
						+ "de grande escala, baseados em palavras binárias, como o 7094, que eram utilizados para cálculos\r\n"
						+ "numéricos em ciência e engenharia. Por outro, havia os computadores comerciais, baseados\r\n"
						+ "em caracteres, como o 1401, que eram amplamente usados por bancos e companhias\r\n"
						+ "de seguro para ordenar e imprimir fitas.");
			}
			if (y == 5) {
				System.out.println("Com o desenvolvimento dos circuitos LSI (Large Scale Integration – integração em larga\r\n"
						+ "escala), chips contendo milhares de transistores em um centímetro quadrado de silício, surgiu\r\n"
						+ "a era do computador pessoal baseado em microprocessador. Em termos de arquitetura, os\r\n"
						+ "computadores pessoais (inicialmente chamados de microcomputadores) não eram muito\r\n"
						+ "diferentes dos minicomputadores da classe PDP-11, mas em termos de preço, eles certamente\r\n"
						+ "eram diferentes. O minicomputador também tornou possível que um departamento de uma\r\n"
						+ "empresa ou universidade tivesse seu próprio computador. O microcomputador tornou possível\r\n"
						+ "que uma pessoa tivesse seu próprio computador.");
			}
		}
		if (x == 2) {
			System.out.println("-------------------------------------------");
			System.out.println("                 Bem vindo                 ");
			System.out.println("Aos assuntos de Arquiterura de Computadores");
			System.out.println();
			System.out.println("Qual tema? ");
			System.out.println("1 - Evolução tecnológica");
			System.out.println("2 - Difernça dos componentes atuais x antigos");
			int z = sc.nextInt();
			
			if (z == 1) {
				System.out.println("O paralelismo da evolução tecnológica entre sistemas ou plataformas e\r\n"
						+ "também equipamentos ou hardware ocorre de forma constante e ascendente.\r\n"
						+ "Até pouco tempo atrás, a plataforma de serviços como conhecemos hoje era\r\n"
						+ "impensável conceitualmente e, em alguns casos, não havia infraestrutura\r\n"
						+ "computacional capaz de suportar esses anseios tecnológicos.");
			}
			if (z == 2) {
				System.out.println("Com o objetivo de tornar o mundo um lugar melhor, o impacto das gerações\r\n"
						+ "atuais de computadores na sociedade é exponencial. A era tecnológica é\r\n"
						+ "fundamental para o desenvolvimento da humanidade e, ao contrário do que\r\n"
						+ "se pensava antes, sustentável. A tecnologia atual facilita essas e outras atividades do cotidiano das pessoas,\r\n"
						+ "transparecendo funcionalidade e dando facilidades ao usuário final.");
				System.out.println();
				char repetir;
				do {
				System.out.println("Qual componente? \r\n"
						+ "1 - Processador \r\n"
						+ "2 - Memória \r\n"
						+ "3 - Disco Rigido \r\n"
						+ "4 - Placa mãe");
				int c = sc.nextInt();
				
				if(c == 1) {
					System.out.println("A evolução aqui ocorre a passos largos para acompanhar a sede por mais\r\n"
							+ "poder de capacidade computacional nos dias atuais.\r\n"
							+ "Como principal fabricante de processadores atualmente, a Intel é uma\r\n"
							+ "gigante tecnológica com grande histórico e capaz de fabricar estas jóias\r\n"
							+ "tão pequenas, mas tão poderosas, que são os processadores dos computadores\r\n"
							+ "atuais.");
				}
				if(c == 2) {
					System.out.println("As memórias para os computadores sempre foram necessárias, pois armazenam\r\n"
							+ "informações que serão processadas pelo CPU ou gravadas no disco rígido.A evolução desse componente diz respeito à quantidade e velocidade tanto\r\n"
							+ "do próprio módulo de memória quanto da interface de comunicação com a\r\n"
							+ "placa mãe.\r\n"
							+ "A sincronização de clock das memórias nos anos 1990 e a adição de mais\r\n"
							+ "um sinal por clock, totalizando dois, foram os diferenciais para que a evolução\r\n"
							+ "das memórias acompanhassem a do processador, não deixando gargalos de\r\n"
							+ "desempenho.");
				}
				if(c == 3) {
					System.out.println("A escrita de dados de forma permanente ocorre no disco rígido. Sua evolução\r\n"
							+ "foi exponencial, indo desde os antigos big foots até os atuais SSDs.\r\n"
							+ "Essa evolução também ocorreu na forma de conectores que permeiam esses\r\n"
							+ "dispositivos, indo dos antigos e lentos IDE (Figura 7) até os atuais e rápidos,\r\n"
							+ "do tipo SATA.");
				}
				if(c == 4) {
					System.out.println("Para suportar e dar vazão a todos esses conectores e poderio de processamento,\r\n"
							+ "a placa mãe também teve que se reinventar. Novas funcionalidades, controles\r\n"
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
		System.out.println("Obrigado por utilizar nossos serviços. Volte sempre :)");
	sc.close();
	}
}
