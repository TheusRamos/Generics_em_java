/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito.Factory;

import com.mycompany.deposito.Itens.Iphone;

/**
 *
 * @author MT
 */
public class FacIphone {
    public static Iphone novoIphone(String nome){
        Iphone novo = new Iphone(nome);
        return novo;
    }
}
