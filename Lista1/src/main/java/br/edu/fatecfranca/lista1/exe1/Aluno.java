package br.edu.fatecfranca.lista1.exe1;

public class Aluno {
    public int N_Aluno;
    public String nome;
    public double p1, p2;
    
    
public Aluno(){
    
}

public Aluno(int N_Aluno, String nome, double p1, double p2){
    this.N_Aluno = N_Aluno;
    this.nome = nome;
    this.p1 = p1;
    this.p2 = p2;
}

public double notaFinal(){
    return (this.p1 + this.p2) /2;
}

public String dadosAluno(){
    return "Nome: " + this.nome + " Nº Aluno: " + this.N_Aluno + " Média final: "  + this.notaFinal();
}

public void passou(){
    if(this.notaFinal() >= 6){
        System.out.println("Aluno aprovado");
        }
        else{
        System.out.println("Aluno reprovado");        
        }
    }
}

