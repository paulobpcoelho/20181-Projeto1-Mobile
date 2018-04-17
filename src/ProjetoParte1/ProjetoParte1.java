/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoParte1;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class ProjetoParte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        // Declaração de variáveis
        int i;
        int a;
        int num1;
        int num2;
        int contador1 = 0;
        int contador2 = 0;
        float somaG = 0;
        float somaM = 0;
        float somaF = 0;
        float mediaM = 0;
        float mediaF = 0;
        float mediaG = 0;
        int sexo;

        //Menu com 6 Opções
        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Faixa etária");
            System.out.println("5 - Números primos");
            System.out.println("6 - Mudança de Base");
            i = scn.nextInt();

            switch (i) {
                //Soma
                case 1:
                    System.out.println("Digite o primeiro número");
                    // Entrada de dados
                    num1 = scn.nextInt();
                    System.out.println("Digite o segundo número");
                    // Entrada de dados
                    num2 = scn.nextInt();
                    // Calculando Soma
                    int soma = num1 + num2;
                    System.out.println("Resultado: " + soma);
                    //Opção para retornar ao menu
                    do {
                        System.out.println("Voltar digite 0!");
                        a = scn.nextInt();
                    } while (a != 0);
                    break;
                // Subtração
                case 2:
                    System.out.println("Digite o primeiro número");
                    // Entrada de dados
                    num1 = scn.nextInt();
                    System.out.println("Digite o segundo número");
                    // Entrada de dados
                    num2 = scn.nextInt();
                    // Calculando Subtração
                    int subtracao = num1 - num2;
                    System.out.println("Resultado: " + subtracao);
                    //Opção para retornar ao menu
                    do {
                        System.out.println("Voltar digite 0!");
                        a = scn.nextInt();
                    } while (a != 0);
                    break;
                // Divisão
                case 3:
                    System.out.println("Digite o primeiro número");
                    // Entrada de dados
                    num1 = scn.nextInt();
                    System.out.println("Digite o segundo número");
                    // Entrada de dados
                    num2 = scn.nextInt();
                    // Validação 
                    if (num2 != 0) {
                        // Calculo Divisão
                        int divisao = num1 / num2;

                        System.out.println("Resultado: " + divisao);
                    } else {
                        System.out.println("Nenhum numero é divisivel por 0");
                    }
                    //Opção para retornar ao menu
                    do {
                        System.out.println("Para voltar digite 0!");
                        a = scn.nextInt();
                    } while (a != 0);
                    break;
                // Faixa etária
                case 4:
                    System.out.println("Quantidade de Pessoas");
                    int np = scn.nextInt();
                    for (int b = 0; b < np; b++) {
                        System.out.println("Digite Idade");
                        int id = scn.nextInt();
                        System.out.println("Digite 1 para Masculino ou 2 para Feminino");
                        sexo = scn.nextInt();

                        mediaG = mediaG + id;
                        if (sexo == 1) {
                            contador1++;
                            somaM = somaM + id;
                            // Media de Idade Masculino
                            mediaM = somaM / contador1;
                        } else if (sexo == 2) {
                            contador2++;
                            somaF = somaF + id;
                            // Media de Idade Feminina
                            mediaF = somaF / contador2;
                        }
                    }
                    // Saída de dados
                    System.out.println("Media De Idade Geral: " + mediaG / np);
                    System.out.println("Media Masculina: " + mediaM);
                    System.out.println("Media Feminina: " + mediaF);

                    //Opção para retornar ao menu
                    do {
                        System.out.println("Para voltar digite 0!");
                        a = scn.nextInt();
                    } while (a != 0);

                    break;
                // Números primos   
                case 5:
                // Mudança de Base    
                case 6:
            }

        } while (i != 4);
    }
}
