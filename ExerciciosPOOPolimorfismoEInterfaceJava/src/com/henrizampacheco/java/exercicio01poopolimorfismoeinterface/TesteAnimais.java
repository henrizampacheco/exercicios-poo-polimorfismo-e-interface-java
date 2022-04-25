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
public class TesteAnimais {
    public static void main(String[] args) {
        Animal[] vetAnimais = new Animal[10];
        
        Cachorro cachorro1 = new Cachorro("Bolinha", 3);
        Cachorro cachorro2 = new Cachorro("Tobi", 5);
        Cachorro cachorro3 = new Cachorro("Totó", 8);
        Cachorro cachorro4 = new Cachorro("Xereta", 14);
        
        Cavalo cavalo1 = new Cavalo("Pé de Pano", 7);
        Cavalo cavalo2 = new Cavalo("Apolo", 13);
        Cavalo cavalo3 = new Cavalo("Tornado", 12);
        
        Preguica preguica1 = new Preguica("Preguiça-bentinho", 18);
        Preguica preguica2 = new Preguica("Preguiça-de-hoffmann", 21);
        Preguica preguica3 = new Preguica("Preguiça-real", 49);
        
        vetAnimais[0] = cachorro1;
        vetAnimais[1] = cavalo1;
        vetAnimais[2] = preguica1;
        vetAnimais[3] = cachorro2;
        vetAnimais[4] = cavalo2;
        vetAnimais[5] = preguica2;
        vetAnimais[6] = cachorro3;
        vetAnimais[7] = cavalo3;
        vetAnimais[8] = preguica3;
        vetAnimais[9] = cachorro4;
        
        for(int i=0; i<vetAnimais.length; i++) {
            System.out.println((i+1) + "º. Animal = " + vetAnimais[i].getNome() + ": ");
            vetAnimais[i].emitirSom();
            System.out.println("");
        }
    }
}
