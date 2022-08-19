/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1;

//algo abstrato e serve de modelo para seus objetos 
public class Produto {
    public String nome; //tipo de dado é String(uma classe)
    public int qtde;//tipo de dado int (tipo primitivo)
    public double preco; //tipo de dado é double(tipo primitivo)
    
    //criar um metodo construtor
    public Produto(){
        
    }
    //criar um metodo construtor 
    public Produto(String nome , int qtde, double preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    //metodo que compra um produto, aumentando sua qtde
    //metodo nao retorna nada
    
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x){
        if(x <= qtde){
            this.qtde = this.qtde - x;
        }
        else System.out.println("Sem estoque");
    }
}
