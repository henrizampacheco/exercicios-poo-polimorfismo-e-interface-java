package com.henrizampacheco.java.exercicio02poopolimorfismoeinterface;

import java.util.Scanner;

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
public class TesteFormas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFormas;
        FormaGeometrica[] formasGeometricas;

        System.out.print("Digite quantas formas você deseja criar: ");
        numFormas = scan.nextInt();
        
        formasGeometricas = new FormaGeometrica[numFormas];
        
        for(int i=0; i<formasGeometricas.length; i++) {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            int resp=0;
            
            do {
                System.out.println("");
                System.out.println("Qual forma você deseja criar?");
                System.out.println("1 - Quadrado");
                System.out.println("2 - Retângulo");
                System.out.println("3 - Círculo");
                System.out.print("Resposta: ");
                resp = sc1.nextInt();
            } while((resp != 1) && (resp != 2) && (resp != 3));
            
            System.out.println("");
            System.out.println("Criando a " + (i+1) + "ª. Forma Geométrica...");

            if(resp == 1) {
                Quadrado quad;
                double tamLado;
                
                System.out.println("");
                System.out.print("Informe o tamanho dos lados do quadrado: ");
                tamLado = sc2.nextDouble();
                quad = new Quadrado(tamLado);
                formasGeometricas[i] = quad;
            } else if(resp == 2) {
                Retangulo ret;
                double tamBase;
                double tamAltura;
                
                System.out.println("");
                System.out.print("Informe o tamanho da base do retângulo: ");
                tamBase = sc2.nextDouble();
                System.out.print("Informe o tamanho da altura do retângulo: ");
                tamAltura = sc2.nextDouble();
                ret = new Retangulo(tamBase, tamAltura);
                formasGeometricas[i] = ret;
            } else {
                Circulo circ;
                double tamRaio;
                
                System.out.println("");
                System.out.print("Informe o tamanho do raio do círculo: ");
                tamRaio = sc2.nextDouble();
                circ = new Circulo(tamRaio);
                formasGeometricas[i] = circ;
            }
        }
        
        System.out.println("");
        for(int j=0; j<formasGeometricas.length; j++) {
            System.out.println(formasGeometricas[j].toString());
        }
    }
}
