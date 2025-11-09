/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deposito;

import com.mycompany.deposito.Class.Deposito;
import com.mycompany.deposito.Factory.FacCarregador;
import com.mycompany.deposito.Factory.FacIphone;
import com.mycompany.deposito.Factory.FacNotebook;
import com.mycompany.deposito.Factory.FacXiaomi;
import com.mycompany.deposito.Itens.Carregador;
import com.mycompany.deposito.Itens.Iphone;
import com.mycompany.deposito.Itens.Notebook;
import com.mycompany.deposito.Itens.Xiaomi;

/**
 *
 * @author MT
 */
public class Main {

    public static void main(String[] args) {
      
        Deposito<Carregador> depositoCarregador = new Deposito<>();            
        Deposito<Iphone> depositoIphone = new Deposito<>();           
        Deposito<Notebook> depositoNotebook = new Deposito<>();
        Deposito<Xiaomi> depositoXiaomi = new Deposito<>();
        
        depositoCarregador.adicionar(FacCarregador.novoCarregador("Carregador para Iphone"));
        depositoIphone.adicionar(FacIphone.novoIphone("Iphone 17 pro"));
        depositoNotebook.adicionar(FacNotebook.novoNotebook("Acer Nitro 5"));
        depositoXiaomi.adicionar(FacXiaomi.novoXiaomi("Note 13 pro 5g"));
        
        
        
       
       
       
        
        System.out.println("---- PRODUTOS EM ESTOQUE ----");
        
        System.out.println("Estoque de Carregadores: " + depositoCarregador.estoque());
        depositoCarregador.mostrarItens();
        System.out.println("");
        System.out.println("Estoque de Iphones: " + depositoIphone.estoque());
        depositoIphone.mostrarItens();
        System.out.println("");
        System.out.println("Estoque de Xiaomi: " + depositoXiaomi.estoque());
        depositoXiaomi.mostrarItens();
        System.out.println("");
        System.out.println("Estoque de Notebooks: " + depositoNotebook.estoque());
        depositoNotebook.mostrarItens();
        
        
        Carregador retirarCarregador = depositoCarregador.obterItem(0);
        System.out.println("Nome do Carregador retirado sem o Cast: " + retirarCarregador.getNome());
        
        // DEMONSTRAÇÃO DE QUE NÃO DÁ PARA COLOCAR TIPOS DIFERENTES EM LISTAS DIFERENTES
        // depositoIphone.adicionar(retirarCarregador);
    }
}
