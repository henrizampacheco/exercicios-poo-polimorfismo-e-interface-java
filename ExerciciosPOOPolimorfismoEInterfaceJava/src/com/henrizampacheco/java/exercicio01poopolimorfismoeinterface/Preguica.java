package com.henrizampacheco.java.exercicio01poopolimorfismoeinterface;

/**Criar uma superclasse chamada animal e as 3 seguintes subclasses: cachorro,
 * cavalo e preguica. Segue as classes com seus respectivos atributos e métodos.
 * Classe abstrata Animal possui um nome e uma idade e um método abstrato
 * emitirSom.
 * Classe Cachorro herda de Animal e sobrescreve o método emitirSom.
 * Classe Cavalo herda de Animal e sobrescreve o método emitirSom.
 * Classe Preguica herda de Animal e sobrescreve o método emitirSom.
 * Classe TesteAnimais que tem um vetor de Animal com 10 posições.
 * - Coloque um Animal em cada posição.
 * - Depois percorra o vetor emitindo o som de cada Animal.
 */
public class Preguica extends Animal {
    
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Âhnn âhn! Eu sou um bicho-preguiça!");
    }
}
