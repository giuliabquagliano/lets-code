package com.company;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(){
     //construtor padrão
    }

    //construtor completo
    public Pessoa(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = peso/(altura*altura);
    }

    //acessa idade
    public int getIdade() {
        return this.idade;
    }

    //acessa nome
    public String getNome(){
        return this.nome;
    }

    //altera o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //altera idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade + '}';
    }

    public double getImc() {
        return imc;
    }
}
