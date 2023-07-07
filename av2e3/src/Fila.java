/* Algoritmo feito por:
Antonio Carlos Borges de Souza;
Antônio Leopoldo França Filho;
Ítalo Ricardo de Andrade Silva;
Kauê Andrade dos Santos.*/

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

class NoFila {

    String dados;
    NoFila proximo;

    public NoFila(String dados){
        this.dados = dados;
        this.proximo = null;
    }
}

class Fila {
    NoFila frente;
    NoFila traz;

    public Fila(){
        this.frente = null;
        this.traz = null;
    }

    public void enfileirar(String dados){
        NoFila novoNo = new NoFila(dados);

        if (traz == null){
            frente = novoNo;
            traz = novoNo;
        } else {
            traz.proximo = novoNo;
            traz = novoNo;
        }
    }

    public String desinfileirar(){
        if (frente == null){
            throw new NoSuchElementException();
        }

        String dados = frente.dados;

        if (frente == traz){
            frente = null;
            traz = null;
        } else {
            frente = frente.proximo;
        }

        return dados;
    }

    public String peek(){
        if(frente == null){
            throw new NoSuchElementException();
        }

        return frente.dados;
    }

    public boolean estaVazia(){
        return frente == null;
    }

    public static void main(String[] args) {
        Fila f1 = new Fila();

        f1.enfileirar("1");
        f1.enfileirar("2");
        f1.enfileirar("3");

        System.out.println("Frente da fila: " + f1.peek() + "\n");

        //f1.imprimirFila();

        while (!f1.estaVazia()){
            System.out.println("Desinfileirando: " + f1.desinfileirar());
        }
    }
}
