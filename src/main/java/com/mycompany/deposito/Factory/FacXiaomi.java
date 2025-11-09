/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito.Factory;


import com.mycompany.deposito.Itens.Xiaomi;

/**
 *
 * @author MT
 */
public class FacXiaomi {
    public static Xiaomi novoXiaomi(String nome){
        Xiaomi novo = new Xiaomi(nome);
        return novo;
    }
}
