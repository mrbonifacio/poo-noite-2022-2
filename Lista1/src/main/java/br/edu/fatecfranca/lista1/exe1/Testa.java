package br.edu.fatecfranca.lista1.exe1;

public class Testa {

    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.nome = "Pedro";
        obj1.N_Aluno = 123;
        obj1.p1 = 2.3;
        obj1.p2 = 1.9;      
        System.out.println(obj1.dadosAluno());
        obj1.passou();
        
        Aluno obj2 = new Aluno(456, "João", 8.9, 9.1);
        System.out.println(obj2.dadosAluno()); 
        obj2.passou();
    }
    
}
