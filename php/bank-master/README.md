# INFO2M

Este repositório será utilizado com intuito de provocar discussões sobre os conceitos em [POO e JAVA](https://www.caelum.com.br/apostila-java-orientacao-objetos/) para a turma **INFO2M**. Para isso, a proposta é que cada encontro semanal possa ser representado como uma **iteração** sobre o problema, para assim termos o nosso **incremento** na solução proposta (ver [Modelo de Desenvolvimento de Software Interativo e Incremental](https://pt.wikipedia.org/wiki/Desenvolvimento_iterativo_e_incremental)). Em ambos os momentos (interação e incremento), as atividades desenvolvimento serão realizadas, as mais comuns são: levantamento de requisitos; análise de requisitos; projeto; implementação; testes; e implantação.

## Uma breve descrição do problema

***FPenha Corporation*** nos procurou para propor uma solução no qual pudesse gerenciar os clientes e as transações financeiras do ***FPenha Bank***, durante o nosso primeiro encontro, conversou-se sobre muitos conceitos, como conta (poupança e corrente), depósito, saque, saldo, limite, taxa de serviço, juros, rendimento que são conceitos essenciais para o funcionamento dessa financeira.

Então, após a discussão com os **envolvidos/interessados**, a seguinte formulação poderia ser alcançada - Projetando um sistema bancário que contenha tanto uma área para o cliente realizar os serviços contratados (semelhante ao caixa de autoatendimento) quanto uma área para a financeira atender o cliente nos serviços primárias e gerenciar as transações financeiras realizada:

 * Cada transação envolve uma conta.
 * Existem diferentes tipos de contas bancárias (Poupança e Corrente).
 * Existem diferentes tipos de transações (Transferencia, Saque, Deposito, Pagamento).
 * Transações em moeda estrangeira são não permitidas.

## Iteração - 2

Depois de sentar com os **envolvidos/interessados** e extrair conceitos preliminares sobre o funcionamento do que estava desejando, tivemos um encontro para compreender melhor os conceitos que foram expostos. Para assim, delimitarmos o nosso primeiro esboço funcional do projeto. Desta forma, o rascunho inicial do projeto se apresentou da seguinte forma: 

* __Funcionalidades do Gerente__ 
  * Registrar um novo cliente para o banco; 
  * Criar uma conta (Poupança ou Corrente);
  * Associar uma conta recém criada para um cliente específico;
  * _Programar a periocidade das cobranças automáticas das taxas_;
  * Resumir as informações (quantidade de clientes, contas correntes e poupanças ) para serem apresentas em uma única tela;
  * Além da poupança, permitir que o gerente crie investimentos para serem apresentados na área do cliente.
  
* __Funcionalidades do Cliente__ 
  * Visualizar todas as suas contas;
  * Definir a conta na qual deseja trabalhar;
  * Permitir, uma vez a conta esteja selecionada, possa Depositar, Sacar, Transferir, Realizar Pagamento, Verificar Saldo, Investir nas oportunidades oferecidas pelo banco;
  * Verificar o Extrato das operações realizadas. 
