package br.edu.fatecfranca.lista1.exe2;

public class Testa {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente();  
        obj1.nome = "Fulano";
        obj1.n_Agencia = 111;
        obj1.n_Conta = 741;
        obj1.saldo = 0;
        
        System.out.println(obj1.paraString());
        obj1.depositar(2000);
        obj1.sacar(300);
        System.out.println(obj1.paraString());
        
        Cliente obj2 = new Cliente(444, 333, "Beltrano", 0);
        System.out.println(obj2.paraString());
         obj1.depositar(900);
        obj1.sacar(1300);
        System.out.println(obj2.paraString());               
    }
}
