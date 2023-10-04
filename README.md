# Anotações
## Anatomia das Classes
Classes:
- Inicialmente a nomenclatura de todas as classes se iniciam com a letra maiuscula.
- A classe deve possuir o mesmo nome do arquivo.
- classe executável significa que tem o potencial de realizar a inicialização do projeto, essa classe tem um metodo pricipal "main".

Variáveis:
- Variaveis devem ser escritas com letra minuscula. ex: anoFabricacao.
- Quando quer identificar uma variável que não sofrerá alteração, deve-se indicar com "final" e o nome da variável todo em letras maiúsculas. 
Ex: final String BR = "Brasil";
- (ESTRUTURA) tipo NomeBemDefinido = Atribuição(opcional);
- Nem sempre precisa ser atribuido valor a variável ao cria-la.

Métodos:
- (ESTRUTURA) TipoRetorno NomeObjetivoNoInfinitivo Parametro
ex: int somar (int numeroUm, int numro2)
String formatarCep (long cep)
- A resposta pode ser do mesmo tipo, ou tipos diferentes.
- todo metodo tem seus parametros

## Organização de Arquivos JAVA
- Organzar arquivos em packages.
ex.: package edu.byatriz.praticasjava

## Java Beans
Estruturação de escrita 
Variável - Clara, sem abreviações, no singular (exceto quando se referir a array ou coleção),  idioma único.
Método - Denominados como verbos, letras minusculas e maiúsculas.

# Tipos e Variáveis
- Tipos de dados (Oito tipos primitivos)
int, byte, short, long, float, double, boolean e char

- Em alguns momentos teremos classes que representarão tipos.
Ex.: Date dataNascimento = new Date(); / quando for atribuido valor deve anteceder com a palavra new

## Numéricos inteiros e decimais
- Tipos numericos interios
byte (1byte), short (2byte), int (4bytes), long (8bytes)
- A JVM sempre tenta converter para int
- Atualmente não há necessidade de se usar short ou byte, pois não precisamos nos preocupar tanto assim com espaço de memória reduzido.
- Da mesma forma não trabalhamos com long por ser incomum o uso de valores tão grandes.

- Tipos que podem conter partes fracionárias
float (4 bytes) e double (8 bytes)
- Mais comum o uso de double, pois float somente mantém uma precisão decimal entre 6 e 7 digitos.

## Tipos lógicos

## Caracteres
char - seu valor é atribuido com aspas simples ' '

## Objetos

## Diferença entre variável e constante
- Variável: área de memória, associada a um nome, que pode armazenar valores de um determinado tipo e esses valores podem variar. Lembrando que se tem necessidade de declarar esse tipo, diferente de outras linguagens.
- Constante: são escrias em CAIXA ALTA, não podem sofrer alterações depois de declarados. São valores representados pela palavra reservada 'final'.
ex.: final double VALOR_DE_PI = 3.14;

# Operadores
Se tratam de símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.

+ valor positivo
- valor negativo - nega número ou expressão aritmetica.
++ incremento de valor - em 1 unidade
-- decremento de valor - em 1 unidade
! lógico de negação - nega expressão booleana

exemplo: numero + 1 é a mesma coisa que dizer numero ++ (imprime primeiro e depois incrementa) ++ numero (incrementa e imprime)

## atribuição
Representados pelo símbolo de igualdade =

## aritméticos
Utilizados para realizar operações matemáticas ( + - * / %)
- O + quando utilizado em variáveis realiza uma concatenação de textos.

## unários
Operadores aplicados com outros operadores numéricos, utilizados para incrementar, decrementar, inverter valores numéricos e booleanos.


## relacionais
== igual a
!= diferente de
> maior que
>= maior ou igual a
< menor que
<= menor ou igual a

Quando se trata de objetos ou textos, usa-se o metodo 'equals' para comparar conteúdos.

## lógicos
&& E
|| OU

Usa-se a tabela verdade

## ternário
Forma resumida de se definir uma condição e escolher entre dois valores. Como um if mas estruturado em uma linha única.
Sempre expressões booleanas
<expressão condicional> ? <caso condição seja true> : <caso condição seja false>
ex.: 
int a, b;

a=5;
b=6;

// utilizando IF/ELSE
String resultado = " ";

if(a==b)
    resultado = "veradeiro";
else
    resultado = "falso";
System.out.println(resultado);

// utilizando operador ternario
String resultado = a==b ? "verdadeiro" : "falso";
Ou
int resultado = a==b ? 1 : 0;
System.out.println(resultado);

# Metodos
Todas ações das aplicações são consideradas métodos.
- Uma classe é definida por atributos e metodos. Sendo atributos variáveis de diferentes tipos e valores e metodos funções ou sub-rotinas disponíveis dentro das classes.
- Critérios de nomeação
nomeado como verbo
padrão camelCase ex: dataAniversario
## Sempre analisar
- Deve ter uma finalidade real
- Qual o tipo de retorno esperado. E caso não retorne nenhum valor deve ser representado pela palavra-chave void
- Quais parametros necessários, sendo que as vezes sera preciso argumentos como critérios para execução
- Pode haver exceções? As vezes é necesário prever e tratar possiveis exceções.
throws Exception - informa que podera gerar uma exceção
- Visivel em toda aplicação, somente em pacotes, atraves de herança ou a nivel a propria classe.
private ao inicio ao invés de public

