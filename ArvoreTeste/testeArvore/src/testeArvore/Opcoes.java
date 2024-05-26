package testeArvore;

import java.util.Locale;
import java.util.Scanner;

public class Opcoes {
 	private static NoArvore raiz = null;
	private static NoArvore arvore = new NoArvore();


	public static void case1() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        if (raiz == null) {
            System.out.print("Digite um valor para inserir na árvore: ");
            int valor = sc.nextInt();
            System.out.println("Digite o nome: ");
            String nome = sc.next();
            raiz = arvore.insere(raiz, valor, nome);
            System.out.println("Valor inserido na árvore.");
        } else {
            System.out.println("A árvore já foi criada. Use a segunda opção para adicionar mais valores.");
        }
               
        voltarMenu();
        sc.close();
    }
	
	public static void case2() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para inserir na árvore: ");
        int valor = sc.nextInt();
        System.out.println("Digite o nome: ");
        String nome = sc.next();
        raiz = arvore.insere(raiz, valor, nome);
        System.out.println("Valor inserido na árvore.");
        
        voltarMenu();
        sc.close();
    }
	
	public static void case3() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Árvore  in-ordem:");
        arvore.inOrdem(raiz);
        
        System.out.println("Árvore  pre-ordem:");
        arvore.preOrdem(raiz);
        
        System.out.println("Árvore  pos-ordem:");
        arvore.posOrdem(raiz);
        
        voltarMenu();
        sc.close();
    }
	
	public static void case4() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Árvore atual (In-Ordem):");
        arvore.inOrdem(raiz);

        System.out.print("Digite o valor para remover: ");
        int valor = sc.nextInt();
        raiz = arvore.remover(raiz, valor);
        System.out.println("Valor removido da árvore.");
        
        voltarMenu();
        sc.close();
    }
	
	public static void case5() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Árvore atual:");
        arvore.inOrdem(raiz);

        System.out.print("Digite o valor para buscar: ");
        int valor = sc.nextInt();
        NoArvore resultadoBusca = arvore.busca(raiz, valor);
        if (resultadoBusca != null) {
            System.out.println("Valor " + valor + " encontrado na árvore.");
        } else {
            System.out.println("Valor " + valor + " não encontrado na árvore.");
        }
        
        voltarMenu();
        sc.close();
    }
	
	public static void case6() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        
        voltarMenu();
        sc.close();
    }
	
	
	private static void voltarMenu(){
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);  
        System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();
        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }
        
        sc.close();
	}
}
