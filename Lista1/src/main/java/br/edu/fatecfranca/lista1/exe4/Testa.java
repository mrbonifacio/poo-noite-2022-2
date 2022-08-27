/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe4;

/**
 *
 * @author 1090482113002
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rio obj1 = new Rio("Amazonas", 1.86, false);
        System.out.println(obj1.paraString());
        obj1.chover(0.54);
        obj1.ensolarar(0.3);
        obj1.limpar();
        System.out.println(obj1.paraString());
        
        Rio obj2 = new Rio("Tiete", 0.87, true);
        System.out.println(obj2.paraString());
        obj2.chover(0.8);
        obj2.ensolarar(0.4);  
        obj2.limpar();
        System.out.println(obj2.paraString());
    }
    
}
