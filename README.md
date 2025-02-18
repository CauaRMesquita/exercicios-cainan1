![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input[\Digite sua nota\]
      input --> ver{ Nota >= 50?}
      ver --> |Sim| Freq{ Frequência >= 75% }
      ver --> |Não| A[/ Reprovado /]
      Freq --> |Sim| b[/Aprovado/]
      Freq --> |Não| c[/Reprovado/]
      b --> finish([Fim])
      c --> finish([Fim])
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite um número\] 
      --> input2[\Digite outro número\]
      --> conta[N1 + N2] --> resp[/Resposta/]
      --> finish([Fim])

   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite um número\]
      --> Leitor{Positivo?} --> |Sim| pos[/Número Positivo/]
      Leitor --> |Não| neg[/Número Negativo/]
      neg --> finish([Fim])
      pos --> finish([Fim])
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start((Início)) --> idade[\Insira sua idade\]
      --> verify{idade >= 16}
      verify --> |Sim| titulo{Possui Título de Eleitor?}
      verify --> |Não| not[/Não Autorizado/]
      titulo --> |Sim| aut[/Autorizado/]
      titulo --> |Não| autnt[/Não autorizado/]
      aut --> finish([Fim])
      not --> finish([Fim])
      autnt --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite um número\]
      --> input2[\Digite outro número\]
      --> ver{N1 > N2}
      ver --> |Sim| maior1[/N1 é maior/]
      ver --> |Não| maybe{N1 < N2}
      maybe --> |Sim| maior2[/N2 é maior/]
      maybe --> |Não| igual[/Números iguais/]
      maior1 --> finish([Fim])
      maior2 --> finish([Fim])
      igual --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite o N1\]
      --> input2[\Digite o N2\] --> input3[\Digite o N3\]
      --> ver1{N1 > N2}
      ver1 --> |Sim| ver2{N1 > N3}
      ver1 --> |Não| ver3{N2 > N3}
      ver2 --> |Sim| maior1[/N1 é o maior/]
      ver2 --> |Não| teste1{N1 < N3}
      teste1 --> |Sim| n3ma[/N3 é o maior/]
      teste1 --> |Não| iguais2[/N1 e N3 são iguais/]
      ver3 --> |Sim| maiorn2[/N2 é o maior/]
      ver3 --> |Não| maybe1{N2 < N3}
      maybe1 --> |Sim| maior3[/N3 é o maior/]
      maybe1 --> |Não| maybe2{N3 > N1}
      maybe2 --> |Sim| n3m[/N3 é o maior/]
      maybe2 --> |Não| final{N3 < N1}
      final --> |Sim| n1m[/N1 é o maior/]
      final --> |Não| iguais[/Os Números são iguais/]
   
      iguais2 --> finish
      n3ma --> finish
      maior1 --> finish([Fim])
      maiorn3 --> finish([Fim])
      maiorn2 --> finish([Fim])
      maior3 --> finish([Fim])
      n3m --> finish
      n1m --> finish
      iguais --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite um número "n" para calcular o seu fatorial\]
      --> Fat["n!= n(n-1)(n-2)(n-3)...3x2x1"]
      --> Result[/Resultado/]
      --> finish([Fim])
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite um número "n" para verificar se ele é par\]
      --> calculo{n % 2 = 1}
      calculo --> |Sim| impar[/O Número é Ímpar/]
      calculo --> |Não| par[/O Número é Par/]
      impar --> finish([Fim])
      par --> finish([Fim])
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite um número "n" para verificar se ele é primo\]
      --> verify{É divisível somente por 1 e por ele mesmo?}
      verify --> |Sim| pr[/O Número é Primo/]
      verify --> |Não| npr[/O Número não é Primo/]
      pr --> finish([Fim])
      npr --> finish([Fim])
   ```

   kkkkkkkk