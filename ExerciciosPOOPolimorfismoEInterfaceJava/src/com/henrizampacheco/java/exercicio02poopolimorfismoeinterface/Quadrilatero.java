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
public abstract class Quadrilatero implements FormaGeometrica {
    double lado1, lado2, lado3, lado4;
    
    public Quadrilatero() {}
    
    public Quadrilatero(double l1, double l2, double l3, double l4) {
        this.setLado1(l1);
        this.setLado1(l2);
        this.setLado1(l3);
        this.setLado1(l4);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        
        perimetro = this.getLado1() + this.getLado2() + this.getLado3() + this.getLado4();
        
        return perimetro;
    }
}
