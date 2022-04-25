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
public class Retangulo extends Quadrilatero implements FormaGeometrica {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
        super.setLado1(base);
        super.setLado2(altura);
        super.setLado3(base);
        super.setLado4(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
        
    @Override
    public double calcularArea() {
        double area;
        
        area = this.getBase() * this.getAltura();
        
        return area;
    }

    @Override
    public String toString() {
        return "***FORMA: RETÂNGULO***" + "\n" +
                "Base: " + this.getBase() + "\n" +
                "Altura: " + this.getAltura() + "\n" +
                "Perímetro: " + super.calcularPerimetro() + "\n" +
                "Área: " + this.calcularArea() + "\n" +
                "";
    }
}
