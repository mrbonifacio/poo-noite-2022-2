/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.lista2.exe1;

public class Testa {
    
    public static void main(String[] args) {
        
        Cliente objFeliz = new Cliente("123456-7",  "1234-5","Fulano",0);
       
        
        objFeliz.depositar(3000);
        objFeliz.sacar(1000);
        objFeliz.mostrar();
        
        Cliente objTriste = new Cliente("7657-3", "1234566-7","Beltrano", 0);
        
        objTriste.depositar(5000);
        objTriste.sacar(7000);
    }
    
}
