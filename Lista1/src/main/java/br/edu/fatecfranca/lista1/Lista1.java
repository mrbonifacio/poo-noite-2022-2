/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.lista1;

import br.edu.fatecfranca.lista1.exe0.Produto;

/**
 *
 * @author 1090482113002
 */
public class Lista1 {

    public static void main(String[] args) {
        
        //criar objetos da classe Produto
        //criar instâncias da classe Produto
        
        Produto obj1 = new Produto ();
                obj1.nome = "Máscara";
                obj1.qtde = 100;
                obj1.preco = 5;
                
                obj1.comprar(10);
                obj1.vender(5);
                obj1.subir(50);
                obj1.abaixar(25);
                obj1.mostrar();
                
                             
                //vamos instanviar explorando o metodo construtor
                //metodo que tem o mesmo nome da classe
                //metodo que inicializa as variaveis da classe
                
                Produto obj2 = new Produto ("Bola de basquete", 10, 93.90);          
                obj2.comprar(3);
                obj1.vender(2);
                obj2.subir(50);
                obj2.abaixar(25);
                obj2.mostrar();
                
                
                
                Produto obj3 = new Produto ("Fortnite", 1, 39.90);         
                obj3.comprar(1);
                obj3.vender(3);
                obj3.subir(50);
                obj3.abaixar(25);
                obj3.mostrar();
                
    }
}
