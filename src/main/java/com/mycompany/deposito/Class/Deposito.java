/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito.Class;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MT
 */
public class Deposito <Tipo extends Produto>{
    private List<Tipo> lista = new ArrayList<>();
    
    
    public void adicionar(Tipo novoItem){
        this.lista.add(novoItem);
    }
    
    public Tipo obterItem(int index){
        return lista.get(index);
    }
    
    public int estoque(){
        return lista.size();
    }
    
    
    public void mostrarItens(){
        
        for(Produto e : lista){
            System.out.println("Item no estoque: " + e.getNome());
        }
    }
}
