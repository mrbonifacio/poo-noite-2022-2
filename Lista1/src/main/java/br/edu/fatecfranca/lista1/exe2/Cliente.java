package br.edu.fatecfranca.lista1.exe2;

public class Cliente {
    public int n_Conta, n_Agencia;
    public String nome;
    public double saldo;
            
public Cliente(){
    
}    
    
public Cliente(int n_Conta, int n_Agencia, String nome, double saldo){
    this.n_Conta = n_Conta;
    this.n_Agencia = n_Agencia;
    this.nome = nome;
    this.saldo = saldo;
}

public void depositar(double x){
    this.saldo += x;
}

public void sacar(double x){
    if(this.saldo > 0){
        this.saldo -= x;
    }
    else{
        System.out.println("Saldo insuficiente!");            
    }
}

public String paraString(){
    return "Nº Agência: " + this.n_Conta +
            " Nº Conta: " + this.n_Agencia +
            " Nome: " + this.nome +
            " Saldo: " + this.saldo;
}
}

