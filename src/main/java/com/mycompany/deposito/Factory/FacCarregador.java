/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito.Factory;

import com.mycompany.deposito.Itens.Carregador;

/**
 *
 * @author MT
 */
public abstract class FacCarregador {
    
    
    public static Carregador novoCarregador(String nome){
        Carregador novo = new Carregador(nome);
        return novo;
    }
}
