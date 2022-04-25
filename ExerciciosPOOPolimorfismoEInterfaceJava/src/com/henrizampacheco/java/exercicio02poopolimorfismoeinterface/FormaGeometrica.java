package com.henrizampacheco.java.exercicio02poopolimorfismoeinterface;

/**Crie a seguinte hierarquia de classes:
 * Uma interface para representar qualquer forma geométrica, definindo métodos
 * para cálculo do perímetro e cálculo da área da forma;
 * Uma classe abstrata para representar quadriláteros. Seu construtor deve
 * receber os tamanhos dos 4 lados e o método de cálculo do perímetro já pode
 * ser implementado;
 * Classes para representar retângulos e quadrados. A primeira deve receber o
 * tamanho da base e da altura no construtor, enquanto a segunda deve receber
 * apenas o tamanho do lado;
 * Uma classe para representar um círculo. Seu construtor deve receber o tamanho
 * do raio.
 * No programa principal, pergunte ao usuário quantas formas ele deseja criar.
 * Em seguida, para cada forma, pergunte se deseja criar um quadrado, um
 * retângulo ou um círculo, solicitando os dados necessários para criar a forma.
 * Todas as formas criadas devem ser armazenadas em um vetor. Finalmente,
 * imprima: (a) os perímetros; e (b) as áreas de todas as formas.
 */
public interface FormaGeometrica {

    double calcularPerimetro();   
    double calcularArea();
}
