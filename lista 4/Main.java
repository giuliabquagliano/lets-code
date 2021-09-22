package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){

        //questão 7
        Pessoa joao = new Pessoa("joão", 15, 1.70, 70);
        Pessoa maria = new Pessoa("maria", 18, 1.50,65);
        Pessoa amanda = new Pessoa("amanda", 20, 1.65, 55);
        Pessoa julia = new Pessoa("julia", 23, 1.60, 60);
        Pessoa luis = new Pessoa("luís", 30, 1.80, 78);
        double media = (joao.getIdade()+ maria.getIdade()+ amanda.getIdade()+ julia.getIdade()+ luis.getIdade())/5;
        int idades[] = new int[5];
        String nomes[] = new String[5];
        idades[0] = joao.getIdade();
        idades[1] = maria.getIdade();
        idades[2] = amanda.getIdade();
        idades[3] = julia.getIdade();
        idades[4] = luis.getIdade();
        nomes[0] = joao.getNome();
        nomes[1] = maria.getNome();
        nomes[2] = amanda.getNome();
        nomes[3] = julia.getNome();
        nomes[4] = luis.getNome();
        int maior = idades[0];
        int menor = idades[0];
        String maisVelho = nomes[0];
        String maisNovo = nomes[0];
        for(int i=0; i<idades.length; i++){
            if(idades[i]>maior){
                maior = idades[i];
                maisVelho = nomes[i];
            }
            else if(idades[i]<menor){
                menor = idades[i];
                maisNovo = nomes[i];
            }
        }
        System.out.println("O mais velho é " + maisVelho);
        System.out.println("O mais novo é " + maisNovo);
        System.out.println("A média das idades é " + media);

        //questão 8

        if(joao.getImc()<18.5||joao.getImc()>25){
            System.out.println(joao.getNome() + " está fora do peso ideal");
        }
        if(maria.getImc()<18.5||maria.getImc()>25){
            System.out.println(maria.getNome() + " está fora do peso ideal");
        }
        if(amanda.getImc()<18.5||amanda.getImc()>25){
            System.out.println(amanda.getNome() + " está fora do peso ideal");
        }
        if(julia.getImc()<18.5||julia.getImc()>25){
            System.out.println(julia.getNome() + " está fora do peso ideal");
        }
        if(luis.getImc()<18.5||luis.getImc()>25){
            System.out.println(luis.getNome() + " está fora do peso ideal");
        }
    }
}
