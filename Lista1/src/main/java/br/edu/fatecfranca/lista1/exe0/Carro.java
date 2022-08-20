/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe0;
public class Carro {
    
    public String marca, modelo;
    public double velAtual;
    public boolean statusMotor;// true or false
    
    
    //crie os dois construtores da classe Carro
     public Carro(){
        
    }
    
    //criar um metodo construtor 
    public Carro(String marca ,String modelo, double velAtual, boolean statusMotor){
        this.marca = marca;
        this.modelo = modelo;
        this.velAtual = velAtual;
        this.statusMotor = statusMotor;
    }
    
    //faça metodo para ligar o carro
    public void ligar(){
        if(!this.statusMotor){
           this.statusMotor = true;
        }
        
    }
    
    //faça metodo para desligar o carro
    public void desligar(){
        if(this.velAtual > 0){
           this.velAtual = 0;
        }
        if(this.statusMotor){
           this.statusMotor = false;
        }
    }
    
    //faça um metodo para acelerar o carro x unidades
    public void acelerar(double x){
        if(this.statusMotor){
        this.velAtual += x;
        }
    }
    //faça um metodo para frear o carro de x unidades
    public void frear(double x){
        if(this.statusMotor){
            if( x <= this.velAtual){
         this.velAtual -= x;
            }
            else System.out.println("Vel não pode ser negativo");
        }      
        else System.out.println("Carro desligado");
    }
}
