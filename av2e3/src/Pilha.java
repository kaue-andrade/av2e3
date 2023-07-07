/* Algoritmo feito por:
Antonio Carlos Borges de Souza;
Antônio Leopoldo França Filho;
Ítalo Ricardo de Andrade Silva;
Kauê Andrade dos Santos.*/

import java.util.EmptyStackException;

class NoPilha {
    String dados;
    NoPilha proximo;

    public NoPilha(String dados) {
        this.dados = dados;
        this.proximo = null;
    }
}

class Pilha {

    NoPilha topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(String dados){
        NoPilha novoNo = new NoPilha(dados);

        if (topo == null){
            topo = novoNo;
        } else {
            novoNo.proximo = topo;
            topo = novoNo;
        }
    }

    public String pop(){
        if (topo == null){
            throw new EmptyStackException();
        }

        String dados = topo.dados;
        topo = topo.proximo;
        return dados;
    }

    public String peek(){
        if (topo == null){
            throw new EmptyStackException();
        }

        return topo.dados;
    }

    public void imprimirPilha() {
        NoPilha atual = topo;

        System.out.println("Elementos da pilha: \n");

        while (atual != null) {
            System.out.print(atual.dados + " ");
            atual = atual.proximo;
        }
    }

    public boolean estaVazia(){
        return topo == null;
    }

    public static void main(String[] args) {
        Pilha p1 = new Pilha();

        p1.push("1");
        p1.push("2");
        p1.push("3");

        System.out.println("Topo da pilha: " + p1.peek() + "\n");

        System.out.println("Antes do pop: " + "\n");
        p1.imprimirPilha();

        System.out.println("\n");

        while (!p1.estaVazia()){
            System.out.println("Pop: " + p1.pop());
        }

        System.out.println("\nDepois do pop: \n");
        p1.imprimirPilha();
    }
}