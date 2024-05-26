package testeArvore;

public class NoArvore {
	int valor;
	String nome;
	NoArvore direita;
	NoArvore esquerda;
	
	
	public NoArvore busca(NoArvore no, int valorprocurado) {
		if(no==null)
			return null;
		
		if(no.valor > valorprocurado) {
			return busca(no.esquerda, valorprocurado);
		}else if(no.valor < valorprocurado) {
			return busca(no.direita, valorprocurado);
		}else {
			return no;
		}
	}
	
	public NoArvore insere(NoArvore no, int novovalor, String nome) {
		if(no == null) {
			no = new NoArvore();
			no.valor = novovalor;
			no.nome = nome;
			no.esquerda = no.direita = null;
		}else if(novovalor < no.valor) {
			no.esquerda = insere(no.esquerda, novovalor, nome);
		}else if(novovalor> no.valor) {
			no.direita = insere(no.direita, novovalor, nome);
		}
		return no;
	}
	
	public void inOrdem(NoArvore raiz) {
		if (raiz != null) {
			inOrdem(raiz.esquerda);
			 System.out.println("rgm: " + raiz.valor + " nome: " + raiz.nome);
			inOrdem(raiz.direita);
		}
	}
	
	public void preOrdem(NoArvore raiz) {
        if (raiz != null) {
            System.out.println("rgm: " + raiz.valor + " nome: " + raiz.nome);
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }
	
	public void posOrdem(NoArvore raiz) {
        if (raiz != null) {
            posOrdem(raiz.esquerda);
            posOrdem(raiz.direita);
            System.out.println("rgm: " + raiz.valor + " nome: " + raiz.nome);
        }
    }
	
	public NoArvore remover(NoArvore r, int v) {
		if(r == null) {
			return null;
		}else if(r.valor > v){
			r.esquerda = remover(r.esquerda, v);
		}else if(r.valor < v) {
			r.direita = remover(r.direita, v);
		}else {
			//Se nao tem filhos, o no vai ser eliminado
			if (r.esquerda == null && r.direita == null) {
                r = null;
            } else if (r.esquerda == null) {
                r = r.direita;
            } else if (r.direita == null) {
                r = r.esquerda;
            } else {
				NoArvore subesquerda = r.esquerda;
				while (subesquerda.direita != null) {
					//capturar o maior no da subarvore esq
					subesquerda = subesquerda.direita;
				}
				//subesquerda.valor e o maior no da subarvore esquerda
				r.valor = subesquerda.valor; //trpca as informacoes
				r.nome = subesquerda.nome;
				subesquerda.valor = v;//troca as informacoes
				r.esquerda = remover (r.esquerda, v);
			}	
		}
		return r;
	}
	
	
}
