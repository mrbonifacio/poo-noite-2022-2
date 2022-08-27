/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe4;

/**
 *
 * @author 1090482113002
 */
public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido; //true - está poluindo, falue- não está poluido 
    
    public Rio(){
            
    }
    public Rio(String nome, double nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void ensolarar(double x){
        if(x <= this.nivel){
            this.nivel -= x;
            System.out.println("Nivel do rio foi diminuido");
        }
        else {
            System.out.print("Nivel nao pode ser negativo");           
        }
    }
    
    public void chover (double x){
        this.nivel += x;
        System.out.println("Nivel do rio foi aumentado");
    }
    
    public void sujar(){
        if (this.poluido){
            System.out.println("Rio ja poluido");
        }
        else{
            this.poluido = true;
            System.out.println("Rio foi sujado");
        }   
    }
    
    public void limpar(){
        if (!this.poluido){
            System.out.println("Rio ja limpo");
        }
        else{
            this.poluido = false;
            System.out.println("Rio foi limpo");
        }
    }
    public String paraString(){
        String aux = (this.poluido ? "Esta poluido" : "Esta limpo");
        return "Nome " + this.nome + " nivel " + this.nivel + " Situação " + aux;
    }
    
}
