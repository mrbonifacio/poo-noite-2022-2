/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe2;

/**
 *
 * @author 1090482113002
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente obj1 = new Cliente();
       obj1.nome = "Fulano";
       obj1.nroAgencia = 111; 
       obj1.nroConta = 222;
       obj1.saldo = 0;
       
       System.out.println(obj1.paraString());
       obj1.depositar(2000);
       obj1.sacar(300);
       System.out.println(obj1.paraString());
       
       Cliente obj2 = new Cliente(444, 333, "Beltrano", 0);
       
       System.out.println(obj2.paraString());
       obj2.depositar(800);
       obj2.sacar(1300);
       System.out.println(obj2.paraString());
    }
    
}
