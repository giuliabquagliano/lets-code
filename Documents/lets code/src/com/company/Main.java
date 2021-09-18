package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // questão 1

        String[] carrinho = new String[5];
        for (int i = 0; i < carrinho.length; i++) {
            System.out.println("\nInforme o nome de uma fruta:");
            String fruta = sc.next();
            carrinho[i] = fruta;
        }
        System.out.println(Arrays.toString(carrinho));

        // questão 2

        System.out.println("\nInforme uma palavra para ser invertida:");
        String palavra = sc.next();
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        System.out.println("invertendo: " + invertida);

        // questão 3

        int[] numeros = new int[5];
        String pares = "";
        String impares = "";
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("\nInforme um número inteiro:");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Números ímpares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        // questão 4

        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("\nInforme um número inteiro:");
            num[i] = sc.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        for(int i=0; i<num.length; i++){
            if(num[i]>maior){
                maior = num[i];
            }
        }
        for(int i=0; i<num.length; i++){
            if(num[i]<menor){
                menor = num[i];
            }
        }
        int soma = 0;
        for(int i=0; i<num.length; i++){
            soma = soma + num[i];
        }
        double media = (double) soma/num.length;
        System.out.println("Maior número: " + maior + "\nMenor número: " + menor + "\nMédia: " + media);

        // questão 5

        String[] nomes = new String[5];
        for(int i=0; i< nomes.length; i++){
            System.out.println("Informe um nome:");
            nomes[i] = sc.next();
        }
        String longo = nomes[0];
        for(int i=0; i< nomes.length; i++){
            if(nomes[i].length()>longo.length()){
                longo = nomes[i];
            }
        }
        System.out.println("Nome mais longo: " + longo);

        // questão 6

        System.out.println("Digite uma palavra:");
        String palavras = sc.next();
        char[] p = palavras.toCharArray();
        for(int i=0; i<p.length; i++){
            if(i%2!=0){
                Character.toUpperCase(p[i]);
            }
        }
        String s = p.toString();
        System.out.println(s);

        // questão 7

        String[] nom = new String[5];
        int[] idade = new int[5];
        for(int i=0; i<idade.length; i++){
            System.out.println("Informe o nome da pessoa:");
            nom[i] = sc.next();
            System.out.println("Informe a idade:");
            idade[i] = sc.nextInt();
        }
        int n = idade[0];
        int v = idade[0];
        String novo = nom[0];
        String velho = nom[0];
        int som = 0;
        for(int i=0; i< idade.length; i++){
            if(idade[i]>v){
                velho = nom[i];
            }
            if(idade[i]<n){
                novo = nom[i];
            }
            som = som + idade[i];
        }
        double med = (double) som/idade.length;
        System.out.println("O mais novo é " + novo + ", o mais velho é " + velho + " e a média das idades é " + med );

        // questão 8

        String[] nome = new String[5];
        double[] altura = new double[5];
        double[] peso = new double[5];
        double[] imc = new double[5];
        for(int i=0; i<peso.length; i++){
            System.out.println("Informe o nome da pessoa:");
            nome[i] = sc.next();
            System.out.println("Informe o peso:");
            peso[i] = sc.nextDouble();
            System.out.println("Informe a altura:");
            altura[i] = sc.nextDouble();
            imc[i] = peso[i]/(altura[i]*altura[i]);
        }
        for(int i=0; i<imc.length; i++){
            if(imc[i]>25){
                System.out.println(nome[i] + " está com peso acima do ideal");
            }
            if(imc[i]<18.5){
                System.out.println(nome[i] + " está com o peso abaixo do ideal");
            }
        }
    }
}
