/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe1;

/**
 *
 * @author 1090482113002
 */
public class Aluno {
    public int nroAluno; //tipo primitivo 
    public String nome; //tipo de classe
    public double p1, p2; //tipo primitivo 
    
    //    construtor sem parametro
    public Aluno (){
        
    }
    //construtor com parametro
    public Aluno (int nroAluno, String nome, double p1, double p2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    //calcula e retorna media final 
    public double notaFinal(){
        return (this.p1 + p2) / 2;
    }
    
    //retorna os dados do aluno 
    public String dadosAluno(){
        return " Nome: " + this.nome + " Nro aluno: " + this.nroAluno + " Média: " + this.notaFinal();
    }
    //verifica se o alunos passou 
    public void passou(){
        if (this.notaFinal()>= 6){
            System.out.println("Aluno passou");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }
}
