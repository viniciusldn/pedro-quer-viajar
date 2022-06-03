### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

# Requisitos do desafio

## Pedro quer viajar

Pedro está planejando um mochilão por alguns países e precisa de uma ajuda para organizar a viagem. Ele começou a desenvolver o planejador de viagens, mas deixou o `PlanejandoDestino.java` por fazer! Esse planejador serve para compilar as capitais dos países que ele deseja visitar junto ao código DDI dos locais — informação fundamental para seu plano de viagem, servindo para entrar em contato com os hotéis, por exemplo.

Logo, temos aqui uma entidade (tabela) chamada `Country` que possui alguns atributos (colunas):

```Java
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String capital;
    private String ddi;
```

Você deverá complementar alguns métodos que já estão em nossa classe para ajudar na missão do mochilão. Abaixo você confere o que deve ser feito.

* No método `inserir()`, usar os recursos do Repository fornecido pelo spring-data a fim de incluir os dados dos países que estão nos planos do Pedro, no caso o `repository.save(Country entity)`. No momento, ele só tem os nomes dos países e de suas capitais, logo, após a chamada do método, nossa tabela deverá ficar desta forma:

| NAME | CAPITAL | DDI |
|----- | ------|-----|
|BRASIL|BRASILIA|NULL|
|ARGENTINA|BUENOS AIRES|NULL|
|URUGUAI|MONTEVIDEO|NULL|
|PANAMA|CIDADE DO PANAMA|NULL|

Pedro tinha se esquecido de pegar os códigos de discagem internacionais, poxa! Ele resolveu pegar e nos passar, o que gerou a necessidade de atualização da lista!

* No método  `corrigir()`, utilizar os recursos do repository para encontrar os países pelo nome (`findByName(String name)`) e atualizar (o `save(Country entity)`) seus itens, deixando a nossa tabela COUNTRY da seguinte forma:

| NAME | CAPITAL | DDI |
|----- | ------|-----|
|BRASIL|BRASILIA|+55|
|ARGENTINA|BUENOS AIRES|+54|
|URUGUAI|MONTEVIDEO|+598|
|PANAMA|CIDADE DO PANAMA|+507|

Só que, no meio desse planejamento todo, Pedro viu que não vai conseguir ir pro Panamá!

* Em `excluir()`, você deverá usar os recursos do repository para encontrar a entidade do Panamá (`findByName(String name)`) e o `delete(Country entity)` para eliminar esse registro. 

Após as três chamadas, a tabela Country deverá estar desta forma: 

| NAME | CAPITAL | DDI |
|----- | ------|-----|
|BRASIL|BRASILIA|+55|
|ARGENTINA|BUENOS AIRES|+54|
|URUGUAI|MONTEVIDEO|+598|

Boa sorte! E simbora ajudar o Pedro a realizar seu sonho da melhor forma possível! 🛫


---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---
