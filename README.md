Atividade: Adequação de Código com Generics em Java
Este projeto demonstra a refatoração de uma classe Java que utilizava "raw types" (tipos brutos) para uma versão segura e robusta utilizando Generics. O objetivo é evidenciar os problemas da abordagem antiga e as vantagens da nova.

🎯 O Problema Original
A versão inicial do código (não presente neste repositório) possuía uma classe Deposito que funcionava de forma insegura.

Ela utilizava List em vez de List<T>, permitindo que qualquer Object fosse adicionado a ela.

Os métodos adicionarItem(Object item) e Object obterItem(int index) forçavam o programador a:

Não ter garantia alguma sobre os tipos dos itens sendo adicionados.

Realizar casts (conversões de tipo) explícitas ao recuperar itens, como (Eletronico) deposito.obterItem(0).

O principal risco era o java.lang.ClassCastException em tempo de execução. Se um Alimento fosse adicionado a um depósito de Eletronico, o código compilaria, mas quebraria ao ser executado.

💡 A Solução com Generics
A classe Deposito foi refatorada para fazer uso de Generics, resolvendo todos os problemas da abordagem anterior.

1. Classe Deposito Parametrizada
A assinatura da classe foi alterada para: public class Deposito <Tipo extends Produto>

<Tipo>: Declara a classe como genérica, aceitando um parâmetro de tipo que será definido na sua instanciação.

extends Produto: Foi utilizado um Bounded Type Parameter (Parâmetro de Tipo Limitado). Isso garante que o Tipo (seja Carregador, Iphone, Notebook, etc.) deve ser, obrigatoriamente, uma subclasse de Produto.

2. Type Safety (Segurança de Tipo) nos Métodos
Com a classe parametrizada, os métodos internos foram atualizados:

Lista interna: private List<Tipo> lista = new ArrayList<>();

A lista agora só aceita objetos do Tipo específico definido na criação do depósito.

Método de adição: public void adicionar(Tipo novoItem)

O método só aceita argumentos do Tipo correto.

Método de obtenção: public Tipo obterItem(int index)

O método retorna o objeto já com seu tipo correto, eliminando a necessidade de casts.

✅ Vantagens Demonstradas na Main.java
A classe Main demonstra os dois principais benefícios desta refatoração:

1. Garantia em Tempo de Compilação
Ao criar depósitos específicos, o compilador impede o erro humano:

Java

// Criação de depósitos com tipos específicos
Deposito<Carregador> depositoCarregador = new Deposito<>();
Deposito<Iphone> depositoIphone = new Deposito<>();

// Adição segura
depositoCarregador.adicionar(FacCarregador.novoCarregador("Carregador para Iphone"));

// ERRO DE COMPILAÇÃO: O compilador impede
// depositoIphone.adicionar(FacCarregador.novoCarregador("..."));
Como demonstrado na Main.java, a tentativa de adicionar um Carregador em um Deposito<Iphone> (linha comentada) agora gera um erro em tempo de compilação, que é o comportamento desejado. O problema é pego antes mesmo do programa rodar.

2. Eliminação de Casts e Risco de ClassCastException
Ao recuperar um item, não é mais necessário fazer o cast, e o risco de ClassCastException é zero.

Java

// O método obterItem(0) retorna um Carregador, e não um Object.
Carregador retirarCarregador = depositoCarregador.obterItem(0);

// O código é mais limpo e seguro
System.out.println("Nome do Carregador retirado sem o Cast: " + retirarCarregador.getNome());
