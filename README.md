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

# Escopo
Ambiente onde uma variável pode ser acessada.
Onde é declarada afeta sua visibilidade.

# Palavras reservadas
Java possui 52 palavras reservadas.
- Controle de pacotes
import: importa pacotes e classes dentro do código.
package: especifica a que pacote todas as classes de um arquivo pertecem.

- Modificadores de acesso
public: acesso de qualquer classe
private: acesso apenas dentro da classe
protected: acesso por classes no mesmo pacote e subclasses. Uso de herança.

- Primitivos
boolean: um valor indicado true ou false
byte: um inteiro de 8 bits (signed)
char: um character unicode (16-bit unsigned)
double: um número de ponto flutuante de 64 bits (signed)
float: um núero de ponto flutuante de 32 bits (signed)
int: um inteiro de 32 bits (signed)
long: uum inteiro de 64 bits (signed)
short: um inteiro de 32 bits (signed)
void: indica que um metodo não tem retorno de valor.

- Modificadores de classes, variáveis e metodos
abstract: classe que não pode ser instanciada ou metodo que precisa ser implementado por uma subclasse não abstrata. (associada com herança, determino que uma classe terá um comportamento mas que esse comportamento precisa de uma implementação de uma classe filha)
class: especifica uma classe
extends:indica a superclasse que a classe está estendendo
final: impossibilita que uma classe seja estendida, que um metodo seja sobrescrito ou que uma variavel seja reiniciada.
implements: indica as interfaces que uma classe irá implementar.
interface: especifica uma interface.
native: indica que um metodo esta escrito em uma linguagem dependente de plataforma, como o C
new: instancia um novo objeto, chamando seu construtor
static: faz um metodo ou variavel pertencer à classe ao inves de às instancias.
strictfp: usado em frente a um método ou classe para indicar que os numeros de ponto flutuante seguirão as regras de ponto flutuante em todas as expressoes.
synchronized: indica que um metodo só pode ser acessado por uma thread de cada vez.
transient: impede a serialização de campos.
volatile: indica que uma variavel pode ser alterada durante o uso de threads.

- Controle de fluxo dentro de um bloco de codigo
break: sai do bloco de codigoem que ele esta
case: executa um bloco de codigo dependendo do teste do switch
continue: pula a execução do codigo que viria após essa linha e vai para a proxima passagem do loop
default: executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro
do: executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente
else: executa um bloco de código alternativo caso o teste if seja falso
for: usado para realizar um loop condicional de um bloco de código
if: usado para realizar um teste lógico de verdadeiro o falso
instanceof: determina se um objeto é uma instância de determinada classe, superclasse ou interface
return: retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)
switch: indica a variável a ser comparada nas expressões case
while: executa um bloco de código repetidamente enquanto a condição for verdadeira

- Tratamento de erros
assert: testa uma expressão condicional para verificar uma suposição do programador
catch: declara o bloco de código usado para tratar uma exceção
finally: bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção
throw:usado para passar uma exceção para o método que o chamou
throws: indica que um método pode passar uma exceção para o método que o chamou
try: bloco de código que tentará ser executado, mas que pode causar uma exceção

- Variaveis de referencia
super: refere-se a superclasse imediata
this: refere-se a instância atual do objeto

- Palavras reservadas não utilizadas
const: Não utilize para declarar constantes; use public static final
goto: não implementada na linguagem Java por ser considerada prejudicial

- Literais reservados
De acordo com a Java Language Specification, null, true e false são tecnicamente chamados de valores literais, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.

http://www.linhadecodigo.com.br/artigo/83/as-52-palavras-reservadas-do-java.aspx
https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/summary

# Documentação
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
https://docs.oracle.com/en/java/javase/21/docs/api/index.html

- Comentários
inline  //
multi line /*
*
*
*/
documentation /**
*
*
*/

- gerador de documentação
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
