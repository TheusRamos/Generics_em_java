
Este repositório contém um projeto Java refatorado para usar Generics. 
O objetivo era corrigir os problemas de segurança de tipo encontrados na versão original do código.
-----------------------------------------------------------------------------------------------------

O Problema no Código Original
A versão inicial da classe Deposito não era segura. 
Ela utilizava uma List simples, sem especificar qual o tipo de item que deveria guardar.

Isso causava dois grandes problemas:
Falta de Segurança ao Adicionar: 
O método de adição aceitava qualquer tipo de objeto. Isso permitia que, por exemplo, um objeto do tipo Alimento fosse guardado em um depósito que deveria ser apenas de Eletronico. O compilador não detectava esse erro.

Risco em Tempo de Execução: 
Ao retirar um item, era sempre necessário fazer uma conversão manual (um "cast") para o tipo correto. Se um item do tipo errado estivesse na lista (como no exemplo acima), o programa quebraria com um erro (java.lang.ClassCastException) durante a execução. O erro não era pego na compilação.

A Solução com Generics
Para corrigir isso, a classe Deposito foi reescrita para usar Generics.

A classe agora recebe um "parâmetro de tipo" no momento da sua criação. Isso define exatamente qual tipo de item aquele depósito específico pode guardar. Além disso, foi usado um "limite de tipo" (extends Produto) para garantir que qualquer tipo usado seja, obrigatoriamente, uma subclasse de Produto.

Com essa mudança, a lista interna, o método de adicionar e o método de obter agora trabalham apenas com esse tipo específico.

Resultados da Mudança
Essa refatoração trouxe duas vantagens principais, que podem ser vistas em funcionamento na classe Main:
Segurança em Tempo de Compilação: O compilador agora impede que tipos errados sejam misturados. Se você tentar adicionar um Carregador em um Deposito<Iphone>, por exemplo, o código nem compila. O erro é detectado imediatamente, e não mais em tempo de execução.
Código Mais Limpo e Seguro: Não é mais necessário fazer a conversão manual ("cast") ao retirar um item. O método de obter já retorna o objeto no seu tipo correto (Carregador, Iphone, etc.), eliminando totalmente o risco do erro ClassCastException.

Além disso, como foi um projeto autoral, alterei os tipos de objetos a serem guardados para: Carregadores, Iphones, Xiaomis e Notebooks. Apenas para testes.
