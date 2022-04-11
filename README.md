<h1 align="center">Jokenpo Game</h1>


<p align="center">
  <img alt="top language" src="https://img.shields.io/github/languages/top/matheusmarks/jokenpo-game.svg" />
  <img alt="repo-size" src="https://img.shields.io/github/repo-size/matheusmarks/jokenpo-game.svg" />
  <img alt="last commit" src="https://img.shields.io/github/last-commit/matheusmarks/jokenpo-game.svg" />
</p>


<h3>Requisitos</h3>
<p> - Ter a versão do java jdk 11 instalado em sua máquina.</p>
<p> - Possuir alguma IDE que seja possível executar código java e seus respectivos testes. Ex: IntelliJ, Eclipse, VsCode, etc.</p>

<h3>Como baixar e utilizar o projeto</h3>

 ```bash
# Clonar o repositório
$ git clone https://github.com/matheusmarks/jokenpo-game.git

# Ir para a pasta do projeto
$ cd jokenpo-game
```

<p> - Agora abra essa pasta em alguma IDE de sua preferência e execute a aplicação na classe <i>JokenpoApplication.java</i></p>
<p> - Caso queira executar os testes da aplicação, execute a classe <i>JokenpoRulesTest.java</i></p>


<h3>Como o jogo foi feito ?</h3>

- Inicialmente, criei uma classe <i>JokenpoApplication.java</i> com o método <i>main()</i> responsável por inicializar o jogo e  
  capturar os valores de entrada dos jogadores como nome e escolha (pedra, papel ou tesoura). 
- 2 - Logo após crei dois enums: 
&nbsp - <i>PlayerChoice.java</i> que eu utilizei para classificar as escolhas possíveis que um usuário pode optar.
&nbsp - <i>Result.java</i> que eu utilizei para classificar os resultados possíveis para declarar o fim de jogo.
<p> 3 - Criei a classe <i>Player.java</i> para tratar das informações do jogador (nome, escolha).</p> 
<p> 4 - A classe <i>JokenpoRules.java</i> foi criada para realizar a parte lógica e para saber o resultado final do jogo, mediante as escolhas dos jogadores.</p>
<p> 5 - Por fim, a classe <i>JokenpoRulesTest.java</i> eu criei para realizar os testes da lógica presente em <i>JokenpoRules.java</i>. Procurei realizar esses testes de forma bem simples e clara, a fim de verificar se as regras do Jokenpo foram implementadas corretamente e saber se o resultado final do jogo está correto.<i>
  
<h3>Linguagens e frameworks</h3>
 - Java 11
 - JUnit 5
 - Maven
  

