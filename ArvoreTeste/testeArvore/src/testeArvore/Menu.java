package testeArvore;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("------ Seja bem-vindo ao Menu ------");
		System.out.println("");
		System.out.println("-1 – CRIAR ARVORE");
		System.out.println("-2 – INSERIR – fornecer RGM e Nome ");
		System.out.println("-3 – EXIBIR A ÁRVORE – três opções: PRÉ, IN ou PÓS");
		System.out.println("-4 – REMOVER UM NÓ – fornecer o RGM a remover ESVAZIAR A ÁRVORE ");
		System.out.println("-5 – PESQUISAR – fornecer o RGM a pesquisar ");
		System.out.println("-0 – SAIR");
 
	
		System.out.println("DIGITE SUA OPÇÃO: ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			//Iniciar a lista e inserir nomes no  inicio
			Opcoes.case1();
			break;
		case 2:
			//Colocar nomes
			Opcoes.case2();
			break;
		case 3:
			//Mostrar nomes
			Opcoes.case3();
			break;
		case 4:
			//Apagar nome
			Opcoes.case4();
			break;	
		case 5:
			//Mostrar o aluno
			Opcoes.case5();
			break;	
		case 0:
			//Sair do menu
			Opcoes.case6();
			break;	
		default:
			System.out.println("Digite um numero valido. ");
			break;		
		}
		
		
		sc.close();
	}
			
}


