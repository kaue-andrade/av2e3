/* Algoritmo feito por:
Antonio Carlos Borges de Souza;
Antônio Leopoldo França Filho;
Ítalo Ricardo de Andrade Silva;
Kauê Andrade dos Santos.*/

class No {
    String dados;
    No proximo;

    public No(String dados){
        this.dados = dados;
        this.proximo = null;
    }
}

public class ListaEncadeadaAntiga {
    No cabeca;

    public ListaEncadeadaAntiga(){
        this.cabeca = null;
    }

    public void inserir(String dados){
        No novoNo = new No(dados);

        if (cabeca == null){
            cabeca = novoNo;
        }

        else {
            No atual = cabeca;
            while (atual.proximo != null){
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
        }
    }

    public void imprimir(){

        No atual = cabeca;

        while (atual != null){
            System.out.print(atual.dados + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeadaAntiga l1 = new ListaEncadeadaAntiga();

        System.out.print("Lista encadeada: ");

        l1.inserir("1");
        l1.inserir("2");
        l1.inserir("Oi");
        l1.imprimir();

    }
}
