/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito.Class;

/**
 *
 * @author MT
 */
public abstract class Produto {
    private String nome;
    
    public Produto(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
            
}
