/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito.Factory;


import com.mycompany.deposito.Itens.Notebook;

/**
 *
 * @author MT
 */
public class FacNotebook {
    public static Notebook novoNotebook(String nome){
        Notebook novo = new Notebook(nome);
        return novo;
    }
}
