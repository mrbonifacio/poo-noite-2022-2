package br.edu.fatecfranca.lista1.exe4;

public class Rio {

    public String nome;
    public double nivel;
    public boolean poluido;
    
public Rio(){
    
}

public Rio(String nome,double nivel, boolean poluido){
    this.nome = nome;
    this.nivel = nivel;
    this.poluido = poluido;
}

public void ensolarar(double x){
    if(x <= this.nivel){
        this.nivel -= x;
        System.out.println("Nível do rio foi diminuído!");
    }
    else{
        System.out.println("Nível do rio não pode ser negativo!");
    }
}

public void chover(double x){
    this.nivel += x;
    System.out.println("Nível do rio foi aumentado!");
}

public void sujar(){
    if(this.poluido){
        System.out.println("O rio já está poluído");
    }
    else{
        this.poluido = true;
        System.out.println("O rio foi poluído");
    }
}

public void limpar(){
    if(this.poluido){
        System.out.println("O rio já está limpo");
    }
    else{
        this.poluido = false;
        System.out.println("O rio foi limpo");
    }
}

public String paraString(){
    String aux = (this.poluido ? "Está poluído" : "Está limpo");
    return "Nome: " + this.nome + 
           " Nível " + this.nivel +
           " Situação: " + aux;
}
}
